
package b22082022;

public class Profesor extends Persona{
    public String estado;
    
    public Profesor(){
        
    }

    public Profesor(String nombre, String direccion,String estado) {
        super(nombre,direccion);
        this.estado = estado;
    }
    
    
    public String toString(){
        return super.nombre+ "\n"+super.direccion+ "\n"+estado+ "\n";
    }
    
    
}
