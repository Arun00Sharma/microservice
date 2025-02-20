package com.example.userService.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.example.userService.payload.ApiResponse;

@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<ApiResponse> handlerResouceNotFoundException(ResourceNotFoundException ex){
		String message=ex.getMessage();
		ApiResponse apiResponse = new ApiResponse(message,true,HttpStatus.NOT_FOUND);
	  return new ResponseEntity<>(apiResponse,HttpStatus.NOT_FOUND);
	}
}
