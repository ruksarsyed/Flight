package com.capg.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.model.EmailDetails;

@RestController
@RequestMapping("/email")
public class EmailSenderService {
	
	@Autowired
	private JavaMailSender mailSender;
	
	public void sendEmail(String toEmail,
			  String body,
			  String subject) {
		SimpleMailMessage message = new SimpleMailMessage();

		message.setFrom("keerthikorrapati07@gmail.com");
		message.setTo(toEmail);
		message.setText(body);	
		message.setSubject(subject);

		mailSender.send(message);
	}
	
	@PostMapping("/send-mail")
	public String sendMail(@RequestBody EmailDetails emailBody) {
		
		sendEmail(emailBody.getToEmail(), emailBody.getBody(), emailBody.getSubject());
		
		return "Confirmation email sent successfully to "+emailBody.getToEmail();
	}

}
