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
public class Comparaison_deux_nombre_entier {
    public static void main(String[] args) {
    double n1 , n2 ; 
    Scanner reader = new Scanner(System.in);
    System.out.print("ecrire le Premier nombres FDP : ");
    n1 = reader.nextDouble();
    System.out.print("ecrire le deuxieme nombres La con de tes Morts: ");
    n2 = reader.nextDouble() ; 
    
    if (n1<n2){
        System.out.println("le Premier nombre est plus petit que le deuxieme");
    }
    else if (n2<n1) {
        System.out.println("Le premier nombre est plus grand que le deuxieme");
    }
     else{
        System.out.println("le Premier nombre est le deuxieme nombre sont égaux");
}
    }
}
