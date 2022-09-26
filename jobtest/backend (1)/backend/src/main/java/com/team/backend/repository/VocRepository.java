package com.team.backend.repository;

import com.team.backend.model.VocDTO;
import com.team.backend.model.VocListVO;
import com.team.backend.model.VocVO;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface VocRepository {

    public int addVoc(VocVO vo);

    public ArrayList<VocListVO> getVoc();

}
