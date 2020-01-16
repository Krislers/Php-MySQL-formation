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
public class Max_de_trois_nombres {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double a , b , c ;
        Scanner reader = new Scanner(System.in);

        System.out.print("Ecrire le premier nombre : ");
        a=reader.nextInt();
        System.out.print("Ecrire le deuxiemme nombre : " );
        b=reader.nextInt();
        System.out.print("Ecrire le troisiemme nombre : ");
        c=reader.nextInt();
        System.out.print("Le Max vaut : "+Maxdestroisnombres(a,b,c));
        System.out.print("Le Min vaut : "+Mindestroisnombres(a,b,c));
        
        // TODO code application logic here
    }
    public static double Maxdestroisnombres (double x , double y , double z ) {
        
        double Max ; 
        
        Max=x ; 
        
        if(y>Max){
            Max = y ;
        }
        if ( z > Max ){
            Max = z ;
        }
        
       return Max ;
    }

public static double Mindestroisnombres (double x , double y , double z ) {
        
        double Min ; 
        
        Min=x ; 
        
        if(y<Min){
            Min = y ;
        }
        if ( z < Min ){
            Min = z ;
        }
        
       return Min ;
    }
}
