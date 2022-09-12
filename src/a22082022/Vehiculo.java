package a22082022;

public class Vehiculo {
    protected String matricula;
    protected String modelo;
    protected float potenciaCV;
    
    public Vehiculo(){        
    }
    
    public Vehiculo(String matricula, String modelo,float potenciaCV){
        this.matricula=matricula;
        this.modelo=modelo;
        this.potenciaCV=potenciaCV;
    }
    
    public String getMatricula() {
        return matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public float getPotenciaCV() {
        return potenciaCV;
    }
    
    public String toString(){
        return matricula+modelo+potenciaCV;
    }
    
}
