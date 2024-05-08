package com.elitech.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;
@Entity
@Getter
@Setter
public class BankDetails {
@Id
private long id;
private String banque;
private String branche;
private String Rib;
private String iban;
@MapsId
@OneToOne(optional = false)
@JoinColumn(name = "id")
private Employee employee;
}
