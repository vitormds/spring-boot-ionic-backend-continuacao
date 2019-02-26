package com.vitor.cursomc.resources;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.vitor.cursomc.dto.EmailDto;
import com.vitor.cursomc.security.JWTUtil;
import com.vitor.cursomc.security.UserSS;
import com.vitor.cursomc.services.AuthService;
import com.vitor.cursomc.services.UserService;

@RestController
@RequestMapping(value="/auth")
public class AuthResource {
	
	@Autowired JWTUtil jwtUtil;
	
	@Autowired private AuthService service;
	@RequestMapping(value="/refresh_token", method=RequestMethod.POST) 
	public ResponseEntity<Void> refreshToken(HttpServletResponse response) {
		UserSS user = UserService.authenticad(); 
		String token = jwtUtil.generateToken(user.getUsername()); 
		response.addHeader("Authorization", "Bearer " + token); 
		return ResponseEntity.noContent().build(); 
		}
	@RequestMapping(value="/forgot", method=RequestMethod.POST) 
	public ResponseEntity<Void> forgot(@Valid @RequestBody EmailDto objDto) {
		service.sendNewPassword(objDto.getEmail());
		return ResponseEntity.noContent().build(); 
		}
}
