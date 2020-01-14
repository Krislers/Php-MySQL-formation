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
public class Departement {
    public static void main(String[] args) {
    int n1  ; 
    Scanner reader = new Scanner(System.in);
    System.out.print("ecrire le numéro de département : ");
    n1 = reader.nextInt();

    
        switch (n1) {
            case 13:
                System.out.println("Bouche du Rhone");
                break;
            case 83:
                System.out.println("VAR");
                break;
            case 84:
                System.out.println("Vaucluse");
                break;
            default:
                System.out.println("Pas le bon département ");
                break;
        }
 
}
}