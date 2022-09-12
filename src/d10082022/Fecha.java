/*
 Ejercicios clases y objetos - 4

Ejercicio nro.4  

Crear una Clase Fecha en Java. La clase tendrá tres atributos privados dia, mes y año de tipo int. 
La clase contendrá los siguientes métodos:

Constructor por defecto.

Constructor con tres parámetros para crear objetos con valores iniciales.

Métodos set y get para asignar y obtener los valores de los atributos de la clase.

Método fechaCorrecta() que comprueba si la fecha es correcta. Devuelve un valor de tipo boolean indicando si la fecha es correcta o no. Este método a su vez utilizará un método privado de la clase llamado esBisiesto que calcula si el año es o no bisiesto. El método esBisiesto devuelve true si el año es bisiesto y false si no lo es.

Método diaSiguiente() que cambia la fecha actual por la del día siguiente. El objeto de la clase Fecha al que se le aplique este método deberá quedar siempre en un estado consistente, es decir, la nueva fecha deberá ser correcta.

Modificar el método toString() heredado de Object para mostrar las fechas de la forma dd-mm-aaaa. El día y el mes se deben mostrar con dos cifras. Si el dia o el mes tienen solo una cifra se escribirá un cero delante. Por ejemplo si la fecha es dia=1, mes=6, año= 2015 la fecha que se mostrará será: 01-06-2015

*/
package d10082022;

public class Fecha {

    private int dia, mes, anio;

    public Fecha() {
    }

    public Fecha(int pdia, int pmes, int panio) {
        dia = pdia;
        mes = pmes;
        anio = panio;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    
    // 30: noviembre, abril, junio, septiembre
    // 28-29: febrero
    // 31: enero,marzo,mayo,julio,agosto,octubre,diciembre
    public Boolean fechaCorrecta() {
        switch (mes) {
            case 4:
            case 11:
            case 6:
            case 9:
                if (dia <= 30) {
                    return true;
                }
                break;

            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                if (dia <= 31) {
                    return true;
                }
                break;

            case 2:
                if (esBisiesto(anio) == true && dia == 29) {
                    return true;
                } else if (dia == 28) {
                    return true;
                }
                break;
            default:
                throw new AssertionError();
        }
        return false;
    }

    /*
    Si el año es uniformemente divisible por 4, vaya al paso 2. ...
    Si el año es uniformemente divisible por 100, vaya al paso 3. ...
    Si el año es uniformemente divisible por 400, vaya al paso 4. ...
    El año es un año bisiesto (tiene 366 días).
    
     */
    private Boolean esBisiesto(int fech1) {
        return fech1 % 4 == 0 && (fech1 % 100 != 0 || fech1 % 400 == 0);
    }

    public void diaSiguiente() {
        if (dia <= 30 && (mes != 2 || mes != 4 || mes != 6 || mes != 9 || mes != 11)) {
            dia += 1;
        } else if (esBisiesto(anio) == false && mes == 2 && dia == 28) {
            mes += 1;
            dia = 1;
        } else if (esBisiesto(anio) == true && mes == 2 && dia == 28) {
            mes += 1;
            dia = 1;
        } else if (dia == 30 && (mes == 4 || mes == 6 || mes == 9 || mes == 11)) {
            mes += 1;
            dia = 1;
        } else if (dia == 31 && (mes == 12)) {
            mes = 1;
            dia = 1;
            anio += 1;
        } else {
            mes += 1;
            dia = 1;
        }
    }

    @Override
    public String toString(){
        if (dia > 9 && mes > 9) {
            return dia + "-" + mes + "-" + anio;
        }else if (dia <= 9 && mes > 9) {
            return "0"+dia + "-" + mes + "-" + anio;
        }else if (dia > 9 && mes <= 9) {
            return dia + "-" +"0"+ mes + "-" + anio;
        }else if (dia <= 9 && mes <= 9) {
            return "0"+dia + "-" +"0"+ mes + "-" + anio;}
        return "0";
    }
}