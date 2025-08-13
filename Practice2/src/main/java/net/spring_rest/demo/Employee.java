package net.spring_rest.demo;

import lombok.Data;

@Data
public class Employee {
  private int id;
  private String name;
public Employee(int id, String name) {
	super();
	this.id = id;
	this.name = name;
}
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}

/**
 * @return the id
 */
public int getId() {
	return id;
}
/**
 * @param id the id to set
 */
public void setId(int id) {
	this.id = id;
}
/**
 * @return the name
 */
public String getName() {
	return name;
}
/**
 * @param name the name to set
 */
public void setName(String name) {
	this.name = name;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + "]";
}
  
}
