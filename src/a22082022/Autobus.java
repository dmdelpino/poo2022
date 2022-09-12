package a22082022;

public class Autobus extends Vehiculo {
    private int numeroPlazas;
    
    public Autobus(){        
    }
    
    public Autobus(String matricula,String modelo, float potenciaCV, int numeroPlazas){
        super(matricula, modelo, potenciaCV);
        this.numeroPlazas=numeroPlazas;
    }

    public int getNumeroPlazas() {
        return numeroPlazas;
    }

    public void setNumeroPlazas(int numeroPlazas) {
        this.numeroPlazas = numeroPlazas;
    }
    
    public String toString(){
        return super.toString()+numeroPlazas;
    }
    
}
