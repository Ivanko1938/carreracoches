package carreracoches;

public class Coche {

    private String marca;
    private String modelo;
    private int cv;
    private int cc;
    private String matricula;
    private int velocidad;
    private int kmRecorridos;

    public Coche(String mar,String mod,int v,int c,String matr,int vel,int km){
        marca = mar;
        modelo = mod;
        cv = v;
        cc = c;
        matricula = matr;
        velocidad = vel;
        kmRecorridos = km;
    }

    public void setMarca(String mar) {
        marca = mar;
    }
    public String getMarca() {
        return marca;
    }
    public void setModelo(String mod){
        modelo = mod;
    }
    public String getModelo() {
        return modelo;
    }
    public void setCv(int v){
        cv = v;
    }
    public int getCv() {
        return cv;
    }
    public void setCc(int c) {
        cc = c;
    }
    public int getCc() {
        return cc;
    }
    public void setMatricula(String matr) {
        matricula = matr;
    }
    public String getMatricula() {
        return matricula;
    }
    public void setVelocidad(int vel) {
        velocidad = vel;
    }
    public int getVelocidad() {
        return velocidad;
    }
    public void setKmRecorridos(int km) {
        kmRecorridos = km;
    }
    public int getKmRecorridos() {
        return kmRecorridos;
    }



    public static int acelerar(int cv) {

        int aceleracion = 0;
        do {
            aceleracion = (int) (Math.random() * 30);
        } while (aceleracion <= 10);

        if (cv > 100) {
            aceleracion = aceleracion + 10;
        }

        return aceleracion;
    }

    public void mostrarDatos () {

        System.out.println("Marca     : " + marca);
        System.out.println("Modelo    : " + modelo);
        System.out.println("CV        : " + cv);
        System.out.println("CC        : " + cc);
        System.out.println("Matrícula : " + matricula);
        System.out.println("Velocidad : " + velocidad);
        System.out.println("Kilómetros: " + kmRecorridos);

    }
}
