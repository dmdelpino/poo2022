package a17082022;

public class Tecnico extends Operario{
    public Tecnico(){
        
    }
    
    public Tecnico(String nombre){
        super(nombre);
        System.out.println("Constructor de tecnico");
    }
    
    @Override
    public String toString(){
        return super.toString()+" -> tecnico";
    }
}
