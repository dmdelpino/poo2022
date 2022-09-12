/*
Ejercicio N°2 - Clases Abstractas

Declara una clase abstracta Legislador que herede de la clase Persona, con un atributo provinciaQueRepresenta (tipo String) y otros atributos. Declara un método abstracto getCamaraEnQueTrabaja. Crea dos clases concretas que hereden de Legislador: la clase Diputado y la clase Senador que sobreescriban los métodos abstractos necesarios. Se pide mostrar todos los datos por pantalla.

La clase Persona contiene los siguientes atributos:
nombre, apellido, edad y un booleano para casado.
Los métodos constructores, setters, getters y toString()

Clase Legislador contiene:
los atributos que hereda de Persona y los propios: provincia que representa, partido político y número de despacho
Contiene los métodos: Los métodos constructores, setters, getters,  toString() y el método abstracto: cámara en que trabaja

La clase Diputado posee los atributos que hereda de Legislador y como propio el número de banca en la cámara baja.
Contiene los métodos: Los métodos constructores, setters, getters,  toString() y camaraEnQueTrabaja().

La clase Senador posee los atributos que hereda de Legislador y como propio el número de banca en la cámara baja.
Contiene los métodos: Los métodos constructores, setters, getters,  toString() y camaraEnQueTrabaja().

*/


package b01092022;

public class Persona {
    
    protected String nombre, apellido;
    protected int edad;
    protected Boolean casado;

    public Persona(String nombre, String apellido, int edad, Boolean casado) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.casado = casado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Boolean getCasado() {
        return casado;
    }

    public void setCasado(Boolean casado) {
        this.casado = casado;
    }

    
    
    @Override
    public String toString() {
        return "Persona: " + "\n"
                + "nombre=" + nombre + "\n"
                + "apellido=" + apellido + "\n"
                + "edad=" + edad + "\n"
                + "casado=" + casado + "\n";
    }
    
    
    
}
