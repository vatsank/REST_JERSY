package com.training.domains;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ErrorProperties {

	private String status;
	private String errorMessage;
	public ErrorProperties(){}
	public ErrorProperties(String statusFromOutside, String errorMessageFromOutside)
	{
	this.status = statusFromOutside;
	this.errorMessage = errorMessageFromOutside;
	}
	public String getErrorMessage() {
	return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
	this.errorMessage = errorMessage;
	}
	public String getStatus() {
	return status;
	}
	public void setStatus(String status) {
	this.status = status;
	}	
	
}
