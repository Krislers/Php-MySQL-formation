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
public class Annéebissextil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here    
        int n;
Scanner reader = new Scanner(System.in);// viarable de type scanner apeller reader et récupére dans le buffer les information saisie

System.out.print("Ecrire une année : ");//ecrire dans le flux de sortie soit la console
n = reader.nextInt();
if (n%400==0) {
System.out.println("bisextille ");
    }
else if (n%100==0){
    System.out.println("Pas bissextile");
}
else if (n%4==0) {
    System.out.println( " Bissextil") ; 
}
else 
{
        System.out.println("pas bixestille ");
        }   
}
}
    
    

