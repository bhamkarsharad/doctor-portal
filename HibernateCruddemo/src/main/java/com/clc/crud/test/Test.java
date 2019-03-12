package com.clc.crud.test;

import com.clc.crud.service.impl.CustomerServiceImpl;
import com.clc.crud.services.CustomerService;

public class Test {

	public static void main(String[] args) {

		CustomerService service=new CustomerServiceImpl();
	/*	
		for (int i = 11; i <= 20; i++) {
			service.addCustomer(new CustomerBean(i,"sharad"+i,"bhamkar",25,12345));
			
		}*/
		System.out.println(service.getCustomerBalanceTotal());
		
		//System.out.println(service.getCustomerBalanceTotal());
		System.out.println(service.deleteCustomer(1));
		System.out.println(service.getTotalCustomers());
				
	}

}
