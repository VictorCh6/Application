package com.bluesoft.application.dao;

import java.util.List;

import com.bluesoft.application.model.Contract;


public interface ContractDAO {

	public void insert(Contract student);
	
	public void update(Contract student);
	
	public List<Contract> select();

	void delete(String number);
	
	public void closeConnection();
}
