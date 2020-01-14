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
public class IndexdeLelementleplusgrand {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                        final int N = 10 ;
        //déclaration de tableau 
        int [] tab ; 
        int iMAX = 0 , i ;
        //Creation du tableau 
        tab = new int [N] ; 
   
         Scanner reader = new Scanner(System.in);

     //Lecture du Tableau
     for ( i=0 ; i<= N-1 ; i++){
         System.out.println("Ecrire un entier:");
             tab[i] = reader.nextInt() ;
     }
     iMAX = 0;
     //Parcour des ellements restant pour trouver le plus grand 
       for ( i=0 ; i<=N-1 ; i++){
           if (tab[i]>tab[iMAX]) {
               iMAX = i;  
               
         }
     }
     System.out.println("Le max se trouve en "+i);
        // TODO code application logic here
    }
    
}
