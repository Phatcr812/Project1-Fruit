/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import Entity.Address;
import com.sun.jdi.connect.spi.Connection;
import java.util.List;
import utils.jdbcHelper;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author PC
 */
public class AddressDAO{
    final static String INSERT_SQL = "EXEC CreateAddress @user_id = ?, @city = ?, @ward = ?, @street = ?, @is_Default = ?";
    final static String UPDATE_SQL = "EXEC UpdateUserAddress @user_id = ?, @address_id = ?, @city = ?, @ward = ?, @street = ?";
    final static String DELETE_SQL = "EXEC DeleteUserAddress @user_id = ?, @address_id = ?";
    private static final String SELECT_BY_USER_ID_SQL = 
        "SELECT a.id, a.city, a.ward, a.street, ua.is_Default " +
        "FROM User_Address ua " +
        "JOIN Address a ON ua.address_id = a.id " +
        "WHERE ua.user_id = ?";
    
   public static void insert(int userId, String city, String ward, String street, boolean isDefault){
        jdbcHelper.update(INSERT_SQL, userId, city, ward, street, isDefault);
   }
   
   public static void update(int userId, int address_id, String city, String ward, String street){
        jdbcHelper.update(UPDATE_SQL, userId,address_id, city, ward, street);
   }
   
   public static void delete(int user_id, int address_id)
   {
       jdbcHelper.update(DELETE_SQL,user_id,address_id);
   }
   
   public static List<Address> selectByUserId(int userId) {
        List<Address> addresses = new ArrayList<>();
        
        try (ResultSet rs = jdbcHelper.query(SELECT_BY_USER_ID_SQL, userId)) {
            while (rs.next()) {
                Address address = new Address();
                address.setId(rs.getString("id"));
                address.setCity(rs.getString("city"));
                address.setWard(rs.getString("ward"));
                address.setStreet(rs.getString("street"));
                // Assuming you want to add isDefault to the Address class
                address.setIsDefault(rs.getBoolean("is_Default"));
                
                addresses.add(address);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AddressDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return addresses;
    }
}
