package b22082022;

public class AppPersona {
    public static void main(String[] args) {
        Persona prueba1 = new Persona("juan","calle falsa 123");
        Profesor prueba2 = new Profesor("roberto", "via industrial 50", "activo");
        Estudiante prueba3 = new Estudiante("maria", "sadsada", 3, "medicina");
        EstudianteInternacional prueba4 = new EstudianteInternacional("pepe","jffdjkg", 4, "cocina", "francia");
        
        
        
        System.out.println(prueba1.toString());
        System.out.println(prueba2.toString());
        System.out.println(prueba3.toString());
        System.out.println(prueba4.toString());
        
    }
}
