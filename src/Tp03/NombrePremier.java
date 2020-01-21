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
public class NombrePremier {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a ; 
        Scanner reader = new Scanner(System.in);
        System.out.print("Ecrire un nombre ");
        a = reader.nextInt();
        String msg ;
        
     //   if( Nombrepremier(a)== true ){
     //       System.out.print("C'est un nombre premier " );
      //  }
        //    else {
        //            System.out.println("Se nombre n'est pas premier");
      //              }
       //Oprérateur ternaire 
    msg = (Nombrepremier(a))? "Est premier " : "N'estpas premier";
    System.out.println(msg) ;
    
    System.out.println("Liste des nombres premier de l'intervlle [3,n]");
    System.out.println("Choix de la valeur de n ");
    int n2  = reader.nextInt();
          Nombrepremierafiicher(n2)  ;
    System.out.println("Ecrire un nombre : ");
     int n3 = reader.nextInt();
            AfficheNPJ(n3);
            }
        
        
    
    public static Boolean Nombrepremier (int x)
     { int div ;
     
     if (x%2==0){
     return false ; 
     }
     div=3;
     while ( div * div <= x && x%div>0){
         div = div + 2 ; 
    }
     
    return div*div > x ; 
    
}
    public static void Nombrepremierafiicher(int n ){
         System.out.println("Liste des nombres premier de l'intervlle [3,n]");
        for (int i=3 ; i <= n ; i++){
            if (Nombrepremier(i)){
                System.out.print(i + " ");          
            }
            
            
        }
        System.out.print("\n Fin de liste");
    }
    public static void AfficheNPJ (int n){
        for (int i=3 ; i <= n ; i++ ){
            int ad , d = 2 ;
          if(Nombrepremier(i)){
              ad = d ;
              d = i ;
              if ( d == ad + 2);
              System.out.printf("Premier jumeaux : %d %d\n", ad, d);                     
            
            }
        }
    }
}