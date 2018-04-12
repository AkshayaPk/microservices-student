package com.revature.studentservice.model;

import java.math.BigInteger;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {

	public Student() {

	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "name")
	private String name;
	@Column(name = "emailId")
	private String emailId;
	@Column(name = "birthDate")
	private Date birthDate;
	private BigInteger mathsMarks;
	private BigInteger physicsMarks;
	private BigInteger chemistryMarks;
	private Integer port;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public BigInteger getMathsMarks() {
		return mathsMarks;
	}

	public void setMathsMarks(BigInteger mathsMarks) {
		this.mathsMarks = mathsMarks;
	}

	public BigInteger getPhysicsMarks() {
		return physicsMarks;
	}

	public void setPhysicsMarks(BigInteger physicsMarks) {
		this.physicsMarks = physicsMarks;
	}

	public BigInteger getChemistryMarks() {
		return chemistryMarks;
	}

	public void setChemistryMarks(BigInteger chemistryMarks) {
		this.chemistryMarks = chemistryMarks;
	}

	public Integer getPort() {
		return port;
	}

	public void setPort(Integer port) {
		this.port = port;
	}

}
