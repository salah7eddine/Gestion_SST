package com.lydex.gestion_sst.entities.chantier;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Epc_epi implements Serializable {
    @Id @GeneratedValue
    private Long id_epc_epi;
    private String utilisation_epc;
    private String 	port_epi;
    private String 	ctrl_reg;
    private String 	outillage_cfrm;
    private String 	gilet_tenue_hv;
    private String 	outillage_range	;



    public Epc_epi() {
    }

    public Epc_epi(String utilisation_epc, String port_epi, String ctrl_reg, String outillage_cfrm, String gilet_tenue_hv, String outillage_range) {

        this.utilisation_epc = utilisation_epc;
        this.port_epi = port_epi;
        this.ctrl_reg = ctrl_reg;
        this.outillage_cfrm = outillage_cfrm;
        this.gilet_tenue_hv = gilet_tenue_hv;
        this.outillage_range = outillage_range;
    }

    public Long getId_epc_epi() {

        return id_epc_epi;
    }

    public void setId_epc_epi(Long id_epc_epi) {
        this.id_epc_epi = id_epc_epi;
    }

    public String getUtilisation_epc() {
        return utilisation_epc;
    }

    public void setUtilisation_epc(String utilisation_epc) {
        this.utilisation_epc = utilisation_epc;
    }

    public String getPort_epi() {
        return port_epi;
    }

    public void setPort_epi(String port_epi) {
        this.port_epi = port_epi;
    }

    public String getCtrl_reg() {
        return ctrl_reg;
    }

    public void setCtrl_reg(String ctrl_reg) {
        this.ctrl_reg = ctrl_reg;
    }

    public String getOutillage_cfrm() {
        return outillage_cfrm;
    }

    public void setOutillage_cfrm(String outillage_cfrm) {
        this.outillage_cfrm = outillage_cfrm;
    }

    public String getGilet_tenue_hv() {
        return gilet_tenue_hv;
    }

    public void setGilet_tenue_hv(String gilet_tenue_hv) {
        this.gilet_tenue_hv = gilet_tenue_hv;
    }

    public String getOutillage_range() {
        return outillage_range;
    }

    public void setOutillage_range(String outillage_range) {
        this.outillage_range = outillage_range;
    }


}
