package com.learning.core.day10;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

class Calculator2{
	public int add(int a,int b) {
		return a+b;
	}
	public int sub(int a,int b) {
		return a-b;
	}
	public int mul(int a,int b) {
		return a*b;
	}
	public int div(int a,int b) {
		if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return a / b;
	}
	 public int findMax(int[] arr) {
	        if (arr.length == 0) {
	            throw new IllegalArgumentException("Array cannot be empty");
	        }
	        int max = arr[0];
	        for (int i = 1; i < arr.length; i++) {
	            if (arr[i] > max) {
	                max = arr[i];
	            }
	        }
	        return max;
	    }
}
public class D10P09 {
	Calculator2 calculator = new Calculator2();
	@Test
	public void testAdd() {
		assertEquals(5, calculator.add(2, 3));
	}
	
	@Test
	public void testSub() {
		assertEquals(3, calculator.sub(5, 2));
	}
	@Test
    public void testMultiply() {
        assertEquals(15, calculator.mul(3, 5));
    }

    @Test
    public void testDivide() {
        assertEquals(2, calculator.div(10, 5));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivideByZero() {
        calculator.div(10, 0);
    }

    @Test
    public void testFindMax1() {
        int[] arr = {1, 2, 3, 4, 5, 6};
        assertEquals(6, calculator.findMax(arr));
    }

    @Test
    public void testFindMax2() {
        int[] arr = {-1, -1, -2, -3, -4, -5, -67};
        assertEquals(-1, calculator.findMax(arr));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindMaxEmptyArray() {
        int[] arr = {};
        calculator.findMax(arr);
    }

}
