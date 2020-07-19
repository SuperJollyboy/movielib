package com.movielib.exception;

import org.springframework.http.HttpStatus;

public class ApiException {
	
	private final String message;
	private final HttpStatus httpstatus;
	private final Throwable throwable;
	
		
	public ApiException(String message, HttpStatus httpstatus,Throwable throwable) {
		super();
		this.message = message;
		this.httpstatus = httpstatus;
		this.throwable = new Throwable();
	}
	
	public String getMessage() {
		return message;
	}
	public HttpStatus getHttpstatus() {
		return httpstatus;
	}

	public Throwable getThrowable() {
		return throwable;
	}
	
}
