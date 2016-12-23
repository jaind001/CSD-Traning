package com.worldpay.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BasicSalaryTest {

	EmployeeDetails details;
	EmployeeService service;
	
	@Before
	public void init(){
	details = new EmployeeDetails();
	service = new EmployeeService();
	}
	
	@Test
	public void getBasicSalaryTest(){
			double gross = service.getBasicSalary();
			
		}
	



}
