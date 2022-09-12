/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a29082022;

/**
 *
 * @author alumno
 */
public class Deportivo extends Barco{
    private int potencia;

    public Deportivo(int potencia, String matricula, int eslora, int anio_fabricacion) {
        super(matricula, eslora, anio_fabricacion);
        this.potencia = potencia;
    }

    

    @Override
    public int alquiladoBarco() {
        return super.alquiladoBarco()+potencia; 
    }

    @Override
    public String toString() {
        return super.toString()+"Deportivo{" + "potencia=" + potencia + '}';
    }

    
    
    
}
