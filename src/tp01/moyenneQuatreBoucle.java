/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp01;

import java.util.Scanner;

/**
 *
 * @author formation_gep
 */
public class moyenneQuatreBoucle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
      Scanner reader = new Scanner ( System.in) ; // TODO code application logic here
      int somme = 0 , n ;
      double moyenne ; 
      int i;
      for( i=1 ; i<=4 ; i++){
          System.out.print("Entrer votre nombre :");
          n= reader.nextInt();
          somme = somme + n ; 
      }
      moyenne = somme /4.0 ;
      System.out.println("La moyenne vaut : " + moyenne);
    }
    
    
}
