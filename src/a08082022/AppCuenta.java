package a08082022;

import java.util.Scanner;

public class AppCuenta {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Scanner tecla = new Scanner(System.in);
        String nc, nom;
        double sal;
        
        Cuenta cta1=new Cuenta("ca1900", "Juan",1500);
        Cuenta cta2=new Cuenta();
        cta2.setNrocta("cc2022");
        cta2.setNombre("Luis");
        cta2.setSaldo(2500);
        
        System.out.println("Ingrese numero de cuenta: ");
        nc= teclado.next();
        System.out.println("Ingrese nombre: ");
        nom=tecla.nextLine();
        System.out.println("Ingrese saldo: ");
        sal=teclado.nextDouble();
        System.out.println("--------------");
        Cuenta cta3 =new Cuenta(nc,nom,sal);
        System.out.println(cta1.toString());
        System.out.println(cta2.toString());
        System.out.println(cta3.toString());
        System.out.println("--------------");
        cta1.depositar(1500);
        cta2.extraer(2000);
        cta3.extraer(3000);
        System.out.println(cta1.toString());
        System.out.println(cta2.toString());
        System.out.println(cta3.toString());
        
        
    }
}
