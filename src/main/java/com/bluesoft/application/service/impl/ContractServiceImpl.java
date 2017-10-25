package com.bluesoft.application.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bluesoft.application.dao.ContractDAO;
import com.bluesoft.application.model.Contract;
import com.bluesoft.application.service.ContractService;

@Service
public class ContractServiceImpl implements ContractService {

	@Autowired
	private ContractDAO contractDAO;
	
	public void insert(Contract contract) {
		contractDAO.insert(contract);
	}

	public void update(Contract contract) {
		contractDAO.update(contract);
	}

	public List<Contract> select() {
		return contractDAO.select();
	}

	public void delete(String number) {
		contractDAO.delete(number);
	}

	public void closeConnection() {
		contractDAO.closeConnection();		
	}
}
