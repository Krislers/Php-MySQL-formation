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
public class bissextille2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n ; 
        Scanner reader = new Scanner(System.in);// viarable de type scanner apeller reader et récupére dans le buffer les information saisie

System.out.print("Ecrire une année : ");//ecrire dans le flux de sortie soit la console
n = reader.nextInt();
if (n%400==0 || (n%100!=0 && n%4==0)) {
System.out.println("bisextille ");
    }
else {
    System.out.println("Pas bissextile");
}
        // TODO code application logic here
    }
    
}
