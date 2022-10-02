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
public class Dosage 
{
    private int codeDosage;
    private int quantiteDosage;
    private String uniteDosage;

    public Dosage(int UnCode, int uneQuantite, String uneUnite) 
    {
        codeDosage = UnCode;
        quantiteDosage = uneQuantite;
        uniteDosage = uneUnite;
    }

    public Dosage(String uneUnite) 
    {
        uniteDosage = uneUnite;
    }

    /**
     * @return the codeDosage
     */
    public int getCodeDosage() {
        return codeDosage;
    }

    /**
     * @param codeDosage the codeDosage to set
     */
    public void setCodeDosage(int codeDosage) {
        this.codeDosage = codeDosage;
    }

    /**
     * @return the quantiteDosage
     */
    public int getQuantiteDosage() {
        return quantiteDosage;
    }

    /**
     * @param quantiteDosage the quantiteDosage to set
     */
    public void setQuantiteDosage(int quantiteDosage) {
        this.quantiteDosage = quantiteDosage;
    }

    /**
     * @return the uniteDosage
     */
    public String getUniteDosage() {
        return uniteDosage;
    }

    /**
     * @param uniteDosage the uniteDosage to set
     */
    public void setUniteDosage(String uniteDosage) {
        this.uniteDosage = uniteDosage;
    }
}
