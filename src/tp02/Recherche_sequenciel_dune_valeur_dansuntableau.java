/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp02;

import java.util.Scanner;

/**
 *
 * @author formation_gep
 */
public class Recherche_sequenciel_dune_valeur_dansuntableau {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        final int N = 10 ;
        //déclaration de tableau 
        int [] tab ; 
        int i , b , c ;
        //Creation du tableau 
        tab = new int [N] ; 
   
         Scanner reader = new Scanner(System.in);

     //Lecture du Tableau
     for ( i=0 ; i<= N-1 ; i++){
         System.out.print("Ecrire les valeurs du tableau:  ");
             tab[i] = reader.nextInt() ;
        // TODO code application logic here
    }
     System.out.print("Saisir une valeur pour trouver l'occurance dans le tableau  ");
     b=reader.nextInt();
     c=0;
     for (i=0 ; i<=N-1 ; i++){
         if (b==tab[i]){
             c = c+1 ; 
         }
     }
    System.out.println("L'occurance du chiffre " +b+ "  est donc de " +c );
}
}
