/*
Herencia - Ejercicio Nro.3
Enunciado:

La empresa informática “CODO A CODO” necesita llevar un registro de todos sus empleados que se encuentran en la oficina central, para eso ha creado un diagrama de clases que debe incluir lo siguiente: 

1) Empleado

Atributos:

- nombre: tipo cadena (Debe ser nombre y apellido) 
- dni: tipo entero 
- edad : entero (Rango entre 18 y 45 años) 
- casado: boolean 
- salario: tipo numérico doble

Métodos:
- Constructor con y sin parámetros de entrada 
- Método que permita mostrar la clasificación según la edad de acuerdo al siguiente algoritmo: 
Si edad es menor o igual a 21, Principiante 
Si edad es >=22 y <=35, Intermedio 
Si edad es >35, Senior.-

- Imprimir los datos del empleado por pantalla (utilizar salto de línea \n para separar los atributos.

- Un método que permita aumentar el salario en un porcentaje que sería pasado como parámetro al método.

2.  Programador (Especialización de Empleado. Clase que hereda de Empleado todos los atributos y métodos.

- Atributos:

- lineasDeCodigoPorHora : tipo entero 

- lenguajeDominante: tipo cadena 

- Metodos: Mostrar los atributos.

- Constructor con y sin parámetos de entrada.

*/


package c22082022;

public class Empleado {
    protected String nombre_apellido;
    protected int dni;
    protected int edad;
    protected boolean casado;
    protected double salario;
    
    public Empleado(){        
    }

    public Empleado(String nombre_apellido, int dni, int edad, boolean casado, double salario) {
        this.nombre_apellido = nombre_apellido;
        this.dni = dni;
        this.edad = edad;
        this.casado = casado;
        this.salario = salario;
    }
    
    public void clasificacion(){
        if (edad <=21) {
            System.out.println("Principiante");
            
        }else if(edad>=22 && edad <=35){
            System.out.println("Intermedio");
        }else{
            System.out.println("Senior");
        }
    }
    
    public String toString(){
        return nombre_apellido + "\n" +
                dni+ "\n" +
                edad+ "\n" +
                casado+"\n" +
                salario+ "\n" ;
    }
    
    public void aumentar_salario(int cant){
        salario =(cant+salario)/100;
    }
    
}
