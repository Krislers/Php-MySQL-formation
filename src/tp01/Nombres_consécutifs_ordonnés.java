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
public class Nombres_consécutifs_ordonnés {
    public static void main(String[] args) {
    double n1 , n2 ; 
    Scanner reader = new Scanner(System.in);
    System.out.print("Ecrire le premier Nombre");
    n1 = reader.nextDouble();
    System.out.print("Ecrire le deuxieme Nombre");
    n2 = reader.nextDouble();
    
    
    if (n2 == n1+1) {
        System.out.print ("c'est consécutif et ordoné Bravo !!");
    }
    else {
        System.out.print ("c'est pas consécutif et ordonée");
    }
}
}
