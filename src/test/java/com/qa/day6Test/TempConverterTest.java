package com.qa.day6Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

import com.qa.day6.TemperatureConverter;
import org.junit.BeforeClass;
import org.junit.Test;

public class TempConverterTest {

    @BeforeClass
    public void Initialisation(){
        TemperatureConverter temperatureConverter = new TemperatureConverter();
    }

    @Test
    public void test1(){
        assertEquals(37.777778, temperatureConverter.convertFahrenheitToCelsius(100),0);
    }
}
