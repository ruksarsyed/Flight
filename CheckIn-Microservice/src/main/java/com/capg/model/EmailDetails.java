package com.capg.model;


public class EmailDetails {

	private String toEmail;
	private String body;
	private String subject;
	
	public String getToEmail() {
		return toEmail;
	}
	public void setToEmail(String toEmail) {
		this.toEmail = toEmail;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public EmailDetails() {
	}
	public EmailDetails(String toEmail, String body, String subject) {
		this.toEmail = toEmail;
		this.body = body;
		this.subject = subject;
	}
}
