/*
    Ejercicio N°3 - Clases Abstractas

Se declara una clase abstracta Operaciones con dos métodos, el método abstracto suma y el método normal resta. 
Creamos la clase Suma que hereda de la clase Operaciones e implementa sus métodos abstractos.
Debemos definir la clase AppOperaciones para verificar el correcto funcionamiento..

 */
package c01092022;

public abstract class Operaciones {
    
    int valor1, valor2;
    
    
    public abstract int suma();
    
    public int resta(){
        int resultado = valor1-valor2;
        return resultado;
    };

    
    
    
    
}
