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
public class Inverser_les_element_du_tableau {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                 final int N = 10 ; 
        //déclaration de tableau 
        int [] tab  ; 
        //Creation du tableau 
        tab = new int [N] ;
        int i , Tmp ;
         Scanner reader = new Scanner(System.in);
    
     //Lecture du Tableau
     for ( i=0 ; i<= N-1 ; i++){     
         System.out.println("Ecrire un entier:");
             tab[i] = reader.nextInt() ;
        
        // TODO code application logic here
    }
    for (i=0 ; i<=N/2 ; i++){
        Tmp=tab[i];
        tab[i]=tab[N-i-1];
        tab[N-i-1]=Tmp ; 
    }
    
    for (i=0 ; i<=N-1 ; i++) {
        System.out.print(tab[i] +" ");
    }
}
}
