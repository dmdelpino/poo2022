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
public class Yate extends Deportivo{
    private int camarotes;

    public Yate(int camarotes, int potencia, String matricula, int eslora, int anio_fabricacion) {
        super(potencia, matricula, eslora, anio_fabricacion);
        this.camarotes = camarotes;
    }

    

    @Override
    public int alquiladoBarco() {
        return super.alquiladoBarco()+camarotes;
    }

    @Override
    public String toString() {
        return super.toString()+"Yate{" + "camarotes=" + camarotes + '}';
    }

    
    
    
}
