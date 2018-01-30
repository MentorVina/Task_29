package com.niit.DaoImpl;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.niit.Dao.SupplierDao;
import com.niit.Model.Supplier;
import com.niit.config.HibernateConfig;

public class SupplierDaoImpl implements SupplierDao {
	
	
	
	private HibernateConfig config;
	//List<Supplier> supplierList = new ArrayList<Supplier>();


	public boolean insertSupp(Supplier supplier) {
		
		config = new HibernateConfig();

		Session session = config.getSessionFac(config.getH2Data()).openSession();
		session.beginTransaction();
		session.save(supplier);
		session.getTransaction().commit();
		session.close();
		return(true);
		
		
	}
	
	public Supplier getSupplier(int id) {
		config = new HibernateConfig();
		Session session = config.getSessionFac(config.getH2Data()).openSession();
		session.beginTransaction();
		Supplier supplier = (Supplier) session.get(Supplier.class,id);
		session.getTransaction().commit();
		session.close();
		return supplier;
	}

	public boolean updateSupp(Supplier supplier) {
		  //supplierList.get(supplier.getSupplierId()).setSupplierId(supplier.getSupplierId());
	      //System.out.println("Student: Roll No " + supplier.getSupplierName() + ", updated in the database");

		config = new HibernateConfig();

		Session session = config.getSessionFac(config.getH2Data()).openSession();
		session.beginTransaction();
		session.update(supplier);
		session.getTransaction().commit();
		session.close();
		return(true);
		
	}

	public boolean deleteSupp(Supplier supplier) {
		config = new HibernateConfig();
		
		Session session = config.getSessionFac(config.getH2Data()).openSession();
		session.beginTransaction();
		session.delete(supplier);
		session.getTransaction().commit();
		session.close();
		return(true);
	}
	 //List<Supplier> supplier;

public List<Supplier> getAllSupp()
{
	config = new HibernateConfig();

     
	Session session = config.getSessionFac(config.getH2Data()).openSession();
    
	session.beginTransaction();
	List suppliers = session.createQuery("FROM Supplier").list(); 

	for (Iterator iterator = suppliers.iterator(); iterator.hasNext();)
	{
	   
		Supplier supplier  = (Supplier) iterator.next(); 
       //System.out.print("Supplier id: " + supplier.getSupplierId()); 
       
       //System.out.print("  Supplier Name: " +supplier.getSupplierName()); 
  
    }
    return(suppliers);
}
}


