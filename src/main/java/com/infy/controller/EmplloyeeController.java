package com.infy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.infy.dto.EmployeeDTO;
import com.infy.service.EmployeeServiceImple;

@RestController
@RequestMapping("/employee")
public class EmplloyeeController {
	@Autowired
	EmployeeServiceImple service;
	@DeleteMapping("deleteEmployee/{empId}")
	
	public ResponseEntity<String>  deleteEmployee(@PathVariable()int  empId )
	{
		
		 String msg=service.removeEmployee(empId);
		 
		 return new ResponseEntity<>(msg,HttpStatus.OK);
		 
				
	}
	
	@GetMapping("getEmployee/{empId}")
	public ResponseEntity<String>  getEmployee(@PathVariable()int  empId )
	{
		
		 String msg="Employee name is "+ service.getEmployee(empId);
		 
		 return new ResponseEntity<>(msg,HttpStatus.OK);
		 
				
	}
	
	

	@PostMapping("/insert")
	public ResponseEntity<String>  insert(@RequestBody EmployeeDTO employeeDTO )
	{
		
		 String msg=service.insertEmployee(employeeDTO);
		 
		 return new ResponseEntity<>(msg,HttpStatus.OK);
		 
				
	}
	
	@PatchMapping("/updateSal/{empId}/{newSal}")
	public ResponseEntity<String>  insert(@PathVariable()int  empId, @PathVariable()double  newSal )
	{
		
		 String msg=service.updateEmployeeSal(empId,newSal);
		 
		 return new ResponseEntity<>(msg,HttpStatus.OK);
		 
				
	}


}
