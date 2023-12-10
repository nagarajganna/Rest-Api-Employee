package com.infy.dto;

import com.infy.entity.Employee;

public class EmployeeDTO {
	private Integer empId;
	private String ename;
	private Double salary;

	
	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public EmployeeDTO() {
		super();
	}

	public EmployeeDTO(Integer empid, String ename, Double salary) {
		super();
		this.empId = empid;
		this.ename = ename;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empId + ", ename=" + ename + ", salary=" + salary + "]";
	}

	public static Employee prepareEmployeeEntity(EmployeeDTO employeeDTO) {
		Employee employee = new Employee();
		employee.setEmpId(employeeDTO.getEmpId());
		employee.setEname(employeeDTO.getEname());
		employee.setSalary(employeeDTO.getSalary());

		return employee;

	}

}
