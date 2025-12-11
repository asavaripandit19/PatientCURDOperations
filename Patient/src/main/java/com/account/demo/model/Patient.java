package com.account.demo.model;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class Patient {
	
	@Id
	
	private Integer id;
	private String name;
	private Integer age;
	private String gender;
	private String mobile;
	private String email;
	private String address;
	private Date date;
	

}
