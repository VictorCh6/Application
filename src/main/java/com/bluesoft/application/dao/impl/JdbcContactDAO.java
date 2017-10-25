package com.bluesoft.application.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bluesoft.application.dao.ContractDAO;
import com.bluesoft.application.model.Contract;
import com.bluesoft.application.util.Database;


@Repository
public class JdbcContactDAO implements ContractDAO {
	
	@Autowired
	private	Database database;

	public void insert(Contract student) {
		// TODO Auto-generated method stub
		
	}

	public void update(Contract student) {
		// TODO Auto-generated method stub
		
	}

	public List<Contract> select() {
		// TODO Auto-generated method stub
		return null;
	}

	public void delete(String number) {
		// TODO Auto-generated method stub
		
	}

	public void closeConnection() {
		// TODO Auto-generated method stub
		
	}

}
