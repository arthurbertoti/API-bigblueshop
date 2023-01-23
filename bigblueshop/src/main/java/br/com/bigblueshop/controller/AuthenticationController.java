package br.com.bigblueshop.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.bigblueshop.config.security.TokenService;
import br.com.bigblueshop.dto.TokenDto;
import br.com.bigblueshop.service.form.LoginForm;

@RestController
@RequestMapping("/auth")
public class AuthenticationController {

	@Autowired
	private AuthenticationManager authManager;

	@Autowired
	private TokenService tokenService;
	
	@PostMapping
	public ResponseEntity<?> authenticate(@RequestBody @Valid LoginForm form) {		
		UsernamePasswordAuthenticationToken loginData = form.convert();
		try {
			Authentication authentication = authManager.authenticate(loginData);
			
			String token = tokenService.generateToken(authentication);
			String type = "Bearer";
			
			return ResponseEntity.ok(new TokenDto(token, type));
		} catch (AuthenticationException e) {
			
			return ResponseEntity.badRequest().build();
			
		}
	}

}
