// CLASE 2 - Ejercicio 1
/*
Ejercicios clases y objetos

Ejercicio nro.1

Crear una clase Libro que contenga los siguientes atributos: 

– ISBN
– Titulo
– Autor
– Número de páginas  
 
Crear sus respectivos métodos get y set correspondientes para cada atributo. Crear el método toString() para mostrar la información relativa al libro con el siguiente formato:
«El libro con ISBN creado por el autor tiene páginas»    
En el fichero main, crear 2 objetos Libro (los valores que se quieran) y mostrarlos por pantalla.
Por último, indicar cuál de los 2 tiene más páginas.


*/


package a10082022;


public class Libro {
    
    private int ISBN;
    private String titulo;
    private String autor;
    private int paginas;
    
    
    public Libro(){
    
    }
    
    public Libro(int pISBN, String ptitulo, String pautor, int ppaginas){
        ISBN = pISBN;
        autor = pautor;
        paginas = ppaginas;
        titulo = ptitulo;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
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

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    
    
    public String toString(){
        return "El "+ titulo + " con  "+ ISBN + " creado por " + autor+ " tiene "+paginas;
    }
    
    
}
   
