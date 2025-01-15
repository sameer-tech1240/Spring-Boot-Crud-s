package com.security.jwt.crud.service;

import java.util.List;

import com.security.jwt.crud.dto.StudentDTO;

public interface IStudentService {

	StudentDTO saveStudent(StudentDTO studentDTO);

	StudentDTO getStudentById(int studentId);

	List<StudentDTO> getAllStudents();

	/* StudentDTO updateStudent(StudentDTO updatedStudentDTO); */

	String deleteStudent(int studentId);
}
