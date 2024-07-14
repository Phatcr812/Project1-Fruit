/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.duan1;

import Entity.Gallery;
import Entity.Product;
import Entity.User;
import Entity.User_Payment_Method;
import dao.GalleryDAO;
import dao.ProductDAO;
import dao.UserDAO;
import dao.User_Payment_MethodDAO;
import java.util.List;
import utils.XDate;

/**
 *
 * @author PC
 */
public class test {
    public static void main(String[] args) {
        User_Payment_MethodDAO dao = new User_Payment_MethodDAO();
        List<User_Payment_Method> list = dao.selectAll();
        User_Payment_Method upm = list.get(2);
//        upm.setUser_id(3);
//        upm.setPayment_type_id(1);
//        upm.setCard_number("0581000804383");
//        upm.setCard_holder_name("CHAU NGUYEN PHAT");
        upm.setExpiry_date(XDate.toDate("2024-11-15", "yyyy-MM-dd"));
//        upm.setProvider("Vietcombank");
        upm.setIs_default(false);
        dao.update(upm);
        for (User_Payment_Method upm1 : list) {
            System.out.println(upm1.toString());
        }
    }
}
