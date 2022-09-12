/*
PersosHerencia - Ejercicio Nro.2

Crear una clase Persona que posee los siguientes atributos:

nombre
direccion

y los métodos:
constructores: por defecto y con parámetros
getters()
setters()
toString()

De la clase persona heredan las clases: Estudiante y Profesor
La clase Profesor posee como atributo:
estado, (titular,interino, suplente)

La clase estudiante posee los siguientes atributos particulares:
nombre
direccion
anio que cursa
especialidad


La clase EstudianteInternacional, hereda de estudiante y tiene como atributo propio que es país de origen.

El método toString() que existe en todas las clases y deben imprimir los atributos comunes y los particulares de cada clase


*/


package b22082022;

public class Persona {
    protected String nombre;
    protected String direccion;

    public Persona(){        
    }
    
    public Persona(String nombre, String direccion){
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    public String toString(){
        return nombre + "\n"+
                direccion+ "\n";
    }
    
    
}
