package com.niit.SupplierProjBackendTest;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;

import com.niit.Dao.SupplierDao;
import com.niit.DaoImpl.SupplierDaoImpl;
import com.niit.Model.Supplier;

public class TestAllSupp {
	private static SupplierDao supplierdao;

	@BeforeClass
	public static void set()
	{
		 supplierdao=new SupplierDaoImpl();
	}

	@Test
	
	public void testallSupplier()
	{
	
	List<Supplier> supplierList = new ArrayList<Supplier>();
	
	supplierList=supplierdao.getAllSupp();
	
	if(supplierList.isEmpty())
	{
		

		System.out.println("error");
		
	}
	else
	{

		for(Supplier supplier: supplierList){
			System.out.println("Supplier Id:"+ supplier.getSupplierId() + "Supplier Name:"+ supplier.getSupplierName());
			
			
			}
		
		}
	}
}

