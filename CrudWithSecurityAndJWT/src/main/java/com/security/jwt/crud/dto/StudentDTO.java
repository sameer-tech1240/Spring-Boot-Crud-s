package com.security.jwt.crud.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.security.jwt.crud.validation.ValidPhoneNumber;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class StudentDTO {

	@JsonIgnore
	private int student_id;

	@NotBlank(message = "Student name cannot be blank")
	private String student_name;

	@NotBlank(message = "Student address cannot be blank")
	private String student_address;

	@ValidPhoneNumber
	private Long student_phoneNumber;

	@ValidPhoneNumber
	private Long student_emergencyContact;

}
