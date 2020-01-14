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
public class Sommesdesnpremiersnombresentiers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int i = 0;
        int n = 0  ;
        int somme = 0 ; 
     Scanner reader = new Scanner(System.in);
     System.out.print("Ecrire le nombres:");
             n = reader.nextInt();
somme=0;

for (i=1 ; i<=n ; i++){
    somme = somme + i ;
}
System.out.println("la somme vaut : " +somme);
        // TODO céode application logic here
    }
    
}
