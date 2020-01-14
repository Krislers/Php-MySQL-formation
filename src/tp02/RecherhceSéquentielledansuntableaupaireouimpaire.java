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
public class RecherhceSéquentielledansuntableaupaireouimpaire {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic herefinal int N = 10 ;
        //déclaration de tableau 
        final int N=10 ; 
        int [] tab ; 
        int i ;
        boolean estpaire ; 
        
        //Creation du tableau 
        tab = new int [N] ; 
   
         Scanner reader = new Scanner(System.in);

     //Lecture du Tableau
     for ( i=0 ; i<= N-1 ; i++){
         System.out.print("Ecrire les valeurs du tableau:  ");
             tab[i] = reader.nextInt() ;
        // TODO code application logic here
    }
    i=0 ;
    estpaire = true ;
    while (i<N && estpaire){
        
            if (tab[i]%2==1){
                estpaire = false ; 
            }
            i++;
        }
     
    
 System.out.print("tout les éléments sont paire" +estpaire);

    }   
   }

