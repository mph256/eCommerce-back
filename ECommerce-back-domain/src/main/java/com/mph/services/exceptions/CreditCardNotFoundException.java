package com.mph.services.exceptions;

import org.springframework.web.bind.annotation.ResponseStatus;

import org.springframework.http.HttpStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class CreditCardNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public CreditCardNotFoundException() {
		super("Credit card not found.");
	}

}