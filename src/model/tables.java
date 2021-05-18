/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class tables {

    public static void main(String[] args) {
        Connection con = null;
        Statement st = null;
        try {

            con = ConnectionProvider.getCon();

            st = con.createStatement();
            st.executeUpdate("create table users(name varchar(200),email varchar(200),passwod varchar(50),answer varchar(200),adderss varchar(200),status varchar(200)); ");
            st.executeUpdate("create table room(roomNo varchar(10),roomType varchar(200),bed varchar(200),price int,status varchar(20));");
            //creating table 
            //eita mysql e create holo 
            //go to mysql type >>>>>desc customer;
            st.executeUpdate("create table customer(id int,name varchar(200),mobileNumber varchar(11),nationality varchar(200),gender varchar(50),email varchar(200),idProof varchar(200),address varchar(500),checkIn varchar(50),roomNo varchar(10),bed varchar(200),roomType varchar(200),pricePerDay int(10),numberOfDaysStay int(10),totalAmount varchar(200),checkout varchar(50));");

            JOptionPane.showMessageDialog(null, "Table created successfully");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);

        }

    }

}
