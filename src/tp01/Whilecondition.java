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
public class Whilecondition {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // TODO code application logic here
       int n , i , somme ; 
       Scanner reader = new Scanner (System.in);
       n = reader.nextInt();
       somme=0 ; 
       i= 1 ; 
       while (i <= n){
           somme = somme + i;
           i++;
       }
       System.out.println("La somme vaut : " + somme);
    }
    
}
