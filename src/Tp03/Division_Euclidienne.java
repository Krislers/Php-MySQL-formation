/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tp03;

import java.util.Scanner;

/**
 *
 * @author formation_gep
 */
public class Division_Euclidienne {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int tab[];
        int a , b ; 
        Scanner reader = new Scanner(System.in);
        System.out.print("Ecrire un dénominateur : ");
        a = reader.nextInt();
        System.out.print("Ecrire un Diviseur : ");
        b = reader.nextInt();
        tab =DivisionEuclidienne(a,b);
        System.out.print("Quotien :" +tab[0]);
        System.out.print("Reste :" +tab[1]);
        
        // TODO code application logic here
    }
    public static int[] DivisionEuclidienne (int x , int y){
        int L=2 , i; 
         int tab []= new int [L];
         
         tab[0]=x/y ;
         tab[1]=x%y ; 
         
         return tab ; 
        
        
    }
}
