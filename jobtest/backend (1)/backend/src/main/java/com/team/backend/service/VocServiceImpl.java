package com.team.backend.service;

import com.team.backend.controller.ReparationController;
import com.team.backend.model.ReparationDTO;
import com.team.backend.model.VocDTO;

import com.team.backend.model.VocListVO;
import com.team.backend.model.VocVO;
import com.team.backend.repository.VocRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class VocServiceImpl implements VocService{

    private VocRepositoryImpl vocRepasitory;

    @Autowired
    public VocServiceImpl(VocRepositoryImpl vocRepasitory) {
        this.vocRepasitory = vocRepasitory;
    }

    @Override
    public int addVoc(VocVO vo){
        int count = vocRepasitory.addVoc(vo);
        return count;
    }

    @Override
    public ArrayList<VocListVO> getVoc(){
        ArrayList<VocListVO> arr = vocRepasitory.getVoc();
        return arr;
    }


}
