package com.nit.salarycount;

public class PayslipGenerator {
	
	private totalesalary salary;
	private Posostion posistion;
	
	//setter method 
	public void setSalary(totalesalary salary) {
		this.salary = salary;
	}

	public void setPosistion(Posostion posistion) {
		this.posistion = posistion;
	}
	
	
	public void generatesalary() {
		if(salary == null)
			throw new RuntimeException("Service not yet maintained");
		
		if(posistion == null)
			throw new RuntimeException("Posistin not yet maintained");
	
		double camputssalry = salary.salarycunt(posistion);
		System.out.println("Payslip getting generate :"+posistion);
		System.out.println(" with salary :"+camputssalry);
	
	}

}
