package com.elitech.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;

import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Conge extends BaseEntity{

	
private String description;
@Column(columnDefinition = "varchar(30) default 'en attente'")
private String etat;
@FutureOrPresent
private Date debut;
@Positive
private int duree;
@ManyToOne(optional = false,fetch = FetchType.EAGER)

private Employee employee;


}
