
package c22082022;

public class Programador extends Empleado{
    
    private int lineasDeCodigoPorHora;
    private String lenguajeDominante;
    
    public Programador(){        
    }

    public Programador(String nombre_apellido, int dni, int edad, boolean casado, double salario,int lineasDeCodigoPorHora, String lenguajeDominante) {
        super(nombre_apellido, dni, edad, casado, salario);
        this.lineasDeCodigoPorHora = lineasDeCodigoPorHora;
        this.lenguajeDominante = lenguajeDominante;
    }
    
    
    public String toString(){
        return super.toString()+ "\n" +
                lineasDeCodigoPorHora+"\n"+
                lenguajeDominante;
    }
    
    
}
