package com.nit.unit;

import java.lang.reflect.Method;

import org.junit.After;
import org.junit.Before;

import com.nit.privatee.demoprivate;

public class Privatetest {
	private demoprivate demopt;
	@Before
	public void setUP() {
		System.out.println("setUp");
		demopt = new demoprivate();
	}
	
	public void Test_SayHi(String name) {
		Class c = Class.forName("demoprivate.class");
		Method m= c.getDeclaredMethod(demoprivate.class);
		m.setAccessible(true);
		
		Object obj = m.invoke(c, "hello");
		
	}
	
	@After
	public void teardown() {
		System.out.println("teardown");
		demopt = null;
	}
}
