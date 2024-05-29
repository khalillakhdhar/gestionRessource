package com.elitech.services.implement;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.elitech.dto.FormationDTO;
import com.elitech.mappers.FormationMapper;
import com.elitech.repos.FormationRepository;
import com.elitech.services.FormationService;

import lombok.RequiredArgsConstructor;
@RequiredArgsConstructor
public class FormationServiceImp implements FormationService {

	private FormationRepository formationRepository;
	
	@Override
	public Page<FormationDTO> getAllFormation(Pageable pageable) {
		// TODO Auto-generated method stub
		
		return formationRepository.findAll(pageable).map(FormationMapper::convertToDto);
	}

	@Override
	public FormationDTO addOneFormation(FormationDTO formationDTO) {
		// TODO Auto-generated method stub
		return FormationMapper.convertToDto(formationRepository.save(FormationMapper.convertToEntity(formationDTO)));
	}

	@Override
	public FormationDTO getOneFormation(long id) {
		// TODO Auto-generated method stub
		return FormationMapper.convertToDto(formationRepository.findById(id).orElse(null));
	}

	@Override
	public void deleteOneFormation(long id) {
		// TODO Auto-generated method stub
		formationRepository.deleteById(id);

	}

}
