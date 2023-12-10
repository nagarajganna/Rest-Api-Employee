package com.infy.service;

import com.infy.dto.EmployeeDTO;

public interface EmployeeService {
	String removeEmployee(Integer empId);
	String insertEmployee(EmployeeDTO Employee);
	public String getEmployee(Integer empId);
	public String updateEmployeeSal(Integer empId, Double newSal);

}
