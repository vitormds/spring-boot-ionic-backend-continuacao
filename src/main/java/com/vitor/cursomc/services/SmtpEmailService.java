package com.vitor.cursomc.services;

import javax.mail.internet.MimeMessage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

public class SmtpEmailService extends AbstractEmailService {

	@Autowired
	private MailSender mainSender;
	@Autowired
	private JavaMailSender javaMainSender;

	private static final Logger LOG = LoggerFactory.getLogger(MockEmailService.class);

	@Override
	public void sendEmail(SimpleMailMessage msg) {

		LOG.info("Enviando email");
		LOG.info(msg.toString());
		LOG.info("Email Enviado");
		mainSender.send(msg);
	}

	@Override
	public void sendHtmlEmail(MimeMessage msg) {

		LOG.info("Enviando email HTML");
		LOG.info(msg.toString());
		LOG.info("Email Enviado");
		javaMainSender.send(msg);

	}

}
