package com.elitech.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.elitech.model.BankDetails;

public interface BankDetailsRepository extends JpaRepository<BankDetails, Long> {

}
