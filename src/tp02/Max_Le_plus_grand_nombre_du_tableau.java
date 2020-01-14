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
public class Max_Le_plus_grand_nombre_du_tableau {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                final int N = 10 ;
        //déclaration de tableau 
        int [] tab ; 
        int MAX ;
        //Creation du tableau 
        tab = new int [N] ; 
   
         Scanner reader = new Scanner(System.in);

     //Lecture du Tableau
     for (int i=0 ; i<= N-1 ; i++){
         System.out.println("Ecrire un entier:");
             tab[i] = reader.nextInt() ;
     }
     MAX = tab[0];
       for (int i=0 ; i<=N-1 ; i++){
           if (tab[i]>MAX) {
               MAX = tab[i];
         }
     }
       System.out.println("Le max est de : " +MAX);
       
     
        // TODO code application logic here
    }
    
}
