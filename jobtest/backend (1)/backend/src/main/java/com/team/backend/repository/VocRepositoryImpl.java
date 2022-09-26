package com.team.backend.repository;

import com.team.backend.model.*;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class VocRepositoryImpl implements VocRepository {


    private SqlSessionTemplate sqlMap;

    @Autowired
    public VocRepositoryImpl(SqlSessionTemplate sqlMap) {
        this.sqlMap = sqlMap;
    }

    @Override
    public int addVoc(VocVO vo) {
        int count = sqlMap.insert("insertVoc", vo.getVocDTO());
        ReparationDTO reparationDTO = vo.getReparationDTO();
        if(reparationDTO != null){
          sqlMap.insert("insertReparation", vo.getReparationDTO());
          sqlMap.insert("insertPenalty",vo.getPenaltyDTO());
        }

        return count;
    }


    @Override
    public ArrayList<VocListVO> getVoc(){
        ArrayList<VocListVO> arr = (ArrayList)sqlMap.selectList("getVoc");
        return arr;
    }

}
