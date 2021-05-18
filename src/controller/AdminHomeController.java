/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import model.InsertUpdateDelete;
import model.select;
import view.AdminHome;
import view.login;

/**
 *
 * @author HP
 */
public class AdminHomeController {
    public static void jButton1ActionPerformed(java.awt.event.ActionEvent evt, AdminHome obj) {                                         
        // TODO add your handling code here:
        if(obj==null) return;
        int a = JOptionPane.showConfirmDialog(null, "Do you really want to log out?", "select", JOptionPane.YES_NO_OPTION);

        if (a == 0) {
            obj.setVisible(false);
        }
        new login().setVisible(true);
    }                                        

    public static void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {   
        // TODO add your handling code here:
        if(evt==null){
            System.err.println("null event");
            return;
        }
        int a = JOptionPane.showConfirmDialog(null, "Do you really want to close application?", "select", JOptionPane.YES_NO_OPTION);

        if (a == 0) {
            System.exit(0);
        }
    }                                        

    public static void jButton4ActionPerformed(java.awt.event.ActionEvent evt, AdminHome obj) { 
        // TODO add your handling code here:
        if(obj==null) return;
        obj.setVisible(false);
        new AdminHome().setVisible(true);
    }                                        

    public static void jButton3ActionPerformed(java.awt.event.ActionEvent evt, JTextField jTextField1, JTable jTable2) {                                         
        // TODO add your handling code here: ResutlSet rs=Select.getData("Select *from users");
        if(jTextField1==null || jTable2==null) return;
        String nameOrEmail = jTextField1.getText();
        ArrayList<String[]> rs = getUser(nameOrEmail);
        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        model.setRowCount(0);
        try {
            while (!rs.isEmpty()) {
                String[] set = rs.remove(0);
                model.addRow(new Object[]{set[0], set[1], set[2], set[3], set[4]});

            }
        } catch (Exception e) {

            JOptionPane.showInternalMessageDialog(null, e);
        }

    }                                        

    public static void jTable2MouseClicked(java.awt.event.MouseEvent evt, JTable jTable2, AdminHome obj) {                                     
        // TODO add your handling code here:
        if(obj==null || jTable2==null) return;
        int index = jTable2.getSelectedRow();
        TableModel model = jTable2.getModel();
        String email = model.getValueAt(index, 1).toString();
        String status = model.getValueAt(index, 4).toString();
        if (status.equals("true")) {
            status = "false";
        } else {
            status = "true";
        }
        try {

            int a = JOptionPane.showConfirmDialog(null, "Do you want to change status of " + email + "", "select", JOptionPane.YES_NO_OPTION);
            if (a == 0) {
                changeStatus(status, email);
                obj.setVisible(false);
                new AdminHome().setVisible(true);

            }
        } catch (Exception e) {

            JOptionPane.showInternalMessageDialog(null, e);
        }

    }                                    

    public static void formComponentShown(java.awt.event.ComponentEvent evt, JTable jTable2) {                                    
        // TODO add your handling code here:
        //public void formComponentShown(java.awt.event.ActionEvent evt){
        if(jTable2==null) return;
        ArrayList<String[]> rs = getAllUsers();
        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        model.setRowCount(0);
        try {
            while (!rs.isEmpty()) {
                String[] set = rs.remove(0);
                model.addRow(new Object[]{set[0], set[1], set[2], set[3], set[4]});

            }
        } catch (Exception e) {

            JOptionPane.showInternalMessageDialog(null, e);
        }
    }
    
    public static ArrayList getAllUsers(){
        ResultSet rs = select.getData("Select * from users");
        return populateList(rs);
    }
    
    public static ArrayList getUser(String nameOrEmail){
        ResultSet rs = select.getData("Select * from users where name like '%" + nameOrEmail + "%' or email like '%" + nameOrEmail + "%'");
        return populateList(rs);
    }
    
    public static ArrayList populateList(ResultSet rs){
        if(rs==null) return null;
        ArrayList<String[]> users = new ArrayList<>();
        try{
            while(rs.next()){
                users.add(new String[]{rs.getString(1), rs.getString(2), rs.getString(4), rs.getString(6), rs.getString(7)});
            }
            rs.close();
        }
        catch (Exception e) {
            JOptionPane.showInternalMessageDialog(null, e);
            e.printStackTrace();
        }
        return users;
    }
    
    public static boolean changeStatus(String status, String email) throws Exception {
        InsertUpdateDelete.setData("update users set status='" + status + "' where email='" + email + "';", "status changed successsfully");
        return true;
    }
}
