package com.genex.repo;

import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.genex.exception.UserException;
import com.genex.model.Users;

@Repository
public interface UserDao extends JpaRepository<Users, String>{

	public Users findByEmail(String email) throws UserException; 
	
	
}
