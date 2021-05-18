/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ComponentEvent;
import java.awt.event.MouseEvent;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.JTextField;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import view.AdminHome;

/**
 *
 * @author HP
 */
public class AdminHomeControllerTest {
    
    public AdminHomeControllerTest() {
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
     * Test of jButton1ActionPerformed method, of class AdminHomeController.
     */
    @Test
    public void testJButton1ActionPerformed() {
        System.out.println("jButton1ActionPerformed");
        ActionEvent evt = null;
        AdminHome obj = null;
        AdminHomeController.jButton1ActionPerformed(evt, obj);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of jButton2ActionPerformed method, of class AdminHomeController.
     */
    @Test
    public void testJButton2ActionPerformed() {
        System.out.println("jButton2ActionPerformed");
        ActionEvent evt = null;
        AdminHomeController.jButton2ActionPerformed(evt);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of jButton4ActionPerformed method, of class AdminHomeController.
     */
    @Test
    public void testJButton4ActionPerformed() {
        System.out.println("jButton4ActionPerformed");
        ActionEvent evt = null;
        AdminHome obj = null;
        AdminHomeController.jButton4ActionPerformed(evt, obj);
    }

    /**
     * Test of jButton3ActionPerformed method, of class AdminHomeController.
     */
    @Test
    public void testJButton3ActionPerformed() {
        System.out.println("jButton3ActionPerformed");
        ActionEvent evt = null;
        JTextField jTextField1 = null;
        JTable jTable2 = null;
        AdminHomeController.jButton3ActionPerformed(evt, jTextField1, jTable2);
    }

    /**
     * Test of jTable2MouseClicked method, of class AdminHomeController.
     */
    @Test
    public void testJTable2MouseClicked() {
        System.out.println("jTable2MouseClicked");
        MouseEvent evt = null;
        JTable jTable2 = null;
        AdminHome obj = null;
        AdminHomeController.jTable2MouseClicked(evt, jTable2, obj);
    }

    /**
     * Test of formComponentShown method, of class AdminHomeController.
     */
    @Test
    public void testFormComponentShown() {
        System.out.println("formComponentShown");
        ComponentEvent evt = null;
        JTable jTable2 = null;
        AdminHomeController.formComponentShown(evt, jTable2);
    }

    /**
     * Test of getAllUsers method, of class AdminHomeController.
     */
    @Test
    public void testGetAllUsers() {
        System.out.println("getAllUsers");
        ArrayList result = AdminHomeController.getAllUsers();
        assertNotNull(result);
    }

    /**
     * Test of getUser method, of class AdminHomeController.
     */
    @Test
    public void testGetUser() {
        System.out.println("getUser");
        String nameOrEmail = "";
        ArrayList result = AdminHomeController.getUser(nameOrEmail);
        assertNotNull(result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of populateList method, of class AdminHomeController.
     */
    @Test
    public void testPopulateList() {
        System.out.println("populateList");
        ResultSet rs = null;
        ArrayList expResult = null;
        ArrayList result = AdminHomeController.populateList(rs);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of changeStatus method, of class AdminHomeController.
     */
    @Test
    public void testChangeStatus() throws Exception {
        System.out.println("changeStatus");
        String status = "";
        String email = "";
        boolean result = AdminHomeController.changeStatus(status, email);
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(true, result);
    }
    
}
