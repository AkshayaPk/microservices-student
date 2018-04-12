package com.revature.markscalculateservice.proxy;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.revature.markscalculateservice.model.Marks;

@RibbonClient(name="student-service")
//@FeignClient(name="student-service")
@FeignClient(name="netflix-zuul-api-gateway-server")
public interface StudentServiceProxy {

	@GetMapping(value="/student-service/students/{id}")
	public Marks calculateTotalMarks(@PathVariable("id") Long id);
	
}
