package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Teacher;

@Service
public class TeacherService implements ITeacherService {

	private static List<Teacher> LIST_TEACHER=new  ArrayList<>();
	
	static{
		LIST_TEACHER.add(new Teacher(1L, "Henry Mendoza Puerta"));
		LIST_TEACHER.add(new Teacher(2L, "Patricia Plasencia Burgos"));
	}
	
	@Override
	public List<Teacher> findAll(){
		return TeacherService.LIST_TEACHER;
	}

	@Override
	public void save(Teacher teacher) {
		TeacherService.LIST_TEACHER.add(teacher);
	}

}