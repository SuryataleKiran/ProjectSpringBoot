package com.Project.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Project.Entity.Student;
import com.Project.Service.StudentCrudOperation;

@RestController
public class studentController {

	@Autowired
	private StudentCrudOperation studentCrud;

	@GetMapping("/details")
	public List<Student> studentDetails() {

		return this.studentCrud.getAllStudent();
	}

	@GetMapping("/details/{sid}")
	public Student getStudentById(@PathVariable("sid") int sid) {

		return studentCrud.getStudentById(sid);
	}

	@PostMapping("/details")
	public Student addStudent(@RequestBody Student stu) {

		this.studentCrud.addStudent(stu);
		return stu;
	}

	@DeleteMapping("/details/{sid}")
	public void deleteStudent(@PathVariable("sid") int sid) {
		this.studentCrud.deleteStudent(sid);
	}
	
	@PutMapping("/details/{sid}")
	public void updateStudent(@RequestBody Student student,@PathVariable("sid") int sid) {
		
		this.studentCrud.updateStudent(student,sid);
	}
}
