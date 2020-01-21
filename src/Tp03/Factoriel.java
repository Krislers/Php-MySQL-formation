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
public class Factoriel {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n ; 
        Scanner reader = new Scanner (System.in);
         System.out.println("Ecriver un nombre : ");
         n = reader.nextInt();
         System.out.printf("%d! = %d\n",n,Fact(n));
   // TODO code application logic here
    }
    public static int Fact (int n){
        
        if (n==0) {
            return 1 ; 
        }
        else { 
          return  n*Fact(n-1) ;
        }
    }
    
}
