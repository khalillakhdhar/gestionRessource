package com.elitech.dto;

import java.util.List;
import java.util.Objects;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class EmployeeDTO extends BaseDTO {
    @NotBlank
    private String nom;
    @NotBlank
    private String prenom;
    @Email
    private String email;
    @NotBlank
    @JsonIgnoreProperties(allowSetters = true, allowGetters = false)
    private String password;
    @NotBlank
    private String telephone;
    @JsonIgnoreProperties(value = "employee", allowSetters = true)
    private List<CongeDTO> conges;
    @JsonIgnoreProperties(value = "employee", allowSetters = true)
    private BankDetailsDTO bankDetails;
    @JsonIgnoreProperties(value = "employees", allowSetters = true)
    private Set<FormationDTO> formations;

}
