/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.ResultSet;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author HP
 */
public class selectTest {
    
    public selectTest() {
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
     * Test of getData method, of class select.
     */
    @Test
    public void testGetData() {
        System.out.println("getData");
        String query = "";
        ResultSet expResult = null;
        ResultSet result = select.getData(query);
        assertEquals(expResult, result);
        query = "select * from users";
        result = select.getData(query);
        assertNotNull(result);
    }
    
}
