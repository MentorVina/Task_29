package com.niit.Dao;

import java.util.List;

import com.niit.Model.Supplier;

public interface SupplierDao {
	
	public boolean insertSupp(Supplier supplier);
	public boolean updateSupp(Supplier supplier);
	public boolean deleteSupp(Supplier supplier);
	public List<Supplier> getAllSupp();
	 public Supplier getSupplier(int supplierId);
}
