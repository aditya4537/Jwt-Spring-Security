package com.example.springsecurityjwt.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springsecurityjwt.dto.AuthenticationRequest;
import com.example.springsecurityjwt.dto.AuthenticationResponse;
import com.example.springsecurityjwt.dto.RegisterRequest;
import com.example.springsecurityjwt.service.AuthenticationService;

import lombok.RequiredArgsConstructor;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class AutheticationController {
	
	private final AuthenticationService service;
	
	@PostMapping("/register")
	public ResponseEntity<AuthenticationResponse> register(@RequestBody  RegisterRequest request) {
		return ResponseEntity.ok(service.register(request));
		
	}
	@PostMapping("/authenticate")
	public ResponseEntity<AuthenticationResponse> authenticate(@RequestBody  AuthenticationRequest request) {
		return ResponseEntity.ok(service.authenticate(request));
		
	}
	
}
