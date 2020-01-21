/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tp03;

import java.util.Scanner;

/**
 *
 * @author formation_gep
 */
public class carrépolybe2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      // TODO code application logic here
       Scanner reader = new Scanner(System.in);
       // VARIABLES
      int i , j , k ;
      String mot = "DEV";
      char lettre ;
       int [] c =new int [mot.length()];
      // MATRICE CARR2E D'ORDRE 5
      final int n=5;
      char[][] T = new char [][]{
          {'A','B','C','D','E'},
          {'F','G','H','I','J'},
          {'K','L','M','N','O'},
          {'P','Q','R','S','T'},
          {'U','V','X','Y','Z'},
   };
      k=0;
      while ( k < mot.length())
   // AFFICHAGE D'UNE MATRICE
          lettre = mot.charAt(k) ;
   for (i = 0; i < n ; i++){
     for (j = 0 ; j < n ; j++){
         if ( lettre = T[i][j]){
             c[i]=i+c[i];
             c[i]=j+c[i];
         
               }
       }
   }
}

    
    

