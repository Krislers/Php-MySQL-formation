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
public class PGCDdedeuxentiersstrictementpositif {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x , y ;
        Scanner reader = new Scanner(System.in);
        System.out.print("Ecrire une valeur");
        x = reader.nextInt();
        System.out.print("Ecrivez une deuxiemme valeur : ");
        y = reader.nextInt();
        System.out.print("PGCD :" + PGCD(x,y));
    }
    public static int PGCD (int a ,int b ){
      
      
             
        while (a != b){
          if  ( a < b ) {
              a = a - b  ; 
          }
          else {
              b = b - a;
          }
      
    }
        return a ;
}
}
