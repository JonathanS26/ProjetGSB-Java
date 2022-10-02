/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author natha
 */
public class Prescrire 
{
    private int codePres;
    private int codeDos;
    private int depotLegal;
    private String posologie;

    public Prescrire(int unCodePres, int unCodeDos, int unDepot, String unPosologie)
    {
    unCodePres = codePres;
    unCodeDos = codeDos;
    unDepot = depotLegal;
    unPosologie = posologie;
    }

    public Prescrire(String unPosologie)
    {
        unPosologie = posologie;
    }

    /**
     * @return the codePres
     */
    public int getCodePres() {
        return codePres;
    }

    /**
     * @param codePres the codePres to set
     */
    public void setCodePres(int codePres) {
        this.codePres = codePres;
    }

    /**
     * @return the codeDos
     */
    public int getCodeDos() {
        return codeDos;
    }

    /**
     * @param codeDos the codeDos to set
     */
    public void setCodeDos(int codeDos) {
        this.codeDos = codeDos;
    }

    /**
     * @return the depotLegal
     */
    public int getDepotLegal() {
        return depotLegal;
    }

    /**
     * @param depotLegal the depotLegal to set
     */
    public void setDepotLegal(int depotLegal) {
        this.depotLegal = depotLegal;
    }

    /**
     * @return the posologie
     */
    public String getPosologie() {
        return posologie;
    }

    /**
     * @param posologie the posologie to set
     */
    public void setPosologie(String posologie) {
        this.posologie = posologie;
    }
}
