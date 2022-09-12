
package b01092022;


public class Senador extends Legislador{
    
    private int numeroBancaCamaraAlta;

    public Senador(int numeroBancaCamaraAlta, String provinciaQueRepresenta, String partidoPolitico, int numeroDespacho, String nombre, String apellido, int edad, Boolean casado) {
        super(provinciaQueRepresenta, partidoPolitico, numeroDespacho, nombre, apellido, edad, casado);
        this.numeroBancaCamaraAlta = numeroBancaCamaraAlta;
    }

    public int getNumeroBancaCamaraAlta() {
        return numeroBancaCamaraAlta;
    }

    public void setNumeroBancaCamaraAlta(int numeroBancaCamaraAlta) {
        this.numeroBancaCamaraAlta = numeroBancaCamaraAlta;
    }

    
    
    
    public void getCamaraEnQueTrabaja(){
        System.out.println("Senadores");
    };

    @Override
    public String toString() {
        return super.toString()+"Senador: " + "\n"
                + "numeroBancaCamaraAlta=" + numeroBancaCamaraAlta;
    }
    
    
    
}
