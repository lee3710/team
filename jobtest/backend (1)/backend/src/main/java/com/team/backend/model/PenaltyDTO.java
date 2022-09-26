package com.team.backend.model;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public class PenaltyDTO {
    private int penalty_idx;
    private int reparation_idx;
    private String penalty_cont;
    private int courier_idx;
    private String courier_check_yn;
    private String courier_aprvl_yn;
    private String courier_obj_yn;

    public PenaltyDTO() {
        super();
    }

    public PenaltyDTO(int penalty_idx, int reparation_idx, String penalty_cont,
                      int courier_idx, String courier_check_yn, String courier_aprvl_yn, String courier_obj_yn) {
        super();
        this.penalty_idx = penalty_idx;
        this.reparation_idx = reparation_idx;
        this.penalty_cont = penalty_cont;
        this.courier_idx = courier_idx;
        this.courier_check_yn = courier_check_yn;
        this.courier_aprvl_yn = courier_aprvl_yn;
        this.courier_obj_yn = courier_obj_yn;
    }

    public int getPenalty_idx() {
        return penalty_idx;
    }

    public void setPenalty_idx(int penalty_idx) {
        this.penalty_idx = penalty_idx;
    }

    public int getReparation_idx() {
        return reparation_idx;
    }

    public void setReparation_idx(int reparation_idx) {
        this.reparation_idx = reparation_idx;
    }

    public String getPenalty_cont() {
        return penalty_cont;
    }

    public void setPenalty_cont(String penalty_cont) {
        this.penalty_cont = penalty_cont;
    }

    public int getCourier_idx() {
        return courier_idx;
    }

    public void setCourier_idx(int courier_idx) {
        this.courier_idx = courier_idx;
    }

    public String getCourier_check_yn() {
        return courier_check_yn;
    }

    public void setCourier_check_yn(String courier_check_yn) {
        this.courier_check_yn = courier_check_yn;
    }

    public String getCourier_aprvl_yn() {
        return courier_aprvl_yn;
    }

    public void setCourier_aprvl_yn(String courier_aprvl_yn) {
        this.courier_aprvl_yn = courier_aprvl_yn;
    }

    public String getCourier_obj_yn() {
        return courier_obj_yn;
    }

    public void setCourier_obj_yn(String courier_obj_yn) {
        this.courier_obj_yn = courier_obj_yn;
    }


}
