package net.spring_rest.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("employee")
public class EmployeeController {
//	@GetMapping()
//	public List<Employee> getEmployee() {
//		List<Employee> employee=new ArrayList<>();
//		employee.add(new Employee(1, "dheeraj"));
//		employee.add(new Employee(2, "qwe"));
//		employee.add(new Employee(3, "lasd"));
//		employee.add(new Employee(4, "dj"));
//		employee.add(new Employee(5, "raj"));
//		
//		return employee;
//	}
//	
//	@GetMapping("{id}/{name}")
//	public Employee getEmployeePathvariable(@PathVariable("id")int Employeeid,
//			@PathVariable("name")String name) {
//		return new Employee(Employeeid, name);
//		
//		
//		}
//	@GetMapping("query")
//	public Employee getEmployeeRequestvariable(@RequestParam("id")int id,@RequestParam("name") String name) {
//		return new Employee(id, name);
//	}
//	
//	@PostMapping("create")
//	public Employee createEmployee(@RequestBody Employee employee) {
//		System.out.println(employee.getId());
//		System.out.println(employee.getName());
//		return employee;
//	}
//	
//	@PutMapping("{id}/update")
//	public Employee EmployeeUpdate(@RequestBody Employee employee,@PathVariable("id") int id) {
//		System.out.println(employee.getName());
//		return employee; 
//	}
//	
//	@DeleteMapping("{id}/delete")
//	public String deleteEmloyee(@PathVariable("id") int id) {
//		 System.out.println(id);
//		 return "employee deleted successfully";
//		
//	}
	
	@GetMapping()
	public ResponseEntity<Employee> getEmployee(Employee employee) {
		employee.setId(1);
		employee.setName("dheeraj");
//		return new ResponseEntity<Employee>(employee, HttpStatus.OK);
//		return ResponseEntity.ok(employee);
		return ResponseEntity.ok().header("custom-header", "Dheeraj").body(employee);
		
	}
	
	@GetMapping("employees")
	public ResponseEntity<List<Employee>> getListOfEmployees(){
		List<Employee> employees= new ArrayList<>();
		employees.add(new Employee(1, "q"));
		employees.add(new Employee(2, "w"));
		employees.add(new Employee(44, "e"));
		employees.add(new Employee(55, "r"));
		employees.add(new Employee(66, "t"));
		employees.add(new Employee(23, "y"));
		return ResponseEntity.ok(employees);
		
		
	}
	
	@PostMapping("create")
	public ResponseEntity<Employee> createEmployee(@RequestBody Employee employee) {
		System.out.println(employee.getId());
		System.out.println(employee.getName());
		return new ResponseEntity<Employee>(employee, HttpStatus.CREATED);
		
		
	}
	
	@PutMapping("{id}/update")
	public ResponseEntity<Employee> updateEmployee(@PathVariable("id") int id,@RequestBody Employee employee) {
		System.out.println(employee.getName());
		return ResponseEntity.ok(employee);
		
	}
	
	@DeleteMapping("{id}/delete")
	public ResponseEntity<String> deleteEmployee(@PathVariable("id") int id ) {
		System.out.println(id);
		return  ResponseEntity.ok("employee successfully deleted!") ;
	}

}
