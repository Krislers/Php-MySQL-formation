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
public class Paire_Impaire {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic heredouble Diametre, resultat;//déclare deux variable Diametre et resultat
    int n;
Scanner reader = new Scanner(System.in);// viarable de type scanner apeller reader et récupére dans le buffer les information saisie

System.out.print("Ecrire un nombre : ");//ecrire dans le flux de sortie soit la console
n = reader.nextInt();
if (n%2==0) {
System.out.print("Paire!! ");
    }
else 
{
        System.out.print("impaire!!! ");
        }   
}
}
