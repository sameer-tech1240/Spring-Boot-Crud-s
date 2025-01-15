package com.security.jwt.crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.security.jwt.crud.dto.StudentDTO;
import com.security.jwt.crud.exception.StudentNotFoundException;
import com.security.jwt.crud.service.IStudentService;

import jakarta.validation.Valid;
import lombok.extern.log4j.Log4j2;

@RestController
@RequestMapping("/students")
@Log4j2
public class StudentController {

	@Autowired
	private IStudentService iStudentService;

	@PostMapping("/createStudent")
	public ResponseEntity<StudentDTO> saveStudent(@RequestBody @Valid StudentDTO studentDTO) {
		try {

			log.info("Starting validation and saving student: {}", studentDTO);
			StudentDTO savedStudent = iStudentService.saveStudent(studentDTO);
			log.info("Student saved successfully: {}", savedStudent);
			return new ResponseEntity<>(savedStudent, HttpStatus.CREATED);

		} catch (Exception ex) {

			log.error("Error while saving student: {}", ex.getMessage());
			throw ex;

		}
	}

	/*
	 * @PutMapping("/updateStudent/{studentId}") public ResponseEntity<StudentDTO>
	 * updateStudent(@PathVariable int studentId,
	 * 
	 * @RequestBody @Valid StudentDTO updatedStudentDTO) { try { StudentDTO
	 * updatedStudent = iStudentService.updateStudent(updatedStudentDTO); return new
	 * ResponseEntity<>(updatedStudent, HttpStatus.OK); } catch (Exception ex) {
	 * return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR); } }
	 */

	@GetMapping("/{studentId}")
	public ResponseEntity<StudentDTO> getStudentByIdEntity(@PathVariable int studentId) {

		try {
			StudentDTO student = iStudentService.getStudentById(studentId);
			return new ResponseEntity<>(student, HttpStatus.OK);
		} catch (StudentNotFoundException studentNotFoundException) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		} catch (Exception exception) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
