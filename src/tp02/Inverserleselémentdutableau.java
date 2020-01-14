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
public class Inverserleselémentdutableau {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         final int N = 10 ; 
        //déclaration de tableau 
        int [] tab ; 
        //Creation du tableau 
        tab = new int [N] ;
        int i ;
         Scanner reader = new Scanner(System.in);
    
     //Lecture du Tableau
     for ( i=0 ; i<= N-1 ; i++){     
         System.out.println("Ecrire un entier:");
             tab[i] = reader.nextInt() ;
        // TODO code application logic here
    }
     for( i = (tab.length -1 ) ; i>=0 ;i--){
     System.out.println(tab[i]);
}
    
    }
}

