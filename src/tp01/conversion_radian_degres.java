package tp01;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author formation_gep
 */
public class conversion_radian_degres {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double n, degres;//déclare deux variable RAdian et n
Scanner reader = new Scanner(System.in);// viarable de type scanner apeller reader et récupére dans le buffer les information saisie

System.out.print("angle en rad Woula : ");//ecrire dans le flux de sortie soit la console
n = reader.nextDouble();
degres = n*(180/ Math.PI);
System.out.println("Degrés: " + degres);
        // TODO code application logic here
}
}