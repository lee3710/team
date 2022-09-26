package com.team.backend.repository;

import com.team.backend.model.ReparationDTO;
import com.team.backend.model.ReparationVO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class ReparationRepositoryImpl implements ReparationRepository {

    private SqlSessionTemplate sqlMap;

    @Autowired
    public ReparationRepositoryImpl(SqlSessionTemplate sqlMap) {
        this.sqlMap = sqlMap;
    }

    @Override
    public int addRepa(ReparationVO vo){
        sqlMap.insert("insertPenalty",vo.getPenaltyDTO());
        int count = sqlMap.insert("insertReparation",vo.getReparationDTO());
        return count;
    }

    @Override
    public ArrayList<ReparationDTO> getRepa(){
        ArrayList<ReparationDTO> arr = (ArrayList)sqlMap.selectList("selectReparation");
        return arr;
    }

}
