package com.team.backend.repository;

import com.team.backend.model.PenaltyDTO;
import org.springframework.stereotype.Repository;
@Repository
public interface PenaltyRepository {

    public int addPenalty(PenaltyDTO dto);

}
