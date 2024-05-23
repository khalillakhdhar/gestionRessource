package com.elitech.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class BankDetailsDTO {
@NotBlank
private String Rib;
@NotBlank
private String iban;
@NotBlank
private String banque;
@NotBlank
private String branche;
@JsonIgnoreProperties("bankDetails")
private EmployeeDTO employee;
}
