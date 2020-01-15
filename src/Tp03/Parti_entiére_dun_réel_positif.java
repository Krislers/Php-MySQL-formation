/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tp03;

import java.util.Scanner;

/**
 *
 * @author formation_gep
 */
public class Parti_entiére_dun_réel_positif {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double r ; 
        Scanner reader = new Scanner(System.in);
        System.out.print("Saisir un nombe réel");
        r = reader.nextDouble();
        System.out.print("La Partie entiére vaut : " +partientiére(r));
    }
    public static int partientiére (double x){
        
         int Resultat ;
         Resultat = 0 ; 
         while (Resultat<x){
             Resultat=Resultat+1 ; 
         }
        return Resultat-1 ;
    }
}
