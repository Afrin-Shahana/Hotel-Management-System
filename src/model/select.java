/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class select {

    public static ResultSet getData(String query) {
        if(query==null||query=="")return null;
        Connection con = null;
        Statement st = null;
        ResultSet rs = null;

        try {
            con = ConnectionProvider.getCon();
            st = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            rs = st.executeQuery(query);
            return rs;

        } catch (Exception e) {

            JOptionPane.showConfirmDialog(null, e);
            return null;

        }

    }
}
