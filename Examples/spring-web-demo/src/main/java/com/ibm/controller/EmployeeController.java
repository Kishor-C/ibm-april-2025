package com.ibm.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ibm.Employee;
import com.ibm.buisness.EmployeeService;

/*
 * This gets the request using @RequestMapping(...)
 * This must use @Controller to act like a controller
 * This must autowire @Service class
 * This must return a model to the view using ModelAndView object
 */
@Controller
@RequestMapping(path = "/employee")
public class EmployeeController {
	
	
	@Autowired
	private EmployeeService service;
	
	/*
	 * @RequestParam is used to read the input parameter
	 */
	@RequestMapping(path = "/save", method = RequestMethod.POST)
	public ModelAndView store(@RequestParam("name") String name, @RequestParam("dob") String dob) {
		Employee emp = new Employee(0, name, LocalDate.parse(dob));
		int status = service.saveEmployee(emp);
		return new ModelAndView("hello", "msg", "Row affected: "+status);
	}
	
	/*
	 * Send HTTP Request with GET method url = http://ip:port/app-name/spring/employee/testing
	 */
	@RequestMapping(path = "/testing", method = RequestMethod.GET)
	public ModelAndView greet() {
		//ModelAndView(viewName, key, model)
		List<Employee> list = service.findEmployees();
		ModelAndView modelView = new ModelAndView("display", "msg", list);
		return modelView;
	}
}
