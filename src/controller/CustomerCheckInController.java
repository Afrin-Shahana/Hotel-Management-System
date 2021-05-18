/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.ResultSet;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import model.InsertUpdateDelete;
import model.select;
import view.CustomerCheckIn;

/**
 *
 * @author HP
 */
public class CustomerCheckInController {
    
    public static void roomDetails(JComboBox jComboBox4, JTextField jTextField8, JComboBox jComboBox2, JComboBox jComboBox3) {
        if(jComboBox4==null || jTextField8==null) return;
        jComboBox4.removeAllItems();
        jTextField8.setText("");
        String bed = (String) jComboBox2.getSelectedItem();
        String roomType = (String) jComboBox3.getSelectedItem();
        try {

            ResultSet rs = select.getData("select *from room where bed='" + bed + "' and roomType='" + roomType + "' and status='NOT Booked'");
            rs.beforeFirst();
            while(rs.next()){
                jComboBox4.addItem(rs.getString(1));//room number
            }

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e);
        }

    }                                          

    public static void jButton1ActionPerformed(java.awt.event.ActionEvent evt, CustomerCheckIn obj) {                                         
        if(obj==null) return;
        obj.setVisible(false);
    }                                        

    public static void jButton3ActionPerformed(java.awt.event.ActionEvent evt, CustomerCheckIn obj) {                                         
        if(obj==null) return;
        obj.setVisible(false);
        new CustomerCheckIn().setVisible(true);
    }                                                                                  

    public static void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt, JComboBox jComboBox4, JTextField jTextField8) {                                           
        if(jComboBox4==null || jTextField8==null) return;
        String roomNo = (String) jComboBox4.getSelectedItem();
        try {
            ResultSet rs = select.getData("select *from room where roomNo='" + roomNo + "'");
            while (rs.next()) {
                jTextField8.setText(rs.getString(4));//price is in 4th position in mysql
            }
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e);
        }
    }                                          

    public static void jButton2ActionPerformed(java.awt.event.ActionEvent evt, JTextField[] jtfArr, JComboBox[] jcbArr, CustomerCheckIn obj) {                                         
        // TODO add your handling code here:
        if(jtfArr==null||jcbArr==null||obj==null) return;
        int id = 1;
        String name = jtfArr[0].getText();
        String mobileNumber = jtfArr[1].getText();
        String nationality = jtfArr[2].getText();
        String gender = (String) jcbArr[0].getSelectedItem();
        String email = jtfArr[3].getText();
        String idProof = jtfArr[4].getText();
        String address = jtfArr[5].getText();
        String CheckIn = jtfArr[6].getText();
        String bed = (String) jcbArr[1].getSelectedItem();
        String roomType = (String) jcbArr[2].getSelectedItem();
        String roomNo = (String) jcbArr[3].getSelectedItem();
        String pricePerDay = jtfArr[7].getText();
        attemptBook(name, mobileNumber,nationality,gender,email,idProof,address,CheckIn,bed,roomType,roomNo,pricePerDay);
        obj.setVisible(false);
        new CustomerCheckIn().setVisible(true);
        
    }      
    
    public static void attemptBook(String name,
            String mobileNumber,
            String nationality,
            String gender,
            String email,
            String idProof,
            String address,
            String CheckIn,
            String bed,
            String roomType,
            String roomNo,
            String pricePerDay){
        String Query = "select max(id) from customer";
        if(name==null||name==""||mobileNumber==null||mobileNumber==""||roomNo==null||roomNo=="") return;
        int id = 0;
        try {

            ResultSet rs = select.getData(Query);
            while (rs.next()) {
                id = rs.getInt(1);
            }
            id = id + 1;
            //price should not be blank
            if (!pricePerDay.equals("")) {
                Query = "update room set status='Booked' where roomNo='" + roomNo + "'";
                InsertUpdateDelete.setData(Query, ""); // for "" will make msz part is not visible
                Query = "insert into customer(id,name,mobileNumber,nationality,gender,email,idProof,address,CheckIn,roomNo,bed,roomType,pricePerDay) values(" + id + ",'" + name + "','" + mobileNumber + "','" + nationality + "','" + gender + "','" + email + "','" + idProof + "','" + address + "','" + CheckIn + "','" + roomNo + "','" + bed + "','" + roomType + "','" + pricePerDay + "')";
                InsertUpdateDelete.setData(Query, "Customer check in successfully");

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            e.printStackTrace();

        }
    }
}
