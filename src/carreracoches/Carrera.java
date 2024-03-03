package carreracoches;

public class Carrera {

    private String ganador;
    private int kmTotales;
    private int numVueltas;

    public Carrera(String gana, int km, int vuelt) {
        ganador = gana;
        kmTotales = km;
        numVueltas = vuelt;
    }

    public void setGanador(String gana) {
        ganador = gana;
    }

    public String getGanador() {
        return ganador;
    }

    public void setKmTotales(int km) {
        kmTotales = km;
    }

    public int getKmTotales() {
        return kmTotales;
    }

    public void setNumVueltas(int vuel) {
        numVueltas = vuel;
    }

    public int getNumVueltas() {
        return numVueltas;
    }


    public static void iniciarCarrera(String marca1, String marca2, String ch1, String ch2, int cv1,
                                      int cv2, int vel1, int vel2, int kmRec1, int kmRec2, int km, int vuelt) {

        int acel;
        int numV;
        for (numV = 1; numV <= vuelt; numV++) {
            Entrada.tiempo(3);
            System.out.println("Vuelta : " + numV);
            System.out.println("------------");

            acel = Coche.acelerar(cv1);
            kmRec1 = kmRec1 + (vel1 + acel) / 2;
            vel1 = vel1 + acel;
            System.out.println("El " + marca1 + " va a " + vel1 + " km/h y lleva recorridos " + kmRec1 + " Kms");

            acel = Coche.acelerar(cv2);
            kmRec2 = kmRec2 + (vel2 + acel) / 2;
            vel2 = vel2 + acel;
            System.out.println("El " + marca2 + " va a " + vel2 + " km/h y lleva recorridos " + kmRec2 + " Kms");
        }

        // Si terminadas las vueltas uno de los coches terminó la carrera Fin
        // si no ... continuar vueltas extra

        if ((kmRec1 < km) &&  (kmRec2 < km)) {
            do {
                System.out.println("\n ¡¡ Vuelta EXTRA !! : " + numV);
                System.out.println("    ++++++++++++");
                Entrada.tiempo(3);

                acel = Coche.acelerar(cv1);
                kmRec1 = kmRec1 + (vel1 + acel) / 2;
                vel1 = vel1 + acel;
                System.out.println("El " + marca1 + " va a " + vel1 + " km/h y lleva recorridos " + kmRec1 + " Kms");

                acel = Coche.acelerar(cv2);
                kmRec2 = kmRec2 + (vel2 + acel) / 2;
                vel2 = vel2 + acel;
                System.out.println("El " + marca2 + " va a " + vel2 + " km/h y lleva recorridos " + kmRec2 + " Kms");
                numV++;
            } while ((kmRec1 < km) && (kmRec2 < km));

        }

        // Mostrar matrícula de ganador

        System.out.println("\n +++++++++++++++++++++++++");
        System.out.println(" +¡¡ FIN DE LA CARRERA !!+");
        System.out.println(" +++++++++++++++++++++++++\n");
        Entrada.tiempo(2);

        if (kmRec1 > kmRec2) {
            System.out.println(" El coche ganador ha sido el " + marca1 + " con matrícula " + ch1);
        } else {
            System.out.println(" El coche ganador ha sido el " + marca2 + " con matrícula " + ch2);
        }

        System.out.println("\n    ¡¡¡ FELICIDADES !!  \n");


    }

}
