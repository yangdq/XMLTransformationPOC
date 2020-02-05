package com.maximus.osbtransform.service;


import java.util.Properties;

import javax.mail.Message;
import javax.mail.Multipart;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.psi.vida.services.email._1.SendEmail;

@Service
public class EmailService {

    @Value("${email.smtpserver}")
    private String smtpServer;
    
    @Value("${email.port}")
    private String port;

    @Value("${email.fromAddress}")
    private String fromAddress;
    
    @Value("${email.replyToAddress}")
    private String replyToAddress;
    
    @Value("${email.toAddress}")
    private String toAddress;
    
    private Properties emailProp;
    
    public EmailService() {

    }
    
    private void loadEmailProperties() {
    	if(emailProp == null) {
        	emailProp = new Properties();
        	emailProp.put("mail.smtp.auth", false);
        	emailProp.put("mail.smtp.host", smtpServer);
        	emailProp.put("mail.smtp.port", port);
    	}
    }

    public void sendEmail(SendEmail mail) {
    	loadEmailProperties();
    	Session session = Session.getInstance(emailProp);
    	Message message = new MimeMessage(session);
    	String subject = mail.getEmail().getSubject();
    	String content = mail.getEmail().getContent();
    	String contentType = mail.getEmail().getContentType();
    	
    	try {
	    	message.setFrom(new InternetAddress(fromAddress));
	    	message.setRecipients(
	    	  Message.RecipientType.TO, InternetAddress.parse(toAddress));
	    	message.setSubject(subject);
	    	 
	    	MimeBodyPart mimeBodyPart = new MimeBodyPart();
	    	mimeBodyPart.setContent(content, contentType);
	    	 
	    	Multipart multipart = new MimeMultipart();
	    	multipart.addBodyPart(mimeBodyPart);
	    	 
	    	message.setContent(multipart);
	    	Transport.send(message);
	    	
    	}catch(Exception e) {
    		e.printStackTrace();
    		throw new RuntimeException(e.getCause());
    	}
    	
    }


}