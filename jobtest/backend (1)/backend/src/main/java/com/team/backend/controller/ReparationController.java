package com.team.backend.controller;

import com.team.backend.model.ReparationDTO;
import com.team.backend.model.ReparationVO;
import com.team.backend.service.PenaltyServiceImpl;
import com.team.backend.service.ReparationServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class ReparationController {

    private ReparationServiceImpl service;

    @Autowired
    public ReparationController(ReparationServiceImpl service) {
        this.service = service;
    }

    @GetMapping("/reparation/add")
    @ResponseBody
    public int addRepa(ReparationVO vo){
        int count = service.addRepa(vo);
        return count;
    }

    @GetMapping("/reparation")
    @ResponseBody
    public ArrayList<ReparationDTO> getRepa(){
        ArrayList<ReparationDTO> arr = service.getRepa();
        return arr;
    }
}