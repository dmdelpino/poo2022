package b10082022;


// Metodo prestamo - incremente el atributo correspondiente cada vez que se realice un prestamo
// No se podran prestar libros de los que no quede ejemplares para prestar
// Metodo devolucion - decremente el atributo cuando se produzca la devolucion
// No se pueden devolver libros que no se hayan prestado
// Metodo toString para mostrar datos

public class AppLibro {
    public static void main(String[] args) {
        
        Libro lib1 = new Libro("titulo1", "autor1", 5,0);
        Libro lib2 = new Libro("titulo2", "autor2", 4,0);
        Libro lib3 = new Libro("titulo3", "autor3", 3,0);
        Libro lib4 = new Libro("titulo4", "autor4", 2,0);
        Libro lib5 = new Libro("titulo5", "autor5", 1,0);
        
        lib1.prestamo();
        System.out.println(lib1.toString());
        lib1.devolucion();
        System.out.println(lib1.toString());
    
    }
    
}
