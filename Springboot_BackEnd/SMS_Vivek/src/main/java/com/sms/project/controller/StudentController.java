package com.sms.project.controller;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sms.project.execption.ResourceNotFoundException;
import com.sms.project.model.Student;
import com.sms.project.repository.StudentRepository;


@CrossOrigin(origins="http://localhost:4200/")
@RestController
@RequestMapping("/api/v1")
public class StudentController {
	
	@Autowired
	private StudentRepository studentRepository;
	
//	//get all Student
	@GetMapping("/students")
	public List<Student> getAllStudents(){
		return studentRepository.findAll();
	}
	//Rest API
	@PostMapping("/students")
	@CrossOrigin(origins="http://localhost:4200")
	public Student createStudent(@RequestBody Student student) {
		return studentRepository.save(student);
	}
	
	//get Employee By Id	
	@GetMapping("/students/{id}")
	public ResponseEntity<Student> getStudentById(@PathVariable Long id) {
		Student student = studentRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Student not exist with id :" + id));
		return ResponseEntity.ok(student);
	}
	
	//Update Student
	@PutMapping("/students/{id}")
	public ResponseEntity<Student> updateEmployee(@PathVariable Long id, @RequestBody Student studentDetails){
		Student student = studentRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Student not exist with id :" + id));
		
		student.setStName(studentDetails.getStName());
		student.setStFatherName(studentDetails.getStFatherName());
		student.setStAge(studentDetails.getStAge());
		student.setStMobile(studentDetails.getStMobile());
		student.setStPin(studentDetails.getStPin());
		student.setStMothet(studentDetails.getStMothet());
		student.setStAddress(studentDetails.getStAddress());
		student.setStStandard(studentDetails.getStStandard());
		student.setStSection(studentDetails.getStSection());
		student.setStDateOfJoin(studentDetails.getStDateOfJoin());
		student.setStPreviousSchool(studentDetails.getStPreviousSchool());
		student.setStDob(studentDetails.getStDob());		
		
		Student updatedStudent = studentRepository.save(student);
		return ResponseEntity.ok(updatedStudent);
	} 
	// delete students 
		@DeleteMapping("/students/{id}")
		public ResponseEntity<Map<String, Boolean>> deleteStudent(@PathVariable Long id){
			Student student = studentRepository.findById(id)
					.orElseThrow(() -> new ResourceNotFoundException("Student not exist with id :" + id));
			
			studentRepository.delete(student);
			Map<String, Boolean> response = new HashMap<>();
			response.put("deleted", Boolean.TRUE);
			return ResponseEntity.ok(response);
		}
	
	
	
	
	
}
