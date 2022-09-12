/*
 Ejercicios clases y objetos

Ejercicio nro.5


Escribe una clase Cuenta para representar una cuenta bancaria. Los datos de la cuenta son: nombre del cliente (String), número de cuenta (String), tipo de interés (double) y saldo (double).
La clase contendrá los siguientes métodos:
Constructor por defecto.
Constructor con todos los parámetros’.
Métodos setters/getters para asignar y obtener los datos de la cuenta.
Métodos ingreso y extracción. Un ingreso consiste en aumentar el saldo en la cantidad que se indique. Esa cantidad no puede ser negativa. Una extracción consiste en disminuir el saldo en una cantidad pero antes se debe comprobar que hay saldo suficiente. La cantidad no puede ser negativa. Los métodos ingreso y extracción devuelven true si la operación se ha podido realizar o false en caso contrario.
Método transferencia que permita pasar dinero de una cuenta a otra siempre que en la cuenta de origen haya dinero suficiente para poder hacerla. Ejemplo de uso del método transferencia:
cuentaOrigen.transferencia(cuentaDestino, importe);
que indica que queremos hacer una transferencia desde cuentaOrigen a cuentaDestino del importe indicado.


*/

package a11082022;


public class Cuenta {
    private String nombre;
    private String nro;
    private double interes;
    private double saldo;
    
    public Cuenta(){
        
    }
    
    public Cuenta(String pnombre, String pnro, double pinteres, double psaldo){
        nombre=pnombre;
        nro=pnro;
        interes=pinteres;
        saldo=psaldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNro() {
        return nro;
    }

    public void setNro(String nro) {
        this.nro = nro;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public Boolean ingreso(String cuentaOrigen,double cant){
        if (cant >0) {
            saldo+=cant;
            return true;
        }return false;
    }
    
    public Boolean extraccion(String cuentaOrigen,double cant){
        if (saldo >= cant) {
            saldo-=cant;
            return true;
        }return false;
    }
    
    
    public void transferencia(String cuentaDestino, double importe){
        if (saldo >= importe) {
            extraccion(nro, importe);
            ingreso(cuentaDestino, importe);
        }else{
            System.out.println("saldo insuficiente para realizar transferencia");
        }
    }
    
    
    
}
