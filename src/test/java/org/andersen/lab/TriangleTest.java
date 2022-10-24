package org.andersen.lab;

import static org.andersen.lab.Triangle.triangleArea;
import static org.junit.Assert.*;
import org.junit.Test;


/**
 * Unit test for simple Triangle.
 */
public class TriangleTest
{

    @Test
    public void testValidInput()
    {
        int a = 3;
        int b = 3;
        int c = 3;
        double pp = (a + b + c) / 2.0;
        double result = Math.sqrt(pp * (pp - a) * (pp - b) * (pp - c));
        assertEquals(triangleArea(a, b, c), result, 0);
    }

    @Test
    public void negativeInputTest()
    {
        int a = -1;
        int b = 2;
        int c = 1;

        Exception exception = assertThrows(RuntimeException.class, () -> {
            triangleArea(a, b, c);
        });
        String expectedMessage = "In a triangle, side's length should be positive";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    public void invalidInputTest()
    {
        int a = 10;
        int b = 5;
        int c = 3;

        Exception exception = assertThrows(RuntimeException.class, () -> {
            triangleArea(a, b, c);
        });
        String expectedMessage = "In a triangle, the sum of any two sides must be greater than the third";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));
    }

}
