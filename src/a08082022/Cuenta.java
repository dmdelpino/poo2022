package a08082022;

public class Cuenta {
    private String nrocta;
    private String nombre;
    private double saldo;
    
    public Cuenta(){         //constructor por defecto
    }
    
    public Cuenta(String nrocta, String nombre, double saldo){     //metodo constructor - toma los 
        this.nrocta = nrocta;
        this.nombre = nombre;
        this.saldo = saldo;
        // atributos => parametros
    }

// GETTERS y SETTERS (click derecho -> "insert code" ->getters and setters (select all) 
    public String getNrocta() {
        return nrocta;
    }

    public void setNrocta(String nrocta) {
        this.nrocta = nrocta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

// FIN GETTERS y SETTERS
    
    public void depositar(double importe){    
        saldo+=importe;
    }
    
    public void extraer(double importe){
        if (saldo-importe >=0) {
            saldo-=importe;
        }else{
            System.out.println(nrocta+" Saldo insuficiente");
        }
    }
    
    public String toString(){
        return "Numero de cuenta: " + nrocta+ " Nombre: "+nombre+" Saldo: "+saldo;
    }
}