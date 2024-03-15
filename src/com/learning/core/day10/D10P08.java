package com.learning.core.day10;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

class Calculator1{
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
}
public class D10P08 {
	Calculator1 calculator=new Calculator1();
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
}

