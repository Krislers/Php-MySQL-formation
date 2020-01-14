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
public class sommededeuxmatricecarréeentier {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Scanner reader = new Scanner(System.in);
    
         int N   ;
        
         System.out.println("entrer l'ordre du carrée du prmeier tableai :");
                N = reader.nextInt(); 
         
      int[][]  tab1 = new int [N][N] ; 
      int[][] tab2 = new int [N][N] ; 
      
        
        
       
                
            for (int i=0 ; i < N; i++){
            for (int j=0 ; j < N ; j++){
                System.out.println("Ecrire un entier 1er:");
                 tab1[i][j] = reader.nextInt() ;
            }
            }
             
               
         
            for ( int i=0 ; i < N; i++){
            for ( int  j=0 ; j < N ; j++){
                System.out.println("Ecrire un entier 2emme:");
                
                tab2[i][j] = reader.nextInt() ;
            }
            } 
                
                int[][] matrice3 = new int [N][N];
               for (  int i = 0 ; i < N ; i++){
                 for (  int j = 0; j < N; j++){
                     matrice3[i][j]= tab1[i][j] + tab2 [i][j];     
                    }
                }
                
               for (int i=0; i< N ; i++){
                   System.out.println();
                   for(int j = 0 ; j < N ; j++){
                       System.out.println(matrice3[i][j]+"\t");
                   }
               }
                
                
            }
    }
            
    


