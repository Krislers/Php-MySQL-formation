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
public class moyenne_tableau_deuxiemme_dimenssion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {       
        final int N = 5 , V = 2 ; 
        //déclaration et creation de tableau 
        int [][] tab =new int [N] [V];
        
     int somme ;
     double moyenne ; 
         Scanner reader = new Scanner(System.in);

     //Lecture du Tableau
     somme=0;
     for (int i=0 ; i<N; i++){
     for (int j=0 ; j<V ; j++){
         System.out.println("Ecrire un entier:");
             tab[i][j] = reader.nextInt() ;
             somme = somme + tab [i][j];
         }
     }
     moyenne = (double) somme / (N*V);
     System.out.println("La moyenne du tableau est :"+moyenne);
     
    
    
}
}