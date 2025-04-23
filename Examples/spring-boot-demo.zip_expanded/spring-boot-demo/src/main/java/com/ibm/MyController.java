package com.ibm;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MyController {

	@GetMapping(path = "/testing")
	public ResponseEntity<Object> greet() {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("message", "Welcome to REST API");
		map.put("dateTime", LocalDateTime.now());
		return ResponseEntity.status(200).body(map);
	}
	@PostMapping(path = "/save", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> save(@RequestBody Employee employee) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("message", "Employee "+employee.getName()+" is processed");
		map.put("emp", employee);
		return ResponseEntity.status(201).body(map);
	}
}
