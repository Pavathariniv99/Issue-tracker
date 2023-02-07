package com.second.sample;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class formservice {
	
	PasswordEncoder passwordEncoder;
	@Autowired
	private formrepository repo;

	public List<formmodel>listAll() {
		this.passwordEncoder=new BCryptPasswordEncoder();
		return repo.findAll();
		
	}

	public void save( formmodel formmodel) {
		String encodedPassword=this.passwordEncoder.encode(formmodel.getPassword());
		formmodel.setPassword(encodedPassword);
		repo.save(formmodel);
		
	}
}




