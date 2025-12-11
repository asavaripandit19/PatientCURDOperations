package com.account.demo.service;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.account.demo.exception.IdNotFound;
import com.account.demo.model.Patient;
import com.account.demo.repository.PatientRepository;

@Service
public class PatientServiceImpl implements PatientService {
	
	@Autowired
	private PatientRepository pr;
	

	@Override
	public List<Patient> display() {
		// TODO Auto-generated method stub
		return pr.findAll();
	}

	@Override
	public void add(Patient p) {
		// TODO Auto-generated method stub
		
		pr.save(p);
		
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		pr.deleteById(id);
		
	}

	@Override
	public Patient update(Integer id, Patient p) {
		// TODO Auto-generated method stub
		p.setId(id);
		return pr.save(p);
	}

	@Override
	public Patient seachById(Integer id) throws Exception{
	   return this.pr.findById(id).orElseThrow(()-> new IdNotFound("patient not found with given id"+id));
	}

	@Override
	public Patient findByDate(Date date) {
		// TODO Auto-generated method stub
		return pr.findByDate(date);
	}

	@Override
	public Patient findByName(String name) {
		// TODO Auto-generated method stub
		return pr.findByName(name);
	}

	@Override
	public Patient findByAge(Integer age) {
		// TODO Auto-generated method stub
		return pr.findByAge(age);
	}

	@Override
	public List<Patient> groupByGender(String gender) {
		// TODO Auto-generated method stub
		return pr.searchByGender(gender);
	}

}
