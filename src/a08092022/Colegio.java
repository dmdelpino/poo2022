/*
Ejercicio 1. Java HashMaps.


Crea una clase colegio que almacene la nacionalidad de los alumnos de un colegio. 
La clase tendrá los siguientes métodos:
-----------

1) addAlumno(String nacionalidad)
añade la nacionalidad de un nuevo alumno


2) showAll()
Muestra las distintas nacionalidades y el número de alumnos que existen por nacionalidad.
pista:
for(String key: nacionalidades.keySet())
System.out.println(key + » – » + nacionalidades.get(key));


3) showNacionalidad(String nacionalidad)
Muestra la nacionalidad y el número de alumnos de esa nacionalidad

4) cuantos()
Muestra cuántas nacionalidades diferentes existen en el colegio.

5) borra()
Elimina los datos insertados.

Crear también una clase para testear la clase anterior.
Crear también una clase exceptionVacio del tipo Exception que será lanzada en el caso que se llame al método
addAlumno(String nacionalidad) con un parámetro nacionalidad vacío.
Nota: Las nacionalidades se almacenan en mayúsculas.
 */
package a08092022;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Diego
 */
public class Colegio {
    
    
    Map<Integer,String> nacionalidades = new HashMap<>();
    
    
    
    public void addAlumno(Integer codigo,String nacionalidad){
        Map<Integer,String>mapa1.put(codigo, nacionalidad);
    }
    
    public void showAll(){
        for(String key: nacionalidades.keySet()){
            System.out.println(key + " – " + nacionalidades.get(key));
            
        }
        
    }
    
    public void showNacionalidad(String nacionalidad){
        
    }
    
    public void cuantos(){
        
    }
    
    
    public void borra(){
        
    }
}
