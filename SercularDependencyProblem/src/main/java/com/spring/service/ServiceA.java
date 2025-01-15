package com.spring.service;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Service
public class ServiceA {
	
	private final ServiceB serviceB;
	
	public ServiceA(@Lazy ServiceB serviceB) {
		this.serviceB=serviceB;
	}
	
	public String getMessageFromB() {
		return serviceB.getMessage();
	}

}
