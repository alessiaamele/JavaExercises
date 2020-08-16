//package com.qa.day6Test;
//
//import static org.junit.Assert.assertTrue;
//import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertSame;
//
//import org.junit.BeforeClass;
////import org.junit.Test;
//
//public class TempConverterTest {
//
//    TemperatureConverter temp;
//
//    @BeforeClass
//    public static void Initialisation(){
//        TemperatureConverter temp = new TemperatureConverter();
//    }
//
//    @Test
//    public void test1(){
//        assertEquals(37.777778, temp.convertFahrenheitToCelsius(100),0.1);
//    }
//
//    @Test
//    public void test2(){
//        assertEquals(37.777778, temp.convertFahrenheitToCelsius(100),0.1);
//
//    }
//}
//
//    static Temp calc;
//    @BeforeClass
//    public static void initialising(){
//        Temp calc = new Temp();
//    }
//    @Test
//    public void Temp()
//    {
//        assertEquals(37.7778, calc.convertFahrenheitToCelsius(100),0.10);
//    }
//    @Test
//    public void Temp2()
//    {
//        assertEquals(50, calc.convertCelsiusToFahrenheit(10),0.10);
//    }
//    @Test
//    public void Temp3()
//    {
//        assertEquals(27, calc.convertKelvinToCelsius(300),0);
//    }
//    @Test
//    public void Temp4()
//    {
//        assertEquals(283, calc.convertCelsiusToKelvin(10),0);
//    }
//    @Test
//    public void Temp5()
//    {
//        assertEquals(80.6, calc.convertKelvinToFahrenheit(300),0.10);
//    }
//    boolean bool;
//    @Test
//    public void Temp6()
//    {
//        assertEquals(283, calc.convertFahrenheitToKelvin(50),0.10);
//        if (calc.convertFahrenheitToKelvin(32) == 273){
//            bool = true;
//        }
//        assertTrue("True",bool);
//
//    }