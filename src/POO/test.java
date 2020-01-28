/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO;

/**
 *
 * @author formation_gep
 */
public class test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Personne p1 = new Personne ("Martin",1980,100000);
       
        
        p1.setNom("DURAND");
        p1.affiche();
        
        Personne p2= new Personne ();
        p2.setNom("LEPIC");
        p2.setAnéeNaissance(2001);
        p2.setSalaire(12000);
        p2.affiche();
        // TODO code application logic here
    }
    
}
