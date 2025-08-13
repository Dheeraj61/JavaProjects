package net.springrest.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	@GetMapping("dheeraj")
	public Employee getEmployee() {
		Employee employee=new Employee(1,"dheeraj","kumar");
		return employee;
	}
}
