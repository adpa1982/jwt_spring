package com.tutorial.auth.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

import com.tutorial.auth.dto.AuthUserDto;
import com.tutorial.auth.dto.TokenDto;
import com.tutorial.auth.entity.AuthUser;
import com.tutorial.auth.service.AuthUserService;

@RestController
@RequestMapping("/auth")
public class AuthUserController {

	@Autowired
	AuthUserService authUserService;

	@PostMapping("/login")
	public ResponseEntity<TokenDto> login(@RequestBody AuthUserDto dto) {
		TokenDto tokenDto = authUserService.login(dto);
		if (tokenDto == null) {
			return ResponseEntity.badRequest().build();
		}
		return ResponseEntity.ok(tokenDto);
	}

	@PostMapping("/validate")
	public ResponseEntity<TokenDto> validate(@RequestParam String token) {
		TokenDto tokenDto = authUserService.validate(token);
		if (tokenDto == null) {
			return ResponseEntity.badRequest().build();
		}
		return ResponseEntity.ok(tokenDto);
	}

	@PostMapping("/create")
	public ResponseEntity<AuthUser> create(@RequestBody AuthUserDto dto) {
		AuthUser authUser = authUserService.save(dto);
		if (authUser == null) {
			return ResponseEntity.badRequest().build();
		}
		return ResponseEntity.ok(authUser);
	}

}
