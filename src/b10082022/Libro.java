/*
Ejercicios clases y objetos - 2

Ejercicio nro.2

Crea una clase llamada Libro que guarde la información de cada uno de los libros de una biblioteca. La clase debe guardar el título del libro, autor, número de ejemplares del libro y número de ejemplares prestados. La clase contendrá los siguientes métodos:

Constructor por defecto.

Constructor con parámetros.

Métodos Setters/getters

Método préstamo que incremente diel atributo corresponente cada vez que se realice un préstamo del libro. No se podrán prestar libros de los que no queden ejemplares disponibles para prestar. Método devolución que decremente el atributo correspondiente cuando se produzca la devolución de un libro. No se podrán devolver libros que no se hayan prestado. 

Método toString para mostrar los datos de los libros

*/



package b10082022;

public class Libro {
    private String titulo;
    private String autor;
    private int ejemplares;
    private int prestados;
    
    
    public Libro(){
        
    }
    
    public Libro(String ptitulo, String pautor, int pejemplares,int pprestados){
        titulo = ptitulo;
        autor = pautor;
        ejemplares = pejemplares;
        prestados  = pprestados;
        
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getEjemplares() {
        return ejemplares;
    }

    public void setEjemplares(int ejemplares) {
        this.ejemplares = ejemplares;
    }

    public int getPrestados() {
        return prestados;
    }

    public void setPrestados(int prestados) {
        this.prestados = prestados;
    }
    
    public String toString(){
        return "El "+ titulo + " creado por " + autor + "tiene "+ ejemplares + " disponibles y "+ prestados;
    }
    
    public void prestamo(){
        if (ejemplares > 0){
            prestados +=1;
            ejemplares -=1;
        }else{
            System.out.println("no hay ejemplares");
        }
    }
    
    public void devolucion(){
        if (prestados > 0){
            prestados -=1;
            ejemplares +=1;
        }else{
            System.out.println("no fue prestado");
        }
    
    }
    
}
