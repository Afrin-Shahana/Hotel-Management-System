/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author HP
 */
import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.SQLException;

public class ConnectionProvider {

    public static Connection getCon() {

        // Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel","root","root");
        /*
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel","root","root");
        }
        catch(Exception e) 
        {
        return null;}
        return null;
    }
    
         */
        Connection con = null;
        try {
            // db parameters
            String url = "jdbc:mysql://localhost:3306/hotel";
            //String name      ="hotel";
            String user = "root";
            String password = "root";

            // create a connection to the database
            con = DriverManager.getConnection(url, user, password);
            // more processing here
            // ...	
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } /*finally {
            try {
                if (con != null) {
                    con.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }*/
        return con;
    }
}
