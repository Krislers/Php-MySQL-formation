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
public class rempliruntableauavecunpas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final int L = 10 , C = 2 ; 
        //déclaration et creation de tableau 
        int [][] tab =new int [L] [C];
        
     int Pas , Depart , j ,i, Val;
     
  
         Scanner reader = new Scanner(System.in);
         
         System.out.print ("Entrés le Pas : ");
         Pas=reader.nextInt();
         System.out.print("Entrér la valeur de départ :");
         Depart=reader.nextInt();

         Val=Depart ; 
     
     
     for ( i=0; i < L; i++){
     for ( j=0 ; j < C ; j++){
        // tab[i][j]=Val;
        // Val=Val+Pas;
         tab[i][j]=(2*i + j)*Pas + Depart ;
     }
          }
        for( i=0 ; i < L ; i++){
    
        System.out.println();
        for( j = 0;j < C ; j++)
        System.out.print(tab[i][j] +"\t");
    }
    }
    
}
