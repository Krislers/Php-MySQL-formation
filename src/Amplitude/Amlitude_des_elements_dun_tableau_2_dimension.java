/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Amplitude;

import java.util.Scanner;

/**
 *
 * @author formation_gep
 */
public class Amlitude_des_elements_dun_tableau_2_dimension {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // déclaration des constante
        final int L = 5 , C = 2 ; 
        //déclaration et creation de tableau 
        int [][] tab =new int [L] [C];
        //déclaration des variable 
     int Min , Max , Amp ;
  
         Scanner reader = new Scanner(System.in);

     //Lecture du Tableau , des entrée utilisateur 
     
     for (int i=0 ; i < L; i++){
     for (int j=0 ; j < C ; j++){
         System.out.println("Ecrire un entier:");
             tab[i][j] = reader.nextInt() ;
        
    }
     }//Calcule de Min
     Min=tab[0][0] ; 
     for (int i=0 ; i < L; i++){
     for (int j=0 ; j < C ; j++){
         if (tab[i][j]< Min) {
             Min=tab[i][j];
         }
     }
     }//Calcule de MAX
     Max=tab[0][0] ; 
     for (int i=0 ; i < L ; i++){
     for (int j=0 ; j < C ; j++){
         if (tab[i][j]> Max) {
             Max=tab[i][j];
     
     }
     
    }
    
     
}//Calcule de Amp et affichage de Amp
     Amp=Max-Min;
     System.out.println("l'amplitude est de "+Amp);
    }
}