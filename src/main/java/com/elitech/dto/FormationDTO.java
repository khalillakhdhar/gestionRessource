package com.elitech.dto;

import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
public class FormationDTO extends BaseDTO {
	private String titre;
	private double prix;
	private int Duree;
	@JsonIgnoreProperties("formations")
	private Set<EmployeeDTO> employees;
}
