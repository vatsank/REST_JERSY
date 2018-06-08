package com.training.execeptions;

public class ItemNotFoundException extends RuntimeException {

	private String message;

	public ItemNotFoundException(String message) {
		super();
		this.message = message;
	}

	@Override
	public String getMessage() {
		return this.message;
	}
	
	
	
}
