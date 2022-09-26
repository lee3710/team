package com.team.backend.model;

import java.util.Date;

public class VocListVO {
        private int voc_idx;
    private int admin_idx;
    private String voc_attribution;
    private String voc_cont;
    private Date voc_date;
    private int reparation_idx;
    private int reparation_cash;
    private String reparation_state;
    private int penalty_idx;
    private String penalty_cont;
    private int courier_idx;
    private String courier_check_yn;
    private String courier_aprvl_yn;
    private String courier_obj_yn;

    public VocListVO() {
        super();
    }

    public VocListVO(int voc_idx, int admin_idx, String voc_attribution, String voc_cont, Date voc_date,
                     int reparation_idx, int reparation_cash, String reparation_state, int penalty_idx,
                     String penalty_cont, int courier_idx, String courier_check_yn, String courier_aprvl_yn, String courier_obj_yn) {
        super();
        this.voc_idx = voc_idx;
        this.admin_idx = admin_idx;
        this.voc_attribution = voc_attribution;
        this.voc_cont = voc_cont;
        this.voc_date = voc_date;
        this.reparation_idx = reparation_idx;
        this.reparation_cash = reparation_cash;
        this.reparation_state = reparation_state;
        this.penalty_idx = penalty_idx;
        this.penalty_cont = penalty_cont;
        this.courier_idx = courier_idx;
        this.courier_check_yn = courier_check_yn;
        this.courier_aprvl_yn = courier_aprvl_yn;
        this.courier_obj_yn = courier_obj_yn;
    }

    public int getVoc_idx() {
        return voc_idx;
    }

    public void setVoc_idx(int voc_idx) {
        this.voc_idx = voc_idx;
    }

    public int getAdmin_idx() {
        return admin_idx;
    }

    public void setAdmin_idx(int admin_idx) {
        this.admin_idx = admin_idx;
    }

    public String getVoc_attribution() {
        return voc_attribution;
    }

    public void setVoc_attribution(String voc_attribution) {
        this.voc_attribution = voc_attribution;
    }

    public String getVoc_cont() {
        return voc_cont;
    }

    public void setVoc_cont(String voc_cont) {
        this.voc_cont = voc_cont;
    }

    public Date getVoc_date() {
        return voc_date;
    }

    public void setVoc_date(Date voc_date) {
        this.voc_date = voc_date;
    }

    public int getReparation_idx() {
        return reparation_idx;
    }

    public void setReparation_idx(int reparation_idx) {
        this.reparation_idx = reparation_idx;
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

    public int getPenalty_idx() {
        return penalty_idx;
    }

    public void setPenalty_idx(int penalty_idx) {
        this.penalty_idx = penalty_idx;
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
