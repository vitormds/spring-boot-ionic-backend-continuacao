package com.vitor.cursomc.config;

import java.text.ParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.vitor.cursomc.services.DBService;

@Configuration
@Profile("test")
public class TesteConfig {
	@Autowired
	DBService dbservice;
	@Bean
	public boolean instantiateDataBase() throws ParseException {
		
		dbservice.instatiateTestDatabase();
		
		return true;
		
	}
}
