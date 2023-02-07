package com.first.demo;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;




@Service
@Transactional
public class issueservice {
	
	@Autowired
	private issuerepository repo;

	public List<issuemodel>listAll() {
		return repo.findAll();
	}

	public void save(issuemodel issuemodel) {
		repo.save(issuemodel);
	}

	public issuemodel get(String id) {
		return repo.findById(id).get();
	}

}