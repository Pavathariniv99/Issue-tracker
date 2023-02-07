package com.first.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


	@Service
	@Transactional
	public class departmentservice {
		
		
		@Autowired
		private departmentrepository repo;

		public List<departmentmodel>listAll() {
			return repo.findAll();
		}
		public void save(departmentmodel departmentmodel) {
			repo.save(departmentmodel);
		}
		 
		public departmentmodel get(String departname) {
			return repo.findById(departname).get();
		}

		
		public void delete(String departname) {
			repo.deleteById(departname);
			}
		

}
