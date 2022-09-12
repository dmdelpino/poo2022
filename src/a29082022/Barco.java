/*
 Ejercicio N° 7 - Herencia
En un puerto se alquilan amarres para barcos de distinto tipo. 
Para cada ALQUILER se guarda el nombre y número de documento del cliente, 
la fecha inicial y final de alquiler, la posición del amarre y el barco que lo ocupará. 
Un BARCO se caracteriza por su matrícula, su eslora en metros y año de fabricación.

Un alquiler se calcula multiplicando el número de días de ocupación (incluyendo 
los días inicial y final) por un módulo función de cada barco (obtenido 
simplemente multiplicando por 10 los metros de eslora) y por un valor fijo 
(2 e en la actualidad).


Sin embargo ahora se pretende diferenciar la información de algunos tipos de barcos:
-Número de mástiles para veleros
-Potencia en CV para embarcaciones deportivas a motor
-Potencia en CV y número de camarotes para yates de lujo


El módulo función de los barcos ahora se obtiene como el módulo normal más:
-El número de mástiles para veleros
-La potencia en CV para embarcaciones deportivas a motor
-La potencia en CV más el número de camarotes para yates de lujo
Utilizando la herencia de forma apropiada, diseñe el diagrama de clases y sus 
relaciones, con detalle de atributos y métodos necesarios. Realice las 
respectivas clases en java y el programa principal que permita alquiler y 
devolución de amarres.

 */
package a29082022;


public class Barco extends Alquiler{
    private String matricula;
    private int eslora;
    private int anio_fabricacion;

    public Barco(String matricula, int eslora, int anio_fabricacion) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.anio_fabricacion = anio_fabricacion;
    }

    
    
    
    public int alquiladoBarco(){
        int valor = diferenciaDias()*(eslora * 10)*2;
        return valor;
    }

    @Override
    public String toString() {
        return "Barco{" + "matricula=" + matricula + ", eslora=" + eslora + ", anio_fabricacion=" + anio_fabricacion + '}';
    }
    
    
    
    
}
