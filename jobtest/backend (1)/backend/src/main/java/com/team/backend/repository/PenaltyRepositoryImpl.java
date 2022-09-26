package com.team.backend.repository;

import com.team.backend.model.PenaltyDTO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;


@Repository
public class PenaltyRepositoryImpl implements PenaltyRepository{


    private SqlSessionTemplate sqlMap;

    @Autowired
    public PenaltyRepositoryImpl(SqlSessionTemplate sqlMap) {
        this.sqlMap = sqlMap;
    }

    @Override
    public int addPenalty(PenaltyDTO dto){
        int count = sqlMap.insert("insertPenalty",dto);
        return count;
    }

}
