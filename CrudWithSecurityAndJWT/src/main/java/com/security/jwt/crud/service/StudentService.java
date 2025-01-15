package com.security.jwt.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.security.jwt.crud.dto.StudentDTO;
import com.security.jwt.crud.entity.Student;
import com.security.jwt.crud.exception.StudentNotFoundException;
import com.security.jwt.crud.repo.StudentRepo;

import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class StudentService implements IStudentService {

	@Autowired
	private StudentRepo studentRepo;

	@Autowired
	private ObjectMapper objectMapper;

	@Override
	public StudentDTO saveStudent(StudentDTO studentDTO) {
		Student student = objectMapper.convertValue(studentDTO, Student.class);
		Student savedStudent = studentRepo.save(student);

		log.info("Student saved successfully: {}", savedStudent);

		return objectMapper.convertValue(savedStudent, StudentDTO.class);
	}

	@Override
	public StudentDTO getStudentById(int studentId) {

		Student existingStudent = studentRepo.findById(studentId)
				.orElseThrow(() -> new StudentNotFoundException("Student not found with id: " + studentId));
		return objectMapper.convertValue(existingStudent, StudentDTO.class);
	}

	@Override
	public List<StudentDTO> getAllStudents() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteStudent(int studentId) {
		// TODO Auto-generated method stub
		return null;
	}

}
