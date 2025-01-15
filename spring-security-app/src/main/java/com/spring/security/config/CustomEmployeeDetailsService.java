package com.spring.security.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import com.spring.security.model.Employee;
import com.spring.security.repository.EmployeeRepo;

@Component
public class CustomEmployeeDetailsService implements UserDetailsService {

	@Autowired
	private EmployeeRepo employeeRepo;

	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		Employee findByEmail = employeeRepo.findByEmail(email);

		if (findByEmail == null)

			throw new UsernameNotFoundException("user name not found...");
		else

			return new CustomEmployee(findByEmail);

	}

}
