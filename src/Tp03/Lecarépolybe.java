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
public class Lecarépolybe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
     
       Scanner reader = new Scanner(System.in);//recherhce info dans 
       
      int i , j ;
      
      
      final int n=5;
      
      char[][] T = new char [][]{
          {'A','B','C','D','E'},
          {'F','G','H','I','J'},
          {'K','L','M','N','O'},
          {'P','Q','R','S','T'},
          {'U','V','X','Y','Z'},
   };
      System.out.print("Entrez un mot :");
      String mot = reader.nextLine();
      int []mot_crypte = code_polype(mot) ; 
   // AFFICHAGE D'UNE MATRICE
   //for (i = 0; i < n ; i++){
     // System.out.println();
    //  for (j = 0 ; j < n ; j++){
      //    System.out.print(T[i][j]+ " ");       }
    
     for (i=0 ; i < mot_crypte.length ; i++){
         System.out.print(mot_crypte[i]+"  ");
     }
     String motchiffré = Décode_Polype(mot_crypte);
     
     System.out.println("\nDecryptage");
     System.out.print("\t"+motchiffré);
   
   
} 


    public static int[] code_polype ( String mot ){  
    // TODO code application logic here
       Scanner reader = new Scanner(System.in);
       // VARIABLES
      int i , j  ;
      
      
       int [] c =new int [mot.length()*2];
      // MATRICE CARR2E D'ORDRE 5
      final int n=5;
      char[][] T = new char [][]{
          {'A','B','C','D','E'},
          {'F','G','H','I','J'},
          {'K','L','M','N','O'},
          {'P','Q','R','S','T'},
          {'U','V','X','Y','Z'},
   };
      char lettre  ;
      
      int pos = 0 ; // position dans le tableau code_polyp
  
          
   for ( int k=0 ; k < mot.length() ; k++){
          lettre = mot.charAt(k) ;
          if (lettre == 'W') lettre='V';
   for (i = 0; i < n ; i++){
     for (j = 0 ; j < n ; j++)
         if ( lettre == T[i][j]){
             c[pos++]=i;
             c[pos++]=j;
                     }
         
       }
   
   }
      return c ;
}
    public static String Décode_Polype(int [] mot_crypte) {
        
    int i , j  ;
    String mot ;
    char[][] T ;
        T = new char [][]{
            {'A','B','C','D','E'},
            {'F','G','H','I','J'},
            {'K','L','M','N','O'},
            {'P','Q','R','S','T'},
            {'U','V','X','Y','Z'},
            
        };
            mot = "";
     for ( int k = 0 ; k < mot_crypte.length ; k = k+2){
        i= mot_crypte[k];
        j= mot_crypte[k+1];
        if (T[i][j]=='V'){
        mot = mot + " V / W ";
    }else{
            mot = mot + T[i][j];
        }
     }
     return mot;
    }
        
       
                                             }


