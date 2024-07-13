/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.duan1;

import Entity.User;
import dao.UserDAO;
import java.util.List;

/**
 *
 * @author PC
 */
public class test {
    public static void main(String[] args) {
        User u = new User();
        u.setName("Phat812");
        u.setPhone("0366155812");
        u.setPassword("123");
        u.setEmail("chauphat812@gmail.com");
        UserDAO dao = new UserDAO();
        dao.insert(u);
        List<User> list = dao.selectAll();
        for (User user : list) {
            System.out.println(user.toString());
        }
        System.out.println(u.toString());
        }
}
