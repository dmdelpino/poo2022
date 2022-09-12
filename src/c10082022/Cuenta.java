
package c10082022;

/*
Ejercicios clases y objetos - 3

Ejercicio nro.3 (tres)


Crea una clase llamada Cuenta que tendrá los siguientes atributos: titular y cantidad (puede tener decimales).

El titular será obligatorio y la cantidad es opcional. Crea dos constructores que cumpla lo anterior.

Crea sus métodos get, set y toString().

Tendrá dos métodos especiales:

ingresar(double cantidad): se ingresa una cantidad a la cuenta, si la cantidad introducida es negativa, no se hará nada.
retirar(double cantidad): se retira una cantidad a la cuenta, si restando la cantidad actual a la que nos pasan es negativa, la cantidad de la cuenta pasa a ser 0.

*/

public class Cuenta {
    private String titular;
    private double cantidad;
    
    public Cuenta(String ptitular){
        titular = ptitular;
        cantidad =0;
    }
    public Cuenta(String ptitular, double pcantidad){
        titular = ptitular;
        cantidad = pcantidad;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }
    
    public String toString(){
        return " Nombre: "+titular+" Saldo: "+cantidad;
    }
    
    public double ingresar(double cant){
        if (cant > 0) {
            cantidad +=cant;
        }
        return cantidad;
    }
     
    public double retirar(double cant){
        
        if (cantidad - cant < 0) {
            cantidad = 0;
        }else{
            cantidad -= cant;
        }
        return cantidad;
    }
    
}
