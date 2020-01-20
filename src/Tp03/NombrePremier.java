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
public class NombrePremier {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a ; 
        Scanner reader = new Scanner(System.in);
        System.out.print("Ecrire un nombre ");
        a = reader.nextInt();
        if( Nombrepremier(a)== true ){
            System.out.print("C'est un nombre premier " );
        }
            else {
                    System.out.println("Se nombre n'est pas premier");
                    }
        }
        
        // TODO code application logic here
    
    public static Boolean Nombrepremier (int x)
     { int div ;
     
     if (x%2==0){
     return false ; 
     }
     div=3;
     while ( div * div <= x && x%div>x){
         div = div + 2 ; 
    }
     
    return div*div > x ; 
    
}
}