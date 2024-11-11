package com.Springboot_OnetoOne_Uni.Springboot_OnetoOne_Uni;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController 
{
	@Autowired
	StudentRepository srepo;
	
	@Autowired
	AddressRepository arepo;
	
	@RequestMapping("/test")
	public String test()
	{
		return "Uni directional test";
	}
	
	@RequestMapping("/save")
	public Student savedata(@RequestBody Student student)
	{
		srepo.save(student);
		return student;
	}
	
	@RequestMapping("/all")
	public Collection<Student> all()
	{
		return srepo.findAll();
	}
	
	@RequestMapping("/{id}")
	public Optional<Student> byid(@PathVariable int sid)
	{
		return srepo.findById(sid);
	}
}
