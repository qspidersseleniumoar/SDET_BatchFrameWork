package com.crm.customertest;

import org.testng.annotations.Test;

public class SampleTest {
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
	}
	@Test 
	public void deleteCustomerTest() {
		System.out.println("execute deleteCustomerTest");
}
}