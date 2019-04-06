package com.nit.salarycount;

import org.easymock.EasyMock;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

public class TestSalaryCoumt extends TestCase {
	private PayslipGenerator payslip;
	private totalesalary salary;
	
	@Before
	public void setup() throws Exception {
		System.out.println("before test");
		payslip = new PayslipGenerator();
		salary = EasyMock.createMock(totalesalary.class);
	}
	
	@Test
	public void testsalarycount(){
		System.out.println("salary");
		EasyMock.expect(salary.salarycunt(Posostion.developer)).andReturn(4500.00);
		EasyMock.expect(salary.salarycunt(Posostion.Manager)).andReturn(85625.00);
		EasyMock.expect(salary.salarycunt(Posostion.teamleader)).andReturn(65000.00);
		EasyMock.replay(salary);
		payslip.setPosistion(Posostion.developer);
		payslip.setSalary(salary);
		payslip.generatesalary();
		
	}
	@After
	public void teardown() throws Exception{
		System.out.println("after test");
	}
}
