package tr.com.huseyinaydin.spring.auditing.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import tr.com.huseyinaydin.spring.auditing.api.dto.InputRequest;
import tr.com.huseyinaydin.spring.auditing.api.model.Employee;
import tr.com.huseyinaydin.spring.auditing.api.service.EmployeeService;

/**
 * 
 @author Huseyin_Aydin
 @since 1994
 @category Spring Boot JPA Auditing
 * 
 */

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService service;

	@PostMapping("/addEmployee")
	public String saveEmployee(@RequestBody InputRequest<Employee> request) {
		return service.saveEmployee(request);
	}

	@PutMapping("/updateEmployee/{id}/{salary}")
	public String updateEmployeeSalary(@PathVariable int id, @PathVariable double salary,
			@RequestBody InputRequest<Employee> request) {
		return service.updateEmployee(id, salary, request);
	}
}
