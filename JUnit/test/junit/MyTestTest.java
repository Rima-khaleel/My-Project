/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junit;

import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author HATTRICK
 */
public class MyTestTest {
    
    public MyTestTest() {
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

    @Test
    public void testAdd() {
        System.out.println("add");
        String s1="2";
        String s2 = "2";
        MyTest instance = new MyTest();
        int expectedResult= 4;
        int result = instance.add(s1, s2);
        assertEquals(expectedResult,result);
      
    }
      @Test
     public void testAdd2() {
        System.out.println("add");
        String s1="3";
        String s2 = "2";
        MyTest instance = new MyTest();
        int expectedResult= 5;
        int result = instance.add(s1, s2);
        assertEquals(expectedResult,result);
      
    }
    @Test(expected=NumberFormatException.class)
    public void testAdd3() {
        System.out.println("add");
        String s1 = "for";
        String s2 = "2";
        MyTest instance = new MyTest();
        int result = instance.add(s1, s2);

    }

}
