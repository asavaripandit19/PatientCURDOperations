package com.account.demo.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.account.demo.model.Patient;

@Repository

public interface PatientRepository extends JpaRepository<Patient, Integer> {

//	Patient findByDate(String date);

	Patient findByName(String name);

	Patient findByAge(Integer age);

	List<Patient> searchByGender(String gender);

	List<Patient> findByDate(Date date);

}
