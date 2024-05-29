package com.elitech.services;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.elitech.dto.FormationDTO;

public interface FormationService {
	public Page<FormationDTO> getAllFormation(Pageable pageable);
	public FormationDTO addOneFormation(FormationDTO formationDTO);
	public FormationDTO getOneFormation(long id);
	public void deleteOneFormation(long id);

}
