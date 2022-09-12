package a22082022;

public class Taxi extends Vehiculo {
    private int numeroLicencia;
    
    public Taxi(){        
    }
        
    
    public Taxi(String matricula,String modelo, float potenciaCV, int numeroLicencia){
        super(matricula, modelo, potenciaCV);        
        this.numeroLicencia = numeroLicencia;
    }
    
    public int getNumeroLicencia() {
        return numeroLicencia;
    }

    public void setNumeroLicencia(int numeroLicencia) {
        this.numeroLicencia = numeroLicencia;
    }
    
    public String toString(){
        return super.toString()+numeroLicencia;
    }
    
    
}
