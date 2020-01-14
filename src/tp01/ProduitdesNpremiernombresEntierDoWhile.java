/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp01;

import java.util.Scanner;

/**
 *
 * @author formation_gep
 */
public class ProduitdesNpremiernombresEntierDoWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          int n , i ;
        long produit; 
       Scanner reader = new Scanner (System.in);
        produit = 1 ; 
       i= 1 ;  
       System.out.println("Ecrire un nombre : ");   
       n = reader.nextInt();
       do {
           produit=produit * i ;
               i++;     }
       while (i <= n);
      
          
       
       System.out.println("Le produit vaut : " + produit);
       
}
        
    }
    

