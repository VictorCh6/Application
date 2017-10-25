package com.bluesoft.application.service;

import java.util.List;

import com.bluesoft.application.model.Contract;

public interface ContractService {

	public void insert(Contract contract);
		
	public void update(Contract contract);
		
	public List<Contract> select();

	void delete(String number);
		
	public void closeConnection();
}
