package a17082022;

public class Operario extends Persona{
    public Operario(){
        
    }
    
    public Operario(String nombre){
        super(nombre);
        System.out.println("Constructor de operario");
    }
    
    @Override
    public String toString(){
        return super.toString()+" -> operario";
    }
}
