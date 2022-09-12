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
public class Velero extends Barco{
    private int mastiles;

    public Velero(int mastiles, String matricula, int eslora, int anio_fabricacion) {
        super(matricula, eslora, anio_fabricacion);
        this.mastiles = mastiles;
    }

    

    @Override
    public int alquiladoBarco() {
        return super.alquiladoBarco()+mastiles; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return super.toString()+"Velero{" + "mastiles=" + mastiles + '}';
    }
    
    
    
}
