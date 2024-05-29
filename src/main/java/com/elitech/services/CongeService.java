package com.elitech.services;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.elitech.dto.CongeDTO;

public interface CongeService {
public Page<CongeDTO> getAllConge(Pageable pageable);
public CongeDTO getOneConge(long id);
public void deleteOneConge(long id);
}
