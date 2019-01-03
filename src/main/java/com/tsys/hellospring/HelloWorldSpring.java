package com.tsys.hellospring;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldSpring {

	@RequestMapping(method = RequestMethod.GET, path = "hello", produces = { "application/json",
			"application/xml" }, consumes = { "application/xml" }, name = "Deposit")
	@ResponseBody
	public Employee getMessage(@RequestBody Employee employee) {
		Employee employee1 = new Employee();
		employee.setId(1);
		employee.setEmail("n@N.com");
		return employee;
	}

}
