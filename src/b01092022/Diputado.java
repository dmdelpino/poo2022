
package b01092022;

public class Diputado extends Legislador{

    private int numeroBancaCamaraBaja;
    
    

    public Diputado(int numeroBancaCamaraBaja, String provinciaQueRepresenta, String partidoPolitico, int numeroDespacho, String nombre, String apellido, int edad, Boolean casado) {
        super(provinciaQueRepresenta, partidoPolitico, numeroDespacho, nombre, apellido, edad, casado);
        this.numeroBancaCamaraBaja = numeroBancaCamaraBaja;
    }
    
    
    ///get+set

    public int getNumeroBancaCamaraBaja() {
        return numeroBancaCamaraBaja;
    }

    public void setNumeroBancaCamaraBaja(int numeroBancaCamaraBaja) {
        this.numeroBancaCamaraBaja = numeroBancaCamaraBaja;
    }
    
    
    
    ///Metodos
    public void getCamaraEnQueTrabaja(){
        System.out.println("Diputados");
    };

    @Override
    public String toString() {
        return super.toString()+"Diputado: " + "\n" 
                + "numeroBancaCamaraBaja=" + numeroBancaCamaraBaja;
    }
    
    
    
    
}
