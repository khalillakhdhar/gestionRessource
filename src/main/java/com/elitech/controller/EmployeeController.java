package com.elitech.controller;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.elitech.dto.BankDetailsDTO;
import com.elitech.dto.EmployeeDTO;
import com.elitech.dto.FormationDTO;
import com.elitech.model.Conge;
import com.elitech.services.EmployeeService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("employee")
@RequiredArgsConstructor
public class EmployeeController {

private final EmployeeService employeeService; 

@GetMapping
public Page<EmployeeDTO> getEmployees(Pageable pageable)
{
	return employeeService.getAllEmployees(pageable);
}
@PostMapping
public EmployeeDTO addOneEmployee(@RequestBody EmployeeDTO employee)
{
return employeeService.addOneEmployee(employee);	
}
@DeleteMapping("/{id}")
public void deleteOneEmployee(@PathVariable long id)
{
employeeService.deleteOneEmployee(id);	
}
/*
 * public EmployeeDTO assignBankToEmployee(long id,BankDetailsDTO bankDetailsDTO);
public EmployeeDTO assignFormationToEmployee(long id,FormationDTO formation);
public EmployeeDTO assignCongeToEmployee(long id,Conge conge);
 */
@PostMapping("/bank/{id}")
public EmployeeDTO assignToBank(@PathVariable long id,@RequestBody BankDetailsDTO bankDetails)
{
return employeeService.assignBankToEmployee(id, bankDetails);	
}
@PostMapping("/formation/{id}")
public EmployeeDTO assignToFormation(@PathVariable long id, @RequestBody FormationDTO formation)
{
return employeeService.assignFormationToEmployee(id, formation);	
}
@PostMapping("/conge/{id}")
public EmployeeDTO assignToConge(@PathVariable long id,@RequestBody Conge conge)
{
return employeeService.assignCongeToEmployee(id, conge);	
}
}
