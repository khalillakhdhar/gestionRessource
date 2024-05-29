package com.elitech.dto;

import java.util.List;
import java.util.Set;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.elitech.model.BankDetails;
import com.elitech.model.Conge;
import com.elitech.model.Formation;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class EmployeeDTO extends BaseDTO{
@NotBlank
private String nom;
@NotBlank
private String prenom;
@Email
private String email;
@NotBlank
@JsonIgnoreProperties(allowSetters = true,allowGetters = false)
private String password;
@NotBlank
private String telephone;
@JsonIgnoreProperties("employee")
private List<CongeDTO> conges;
@JsonIgnoreProperties("employee")
private BankDetailsDTO bankDetails;

}
