package com.elitech.mappers;

import org.modelmapper.ModelMapper;

import com.elitech.dto.CongeDTO;
import com.elitech.model.Conge;

public class CongeMapper {
	private static final ModelMapper modelMapper= new ModelMapper();

	public static CongeDTO convertToDto(Conge conge)
	{
		return modelMapper.map(conge, CongeDTO.class);
	}
	public static Conge convertToEntity(CongeDTO congeDTO)
	{
		return modelMapper.map(congeDTO, Conge.class);
	}
	
	
}
