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
public class moyenne {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int n1,n2,n3,n4 ;
    double    Moyenne;//déclare 5 Variables
Scanner reader = new Scanner(System.in);// viarable de type scanner apeller reader et récupére dans le buffer les information saisie

System.out.print("valeur du premier nombre : ");//ecrire dans le flux de sortie soit la console
n1 = reader.nextInt();
System.out.print("valeur du deuxieme nombre : ");//ecrire dans le flux de sortie soit la console
n2 = reader.nextInt();
System.out.print("valeur du Troisiemme nombre : ");//ecrire dans le flux de sortie soit la console
n3 = reader.nextInt();
System.out.print("valeur du Quatriemme nombre : ");//ecrire dans le flux de sortie soit la console
n4 = reader.nextInt();
Moyenne = (n2+n1+n3+n4)/4.0;
System.out.println("La moyenne est donc de : " + Moyenne);    // TODO code application logic here
    }
    
}
