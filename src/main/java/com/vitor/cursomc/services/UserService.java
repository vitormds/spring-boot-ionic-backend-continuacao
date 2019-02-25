package com.vitor.cursomc.services;

import org.springframework.security.core.context.SecurityContextHolder;

import com.vitor.cursomc.security.UserSS;

public class UserService {
	//Pegando o usuário logado
	public static UserSS authenticad() {
		try {
			return (UserSS) SecurityContextHolder.getContext().getAuthentication().getPrincipal();	
		}catch (Exception e) {
			return null;
		}
		
	}

}
