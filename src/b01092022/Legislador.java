
package b01092022;
public abstract class Legislador extends Persona{
    
    protected String provinciaQueRepresenta, partidoPolitico;
    protected int numeroDespacho;
    
    
    
    ///Constructor
    public Legislador(String provinciaQueRepresenta, String partidoPolitico, int numeroDespacho, String nombre, String apellido, int edad, Boolean casado) {
        super(nombre, apellido, edad, casado);
        this.provinciaQueRepresenta = provinciaQueRepresenta;
        this.partidoPolitico = partidoPolitico;
        this.numeroDespacho = numeroDespacho;
    }

    
    ///Getter+setter

    public String getProvinciaQueRepresenta() {
        return provinciaQueRepresenta;
    }

    public void setProvinciaQueRepresenta(String provinciaQueRepresenta) {
        this.provinciaQueRepresenta = provinciaQueRepresenta;
    }

    public String getPartidoPolitico() {
        return partidoPolitico;
    }

    public void setPartidoPolitico(String partidoPolitico) {
        this.partidoPolitico = partidoPolitico;
    }

    public int getNumeroDespacho() {
        return numeroDespacho;
    }

    public void setNumeroDespacho(int numeroDespacho) {
        this.numeroDespacho = numeroDespacho;
    }
    

    
    ///Metodos
    
    public abstract void getCamaraEnQueTrabaja();
    
    
    @Override
    public String toString() {
        return super.toString()+"Legislador: " + "\n"
                + "provinciaQueRepresenta=" + provinciaQueRepresenta + "\n"
                + "partidoPolitico=" + partidoPolitico + "\n"
                + "numeroDespacho=" + numeroDespacho + "\n";
    }
    
    
    
}
