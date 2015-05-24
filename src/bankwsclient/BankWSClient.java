/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankwsclient;

import static bankwsclient.Operation.*;

/**
 *
 * @author macbookpro
 */
public class BankWSClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Compte c1 = creercompte(1,"mehdi",100);
        Compte c2 = creercompte(2, "agouzal", 600);
        versercompte(c1,100);
        retraitcompte(c1, 50);
        transfertargent(c1, c2, 50);
        afficher(c1);
        afficher(c2);
        
        // TODO code application logic here
    }
    
}
