package com.account.demo.service;

import java.util.Date;
import java.util.List;

import com.account.demo.model.Patient;

public interface PatientService {

	

	List<Patient> display();

	void add(Patient p);

	void delete(Integer id);

	Patient update(Integer id, Patient p);

	Patient seachById(Integer id) throws Exception;

	List<Patient> findByDate(Date date);

	Patient findByName(String name);

	Patient findByAge(Integer age);



	List<Patient> groupByGender(String gender);

	

	

}
