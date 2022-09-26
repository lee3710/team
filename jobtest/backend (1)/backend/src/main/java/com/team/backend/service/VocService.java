package com.team.backend.service;

import com.team.backend.model.VocDTO;
import com.team.backend.model.VocListVO;
import com.team.backend.model.VocVO;

import java.util.ArrayList;

public interface VocService {

    public int addVoc(VocVO vo);

    public ArrayList<VocListVO> getVoc();

}
