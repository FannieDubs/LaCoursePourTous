/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entites;

import BDD.CBDD;
import BDD.CParametresStockageBDD;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import lacoursepourtous.ApplicationCompte;

/**
 *
 * @author BTS sio
 */
public class Footing {
    

    private String indexFooTps;
    private String tempsFT;
    private String allureFT;
    private String recuperation_idrecuparation;
    private String echauffement_idechauffement;
    
    protected CBDD bdd;

       public Footing(CBDD bdd){
           this.bdd = bdd;
       }
    
public Footing (String indexFooTps, String tempsFT, String allureFT, String recuperation_idrecuparation, String echauffement_idechauffement){

    this.indexFooTps = indexFooTps;
    this.tempsFT = tempsFT;
    this.allureFT = allureFT;
    this.echauffement_idechauffement = echauffement_idechauffement;
    this.recuperation_idrecuparation = recuperation_idrecuparation;
    
}

public Footing convertir_Footing (ResultSet rs) {
        try {
            String indexFooTps = rs.getString(1);
            String tempsFT = rs.getString(2);
            String allureFT = rs.getString(3);
            String echauffement_idechauffement = rs.getString(4);
            String recuperation_idrecuparation = rs.getString(5);


            Footing footing = new Footing(indexFooTps, tempsFT, allureFT, echauffement_idechauffement, recuperation_idrecuparation);

            return footing;
        } catch (SQLException ex) {
            Logger.getLogger(ApplicationCompte.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

 public Footing afficherFooting (int indexFooTps){
        Footing footing = null;
        if (bdd.connecter() == true) {
            System.out.println("Connexion OK");
            ResultSet rs = bdd.executerRequeteQuery("select * from FootingTemps  WHERE `indexFooTps ` = " + indexFooTps);
            try {
                if (rs.next()) {
                    footing = convertir_Footing(rs);
                }
            } catch (SQLException ex) {
                Logger.getLogger(CBDD.class.getName()).log(Level.SEVERE, null, ex);
            }
            bdd.deconnecter();
        } else {
            System.out.println("Connexion KO");
        }
        return footing;
    }
        

    public String getIndexFooTps() {
        return indexFooTps;
    }

    public void setIndexFooTps(String indexFooTps) {
        this.indexFooTps = indexFooTps;
    }

    public String getTempsFT() {
        return tempsFT;
    }

    public void setTempsFT(String tempsFT) {
        this.tempsFT = tempsFT;
    }

    public String getAllureFT() {
        return allureFT;
    }

    public void setAllureFT(String allureFT) {
        this.allureFT = allureFT;
    }

    public String getRecuperation_idrecuparation() {
        return recuperation_idrecuparation;
    }

    public void setRecuperation_idrecuparation(String recuperation_idrecuparation) {
        this.recuperation_idrecuparation = recuperation_idrecuparation;
    }

    public String getEchauffement_idechauffement() {
        return echauffement_idechauffement;
    }

    public void setEchauffement_idechauffement(String echauffement_idechauffement) {
        this.echauffement_idechauffement = echauffement_idechauffement;
    }

    
  
}
