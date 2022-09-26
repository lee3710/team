package com.team.backend.model;

import java.util.Date;

public class VocVO {

    private VocDTO vocDTO;

    private ReparationDTO reparationDTO;

    private PenaltyDTO penaltyDTO;

public VocVO() {
    super();
}

    public VocVO(VocDTO vocDTO) {
        super();
        this.vocDTO = vocDTO;
    }

    public VocVO(VocDTO vocDTO, ReparationDTO reparationDTO, PenaltyDTO penaltyDTO) {
        super();
        this.vocDTO = vocDTO;
        this.reparationDTO = reparationDTO;
        this.penaltyDTO = penaltyDTO;
    }

    public VocDTO getVocDTO() {
        return vocDTO;
    }

    public void setVocDTO(VocDTO vocDTO) {
        this.vocDTO = vocDTO;
    }

    public ReparationDTO getReparationDTO() {
        return reparationDTO;
    }

    public void setReparationDTO(ReparationDTO reparationDTO) {
        this.reparationDTO = reparationDTO;
    }

    public PenaltyDTO getPenaltyDTO() {
        return penaltyDTO;
    }

    public void setPenaltyDTO(PenaltyDTO penaltyDTO) {
        this.penaltyDTO = penaltyDTO;
    }


}
