package com.team.backend.model;

import org.apache.ibatis.annotations.Mapper;

import java.util.Date;
@Mapper
public class VocDTO {

    private int voc_idx;
    private int admin_idx;
    private String voc_attribution;
    private String voc_cont;
    private Date voc_date;


    public VocDTO() {
        super();
    }

    public VocDTO(int voc_idx, int admin_idx, String voc_attribution, String voc_cont, Date voc_date) {
        super();
        this.voc_idx = voc_idx;
        this.admin_idx = admin_idx;
        this.voc_attribution = voc_attribution;
        this.voc_cont = voc_cont;
        this.voc_date = voc_date;
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

}
