package com.team.backend.model;

public class ReparationVO {

    private ReparationDTO reparationDTO;

    private PenaltyDTO penaltyDTO;

    public ReparationVO() {
        super();
    }

    public ReparationVO(ReparationDTO reparationDTO, PenaltyDTO penaltyDTO) {
        super();
        this.reparationDTO = reparationDTO;
        this.penaltyDTO = penaltyDTO;
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

    //
//    private int voc_idx;
//    private int reparation_cash;
//    private String reparation_state;
//    private int penalty_idx;
//    private int reparation_idx;
//    private String penalty_cont;
//    private int courier_idx;
//    private String courier_check_yn;
//    private String courier_aprvl_yn;
//    private String courier_obj_yn;
//
//    public ReparationVO(int voc_idx, int reparation_cash, String reparation_state, int penalty_idx, int reparation_idx,
//                        String penalty_cont, int courier_idx, String courier_check_yn, String courier_aprvl_yn, String courier_obj_yn) {
//        this.voc_idx = voc_idx;
//        this.reparation_cash = reparation_cash;
//        this.reparation_state = reparation_state;
//        this.penalty_idx = penalty_idx;
//        this.reparation_idx = reparation_idx;
//        this.penalty_cont = penalty_cont;
//        this.courier_idx = courier_idx;
//        this.courier_check_yn = courier_check_yn;
//        this.courier_aprvl_yn = courier_aprvl_yn;
//        this.courier_obj_yn = courier_obj_yn;
//    }
//
//    public int getVoc_idx() {
//        return voc_idx;
//    }
//
//    public void setVoc_idx(int voc_idx) {
//        this.voc_idx = voc_idx;
//    }
//
//    public int getReparation_cash() {
//        return reparation_cash;
//    }
//
//    public void setReparation_cash(int reparation_cash) {
//        this.reparation_cash = reparation_cash;
//    }
//
//    public String getReparation_state() {
//        return reparation_state;
//    }
//
//    public void setReparation_state(String reparation_state) {
//        this.reparation_state = reparation_state;
//    }
//
//    public int getPenalty_idx() {
//        return penalty_idx;
//    }
//
//    public void setPenalty_idx(int penalty_idx) {
//        this.penalty_idx = penalty_idx;
//    }
//
//    public int getReparation_idx() {
//        return reparation_idx;
//    }
//
//    public void setReparation_idx(int reparation_idx) {
//        this.reparation_idx = reparation_idx;
//    }
//
//    public String getPenalty_cont() {
//        return penalty_cont;
//    }
//
//    public void setPenalty_cont(String penalty_cont) {
//        this.penalty_cont = penalty_cont;
//    }
//
//    public int getCourier_idx() {
//        return courier_idx;
//    }
//
//    public void setCourier_idx(int courier_idx) {
//        this.courier_idx = courier_idx;
//    }
//
//    public String getCourier_check_yn() {
//        return courier_check_yn;
//    }
//
//    public void setCourier_check_yn(String courier_check_yn) {
//        this.courier_check_yn = courier_check_yn;
//    }
//
//    public String getCourier_aprvl_yn() {
//        return courier_aprvl_yn;
//    }
//
//    public void setCourier_aprvl_yn(String courier_aprvl_yn) {
//        this.courier_aprvl_yn = courier_aprvl_yn;
//    }
//
//    public String getCourier_obj_yn() {
//        return courier_obj_yn;
//    }
//
//    public void setCourier_obj_yn(String courier_obj_yn) {
//        this.courier_obj_yn = courier_obj_yn;
//    }
}
