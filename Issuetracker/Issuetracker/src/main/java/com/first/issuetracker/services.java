package com.first.issuetracker;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional

public class services {
	
	@Autowired
	private repository repo;

	public List<pa> listAll() {
		return repo.findAll();
	}

	public void save(pa pa) {
		repo.save(pa);
	}

	public pa get(String id) {
		return repo.findById(id).get();
	}

}
