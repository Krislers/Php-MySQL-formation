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
public class inverser_les_valeurs_dans_2_tableaux {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        final int N=10 ; 
        int i , tmp ;
        int [] tab1 , tab2 ;
        tab1 = new int [N] ; 
        tab2 = new int [N] ; 
        Scanner reader = new Scanner(System.in);

        for ( i=0 ; i<= N-1 ; i++){     
         System.out.println("Ecrire un entier:");
             tab1[i] = reader.nextInt() ;
        }
             
        for (i=0 ; i<=N-1 ; i++){
            
            tab2[i]=tab1[N-i-1];
            
            }
        for (i=0 ; i<=N-1 ; i++) {
        System.out.print(tab2[i] +"\t \f\t");
        // TODO code application logic here
    }
    
}
    }

