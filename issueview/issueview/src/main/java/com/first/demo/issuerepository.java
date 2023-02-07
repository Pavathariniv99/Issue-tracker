package com.first.demo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.first.demo.issuemodel;

public interface issuerepository extends  JpaRepository<issuemodel,String> {
	

}




