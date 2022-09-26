package com.team.backend.service;

import com.team.backend.model.ReparationDTO;
import com.team.backend.model.ReparationVO;
import com.team.backend.repository.ReparationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ReparationServiceImpl implements ReparationService{

    @Autowired
    private ReparationRepository repository;

    @Override
    public int addRepa(ReparationVO vo){
        int count = repository.addRepa(vo);
        return count;
    }

    @Override
    public ArrayList<ReparationDTO> getRepa(){
        ArrayList<ReparationDTO> arr = repository.getRepa();
        return arr;
    }
}
