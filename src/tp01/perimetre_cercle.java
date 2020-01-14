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
public class perimetre_cercle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      // final double PI=3.14159226 ;
        
    
            //Variable 
double Diametre, resultat;//déclare deux variable Diametre et resultat
Scanner reader = new Scanner(System.in);// viarable de type scanner apeller reader et récupére dans le buffer les information saisie

System.out.print("Diametre : ");//ecrire dans le flux de sortie soit la console
Diametre = reader.nextDouble();
resultat = Diametre * Math.PI;
System.out.println("Perimètre : " + resultat);   // TODO code application logic here
    }
    
}
