package com.elitech.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.Data;

@Data
public class CongeDTO extends BaseDTO {
@NotBlank
private String description;
@NotBlank
private String etat;
@NotBlank
private String debut;
@Positive
private int duree;
@JsonIgnoreProperties("conges")
private EmployeeDTO employee;
}
