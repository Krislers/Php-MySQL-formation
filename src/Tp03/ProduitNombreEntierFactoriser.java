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
public class ProduitNombreEntierFactoriser {
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner reader = new Scanner ( System.in);
    
    int n ; 
    System.out.print("Donner le factorielle ");
    n=reader.nextInt();
    affiche();
    System.out.println("La valeur du factorielle est donc : "+Factorielle(n));
    affiche();
    
    
       // TODO code application logic here
    }
     public static int Factorielle(int x){
         int i ;
         int produit ; 
         produit = 1 ;
         for (i=2 ;i<=x ; i++){
             produit = produit * i ;
         }
         return produit ;
     }
     public static void affiche(){
         System.out.println("**********************************************");
     }
}
