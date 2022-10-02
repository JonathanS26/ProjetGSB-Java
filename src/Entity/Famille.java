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
public class Famille 
{
    private int codeFam;
    private String nomFam;

  public  Famille(String unNom) 
  {
      nomFam = unNom;  
  }

    /**
     * @return the codeFam
     */
    public int getCodeFam() {
        return codeFam;
    }

    /**
     * @return the nomFam
     */
    public String getNomFam() {
        return nomFam;
    }
    
    
    
}
