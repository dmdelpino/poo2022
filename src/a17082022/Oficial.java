package a17082022;

public class Oficial extends Operario{
    public Oficial(){
        
    }
    
    public Oficial(String nombre){
        super(nombre);
        System.out.println("Constructor de oficial");
    }
    
    @Override
    public String toString(){
        return super.toString()+" -> oficial";
    }
}
