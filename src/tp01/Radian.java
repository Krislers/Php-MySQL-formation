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
public class Radian {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double n, radian;//déclare deux variable RAdian et n
Scanner reader = new Scanner(System.in);// viarable de type scanner apeller reader et récupére dans le buffer les information saisie

System.out.print("angle : ");//ecrire dans le flux de sortie soit la console
n = reader.nextDouble();
radian = (n*Math.PI)/180;
System.out.println("radian: " + radian);
        // TODO code application logic here
    }
    
}
