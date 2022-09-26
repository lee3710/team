package com.team.backend.repository;

import com.team.backend.model.ReparationDTO;
import com.team.backend.model.ReparationVO;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface ReparationRepository {

    public int addRepa(ReparationVO vo);

    public ArrayList<ReparationDTO> getRepa();
}
