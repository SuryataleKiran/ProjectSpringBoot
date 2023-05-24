package com.Project.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.Project.Dao.StudentRepo;
import com.Project.Entity.Student;

@Component
public class StudentCrudOperation {

	@Autowired
	private StudentRepo sRepo;

	public List<Student> getAllStudent() {

		List<Student> list = (List<Student>) this.sRepo.findAll();

		return list;
	}

	public Student getStudentById(int sid) {

		Student student = null;
		try {
			student = this.sRepo.findById(sid);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return student;
	}

	public Student addStudent(Student s) {

		Student save = sRepo.save(s);
		return save;
	}

	public void deleteStudent(int sId) {

		sRepo.deleteById(sId);

	}

	public void updateStudent(Student student, int sid) {

		student.setsId(sid);

		sRepo.save(student);
	}

}
