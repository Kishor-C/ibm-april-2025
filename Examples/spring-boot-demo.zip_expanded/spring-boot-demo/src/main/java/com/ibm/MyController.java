package com.ibm;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.buisness.EmployeeService;

@RestController
@RequestMapping("/api/employee")
@CrossOrigin(origins = "*")
public class MyController {

	@Autowired
	private EmployeeService service;
	
	
	@Value("${server.port}") // it supplies the server port to this variable
	private int port;
	
	@GetMapping(path = "/test/greet")
	public ResponseEntity<Object> greet() {
		return ResponseEntity.status(200).body("microservice running in "+port+" number");
	}
	
	// send HTTP post request with JSON to save the data
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> save(@RequestBody Employee employee) {
		Employee savedEntity = service.saveOrUpdate(employee);
		return ResponseEntity.status(201).body(savedEntity);
	}
	// send HTTP get request to get all the employees in JSON 
	@GetMapping
	public ResponseEntity<Object> find() {
		List<Employee> list = service.findEmployees();
		return ResponseEntity.status(200).body(list);
	}
	// send HTTP get with dynamic path to get a particular employee or an error message
	@GetMapping(path = "/{id}") // it can accept any value like /100 /200 /300, you can also use /{id}/{name}
	public ResponseEntity<Object> get(@PathVariable("id") int empId) {
		try {
			Employee emp = service.findEmployee(empId);
			return ResponseEntity.status(200).body(emp);
		} catch(Exception e) {
			Map<String, String> errorMap = new HashMap<String, String>();
			errorMap.put("message", e.getMessage()); // to create error message in JSON format we are using Map
			return ResponseEntity.status(404).body(errorMap);
		}
	}
}
