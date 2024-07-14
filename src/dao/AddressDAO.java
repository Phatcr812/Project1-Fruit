/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import Entity.Address;
import java.util.List;
import utils.jdbcHelper;

/**
 *
 * @author PC
 */
public class AddressDAO extends EduSysDAO<Address, String>{
    final String INSERT_SQL = "EXEC CreateAddress @user_id = ?, @city= ?, @ward = ?, @street = ?";
    final String UPDATE_SQL = "EXEC UpdateUserAddress @user_id = ?, @address_id = ?, @city = ?, @ward = ?, @street = ?";
    final String DELETE_SQL = "DELETE FROM Category\n" +
                              "WHERE id = ?";
    final String SELECT_ALL_SQL = "SELECT * FROM Category";
    final String SELECT_BY_ID_SQL = "SELECT * FROM Category where id = ?";
    @Override
    public void insert(Address entity) {
        jdbcHelper.update(INSERT_SQL, entity.getId());
    }

    @Override
    public void update(Address entity) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(String id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Address> selectAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Address selectById(String id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Address> selectBySql(String sql, Object... args) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
