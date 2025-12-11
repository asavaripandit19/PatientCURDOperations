package com.account.demo.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.account.demo.exception.IdNotFound;

@RestControllerAdvice
public class GlobalExceptionHandler {
	@ExceptionHandler({IdNotFound.class})
	public ResponseEntity<Map<String,String>> idNotFoundHandler(IdNotFound e) {
		Map<String,String> response=new HashMap<>();
		response.put("message",e.getMessage());
	return new ResponseEntity<Map<String,String>>(response,HttpStatus.BAD_REQUEST);
	}

}
