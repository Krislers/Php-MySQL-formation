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
public class ProduitdesNpremiernombreEntierWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n , i ;
        long produit; 
       Scanner reader = new Scanner (System.in);
        produit = 1 ; 
       i= 2 ;  
       System.out.println("Ecrire un nombre : ");   
       n = reader.nextInt();
       while (i <= n){
           produit = produit * i;
           i++;
       }
       System.out.println("Le produit vaut : " + produit);

        // TODO code application logic here
    }
    
}
