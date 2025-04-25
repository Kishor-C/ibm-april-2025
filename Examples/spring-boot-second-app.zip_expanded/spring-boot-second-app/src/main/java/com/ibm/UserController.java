package com.ibm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/second-app")
public class UserController {

	@Autowired
	private RestTemplate temp;
	
	@GetMapping
	public ResponseEntity<Object> sendRequestToRemote() {
		String url = "http://spring-boot-demo-microservice/api/employee/test/greet";
		// HTTP GET
		String result = temp.getForObject(url, String.class);
		return ResponseEntity.status(200).body(result);
	}
}
