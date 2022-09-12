/*

 */
package d08092022;

import java.util.ArrayList;

/**
 *
 * @author Diego
 */
public class AppOperaciones {
    public static void main(String[] args) {
        Operaciones obj1 = new Operaciones();
        
        
        ArrayList<Integer> listaPrueba= new ArrayList();
        
        listaPrueba = obj1.leerValores();
        
        int suma = obj1.calcularSuma(listaPrueba);
        
        int valorMedia = suma / listaPrueba.size();
        
        obj1.mostrarResultados(listaPrueba, suma, valorMedia);
        
    }
    
}
