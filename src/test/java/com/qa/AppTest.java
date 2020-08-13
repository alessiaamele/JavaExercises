package com.qa;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AppTest 
{
    //@Before
    //Calculator calculator = new Calculator();

    @Test
    public void test1() {
        Calculator calculator = new Calculator();
        assertEquals( "2+3 should equal 5",5,calculator.Sum(2,3) );
        assertEquals( "2*3 should equal 6",6,calculator.Multiplication(2,3) );
        assertEquals( "2-3 should equal -1",-1,calculator.Substraction(2,3) );
        assertEquals( "6/3 should equal 2",2,calculator.Division(6,3) );
    }

   // @After
   // calculator = null;
}
