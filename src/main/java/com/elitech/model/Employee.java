package com.elitech.model;

import java.util.List;
import java.util.Set;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;

import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Employee extends BaseEntity {
@Column(nullable = false)
@NotBlank
private String nom;
@Column(nullable = false)
@NotBlank
private String prenom;
@Column(nullable = false,unique = true)
@Email
private String email;
@Column(nullable = false)
@NotBlank
private String password;
@Column(nullable = false,unique = true)
@NotBlank
private String telephone;
//SOLID
//S: single responsability
@OneToMany(mappedBy = "employee")
@OnDelete(action = OnDeleteAction.CASCADE)
private List<Conge> conges;
@OneToOne(mappedBy = "employee",cascade = CascadeType.ALL)
private BankDetails bankDetails;
@ManyToMany(cascade = {CascadeType.PERSIST,CascadeType.MERGE},fetch = FetchType.EAGER)
private Set<Formation> formations;
}
