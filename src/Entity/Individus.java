/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.util.logging.Logger;

/**
 *
 * @author natha
 */
public class Individus 
{
    private int codeIndividu;
    private String libelle;

    public Individus(int UnCodeIndividu, String unLibelle) 
    {
        codeIndividu = UnCodeIndividu;
        libelle = unLibelle;
    }

    public Individus(String unLibelle) 
    {
        libelle = unLibelle;
    }

    /**
     * @return the codeIndividu
     */
    public int getCodeIndividu() {
        return codeIndividu;
    }

    /**
     * @param codeIndividu the codeIndividu to set
     */
    public void setCodeIndividu(int codeIndividu) {
        this.codeIndividu = codeIndividu;
    }

    /**
     * @return the libelle
     */
    public String getLibelle() {
        return libelle;
    }

    /**
     * @param libelle the libelle to set
     */
    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }
    
    
    
}
