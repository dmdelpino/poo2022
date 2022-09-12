/*

 */
package c05092022;

/**
 *
 * @author Diego
 */
public class Persona {
    int ahorro;
    int fondoretiro;
    String nom;
    String ape;
    
    public Persona(){
        
    }
    
    public Persona(int ahorro, int fondoretiro, String nom, String ape){
        this.ahorro=ahorro;
        this.fondoretiro=fondoretiro;
        this.nom=nom;
        this.ape=ape;
    }
    
    public int calculoCapital(){
        return ahorro+fondoretiro;
    }
    
    public String getNombre(){
        return nom+" "+ape;
    }
}
