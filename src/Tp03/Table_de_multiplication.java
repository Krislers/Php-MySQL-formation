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
public class Table_de_multiplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int r ; 
        Scanner reader = new Scanner(System.in);
        System.out.print("Saisir un nombe réel");
        r = reader.nextInt();
         tabledemultiplication(r);
    }
    public static void tabledemultiplication (int x){
        
         int  i ;
          
        for (i=0 ; i<10 ; i++){
           System.out.println(i+" x "+x+" = "+i*x);
        
    }
        
        
}
}    // TODO code application logic here
    
    
 
