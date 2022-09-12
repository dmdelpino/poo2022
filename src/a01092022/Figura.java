
/*
Ejercicio N°1 - Clases Abstractas

Se hará una librería de clases que represente figuras tridimensionales y bidimensionales, y su respectiva jerarquía de clases. Las clases deben ser capaces de tener funcionamiento bastante básico, como obtener áreas, volúmenes y perímetros de la figura correspondiente.

1.-  Crear la clase Abstracta Figura

2.- Crear las clases 3D y 2D
    
3.-  Crear las clases Esfera, Pirámide y Cubo

4.- Crear las clases Cuadrado, Círculo y Triángulo



*/


package a01092022;

public abstract class Figura {
    
    protected String nombre;
    protected int GrosorBorde;
    protected int Color;
    
    public abstract void dibujar();
    
}
