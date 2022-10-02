/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import Entity.Individus;
import Entity.Medicament;
import Entity.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 
 */
public class FonctionsMetier implements IMetier
{
    // Fonction qui sert a lister les individus
    @Override
    public ArrayList<Individus> GetAllIndividus() 
    {
        ArrayList<Individus> lesIndividus = new ArrayList<>();
        try {
             Connection c = ConnexionBDD.getCnx();
            PreparedStatement s = c.prepareStatement("select TIN_CODE, TIN_LIBELLE from type_individu");
            System.out.println(s);
            ResultSet rs = s.executeQuery();
            while(rs.next())
            {
               lesIndividus.add(new Individus(rs.getInt("TIN_CODE"), rs.getString("TIN_LIBELLE"))); 
            
            }
            s.close();
        } catch (SQLException ex) {
            Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lesIndividus;
}

    // Fonction qui sert a se connecter
    @Override
    public User GetUnUser(String login, String mdp) {
        User unUser = null;
        try {
            Connection cnx = ConnexionBDD.getCnx();
            PreparedStatement ps = cnx.prepareStatement("select Identifiant,MotDePasse from utilisateur where Identifiant = '"+login+"' and MotDePasse = '"+mdp+"'");
            ResultSet rs = ps.executeQuery();
            if(rs.next())
            {
                unUser = new User(rs.getString("Identifiant"), rs.getString("MotDePasse"));
            }
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
        }
        return unUser;
    }

    // Fonction qui sert a lister les médicaments 
    @Override
    public ArrayList<Medicament> getAllMedicaments() {
        
        ArrayList<Medicament> lesMedicaments = new ArrayList<>();
    try {
        Connection cnx = ConnexionBDD.getCnx();
        PreparedStatement ps = cnx.prepareStatement("select MED_DEPOTLEGAL, MED_NOMCOMMERCIAL, MED_COMPOSITION, MED_EFFETS, MED_CONTREINDIC, MED_PRIXECHANTILLON, FAM_CODE from medicament");
        ResultSet rs = ps.executeQuery();
    while (rs.next())
        {

        Medicament m = new Medicament(rs.getInt("MED_DEPOTLEGAL"), rs.getString("MED_NOMCOMMERCIAL"),rs.getString("MED_COMPOSITION"),rs.getString("MED_EFFETS"),rs.getString("MED_CONTREINDIC"),rs.getInt("MED_PRIXECHANTILLON"),rs.getInt("FAM_CODE"));
        lesMedicaments.add(m);
        }
        ps.close();

        } 
    catch (SQLException ex) {
    Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lesMedicaments;
        
    }

    // Fonction qui sert a inscrire un user
    @Override
    public void InsererUser(String unId, String unMail, String unMdp) {
         try {
            Connection cnx = ConnexionBDD.getCnx();
            PreparedStatement ps = cnx.prepareStatement("insert into utilisateur values('"+unId+"','"+unMail+"','"+unMdp+"')");
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    // Fonction qui sert a modifier un individu
    @Override
    public void ModifierIndividu(String unLabelle, int unCode) {
        try {
            Connection cnx = ConnexionBDD.getCnx();
            PreparedStatement ps = cnx.prepareStatement("update type_individu set TIN_LIBELLE = '"+unLabelle + "' where TIN_CODE = "+unCode+"");
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Fonction qui sert ajouter un individu
    @Override
    public void InsererIndividu(String libelle) {
        try {
            Connection cnx = ConnexionBDD.getCnx();
            PreparedStatement ps = cnx.prepareStatement("insert into type_individu values(null,'"+libelle+"')");
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Fonction qui sert a recuperer le libelle de la famille
    @Override
    public ArrayList<String> getFamLib() {
        ArrayList<String> arr = new ArrayList<>();
        try {
            
             Connection cnx = ConnexionBDD.getCnx();
            PreparedStatement s = cnx.prepareStatement("select FAM_LIBELLE from famille");
            System.out.println(s);
            ResultSet rs = s.executeQuery();
            while(rs.next())
            {
               arr.add(rs.getString("FAM_LIBELLE")); 
            }
                  
        } 
        catch(SQLException exception) {
            Logger.getLogger(ConnexionBDD.class.getName()).log(Level.SEVERE, null, exception);
        }
     return arr;
    }

    // Fonction qui sert a recuperer le code des familles
    @Override
    public int getFamCodeByFamLib(String unFamCode) {
        int code=0;
        try {
            Connection c = ConnexionBDD.getCnx();
            PreparedStatement s = c.prepareStatement("select FAM_CODE from famille WHERE FAM_LIBELLE ='"+unFamCode+"'");
            System.out.println(s);
            ResultSet rs = s.executeQuery();
            rs.next();
            
            code = rs.getInt("FAM_CODE"); 
            
                  
        } 
        catch(SQLException exception) {
            Logger.getLogger(ConnexionBDD.class.getName()).log(Level.SEVERE, null, exception);
        }
       
        return code;
    }

    // Fonction qui sert a inserer un medicament
    @Override
    public void InsererMedicament(String unNom, String uneCompo, String unEffet, String unContreIndi, int unPrix, String unFamCode) {
        try {
             Connection c = ConnexionBDD.getCnx();
            int fam_code = getFamCodeByFamLib(unFamCode);
            PreparedStatement s = c.prepareStatement("INSERT INTO medicament VALUES (null,'"+unNom+"','"+uneCompo+"','"+unEffet+"','"+unContreIndi+"',"+unPrix+","+fam_code+")");
            System.out.println(s);   
            s.executeUpdate();           
        } 
        catch(SQLException exception) {
            Logger.getLogger(ConnexionBDD.class.getName()).log(Level.SEVERE, null, exception);
    }

  
    }

    // Fonction qui sert a recuperer le libelle des types d'individus
    public ArrayList<Individus> GetLibelleIndividus() {
        ArrayList<Individus> lesIndividus = new ArrayList<>();
        try {
            Connection cnx = ConnexionBDD.getCnx();
            PreparedStatement ps = cnx.prepareStatement("select  TIN_LIBELLE from type_individu");
            ResultSet rs = ps.executeQuery();
            while (rs.next())
            {
                
                Individus i = new Individus("TIN_LIBELLE");
                lesIndividus.add(i);
            }
            ps.close();
        
        }   catch (SQLException ex) {
            Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lesIndividus;
    }

    // Fonction qui sert a recuperer les dosages
    @Override
    public ArrayList<Dosage> getAllDosage() {
        ArrayList<Dosage> lesDosages = new ArrayList<>();
        try {
            Connection cnx = ConnexionBDD.getCnx();
            PreparedStatement ps = cnx.prepareStatement("select DOS_UNITE from dosage");
            ResultSet rs = ps.executeQuery();
            while (rs.next())
            {
                
                Dosage d = new Dosage(rs.getString("DOS_UNITE"));
                lesDosages.add(d);
            }
            ps.close();
        
        }   catch (SQLException ex) {
            Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lesDosages;
    }

    // Fonction qui sert a récupérer les noms des médicaments
    public ArrayList<Medicament> getAllNomMedicaments() {
        ArrayList<Medicament> lesMedicaments = new ArrayList<>();
        try {
            Connection cnx = ConnexionBDD.getCnx();
            PreparedStatement ps = cnx.prepareStatement("select MED_NOMCOMMERCIAL from medicament");
            ResultSet rs = ps.executeQuery();
            while (rs.next())
            {
                
                Medicament m = new Medicament( rs.getString("MED_NOMCOMMERCIAL"));
                lesMedicaments.add(m);
            }
            ps.close();
        
        }   catch (SQLException ex) {
            Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lesMedicaments;
    }

    // Fonction qui sert a récupérer 
    @Override
    public ArrayList<Famille> getAllNomFamille() {
        ArrayList<Famille> lesFamilles = new ArrayList<>();
        try {
            Connection cnx = ConnexionBDD.getCnx();
            PreparedStatement ps = cnx.prepareStatement("select FAM_LIBELLE from famille");
            ResultSet rs = ps.executeQuery();
            while (rs.next())
            {
                
                Famille f= new Famille( rs.getString("FAM_LIBELLE"));
                lesFamilles.add(f);
            }
            ps.close();
        
        }   catch (SQLException ex) {
            Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lesFamilles;
    }

    // Fonction qui sert a inserer une prescription
    @Override
    public void InsererUnePrescription(String nomCommercial, String libelle, String forme, String posologie) {
        try
     {
        Connection cnx = ConnexionBDD.getCnx();
        PreparedStatement ps = cnx.prepareStatement("SELECT medicament.MED_DEPOTLEGAL from medicament WHERE medicament.MED_NOMCOMMERCIAL = '"+nomCommercial+"'");
        ResultSet rs = ps.executeQuery();
        rs.next();
        int numCodeMedoc = rs.getInt(1);
        
        
        ps = cnx.prepareStatement("SELECT TIN_CODE from type_individu WHERE TIN_LIBELLE = '"+libelle+"'");
        rs = ps.executeQuery();
        rs.next();
        int numTypeeIndividu = rs.getInt(1);
        
        ps = cnx.prepareStatement("SELECT DOS_CODE FROM dosage WHERE DOS_UNITE = '"+forme+"'");
        rs = ps.executeQuery();
        rs.next();
        int numDose = rs.getInt(1);
        
       
        
        ps = cnx.prepareStatement("insert into prescrire values (null,"+numTypeeIndividu+","+numDose+","+numCodeMedoc+",'"+posologie+"')");
        ps.executeUpdate();
        ps.close();
     }  catch (SQLException ex) {
        Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Fonction qui sert a ajouter un medicament perturbateur 
    @Override
    public void InsererInteraction(int numMedoc, int numMedocperturber) {
        try
        {
        Connection cnx = ConnexionBDD.getCnx();
        PreparedStatement ps = cnx.prepareStatement("insert into interagir values ("+numMedoc+","+numMedocperturber+")");
        ps.executeUpdate();

        } catch (SQLException ex) {
        Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
        }
       }
    
   // Fonction qui sert lister les médicaments perturbateurs 
   public ArrayList<Medicament> getAllMedicamentsPerturber(int code) {
    ArrayList<Medicament> lesMedicamentsPerturber = new ArrayList<>();
    try {
    Connection cnx = ConnexionBDD.getCnx();

    PreparedStatement ps = cnx.prepareStatement("select m.MED_DEPOTLEGAL , m.MED_NOMCOMMERCIAL from medicament m inner join interagir i on m.MED_DEPOTLEGAL=i.MED_PERTURBATEUR where i.MED_MED_PERTURBE= "+code);
    ResultSet rs = ps.executeQuery();
    while (rs.next())
    {

    Medicament m = new Medicament(rs.getInt("MED_DEPOTLEGAL"), rs.getString("MED_NOMCOMMERCIAL"));
    lesMedicamentsPerturber.add(m);
    }
    ps.close();

    } catch (SQLException ex) {
    Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
    }
    return lesMedicamentsPerturber;

    }
   
    // Fonction qui liste les médicaments non perturbateurs
    public ArrayList<Medicament> getAllMedicamentsNonPerturber(int code) {
    ArrayList<Medicament> lesMedicamentsPerturber = new ArrayList<>();
    try {
    Connection cnx = ConnexionBDD.getCnx();
    PreparedStatement ps = cnx.prepareStatement("select m.MED_DEPOTLEGAL , m.MED_NOMCOMMERCIAL from medicament m Where MED_DEPOTLEGAL not in( select m.MED_DEPOTLEGAL from medicament m inner join interagir i on m.MED_DEPOTLEGAL=i.MED_PERTURBATEUR where i.MED_MED_PERTURBE = "+code+")AND MED_DEPOTLEGAL !="+code+"");
    ResultSet rs = ps.executeQuery();
    while (rs.next())
    {

    Medicament m = new Medicament(rs.getInt("MED_DEPOTLEGAL"), rs.getString("MED_NOMCOMMERCIAL"));
    lesMedicamentsPerturber.add(m);
    }
    ps.close();

    } catch (SQLException ex) {
    Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
    }
    return lesMedicamentsPerturber;

    }

    // Fonction qui récupère les noms des types d'individus
    public ArrayList<String> GetAllNomIndividus() {
        ArrayList<String> lesNomsDesIndividus = new ArrayList<>();
        try {
            Connection cnx = ConnexionBDD.getCnx();
            PreparedStatement ps = cnx.prepareStatement("select  TIN_LIBELLE from type_individu");
            ResultSet rs = ps.executeQuery();
            while(rs.next())
            {
                lesNomsDesIndividus.add(rs.getString(1));
            }
        } catch (SQLException ex) {
            Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lesNomsDesIndividus;
    }
    
    // Graphique qui liste le nombre de prescription par type d'individu
    public HashMap<String,Double> GetDatasGraphique1(String nomType)
    {
        HashMap<String, Double> datas = new HashMap();
        try {
            Connection cnx = ConnexionBDD.getCnx();
            PreparedStatement ps = cnx.prepareStatement("select medicament.MED_NOMCOMMERCIAL, COUNT(prescrire.TIN_CODE) as compteur\n" +
                                                        "from medicament\n" +
                                                        "inner join prescrire ON medicament.MED_DEPOTLEGAL= prescrire.MED_DEPOTLEGAL\n" +
                                                        "inner join type_individu ON  prescrire.TIN_CODE= type_individu.TIN_CODE\n" +
                                                        "WHERE type_individu.TIN_LIBELLE ='"+nomType+"'" +
                                                        "group by medicament.MED_NOMCOMMERCIAL");
            ResultSet rs = ps.executeQuery();
            while(rs.next())
            {
                datas.put(rs.getString(1), rs.getDouble(2));
            }
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return datas;
    }

    // Fonction qui sert a recuperer les données des médicaments 
    @Override
    public Medicament getLeMedicament(int code) {
        Medicament m = null;
       try
     {
        Connection cnx = ConnexionBDD.getCnx();
        PreparedStatement ps = cnx.prepareStatement("select MED_DEPOTLEGAL,MED_NOMCOMMERCIAL,MED_COMPOSITION,MED_EFFETS,MED_CONTREINDIC,MED_PRIXECHANTILLON, FAM_CODE from medicament where MED_DEPOTLEGAL = "+code);
        ResultSet rs = ps.executeQuery();
        rs.next() ;
       
         m = new Medicament(rs.getInt("MED_DEPOTLEGAL"), rs.getString("MED_NOMCOMMERCIAL"),rs.getString("MED_COMPOSITION"),rs.getString("MED_EFFETS"), rs.getString("MED_CONTREINDIC"),rs.getInt("MED_PRIXECHANTILLON"), rs.getInt("FAM_CODE"));

     
     }  catch (SQLException ex) {
            Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
        }
        return m;
    }

    // Graphique qui sert a afficher le nombre de médicaments par famille de médicaments 
    public HashMap<String,Integer> GetDatasGraphique2() 
    {
        HashMap<String, Integer> datas = new HashMap();
        try {
             Connection cnx = ConnexionBDD.getCnx();
             PreparedStatement ps = cnx.prepareStatement("select famille.FAM_LIBELLE, COUNT(medicament.MED_DEPOTLEGAL) as compteur\n" +
                                                         "from famille\n" +
                                                         "INNER join medicament ON famille.FAM_CODE= medicament.FAM_CODE\n" +
                                                         "group by famille.FAM_LIBELLE");
           ResultSet rs = ps.executeQuery();
            while(rs.next())
            {
                datas.put(rs.getString(1), rs.getInt(2));
            }
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return datas;
    }

    // Fonction qui sert a modifier les médicaments
    public void ModifierMedicament(int unDepo, String unNom, String uneCompo, String unEffet, String unContreIndi,int unPrix){
    try {
            Connection cnx = ConnexionBDD.getCnx();
            PreparedStatement ps = cnx.prepareStatement("update medicament as m set m.MED_NOMCOMMERCIAL='"+unNom+"', m.MED_COMPOSITION='"+uneCompo+"',m.MED_PRIXECHANTILLON ="+unPrix+", m.MED_EFFETS='"+unEffet+"', m.MED_CONTREINDIC='"+unContreIndi+"' where m.MED_DEPOTLEGAL="+unDepo+"");
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
        }    
    }
    
    // Graphique qui liste le nombre de prescriptions d'un médicament
    public HashMap<Integer,String[]> GetDatasGraphique3()
    {
        HashMap<Integer,String[]> datas = new HashMap();
        try {
            Connection cnx = ConnexionBDD.getCnx();
            PreparedStatement ps = cnx.prepareStatement("select medicament.MED_NOMCOMMERCIAL, COUNT(prescrire.TIN_CODE) as compteur, type_individu.TIN_LIBELLE\n" +
                                                        "from medicament\n"+
                                                        "inner join prescrire   ON medicament.MED_DEPOTLEGAL= prescrire.MED_DEPOTLEGAL\n"+
                                                        "inner join type_individu ON  prescrire.TIN_CODE= type_individu.TIN_CODE\n"+
                                                        "group by medicament.MED_NOMCOMMERCIAL\n");
           ResultSet rs = ps.executeQuery();
            int i = 1;
            while(rs.next())
            {
                datas.put(i, new String[]{rs.getString(1),rs.getString(2),rs.getString(3)});
                i++;
            }
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return datas;
    }
}
