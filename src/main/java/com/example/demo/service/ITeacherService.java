package com.example.demo.service;

import com.example.demo.entity.Teacher;

public interface ITeacherService {

//	public List<Teacher> findAll();
	public Iterable<Teacher> findAll();

	public void save(Teacher teacher);
	
}