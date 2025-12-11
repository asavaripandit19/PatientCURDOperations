package com.account.demo.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.account.demo.model.Patient;
import com.account.demo.service.PatientService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PutMapping;




@RestController
public class PatientController {
	
	@Autowired
	private PatientService ps;
	
	@PostMapping("add")
	public void add(@RequestBody Patient p) {
		//TODO: process POST request
		
		ps.add(p);
	}
	
	@GetMapping("display")
	public List<Patient> display() {
		return ps.display();
	}
	
	@DeleteMapping("delete = {id}")
	public void delete(@PathVariable Integer id) {
		ps.delete(id);
	}
	
	@PutMapping("update/{id}")
	public Patient updatePatient(@PathVariable Integer id, @RequestBody Patient p) {
		//TODO: process PUT request
		return ps.update(id ,p);
	}
	
	@GetMapping("search/{id}")
	public ResponseEntity<?> serachById(@PathVariable Integer id) throws Exception {
		Patient result = ps.seachById(id);
		return new ResponseEntity<Patient>(result, HttpStatus.OK);
	}
	
	@GetMapping("/date/{date}")
	public List<Patient> findByDate(@PathVariable @DateTimeFormat(pattern = "dd-MM-yyyy") Date date) {
		
		return ps.findByDate(date);
	}
	
	@GetMapping("name/{name}")
	public Patient findByName(@PathVariable String name) {
		return ps.findByName(name);
	}
	
	@GetMapping("age/{age}")
	public Patient findByAge(@PathVariable Integer age) {
		return ps.findByAge(age);
	}
	
	
	@GetMapping("gender/{gender}")
	public List<Patient> getMethodName(@PathVariable String gender) {
		return ps.groupByGender(gender);
	}
	
	
	
	
	

}
