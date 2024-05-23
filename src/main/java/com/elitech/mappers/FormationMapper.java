package com.elitech.mappers;

import org.modelmapper.ModelMapper;

import com.elitech.dto.FormationDTO;
import com.elitech.model.Formation;

public class FormationMapper {
	private static final ModelMapper modelMapper= new ModelMapper();

	public static FormationDTO convertToDto(Formation formation)
	{
		return modelMapper.map(formation, FormationDTO.class);
	}
	public static Formation convertToEntity(FormationDTO formationDTO)
	{
		return modelMapper.map(formationDTO, Formation.class);
	}
	
}
