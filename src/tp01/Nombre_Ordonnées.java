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
public class Nombre_Ordonnées {
    public static void main(String[] args) {
    double n1 , n2 ; 
    Scanner reader = new Scanner(System.in);
    System.out.print("ecrire le Premier nombres  : ");
    n1 = reader.nextDouble();
    System.out.print("ecrire le deuxieme nombres: ");
    n2 = reader.nextDouble() ; 
    
    if (n1<n2){
        System.out.println("Ordonée");
    }
    else {
        System.out.println("C'est pas ordonée ");
    }
}
}