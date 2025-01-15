package com.spring.service;

import org.springframework.stereotype.Service;

@Service
public class ServiceB {
	
	private final ServiceA serviceA;
	
	public ServiceB(ServiceA serviceA) {
		this.serviceA=serviceA;
	}
	
	public String getMessage() {
		return "Message from serviceB";
	}

}
