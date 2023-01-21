package com.genex.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Users {

	@Id
	private String email;
	private String password;
	private String firstName;
	private String lastName;
	private Gender gender;
	
}
