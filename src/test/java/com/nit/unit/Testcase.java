package com.nit.unit;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.nit.test.Calucator;

import junit.framework.TestCase;

public class Testcase extends TestCase{
	
	private Calucator cal;

	public void setCal(Calucator cal) {
		this.cal = cal;
	}
	
	public Testcase() {
				// TODO Auto-generated constructor stub
			}
	
	@Before
	public void setup() throws Exception{
		cal= new Calucator();
		System.out.println("hello");
	}
	
	@Test
	public void testsum() {
		int acutresult = cal.sum(10, 5);
		assertEquals(15, acutresult);
		System.out.println(acutresult);
	}
	@After
	public  void  teardown() throws Exception{
		cal = null;
		System.out.println("hi");
	}
	
	
}
