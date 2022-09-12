/*
CALCULAR LA SUMA Y LA MEDIA ARITMÉTICA DE LOS VALORES CONTENIDOS EN UN ARRAYLIST.
Programa que lea una serie de valores numéricos enteros desde el teclado y los guarde 
en un ArrayList de tipo Integer. La lectura de números termina cuando se introduzca el valor -99. 
Este valor no se guarda en el ArrayList. A continuación el programa mostrará por pantalla el número 
de valores que se han leído, su suma, su media. Por último se mostrarán todos los valores leídos, 
indicando cuántos de ellos son mayores que la media.
Vamos a utilizar 3 métodos además del método main para resolverlo:

Método leerValores(): pide por teclado los números y los almacena en el ArrayList. 
La lectura acaba cuando se introduce el valor -99. El método devuelve mediante return 
el ArrayList con los valores introducidos.

Método calcularSuma(): Recibe como parámetro el ArrayList con los valores numéricos 
y calcula y devuelve su suma. En este método se utiliza un Iterator para recorrer el ArrayList.

Método mostrarResultados(): Recibe como parámetro el ArrayList, la suma y la media aritmética. 
Muestra por pantalla todos los valores, su suma y su media y calcula y muestra cuantos números 
son superiores a la media. En este método se utiliza un for para colecciones para recorrer el ArrayList.

 */
package d08092022;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class Operaciones {
    
    
    
    
    
    public ArrayList leerValores(){
        ArrayList<Integer> lista1 = new ArrayList<>();
        Scanner sc = new Scanner(System.in);                
        do{
            System.out.println("ingrese valor: ");
            int valor = sc.nextInt();
                if (valor != -99) {                
                    lista1.add(valor);
                }else{
                    break;
                }
        }while (true);
        
        return lista1;
    }
    
    
    public int calcularSuma(ArrayList<Integer> parametro){
        int suma=0;
        Iterator<Integer> iter = parametro.iterator();          
        while (iter.hasNext()) {
            suma+=iter.next();        
        }
        return suma;
    }
    
    
    
    
    public void mostrarResultados(ArrayList<Integer> lista, int valorSuma, int valorMedia){
        System.out.println("Los valores de la lista son: "+ lista);
        System.out.println("La suma de todos los valores es: "+ valorSuma);
        System.out.println("El promedio de todos los valores es: "+ valorMedia);
        ArrayList<Integer> listaResultado = new ArrayList<>();
        for (Integer integer : lista) {
            if (integer > valorMedia) {                
                listaResultado.add(integer);
            }            
        }
        System.out.println("Los valores de la lista mayores a la media son: "+listaResultado);
    }
    
    
    
}
