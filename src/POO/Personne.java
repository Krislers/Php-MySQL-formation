/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO;

import java.util.Calendar;

/**
 *
 * @author formation_gep
 * 
 */


public class Personne {

    private String nom ; 
    private int annéeNaissance ; 
    private int salaire ;
    
    public void setAnéeNaissance(int annéeNaissance){
    this.annéeNaissance = annéeNaissance ; 
    }
    
    public int getAnnéeNaissance(){
    return annéeNaissance ; 
    }
    
    public int getSalaire(){
    return salaire; 
    }
    
    public void setSalaire(int salaire){
    this.salaire =  salaire ;
     }
    
    public String getNom(){
    return nom;
    }
    
    public void setNom(String nom){
    this.nom=nom;
    }
    
    public Personne(){}
    
    
    public Personne (String n , int a , int s ){
     nom = n ;  // Attribue = variable si l'attribut et la variiableon le méme nom on utilisara this.Attribut pour pourvoir lever les choses embigue 
     annéeNaissance = a  ; 
     salaire = s;
    
    }
    public void affiche(){
    System.out.printf("%s âge de %d ans \n",nom,calculAge());
    }
   
    public int calculAge(){ // Fonction qui retourne un entier et qui calcule l'age de la personne 
    Calendar c = Calendar.getInstance();
    int year = c.get(Calendar.YEAR);
    return year - annéeNaissance ;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
     // instancier P1
     Personne P1 = new Personne("Joe",1990,12000);
     // instancier P2
     Personne P2 = new Personne ("Joe",1990,12000);
     
     if (P1.equals(P2) ){ // l'orsque l'on veux tester l'égualité entre 2 Objets on Utilisera .equals au lieu de == 
         System.out.print("les deux personne sont jumeaux"); 
     }
     else {
         System.out.println("Les deux personne ne sont pas les mémes ");
     }
    }
    
}

