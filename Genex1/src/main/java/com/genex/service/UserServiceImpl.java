package com.genex.service;

import java.net.UnknownServiceException;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.genex.exception.UserException;
import com.genex.model.Users;
import com.genex.model.UsersDto;
import com.genex.repo.UserDao;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
 private UserDao userdao;
	
	
	@Override
	public Users createUsers(Users users) throws UserException{
	
		return userdao.save(users);
		
	}

	@Override
	public Users loginUsers(UsersDto userdto) throws UserException{
		
	Users u=	userdao.findByEmail(userdto.getEmail());
		
	if(u==null) {
		throw new UserException("users not found with this email");
		
	}
	
	if (!u.getPassword().equals(userdto.getPassword())) {
		throw new UserException("Wrong password");
		
	}
	return u;
	
	}

}
