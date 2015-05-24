/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankwsclient;

/**
 *
 * @author macbookpro
 */
public class Operation {
    
    public static Compte creercompte(int id,String prop,float solde){
        return new Compte(id, prop, solde);
    }
    
    public static void versercompte(Compte c1,float montant){
        c1.setSolde(c1.getSolde()+montant);
    }
    
    public static void retraitcompte(Compte c1,float montant){
        if(c1.getSolde()-montant>=0) {
        c1.setSolde(c1.getSolde()-montant);
        } else {
            System.out.println("Fonds Insuffisant");
        }
    }
    
    public static void transfertargent(Compte cptexp, Compte cptdest , float montant) {
        if(cptexp.getSolde()-montant>=0) {
        cptexp.setSolde(cptexp.getSolde()-montant);
        cptdest.setSolde(cptdest.getSolde()+montant);
        } else {
            System.out.println("Fonds Insuffisant");
        } 
    }
    
    public static void afficher(Compte c1){
        System.out.println("Identifiant : "+c1.getId());
        System.out.println("Propriétaire : "+c1.getProprietaire());
        System.out.println("Solde : "+c1.getSolde());
    }
}
