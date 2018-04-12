package com.revature.markscalculateservice.controller;


import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.revature.markscalculateservice.model.Marks;
import com.revature.markscalculateservice.proxy.StudentServiceProxy;

@RestController
public class MarksController {
	
	@Autowired
	private StudentServiceProxy studentServiceProxy;
	

	@GetMapping(value="/marks-calculate-service/total/{id}")
	public Marks calculateTotalMarks(@PathVariable Long id) {

		
		Map<String,Long> uriVariables=new HashMap<>();
		uriVariables.put("id", id);
		ResponseEntity<Marks> responseEntity = new RestTemplate().getForEntity("http://localhost:8000/student-service/students/{id}",Marks.class,uriVariables);
		Marks response = responseEntity.getBody();
		BigInteger physicsMarks;
		BigInteger chemistryMarks;
		BigInteger mathsMarks;
		physicsMarks=response.getPhysicsMarks();
		chemistryMarks=response.getChemistryMarks();
		mathsMarks=response.getMathsMarks();
		BigInteger physicsAndMathsMarks=physicsMarks.add(mathsMarks);
		BigInteger totalMarks=physicsAndMathsMarks.add(chemistryMarks);
	    Marks marks=new Marks(response.getId(),response.getName(),response.getMathsMarks(),response.getPhysicsMarks(),response.getChemistryMarks(),totalMarks
	    		,response.getPort());
	    return marks;
	}
	
	@GetMapping(value="/marks-calculate-service-feign/total/{id}")
	public Marks calculateTotalMarksByFeign(@PathVariable Long id) {
		Marks response=studentServiceProxy.calculateTotalMarks(id);
		BigInteger physicsMarks;
		BigInteger chemistryMarks;
		BigInteger mathsMarks;
		physicsMarks=response.getPhysicsMarks();
		chemistryMarks=response.getChemistryMarks();
		mathsMarks=response.getMathsMarks();
		BigInteger physicsAndMathsMarks=physicsMarks.add(mathsMarks);
		BigInteger totalMarks=physicsAndMathsMarks.add(chemistryMarks);
		Marks marks=new Marks(response.getId(),response.getName(),response.getMathsMarks(),response.getPhysicsMarks(),response.getChemistryMarks(),totalMarks
	    		,response.getPort());
		return marks;
		
	}
}
