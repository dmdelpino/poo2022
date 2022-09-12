package a17082022;


public class Empleado extends Persona {
    
    public Empleado(){
        
    }
    
    public Empleado(String nombre){
        super(nombre);
        System.out.println("Constructor de empleado");
    }
    
    @Override
    public String toString(){
        return super.toString()+" -> empleado";
    }
    
}
