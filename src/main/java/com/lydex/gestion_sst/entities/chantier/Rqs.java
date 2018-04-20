package com.lydex.gestion_sst.entities.chantier;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Rqs implements Serializable {
    @Id @GeneratedValue
    private Long id_rqs;
    private String aff_rqs;
    private String sensibilisation_rqs;
    private String conn_rqs;
    private String conv_role_rqs;
    private String passer_ss_charge;
    private String pos_dehors_trajec_veh;
    private String accrocher_harnais;
    private String des_tranche;
    private String assurer_atm;
    private String assurer_risque_incendie;
    private String verif_abs_energie;
    private String manip_mobile;
    private String conduire_ss_emprise;
    private String ral_en_conduisant;



    public Rqs() {
    }

    public Rqs(String aff_rqs, String sensibilisation_rqs, String conn_rqs, String conv_role_rqs, String passer_ss_charge, String pos_dehors_trajec_veh, String accrocher_harnais, String des_tranche, String assurer_atm, String assurer_risque_incendie, String verif_abs_energie, String manip_mobile, String conduire_ss_emprise, String ral_en_conduisant) {

        this.aff_rqs = aff_rqs;
        this.sensibilisation_rqs = sensibilisation_rqs;
        this.conn_rqs = conn_rqs;
        this.conv_role_rqs = conv_role_rqs;
        this.passer_ss_charge = passer_ss_charge;
        this.pos_dehors_trajec_veh = pos_dehors_trajec_veh;
        this.accrocher_harnais = accrocher_harnais;
        this.des_tranche = des_tranche;
        this.assurer_atm = assurer_atm;
        this.assurer_risque_incendie = assurer_risque_incendie;
        this.verif_abs_energie = verif_abs_energie;
        this.manip_mobile = manip_mobile;
        this.conduire_ss_emprise = conduire_ss_emprise;
        this.ral_en_conduisant = ral_en_conduisant;
    }

    public Long getId_rqs() {

        return id_rqs;
    }

    public void setId_rqs(Long id_rqs) {
        this.id_rqs = id_rqs;
    }

    public String getAff_rqs() {
        return aff_rqs;
    }

    public void setAff_rqs(String aff_rqs) {
        this.aff_rqs = aff_rqs;
    }

    public String getSensibilisation_rqs() {
        return sensibilisation_rqs;
    }

    public void setSensibilisation_rqs(String sensibilisation_rqs) {
        this.sensibilisation_rqs = sensibilisation_rqs;
    }

    public String getConn_rqs() {
        return conn_rqs;
    }

    public void setConn_rqs(String conn_rqs) {
        this.conn_rqs = conn_rqs;
    }

    public String getConv_role_rqs() {
        return conv_role_rqs;
    }

    public void setConv_role_rqs(String conv_role_rqs) {
        this.conv_role_rqs = conv_role_rqs;
    }

    public String getPasser_ss_charge() {
        return passer_ss_charge;
    }

    public void setPasser_ss_charge(String passer_ss_charge) {
        this.passer_ss_charge = passer_ss_charge;
    }

    public String getPos_dehors_trajec_veh() {
        return pos_dehors_trajec_veh;
    }

    public void setPos_dehors_trajec_veh(String pos_dehors_trajec_veh) {
        this.pos_dehors_trajec_veh = pos_dehors_trajec_veh;
    }

    public String getAccrocher_harnais() {
        return accrocher_harnais;
    }

    public void setAccrocher_harnais(String accrocher_harnais) {
        this.accrocher_harnais = accrocher_harnais;
    }

    public String getDes_tranche() {
        return des_tranche;
    }

    public void setDes_tranche(String des_tranche) {
        this.des_tranche = des_tranche;
    }

    public String getAssurer_atm() {
        return assurer_atm;
    }

    public void setAssurer_atm(String assurer_atm) {
        this.assurer_atm = assurer_atm;
    }

    public String getAssurer_risque_incendie() {
        return assurer_risque_incendie;
    }

    public void setAssurer_risque_incendie(String assurer_risque_incendie) {
        this.assurer_risque_incendie = assurer_risque_incendie;
    }

    public String getVerif_abs_energie() {
        return verif_abs_energie;
    }

    public void setVerif_abs_energie(String verif_abs_energie) {
        this.verif_abs_energie = verif_abs_energie;
    }

    public String getManip_mobile() {
        return manip_mobile;
    }

    public void setManip_mobile(String manip_mobile) {
        this.manip_mobile = manip_mobile;
    }

    public String getConduire_ss_emprise() {
        return conduire_ss_emprise;
    }

    public void setConduire_ss_emprise(String conduire_ss_emprise) {
        this.conduire_ss_emprise = conduire_ss_emprise;
    }

    public String getRal_en_conduisant() {
        return ral_en_conduisant;
    }

    public void setRal_en_conduisant(String ral_en_conduisant) {
        this.ral_en_conduisant = ral_en_conduisant;
    }



}
