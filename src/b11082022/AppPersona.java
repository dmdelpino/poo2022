package b11082022;

import java.util.Scanner;

public class AppPersona {
    public static void main(String[] args) {
        
        
        Scanner lector=new Scanner(System.in);
        System.out.println("ingrese nombre: ");
        String nombre1 = lector.nextLine();
        System.out.println("ingrese edad: ");
        int edad1=lector.nextInt();
        System.out.println("ingrese sexo: ");
        char sexo1=lector.next().charAt(0);
        System.out.println("ingrese peso: ");
        double peso1=lector.nextDouble();
        System.out.println("ingrese altura: ");
        double altura1=lector.nextDouble();
        
        Persona pers1=new Persona(nombre1,edad1,sexo1,peso1,altura1);
        
        
        Persona pers2=new Persona("pepe",56,'M');
        Persona pers3=new Persona();
        
        
        pers3.setNombre("jacinta");
        pers3.setSexo('M');
        pers3.setEdad(49);
        pers3.setAltura(1.68);
        pers3.setPeso(71);
        
        System.out.println("--------------------");
        System.out.println("IMC persona1: "+pers1.calcularIMC());
        System.out.println("Persona1 es mayor?: "+pers1.esMayorDeEdad());
        System.out.println(pers1.toString());
        System.out.println("--------------------");
        
        
        System.out.println("IMC persona2: "+pers2.calcularIMC());
        System.out.println("Persona2 es mayor?: "+pers2.esMayorDeEdad());
        System.out.println(pers2.toString());
        System.out.println("--------------------");
        
        
        
        
        System.out.println("IMC persona3: "+pers3.calcularIMC());
        System.out.println("Persona3 es mayor?: "+pers3.esMayorDeEdad());
        System.out.println(pers3.toString());
        System.out.println("--------------------");
        
        
        
    }
    
}
