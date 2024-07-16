/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.duan1;

import Entity.Address;
import Entity.Gallery;
import Entity.Product;
import Entity.Review;
import Entity.User;
import Entity.User_Payment_Method;
import dao.AddressDAO;
import dao.GalleryDAO;
import dao.ProductDAO;
import dao.ReviewDAO;
import dao.UserDAO;
import dao.User_Payment_MethodDAO;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import utils.XDate;

/**
 *
 * @author PC
 */
public class test {
    public static void main(String[] args) {
        AddressDAO dao = new AddressDAO();
        List<Address> list = dao.selectByUserId(1);
        for (Address address : list) {
            System.out.println(address);
        }
    }
}
