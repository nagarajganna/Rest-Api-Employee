package com.infy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import com.infy.dto.EmployeeDTO;
import com.infy.entity.Employee;
import com.infy.repository.EmployeeRepository;


@Service("employeeService")
public class EmployeeServiceImple implements EmployeeService {
	@Autowired
	private EmployeeRepository repository;

	@Override
	//delete
	public String removeEmployee(Integer empId) {
		repository.deleteById(empId);
		
		return "deleted employee having emp Id "+ empId ;
		
	}

	@Override
//	create
	public String insertEmployee(EmployeeDTO employeeDTO) {
		System.out.println(" printing detaila "+employeeDTO.getEmpId());
		Employee e=EmployeeDTO.prepareEmployeeEntity(employeeDTO);
		repository.saveAndFlush(e);
		return "inserted";
	}
	@Override
	//retreive
	public String getEmployee(Integer empId) {
		Optional<Employee> optionalEmployee = repository.findById(empId);
		Employee employeeEntity = optionalEmployee.get();// Converting Optional<Customer> to Customer
		EmployeeDTO employeeDTO = Employee.prepareCustomerDTO(employeeEntity);
		return employeeDTO.getEname();
	}
	@Override
	//update
	public String updateEmployeeSal(Integer empId, Double newSal) {
		Optional<Employee> optionalCustomer = repository.findById(empId);
		Employee employeeEntity = optionalCustomer.get();
		double oldsal = employeeEntity.getSalary();
		employeeEntity.setSalary(newSal);
		repository.save(employeeEntity);
		return "employee with emp Id  " + empId + " salary update from Rs."+ oldsal + " to Rs."+newSal;
	}
		
}
