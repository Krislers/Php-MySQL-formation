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
public class Carré_Magic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
       int x , ligne , colone ;
       System.out.println("Ecrire un entier:");
          int n = reader.nextInt();
       final int [][] tab =new int [n] [n];
        colone = n/2 ; 
        ligne = colone + 1 ;
        tab [ligne][colone]= 1 ;
        
        
           
     //Lecture du Tableau
     
     for ( x=2 ; x < n*n ; x++){
        
         if ((x-1)%n==0){
          ligne=(ligne+2)%n;
          
         
      }
      else {
ligne=(ligne+1)%n;
colone=(colone+1)%n;
        }
      tab[ligne][colone]=x ; 
           }
    
    for(int i=0 ; i < n ; i++){
    
        System.out.println();
        for(int j = 0;j < n ; j++)
        System.out.print(tab[i][j] +"\t");
    }
    }
}

