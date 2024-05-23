package com.elitech.mappers;

import org.modelmapper.ModelMapper;

import com.elitech.dto.EmployeeDTO;
import com.elitech.model.Employee;

public class EmployeeMapper {
	private static final ModelMapper modelMapper= new ModelMapper();

	public static EmployeeDTO convertToDto(Employee employee)
	{
		return modelMapper.map(employee, EmployeeDTO.class);
	}
	public static Employee convertToEntity(EmployeeDTO employeeDTO)
	{
		return modelMapper.map(employeeDTO, Employee.class);
	}
	
	
}
