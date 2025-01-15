package com.security.jwt.crud.entity;

import com.security.jwt.crud.validation.ValidPhoneNumber;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "students_data")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
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
