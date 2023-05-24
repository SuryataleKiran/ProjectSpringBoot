package com.Project.Dao;

import org.springframework.data.repository.CrudRepository;

import com.Project.Entity.Student;

public interface StudentRepo extends CrudRepository<Student, Integer> {

	public Student findById(int sId);
}
