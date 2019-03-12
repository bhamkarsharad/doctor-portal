package com.clc.crud.services;

import java.util.List;

import com.clc.crud.beans.CustomerBean;

public interface CustomerService {

	public boolean addCustomer(CustomerBean bean);
	public CustomerBean getCustomer(int custId);
	public List<CustomerBean> getAllCustomer();
	public List<CustomerBean> deleteCustomer(int custId);
	public CustomerBean updateCustomer(CustomerBean bean);
	public int getTotalCustomers();
	public double getCustomerBalanceTotal();
	

	
	
}

