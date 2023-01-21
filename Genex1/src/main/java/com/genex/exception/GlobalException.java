package com.genex.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class GlobalException {

	@ExceptionHandler(UserException.class)
	public ResponseEntity<MyErrorDetails> bookExceptionHandler(UserException exception , WebRequest wb){
		
		MyErrorDetails myerror = new MyErrorDetails(exception.getMessage(), LocalDateTime.now(),wb.getDescription(false));		
		
		return new ResponseEntity<>(myerror, HttpStatus.BAD_REQUEST);
		
		
	}
	
	
	
	
}
