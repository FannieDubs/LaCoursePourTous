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
public class ConfirmFractTemps {
    
    private int idCFT;
    private String TempsCFT;
    private String RepetitionCFT;
    private String NbSerieCFT;
    private String AllureCFT;
    
public ConfirmFractTemps (int idCFT, String TempsCFT, String RepetitionCFT, String NbSerieCFT, String AllureCFT ){
    
    this.idCFT = idCFT;
    this.TempsCFT = TempsCFT;
    this.RepetitionCFT = RepetitionCFT;
    this.NbSerieCFT = NbSerieCFT;
    this.AllureCFT = AllureCFT;
}

    public int getIdCFT() {
        return idCFT;
    }

    public void setIdCFT(int idCFT) {
        this.idCFT = idCFT;
    }

    public String getTempsCFT() {
        return TempsCFT;
    }

    public void setTempsCFT(String TempsCFT) {
        this.TempsCFT = TempsCFT;
    }

    public String getRepetitionCFT() {
        return RepetitionCFT;
    }

    public void setRepetitionCFT(String RepetitionCFT) {
        this.RepetitionCFT = RepetitionCFT;
    }

    public String getNbSerieCFT() {
        return NbSerieCFT;
    }

    public void setNbSerieCFT(String NbSerieCFT) {
        this.NbSerieCFT = NbSerieCFT;
    }

    public String getAllureCFT() {
        return AllureCFT;
    }

    public void setAllureCFT(String AllureCFT) {
        this.AllureCFT = AllureCFT;
    }


}
