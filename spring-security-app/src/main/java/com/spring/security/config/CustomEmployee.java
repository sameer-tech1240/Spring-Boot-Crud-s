package com.spring.security.config;

import java.util.Arrays;
import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.spring.security.model.Employee;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CustomEmployee implements UserDetails {
	private static final long serialVersionUID = 1L;

	private Employee employee;

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		SimpleGrantedAuthority authority = new SimpleGrantedAuthority(employee.getRole());

		return Arrays.asList(authority);
	}

	@Override
	public String getPassword() {

		return employee.getPassword();
	}

	@Override
	public String getUsername() {

		return employee.getEmail();
	}

	@Override
	public boolean isAccountNonExpired() {
		return UserDetails.super.isAccountNonExpired();
	}

	@Override
	public boolean isAccountNonLocked() {
		return UserDetails.super.isAccountNonLocked();
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return UserDetails.super.isCredentialsNonExpired();
	}

	@Override
	public boolean isEnabled() {
		return UserDetails.super.isEnabled();
	}

}
