package com.nucleus.dao;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.nucleus.model.Customer;

@Repository
public class CustomerDaoImpl implements CustomerDao
{
	@Autowired
    SessionFactory sessionFactory;
	@Transactional
	public void saveRecord(Customer customer) 
	{	
		Date date=new Date();
		SimpleDateFormat simpleDateFormat=new SimpleDateFormat("dd/MM/yyyy");
		customer.setCreate_date(simpleDateFormat.format(date));
//		customer.setCreated_by();
		sessionFactory.getCurrentSession().persist(customer);	
	}	
	@Transactional
	public void deleteRecordByCustomerCode(String customer_code) 
	{
		System.out.println(customer_code);
		Customer customer=(Customer)sessionFactory.getCurrentSession().load(Customer.class,customer_code);
		if(customer!=null)
		{
			this.sessionFactory.getCurrentSession().delete(customer);
		}	
	}
	@Transactional
	public Customer getRecordByCustomerId(String customer_code) 
	{
		Customer customer1=(Customer)sessionFactory.getCurrentSession().get(Customer.class, customer_code);	
		return customer1 ;
	}
	//@SuppressWarnings("unchecked")
	@Transactional
	public List<Customer> show() 
	{		
		List<Customer> list1=sessionFactory.getCurrentSession().createQuery("from Customer").list();
		return list1;
	}
	@Transactional
	public Customer update2(Customer customer) 
	{
		sessionFactory.getCurrentSession().update(customer);
		return customer;
	
	}
	@Transactional
	public Customer update1(String customer_code) 
	{
		Customer customer3=(Customer)sessionFactory.getCurrentSession().get(Customer.class, customer_code);
		return customer3;
	}

}