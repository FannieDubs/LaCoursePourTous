/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entites;

/**
 *
 * @author BTS sio
 */
public class User {
    /*liste des attributs de la classe */
    
    private String nom ;
    private String prenom ;
    private String mail ; 
    private String mdp ;
    
    /* le constructeur*/
    public User (String nom, String prenom, String mail, String mdp ){
        this.nom = nom;
        this.prenom = prenom ;
        this.mail = mail ;
        this.mdp = mdp;
    }
    //création des methodes get et set
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getMdp() {
        return mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }
    
   
}
