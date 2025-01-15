package com.spring.security.basic.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class ApplicationController {

	@RequestMapping("/")
	@PreAuthorize("hasAuthority('ROLE_USER')")
	public String index() {
		return "index";
	}

	@RequestMapping("/getHome")
	@PreAuthorize("hasAuthority('ROLE_ADMIN')")
	public String home() {
		return "home";
	}

	@PreAuthorize("hasAuthority('ROLE_USER')")
	@RequestMapping("/getAbout")
	public String about() {
		return "about";
	}
}
