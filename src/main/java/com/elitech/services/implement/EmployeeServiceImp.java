package com.elitech.services.implement;

import java.util.Optional;
import java.util.Set;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.elitech.dto.BankDetailsDTO;
import com.elitech.dto.EmployeeDTO;
import com.elitech.dto.FormationDTO;
import com.elitech.mappers.BankDetailsMapper;
import com.elitech.mappers.EmployeeMapper;
import com.elitech.mappers.FormationMapper;
import com.elitech.model.Conge;
import com.elitech.model.Employee;
import com.elitech.model.Formation;
import com.elitech.repos.CongeRepository;
import com.elitech.repos.EmployeeRepository;
import com.elitech.repos.FormationRepository;
import com.elitech.services.EmployeeService;

import lombok.RequiredArgsConstructor;
@Service
@RequiredArgsConstructor
public class EmployeeServiceImp implements EmployeeService {

private final EmployeeRepository employeeRepository;

private final CongeRepository congeRepository;
private final FormationRepository formationRepository;
	
	@Override
	public Page<EmployeeDTO> getAllEmployees(Pageable pageable) {
		// TODO Auto-generated method stub
		Page<Employee> employees=employeeRepository.findAll(pageable);
		return employees.map(EmployeeMapper::convertToDto);
		
	}

	@Override
	public EmployeeDTO addOneEmployee(EmployeeDTO employee) {
		// TODO Auto-generated method stub
		return EmployeeMapper.convertToDto(employeeRepository.save(EmployeeMapper.convertToEntity(employee)));
	}

	@Override
	public void deleteOneEmployee(long id) {
		// TODO Auto-generated method stub
		employeeRepository.deleteById(id);

	}

	@Override
	public Optional<EmployeeDTO> findOneEmployee(long id) {
		// TODO Auto-generated method stub
		return employeeRepository.findById(id).map(EmployeeMapper::convertToDto);
	}

	@Override
	public EmployeeDTO assignBankToEmployee(long id, BankDetailsDTO bankDetails) {
		// TODO Auto-generated method stub
		Employee employee=employeeRepository.findById(id).orElse(null);
		if(employee!=null)
		{
			employee.setBankDetails(BankDetailsMapper.convertToEntity(bankDetails));
			return EmployeeMapper.convertToDto(employeeRepository.save(employee));
		}
		return null;
	}

	/*@Override
	public EmployeeDTO assignFormationToEmployee(long id, FormationDTO formation) {
		// TODO Auto-generated method stub
		Employee employee=employeeRepository.findById(id).orElse(null);
		if(employee!=null)
		{
			Set<Formation> formations=employee.getFormations();
			formations.add(FormationMapper.convertToEntity(formation));
			return EmployeeMapper.convertToDto(employeeRepository.save(employee));
		}
		
		return null;
	}
*/
	@Override
	public EmployeeDTO assignCongeToEmployee(long id, Conge conge) {
		// TODO Auto-generated method stub
		Employee employee=employeeRepository.findById(id).orElse(null);
		if(employee!=null)
		{
			conge.setEmployee(employee);
			congeRepository.save(conge);
			return EmployeeMapper.convertToDto(employee);
		}
		
		return null;
	}

	@Override
	public EmployeeDTO assignFormationToEmployee(long id, long idFormation) {
		// TODO Auto-generated method stub
		Employee emp=employeeRepository.findById(id).orElse(null);
		Formation formation=formationRepository.findById(id).orElse(null);
		if(emp!=null && formation!=null)
		{
			Set<Formation> formations=emp.getFormations();
			formations.add(formation);
			emp.setFormations(formations);
			return EmployeeMapper.convertToDto(employeeRepository.save(emp));
		}
		
		
		return null;
	}

}
