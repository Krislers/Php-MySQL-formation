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
public class Somme_des_n_premier_nombre_entiers_pairs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       int i ,n , somme ;
     Scanner reader = new Scanner(System.in);
     System.out.print("Ecrire le nombres:");
             n = reader.nextInt();
somme=0;

for (i=2 ; i<=n*2 ; i=i+2){
    somme = somme + i ;
}
System.out.println("la somme vaut : " +somme);


    }
    
}
