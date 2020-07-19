
package com.movielib.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ApiExceptionHandler {

	@ExceptionHandler
	public ResponseEntity<Object> handleApiRequestionException(ApiRequestException e){
		//Create payload containing exception details - so we create class ApiException.Java
		ApiException apiException = new ApiException(e.getMessage(),HttpStatus.BAD_REQUEST,e.getCause());
		//Return reponse entity to this method with the new exception
		return new ResponseEntity<>(apiException,HttpStatus.BAD_REQUEST);
	}
	
}
