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
public class Moyenne_des_n_nombreOptimiser {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final int N = 10 ; 
        //déclaration de tableau 
        int [] tab ; 
        //Creation du tableau 
        tab = new int [N] ; 
     int somme ;
     double moyenne ; 
         Scanner reader = new Scanner(System.in);
    somme=0;
     //Lecture du Tableau
     for (int i=0 ; i<= N-1 ; i++){     
         System.out.println("Ecrire un entier:");
             tab[i] = reader.nextInt() ;
                     somme = somme + tab[i];
    }
     
       
     
     moyenne = somme / N ; 
     System.out.println("La moyenne du Tableau est de: "+moyenne);
    }
    }
        // TODO code application logic here
    
    

