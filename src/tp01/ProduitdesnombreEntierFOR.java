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
public class ProduitdesnombreEntierFOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i ,n , produit ;
     Scanner reader = new Scanner(System.in);
     System.out.print("Ecrire le nombres:");
             n = reader.nextInt();
produit=1;

for (i=2 ; i<=n ; i++){
    produit = produit * i ;
}
System.out.println("la somme vaut : " +produit);
        // TODO code application logic here
    }
    
}
