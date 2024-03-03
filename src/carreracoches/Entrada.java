package carreracoches;

public class Entrada {

    public static void main(String[] args) {

        //Crear dos coches con los datos que yo quiera

        Coche[] coches = new Coche[2];
        coches[0] = new Coche("Mercedes","A300",95,2000,"1111CXH",10,0);
        coches[1] = new Coche("BMW","Clase 3",95,1800,"2222DMZ",10,0);

        System.out.println("\nCOCHES QUE VAN A COMPETIR EN LA CARRERA");
        System.out.println("----------------------------------------\n");
        for (Coche coche : coches) {
            coche.mostrarDatos();
            System.out.println();
        }

        System.out.print("LA CARRERA VA A COMENZAR : ");
        for (int i = 10; i >= 0; i--){
            tiempo(1);
            System.out.print(i + " ");
        }

        System.out.println("\n\n ¡¡ COMIENZA LA CARRERA !! \n");

        //Crear una carrera con los datos que yo quiera

        Carrera miCarr = new Carrera("",300,5);

        //Asociar los coches a la carrera

        String marca1 = coches[0].getMarca() + " " + coches[0].getModelo();
        String marca2 = coches[1].getMarca() + " " + coches[1].getModelo();
        String ch1 = coches[0].getMatricula();
        String ch2 = coches[1].getMatricula();
        int cv1 = coches[0].getCv();
        int cv2 = coches[1].getCv();
        int vel1 = coches[0].getVelocidad();
        int vel2 = coches[1].getVelocidad();
        int kmRec1 = coches[0].getKmRecorridos();
        int kmRec2 = coches[1].getKmRecorridos();
        int km = miCarr.getKmTotales();
        int vuelt = miCarr.getNumVueltas();

        //Iniciar la carrera y comprobar que los datos son correctos

        Carrera.iniciarCarrera(marca1,marca2,ch1,ch2,cv1,cv2,vel1,vel2,kmRec1,kmRec2,km,vuelt);

    }


    public static void tiempo(int segundos) {

        try {
            // Hacer una pausa de 1 segundo (1000 milisegundos)
            Thread.sleep(1000*segundos);
        } catch (InterruptedException e) {
            // Manejar la excepción si ocurre
            e.printStackTrace();
        }
    }
}
