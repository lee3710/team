package com.team.backend.controller;

import com.team.backend.model.VocDTO;
import com.team.backend.model.VocListVO;
import com.team.backend.model.VocVO;
import com.team.backend.service.VocServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


import java.util.ArrayList;

@RestController
public class VocController {

    private final VocServiceImpl vocServiceImpl;

    @Autowired
    public VocController(VocServiceImpl vocServiceImpl) {
        this.vocServiceImpl = vocServiceImpl;
    }


    @GetMapping("/voc")
    @ResponseBody
    public ArrayList<VocListVO> getVoc(){
        ArrayList<VocListVO> arr = vocServiceImpl.getVoc();
        return arr;
    }


    @PostMapping("/voc/add")
    public int addVoc(@RequestBody VocVO vo){
        int count = vocServiceImpl.addVoc(vo);
        return count;
    }
}
