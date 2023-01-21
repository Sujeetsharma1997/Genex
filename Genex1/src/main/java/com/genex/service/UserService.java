package com.genex.service;

import com.genex.exception.UserException;
import com.genex.model.Users;
import com.genex.model.UsersDto;

public interface UserService{

	public Users createUsers(Users users) throws UserException;
	
	public Users loginUsers(UsersDto userdto) throws UserException;
	
	
}
