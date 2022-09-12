package a07092022;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class PruebaSet {
    public static void main(String[] args) {
        
        //COLECCION-SET
        Set<Integer> conj1 = new HashSet<Integer>();
        
        conj1.add(20);//método Obj.add=agrega el elemento que se le agrega
        conj1.add(1);
        conj1.add(10);
        conj1.add(5);
        conj1.add(20);
        
        for (int elemento : conj1) {
            System.out.println(elemento+"-");
        }
        
        conj1.size(); //devuelve la cantidad de elementos que tiene el objeto
        conj1.clear();// borra todo el contenido del objeto
        conj1.remove(5);//borra el elmento que se le especifica
        
        System.out.println("-------------------------------------\n");
        //---------------------------------------------//
        //COLECCION-TREESET
        
        Set <Integer> conj2 = new TreeSet<Integer>();
        
        conj2.add(20);
        conj2.add(1);
        conj2.add(10);
        conj2.add(5);
        conj2.add(20);

        for (int elemento : conj2) {
            System.out.println(elemento+"-");
        }
        
        System.out.println("-------------------------------------\n");
        //---------------------------------------------//
        //LINKEDHASHSET
        
        Set <Integer> conj3 = new LinkedHashSet<>();
                
        conj3.add(20);
        conj3.add(1);
        conj3.add(10);
        conj3.add(5);
        conj3.add(20);

        
        for (int elemento : conj3) {
            System.out.println(elemento+"-");
        }
        
        
        
        
        
    }
    
}
