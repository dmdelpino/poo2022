
package a17082022;


public class Persona {
    public String nombre;
    
    public Persona(){        
    }
    
    public Persona(String nombre){
        this.nombre=nombre;
        System.out.println("Constructor de persona: "+nombre);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String toString(){
        return "Persona: "+nombre;
    }
}
