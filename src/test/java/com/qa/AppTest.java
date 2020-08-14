package com.qa;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;


import com.qa.day2.Calculator;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.BeforeClass;

public class AppTest 
{
    //@Before
    //Calculator calculator = new Calculator();
    // import com.qa.day2.ClassExample;

  //  static Calculator calculator;
   // static ClassExample classExample;
   // static Customer customer;

   // @BeforeClass
         //   public static void initialise() {
        // Calculator calculator = new Calculator();
       // ClassExample classExample = new ClassExample();
      //  Customer customer = new Customer();
   // }


    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        assertEquals( 5, calculator.Sum(2,3));
    }

    //@Test
    //public void testSubstraction() {
      //  assertEquals( -1,calculator.Subtraction(2,3) );
    //}

    //@Test
    //public void testDivision(){
    //    assertEquals( 0,calculator.Division(3,6) ,0);
    //}

    //@Test
    //public void testMultiplication(){
    //    assertEquals( 6,calculator.Multiplication(2,3) );
    //}

   //@Test
   // public void test2(){
   //    assertSame(classExample.Customer("Alessia","M").fname, "Alessia");
   // }
}
