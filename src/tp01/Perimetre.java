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
public class Perimetre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //Constantes
    final int NB_COTES = 4 ;
    
            //Variable 
double longueur, resultat;//déclare deux variable longuer et resultat
Scanner reader = new Scanner(System.in);// viarable de type scanner apeller reader et récupére dans le buffer les information saisie

System.out.print("longueur du coté : ");//ecrire dans le flux de sortie soit la console
longueur = reader.nextDouble();
resultat = longueur * NB_COTES;
System.out.println("Perimètre : " + resultat);  // TODO code application logic here
    }
   
}
