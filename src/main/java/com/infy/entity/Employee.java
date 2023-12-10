package com.infy.entity;





import com.infy.dto.EmployeeDTO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee{
	
	@Id
	@Column(name="empId")
//	@GeneratedValue(strategy=GenerationType.IDENTITY)
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
@Override
	public String toString() {
		return "Employee [empid=" + empId + ", ename=" + ename + ", salary=" + salary + "]";
	}
public static EmployeeDTO prepareCustomerDTO(Employee employee)
{
	EmployeeDTO employeeDTO = new EmployeeDTO();
	employeeDTO.setEmpId(employee.getEmpId());
	employeeDTO.setEname(employee.getEname());
	employeeDTO.setSalary(employee.getSalary());

		return employeeDTO;
	
}


}
