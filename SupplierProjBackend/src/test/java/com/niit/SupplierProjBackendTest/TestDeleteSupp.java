package com.niit.SupplierProjBackendTest;

import static org.junit.Assert.assertEquals;

import org.hibernate.Session;
import org.junit.BeforeClass;
import org.junit.Test;

import com.niit.Dao.SupplierDao;
import com.niit.DaoImpl.SupplierDaoImpl;
import com.niit.Model.Supplier;
import com.niit.config.HibernateConfig;

public class TestDeleteSupp {
	private static SupplierDao supplierdao;
	private static HibernateConfig config;
		
	@BeforeClass
	public static void setUp(){
		supplierdao = new SupplierDaoImpl();
		config=new HibernateConfig();
	}

	@Test
	public void testdeleteSupplier(){
		Session session = config.getSessionFac(config.getH2Data()).openSession();
		session.beginTransaction();
	
		Supplier supplier = (Supplier)supplierdao.getSupplier(12);
		
		 assertEquals("sucessful insert into table",true, supplierdao.deleteSupp(supplier));
		
	}

}
