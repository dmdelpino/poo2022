/*
Ejercicio 2. Java List.

Crea una lista que contenga los días de la semana.
Pista:
List listDias = new ArrayList();

Inserta en la posición 4 el elemento «Juernes».

Copia esa lista a otra llamada listaDos.
Pista:
List listaDos = new ArrayList<>(listaUno);

Añade a listDias el contenido de listaDos.

Muestra el contenido de las posiciones 3 y 4 de la lista original.

Muestra el primer elemento y el último de la lista original.
Pista: getFirst() y getLast()

Elimina el elemento que contenga «Juernes» de la lista y comprueba si elimina algo o no.
Pista:
if (listaDias.remove(«Juernes»)) {
System.out.println(«Borrado»);
} else {
System.out.println(«No existe»);
}


Crea un iterador y muestra uno a uno los valores de la lista original.

Busca si existe en la lista un elemento que se denomine «Lunes».
Pista: listaDias.contains(«Lunes»)

Busca si existe en la lista un elemento que se denomine «Lunes». No importa si está en mayúscula o minúscula.

Ordena la lista y muestra su contenido.
Pista: método sort().

Borra todos los elementos de la lista.
Pista: clear()
 */
package b08092022;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Diego
 */
public class Dias {
    public static void main(String[] args) {
        
        List listaDias = new ArrayList();
        
        listaDias.add("lunes");
        listaDias.add("martes");
        listaDias.add("miercoles");
        listaDias.add("jueves");
        listaDias.add("viernes");
        listaDias.add("sabado");
        listaDias.add("domingo");
        
        System.out.println("Inserta en la posicion 4 el elemento 'Juernes'.");
        listaDias.add(4,"juernes");
        System.out.println(listaDias);
        System.out.println("-----------------------------------------------");
        
        
        //Copia esa lista a otra llamada listaDos.        
        List listaDos = new ArrayList<>(listaDias);
        listaDias.add(listaDos);
        
        
        System.out.println("Muestra el contenido de las posiciones 3 y 4 de la lista original.");
        System.out.println(listaDias.get(3));
        System.out.println(listaDias.get(4));
        System.out.println("-----------------------------------------------");
        
        
        System.out.println("Muestra el primer elemento y el ultimo de la lista original.");
        System.out.print("primer elemento: ");
        System.out.println(listaDias.get(0));
        System.out.print("ultimo elemento: ");
        System.out.println(listaDias.get(listaDias.size()-1));
        System.out.println("-----------------------------------------------");
        
        
        System.out.println("Elimina el elemento que contenga 'Juernes' de la lista y comprueba si elimina algo o no.");
        if (listaDias.remove("juernes")) {
            System.out.println("Borrado");
        } else {
            System.out.println("No existe");
        }
        System.out.println("-----------------------------------------------");
        
        
        System.out.println("Crea un iterador y muestra uno a uno los valores de la lista original.");
        for (Object valor : listaDias) {
            System.out.println(valor);
        }
        System.out.println("-----------------------------------------------");
        
        
        System.out.println("Busca si existe en la lista un elemento que se denomine 'Lunes'.");
        if (listaDias.contains("lunes")) {
            System.out.println("la lista contiene 'lunes'");
        }else{
            System.out.println("La lista no tiene 'lunes'");
        }
        System.out.println("-----------------------------------------------");
        
        
        /// PREGUNTAR POR VERSION CASE INSENSITIVE
        
        System.out.println("Ordena la lista y muestra su contenido.");
        Collections.sort(listaDias);
        System.out.println(listaDias);
        System.out.println("-----------------------------------------------");
        
        
        System.out.println("Borra todos los elementos de la lista.");
        listaDias.clear();
        System.out.println(listaDias);
    }
}
