package com.elitech.services.implement;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.elitech.dto.CongeDTO;
import com.elitech.mappers.CongeMapper;
import com.elitech.repos.CongeRepository;
import com.elitech.services.CongeService;

import lombok.RequiredArgsConstructor;
@RequiredArgsConstructor
public class CongeServiceImp implements CongeService {

	private final CongeRepository congeRepository;
	
	
	@Override
	public Page<CongeDTO> getAllConge(Pageable pageable) {
		// TODO Auto-generated method stub
		return congeRepository.findAll(pageable).map(CongeMapper::convertToDto);
	}

	@Override
	public CongeDTO getOneConge(long id) {
		// TODO Auto-generated method stub
		return CongeMapper.convertToDto(congeRepository.findById(id).orElse(null));
	}

	@Override
	public void deleteOneConge(long id) {
		// TODO Auto-generated method stub
		congeRepository.deleteById(id);
	}

}
