package com.team.backend.model;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public class ReparationDTO {

    private int reparation_idx;
    private int voc_idx;
    private int reparation_cash;
    private String reparation_state;

    public ReparationDTO() {
        super();
    }

    public ReparationDTO(int reparation_idx, int voc_idx, int reparation_cash, String reparation_state) {
        super();
        this.reparation_idx = reparation_idx;
        this.voc_idx = voc_idx;
        this.reparation_cash = reparation_cash;
        this.reparation_state = reparation_state;
    }

    public int getReparation_idx() {
        return reparation_idx;
    }

    public void setReparation_idx(int reparation_idx) {
        this.reparation_idx = reparation_idx;
    }

    public int getVoc_idx() {
        return voc_idx;
    }

    public void setVoc_idx(int voc_idx) {
        this.voc_idx = voc_idx;
    }

    public int getReparation_cash() {
        return reparation_cash;
    }

    public void setReparation_cash(int reparation_cash) {
        this.reparation_cash = reparation_cash;
    }

    public String getReparation_state() {
        return reparation_state;
    }

    public void setReparation_state(String reparation_state) {
        this.reparation_state = reparation_state;
    }


}
