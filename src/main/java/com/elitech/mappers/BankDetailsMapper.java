package com.elitech.mappers;

import org.modelmapper.ModelMapper;

import com.elitech.dto.BankDetailsDTO;
import com.elitech.model.BankDetails;

public class BankDetailsMapper {
	private static final ModelMapper modelMapper= new ModelMapper();

	public static BankDetailsDTO convertToDto(BankDetails bankDetails)
	{
		return modelMapper.map(bankDetails, BankDetailsDTO.class);
	}
	public static BankDetails convertToEntity(BankDetailsDTO bankDetailsDTO)
	{
		return modelMapper.map(bankDetailsDTO, BankDetails.class);
	}
}
