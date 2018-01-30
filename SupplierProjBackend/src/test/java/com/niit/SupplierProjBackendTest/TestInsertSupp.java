package com.niit.SupplierProjBackendTest;

import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.Test;

import com.niit.Dao.SupplierDao;
import com.niit.DaoImpl.SupplierDaoImpl;
import com.niit.Model.Supplier;

public class TestInsertSupp {
	
private static SupplierDao supplierdao;
	
	@BeforeClass
	public static void set()
	{
		 supplierdao = new SupplierDaoImpl();
	}
@Test
	
	public void testinsertSupplier()
	{
	  Supplier supplier=new Supplier();
	  supplier.setSupplierId(12);
	  supplier.setSupplierName("Rahul");
	  
	   assertEquals("sucessful insert into table", true, supplierdao.insertSupp( supplier));
	

	
}

}
