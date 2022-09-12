
package b22082022;


public class Estudiante extends Persona{
    private int anio;
    private String especialidad;
    
    
    public Estudiante(){        
    }

    public Estudiante(String nombre,String direccion, int anio, String especialidad) {
        super(nombre,direccion);
        this.anio = anio;
        this.especialidad = especialidad;
    }
    
    public String toString(){
        return super.toString()+ "\n"+anio+ "\n"+especialidad+ "\n";
    }
    
}
