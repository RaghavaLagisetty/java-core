package com.learning.core.day10;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

class Calculator{
	public int add(int a,int b) {
		return a+b;
	}
	public int sub(int a,int b) {
		return a-b;
	}
}
public class D10P07 {
	Calculator calculator=new Calculator();
	@Test
	public void testAdd() {
		assertEquals(5, calculator.add(2, 3));
	}
	
	@Test
	public void testSub() {
		assertEquals(3, calculator.sub(5, 2));
	}
}
