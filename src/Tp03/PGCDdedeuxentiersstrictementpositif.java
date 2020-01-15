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
        int a , b ;
        Scanner reader = new Scanner(System.in);
        System.out.print("Ecrire une valeur");
        a = reader.nextInt();
        System.out.print("Ecrivez une deuxiemme valeur : ");
        b = reader.nextInt();
        PGCD(a,b);
    }
    public static int PGCD (int x ,y ){
       int PG , PB ;
      
             
        while (x > 0 && y > 0){
          if  ( x < y ) {
              y-x=y ; 
          }
          else {
              x-y=x;
          }
        }
        if ( x == 0){
            System.out.print(+y);
        }
        else {
            System.out.print(+x);
        }
    }
}
