package com.team.backend.service;

import com.team.backend.model.PenaltyDTO;
import com.team.backend.repository.PenaltyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PenaltyServiceImpl implements PenaltyService{

    private PenaltyRepository repository;

    @Autowired
    public PenaltyServiceImpl(PenaltyRepository repository) {
        this.repository = repository;
    }

    @Override
    public int addPenalty(PenaltyDTO dto){
        int count = repository.addPenalty(dto);
        return count;
    }

}
