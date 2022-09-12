package c01092022;

public class Suma extends Operaciones{
    
    private int valorsuma1, valorsuma2;

    public Suma(int valorsuma1, int valorsuma2) {
        this.valorsuma1 = valorsuma1;
        this.valorsuma2 = valorsuma2;
    }

    
    
    
    @Override
    public int suma(){
        int resultado= valorsuma1+valorsuma2;
        return resultado;
    };

    @Override
    public int resta(){
        int resultado= valorsuma1-valorsuma2;
        return resultado;
    };
    
    
    
    
    
    
    
}
