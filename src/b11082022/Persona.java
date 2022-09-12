/*

Ejercicios clases y objetos

Ejercicio nro.6
 
Crear una clase llamada Persona que siga las siguientes condiciones:
Sus atributos son: nombre, edad, DNI, sexo (H hombre, M mujer), peso y altura. No queremos que se accedan directamente a ellos. Piensa que modificador de acceso es el más adecuado, también su tipo. Si quieres añadir algún atributo puedes hacerlo.
Por defecto, todos los atributos menos el DNI serán valores por defecto según su tipo (0 números, cadena vacía para String, etc.). Sexo sera hombre por defecto, usa una constante para ello.
Se implantaran varios constructores:
Un constructor por defecto.
Un constructor con el nombre, edad y sexo, el resto por defecto.
Un constructor con todos los atributos como parámetro.
Los métodos que se implementaran son:


calcularIMC(): calculara si la persona esta en su peso ideal (peso en kg/(altura^2  en m)), si esta fórmula devuelve un valor menor que 20, la función devuelve un -1, si devuelve un número entre 20 y 25 (incluidos), significa que esta por debajo de su peso ideal la función devuelve un 0  y si devuelve un valor mayor que 25 significa que tiene sobrepeso, la función devuelve un 1. Te recomiendo que uses constantes para devolver estos valores.


esMayorDeEdad(): indica si es mayor de edad, devuelve un booleano.
comprobarSexo(char sexo): comprueba que el sexo introducido es correcto. Si no es correcto, sera H. No sera visible al exterior.
toString(): devuelve toda la información del objeto.
generaDNI(): genera un número aleatorio de 8 cifras y ese será el dni. Este método será invocado cuando se construya el objeto. Puedes dividir el método para que te sea más fácil. No será visible al exterior.
Métodos set de cada parámetro, excepto de DNI.
Ahora, crea una clase ejecutable que haga lo siguiente:
Pide por teclado el nombre, la edad, sexo, peso y altura.
Crea 3 objetos de la clase anterior, el primer objeto obtendrá las anteriores variables pedidas por teclado, el segundo objeto obtendrá todos los anteriores menos el peso y la altura y el último por defecto, para este último utiliza los métodos set para darle a los atributos un valor.
Para cada objeto, deberá comprobar si esta en su peso ideal, tiene sobrepeso o por debajo de su peso ideal con un mensaje.
Indicar para cada objeto si es mayor de edad.
Por último, mostrar la información de cada objeto.
nombre
edad 
sexo 
peso 
altura

dni generar invocar metodo calcular dni
constructor por defecto
incorporar seter

todos los atributos nombre edad sexo peso altura

calcular imc formulo kilo en metro
peso en altura
divido en cuadrado

metodo
mayor de edad comprobar con 18 mayor de edad

H
validar sexo

toString todos los atributos de la clase en forma de string

generar dni

clase Math(formuas)
math.random(calcular numero al azar entre cero a uno y no llega a unn)
incluye o no uno

o, y resto
Math.random()

0,1357932,7442136 es ranando

solo parte entera
(int)
(math.random() * 100000000)+1

+1 por el redondeo

(int)((Math.random()*100000000) +1)

*/


package b11082022;

public class Persona {
    private String nombre = "";
    private int edad =0;
    private int dni = generaDNI();
    private char sexo = 'H';
    private double peso = 0;
    private double altura = 0;
    
    public Persona(){        
    }
    
    public Persona(String pnombre, int pedad, char psexo){
        nombre=pnombre;
        edad=pedad;
        sexo=psexo;        
    }
    
    public Persona(String pnombre, int pedad, char psexo,double ppeso,double paltura){
        nombre=pnombre;
        edad=pedad;
        sexo=psexo;
        peso=ppeso;
        altura=paltura;        
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    
    
    
    
    public int calcularIMC(){
        double pideal = peso / (Math.pow(altura,2));
        if (pideal < 20) {
            return -1;
        }else if(pideal >= 20 && pideal <=25){
            return 0;
        }else{
            return 1;
        }
    }
    
    public Boolean esMayorDeEdad(){
        if (edad >= 18) {
            return true;
        }
        return false;
    }
    
    private char comprobarSexo(char sexo){
        if (sexo == 'H' || sexo == 'M') {
            return sexo;
        }else{
            return 'H';
        }
    }
    
    public String toString(){
        return "Nombre: "+nombre+ "\n" +
               "Edad:   "+edad+ "\n" +
               "DNI:    "+dni+ "\n" +
               "Sexo:   "+sexo+ "\n" +
               "Peso:   "+peso+ "\n" +
               "Altura: "+altura;
    }
    /*
    private String generaDNI(){
        Integer numero1 = generarNro(01,100);
        Integer numero2 = generarNro(001,1000);
        Integer numero3 = generarNro(001,1000);
        
        return numero1+""+numero2+""+numero3;                       
    }
    
    private int generarNro(int min, int max) {
		int range = (max - min) + 1;
		return (int)(Math.random() * range) + min;
    }
    */
    
    private int generaDNI(){        
        int numero = (int)(Math.random() * 100000000) + 1;
        return numero;    
    }
    
}