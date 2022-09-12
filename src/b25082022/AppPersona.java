
package b25082022;


import java.util.Scanner;

public class AppPersona {
    public static void main(String[] args) {
        Persona pers1 = new Persona();
        Niveles niv1;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese nombre: ");
        pers1.nombre=sc.next();
        System.out.println("Ingrese apellido: ");
        pers1.apellido=sc.next();
        
        Niveles[] niv = Niveles.values();
        
        System.out.println("Nivel de estudios: ");
        for (int i = 0; i < niv.length; i++) {
            System.out.println((i+1)+"-"+niv[i]);
        }
        int opcion;
        opcion=sc.nextInt();
        
        pers1.NivelEstudios=niv[opcion-1];
        
        
        System.out.println("Nombre: "+pers1.nombre);
        System.out.println("Apellido: "+pers1.apellido);
        System.out.println("Nivel de estudios: "+pers1.NivelEstudios.toString());
    }
}
