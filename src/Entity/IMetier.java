/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import Entity.Medicament;
import Entity.Individus;
import Entity.User;
import java.util.ArrayList;

/**
 *
 * @author 
 */
public interface IMetier 
{
    //GESTION DES INDIVIDUS
    
    public ArrayList<Individus> GetAllIndividus();
    public void InsererIndividu(String libelle);
    public void ModifierIndividu(String unLabelle, int unCode);
    
    
    //GESTION DES MEDICAMENTS
    
    public ArrayList<Medicament> getAllMedicaments();
    public Medicament getLeMedicament(int code);
    public void InsererMedicament(String unNom, String uneCompo,String unEffet,String unContreIndi,int unPrix, String unFamCode);
    
    
    //GESTION DE L'INSCRIPTION ET DE L'IDENTIFICATION
    
    public User GetUnUser(String login, String mdp);
    public void InsererUser(String unId,String unMail, String unMdp);
    
    
    
    public ArrayList<String> getFamLib();
    public int getFamCodeByFamLib(String unFamCode);
    public ArrayList<Famille> getAllNomFamille();
    

    
    //GESTION DES PRESCRIPTIONS
    
    public ArrayList<Individus> GetLibelleIndividus();
    public ArrayList<Dosage> getAllDosage();
    public ArrayList<Medicament> getAllNomMedicaments();
    public void InsererUnePrescription(String nomCommercial, String libelle, String forme, String posologie);
    
    
    //GESTION DES MEDICAMENTS NON CONSEILLE
    
    public void InsererInteraction(int numMedoc,int numMedocperturber);
    
    
}
