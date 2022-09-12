
package a24082022;

public class AppDiaSemana2 {
    public static void main(String[] args) {
        DiaSemana d;
        d = DiaSemana.MIERCOLES;
        switch (d) {
            case SABADO:
            case DOMINGO:
                System.out.println("fin de semana");                
                break;
            default:
                System.out.println("dia laboral");;
        }
        /*
        System.out.println(DiaSemana.JUEVES.ordinal());
        System.out.println(DiaSemana.DOMINGO.name());
        System.out.println(DiaSemana.MARTES.toString());
        */
        DiaSemana[] dias=DiaSemana.values();
        for (int i = 0; i < dias.length; i++) {
            System.out.println(dias[i]);
        }
    }
}
