package com.niit.SupplierProjBackend;

import com.niit.Dao.SupplierDao;
import com.niit.DaoImpl.SupplierDaoImpl;
import com.niit.Model.Supplier;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
    	/*Supplier supplier=new Supplier();
    	supplier.setSupplierId(10);
    	supplier.setSupplierName("Vina");*/
    	
    	
    	SupplierDao supplierdao=new SupplierDaoImpl();
    	 
    	//Display all table data
    	//supplierdao.getAllSupp();
    	//System.out.println("Display all table data");
    	
    	//Insert data in to table
    	
           // supplierdao.insertSupp(supplier);
    	 //System.out.println("sucessfully inserted in table");
    	 
    	 
    	 // get single user
    	 
     	//System.out.println("Single data printed");
  		//Supplier supplier = (Supplier)supplierdao.getSupplier(10);
 		//System.out.println(supplier.getSupplierId()+" "+supplier.getSupplierName());
     	
    	 //delete single user
    	 
    	//Supplier supplier = (Supplier)supplierdao.getSupplier(10);
    	//supplierdao.deleteSupp(supplier);
    	 //  System.out.println("sucessfully deleted");
    
           //update single user
    	
    	//Supplier supplier = (Supplier)supplierdao.getSupplier(10);
         //supplier.setSupplierName("Michael");
         //supplierdao.updateSupp(supplier);
         //System.out.println("sucessfully updated");
         
    	
    	
    
    }
}

    	
    	
    