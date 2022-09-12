package b22082022;

public class EstudianteInternacional extends Estudiante{
    public String pais_origen;
    
    public EstudianteInternacional(){
        
    }

    public EstudianteInternacional(String nombre, String direccion, int anio, String especialidad, String pais_origen){
        super(nombre, direccion, anio, especialidad);
        this.pais_origen = pais_origen;
    }
    
    
    
    public String toString(){
        return super.toString()+ "\n"+pais_origen+ "\n";
    }
    
    
}
