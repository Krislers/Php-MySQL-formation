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
public class Min_le_plus_petit_tableau_2_dimenssion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final int L = 5 , C = 2 ; 
        //déclaration et creation de tableau 
        int [][] tab =new int [L] [C];
        
     int Min ;
  
         Scanner reader = new Scanner(System.in);

     //Lecture du Tableau
     
     for (int i=0 ; i < L; i++){
     for (int j=0 ; j < C ; j++){
         System.out.println("Ecrire un entier:");
             tab[i][j] = reader.nextInt() ;
        // TODO code application logic here
    }
     }
     Min=tab[0][0] ; 
     for (int i=0 ; i < L; i++){
     for (int j=0 ; j < C ; j++){
         if (tab[i][j]< Min) {
             Min=tab[i][j];
         }
     }
}
     System.out.println("Le minimum est : "+Min);
     }
}

     
