/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author jacqu
 */
public class User
{
    private String identifiantUser;
    private String mailUser;
    private String mdpUser;
    
    public User(String unId,String unMail, String unMdp)
    {
        identifiantUser = unId;
        mailUser = unMail;
        mdpUser = unMdp;
    }

public User(String unId, String unMdp)
    {
        identifiantUser = unId;
        mdpUser = unMdp;
    }

    
    public String getMailUser() {
        return mailUser;
    }


    /**
     * @param mailUser the mailUser to set
     */
    public void setMailUser(String mailUser) {
        this.mailUser = mailUser;
    }

    /**
     * @return the nomIdentifiant
     */
    public String getNomIdentifiant() {
        return identifiantUser;
    }

    /**
     * @param nomIdentifiant the nomIdentifiant to set
     */
    public void setNomIdentifiant(String nomIdentifiant) {
        this.identifiantUser = identifiantUser;
    }

    /**
     * @return the mdpUser
     */
    public String getMdpUser() {
        return mdpUser;
    }

    /**
     * @param mdpUser the mdpUser to set
     */
    public void setMdpUser(String mdpUser) {
        this.mdpUser = mdpUser;
    }
}
