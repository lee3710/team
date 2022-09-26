package com.team.backend.service;

import com.team.backend.model.ReparationDTO;
import com.team.backend.model.ReparationVO;

import java.util.ArrayList;

public interface ReparationService {


    public int addRepa(ReparationVO vo);

    public ArrayList<ReparationDTO> getRepa();

}
