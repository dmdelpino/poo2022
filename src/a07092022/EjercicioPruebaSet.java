/*
Crear una lista de 10 valores enteros entre 1 y 100. Validar que los valores no 
estén repetidos. Los valores deben mostrarse ordenados de menor a mayor, en el 
orden que fueron cargados y por último en cualquier orden.
*/
package a07092022;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class EjercicioPruebaSet {
    public static void main(String[] args) {
       
        Set <Integer> conj1 = new HashSet<Integer>();
        Set <Integer> conj2 = new TreeSet<Integer>();
        Set <Integer> conj3 = new LinkedHashSet<Integer>();
       
        while (conj1.size()<10) {
            Random rand = new Random();
            int randomNum = rand.nextInt((100 - 1) + 1);            
            if (!conj1.contains(randomNum)) {
                conj1.add(randomNum);
                conj2.add(randomNum);
                conj3.add(randomNum);
            }          
        }
       
        System.out.println("Cualquier orden");
        for (int elemento : conj1) {           
            System.out.println(elemento);
        }
        
        System.out.println("Ascendente");
        for (int elemento : conj2) {           
            System.out.println(elemento);
        }
        
        System.out.println("Como se cargaron");
        for (int elemento : conj3) {           
            System.out.println(elemento);
        }
    
    }    
}