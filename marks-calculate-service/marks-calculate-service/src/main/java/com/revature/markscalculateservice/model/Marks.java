package com.revature.markscalculateservice.model;

import java.math.BigInteger;

public class Marks {

	private Long id;
	private String name;
	private BigInteger mathsMarks;
	private BigInteger physicsMarks;
	private BigInteger chemistryMarks;
	private BigInteger totalMarks;
	private Integer port;
	
	public Marks() {
		
	}

	public Marks(Long id, String name, BigInteger mathsMarks, BigInteger physicsMarks, BigInteger chemistryMarks,
			BigInteger totalMarks,Integer port) {
		super();
		this.id = id;
		this.name = name;
		this.mathsMarks = mathsMarks;
		this.physicsMarks = physicsMarks;
		this.chemistryMarks = chemistryMarks;
		this.totalMarks = totalMarks;
		this.port=port;
	}

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

	public BigInteger getTotalMarks() {
		return totalMarks;
	}

	public void setTotalMarks(BigInteger totalMarks) {
		this.totalMarks = totalMarks;
	}

	public Integer getPort() {
		return port;
	}

	public void setPort(Integer port) {
		this.port = port;
	}
}
