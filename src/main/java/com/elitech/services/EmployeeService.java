package com.elitech.services;


import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.elitech.dto.BankDetailsDTO;
import com.elitech.dto.EmployeeDTO;
import com.elitech.dto.FormationDTO;
import com.elitech.model.Conge;

public interface EmployeeService {
public Page<EmployeeDTO> getAllEmployees(Pageable pageable);
public EmployeeDTO addOneEmployee(EmployeeDTO employee);
public void deleteOneEmployee(long id);
public Optional<EmployeeDTO> findOneEmployee(long id);
public EmployeeDTO assignBankToEmployee(long id,BankDetailsDTO bankDetailsDTO);
public EmployeeDTO assignFormationToEmployee(long id,long idFormation);
public EmployeeDTO assignCongeToEmployee(long id,Conge conge);
}
