/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp02;

/**
 *
 * @author formation_gep
 */
public class Tes_Printf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String nom = "Dupond Marc";
        double montant = 125.6 ; 
        int numero = 8 ; 
        System.out.printf("Note frais N° %d : %4.2f $ - %s\n " , numero , montant , nom);
        // TODO code application logic here
    }
    
}
