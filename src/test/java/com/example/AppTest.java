package com.example;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class AppTest {
    @Test public void testFactorialFive() { assertEquals(120L, new App().factorial(5)); }
    @Test public void testFactorialZero() { assertEquals(1L, new App().factorial(0)); }
}