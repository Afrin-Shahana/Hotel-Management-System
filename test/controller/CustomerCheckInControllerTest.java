/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import view.CustomerCheckIn;

/**
 *
 * @author HP
 */
public class CustomerCheckInControllerTest {
    
    public CustomerCheckInControllerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of roomDetails method, of class CustomerCheckInController.
     */
    @Test
    public void testRoomDetails() {
        System.out.println("roomDetails");
        JComboBox jComboBox4 = null;
        JTextField jTextField8 = null;
        JComboBox jComboBox2 = null;
        JComboBox jComboBox3 = null;
        CustomerCheckInController.roomDetails(jComboBox4, jTextField8, jComboBox2, jComboBox3);
    }

    /**
     * Test of jButton1ActionPerformed method, of class CustomerCheckInController.
     */
    @Test
    public void testJButton1ActionPerformed() {
        System.out.println("jButton1ActionPerformed");
        ActionEvent evt = null;
        CustomerCheckIn obj = null;
        CustomerCheckInController.jButton1ActionPerformed(evt, obj);
    }

    /**
     * Test of jButton3ActionPerformed method, of class CustomerCheckInController.
     */
    @Test
    public void testJButton3ActionPerformed() {
        System.out.println("jButton3ActionPerformed");
        ActionEvent evt = null;
        CustomerCheckIn obj = null;
        CustomerCheckInController.jButton3ActionPerformed(evt, obj);
    }

    /**
     * Test of jComboBox4ActionPerformed method, of class CustomerCheckInController.
     */
    @Test
    public void testJComboBox4ActionPerformed() {
        System.out.println("jComboBox4ActionPerformed");
        ActionEvent evt = null;
        JComboBox jComboBox4 = null;
        JTextField jTextField8 = null;
        CustomerCheckInController.jComboBox4ActionPerformed(evt, jComboBox4, jTextField8);
    }

    /**
     * Test of jButton2ActionPerformed method, of class CustomerCheckInController.
     */
    @Test
    public void testJButton2ActionPerformed() {
        System.out.println("jButton2ActionPerformed");
        ActionEvent evt = null;
        JTextField[] jtfArr = null;
        JComboBox[] jcbArr = null;
        CustomerCheckIn obj = null;
        CustomerCheckInController.jButton2ActionPerformed(evt, jtfArr, jcbArr, obj);
    }

    /**
     * Test of attemptBook method, of class CustomerCheckInController.
     */
    @Test
    public void testAttemptBook() {
        System.out.println("attemptBook");
        String name = "";
        String mobileNumber = "";
        String nationality = "";
        String gender = "";
        String email = "";
        String idProof = "";
        String address = "";
        String CheckIn = "";
        String bed = "";
        String roomType = "";
        String roomNo = "";
        String pricePerDay = "";
        CustomerCheckInController.attemptBook(name, mobileNumber, nationality, gender, email, idProof, address, CheckIn, bed, roomType, roomNo, pricePerDay);

    }
    
}
