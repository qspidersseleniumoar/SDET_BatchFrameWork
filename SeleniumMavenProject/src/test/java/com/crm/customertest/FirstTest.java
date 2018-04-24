package com.crm.customertest;

import org.testng.annotations.Test;

public class FirstTest {
	@Test 
	public void createCustomerTest1() {
		String browser = System.getProperty("browser");
		String url = System.getProperty("url");
		
		System.out.println("browser NAme==>"+browser);
		System.out.println("url to be execute==>"+url);

		System.out.println("execute createCustomerTest");
	}
	
	@Test 
	public void modifyCustomerTest2() {
		System.out.println("execute modifyCustomerTest");
	}
	@Test 
	public void deleteCustomerTest3() {
		System.out.println("execute deleteCustomerTest");
}
}
