package com.crm.customertest;

import org.testng.annotations.Test;

public class CustomerTest {
	
	@Test 
	public void createCustomerTest() {
		String browser = System.getProperty("browser");
		String url = System.getProperty("url");
		
		System.out.println("browser NAme==>"+browser);
		System.out.println("url to be execute==>"+url);

		System.out.println("execute createCustomerTest");
	}
	
	@Test 
	public void modifyCustomerTest() {
		System.out.println("execute modifyCustomerTest");
		System.out.println("2nd commit");
		
		
	}
	@Test 
	public void deleteCustomerTest() {
		System.out.println("execute deleteCustomerTest");
	}

}
