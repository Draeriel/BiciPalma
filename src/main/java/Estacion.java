import java.util.ArrayList;

public class Estacion {
    private int id = 0;
    private String direccion = "";
    private int numeroAnclajes = 0;
    private Bicicleta[] anclajes= null;

    public Estacion(int id, String direccion, int numeroAnclajes){
        this.id = id;
        this.direccion = direccion;
        this.numeroAnclajes = numeroAnclajes;
        this.anclajes = new Bicicleta[numeroAnclajes];
    }

    public int getId() {
        return id;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getNumeroAnclajes() {
        return numeroAnclajes;
    }
    public void consultarEstacion(){
        System.out.println("Identificador de la estación: " + getId() + "\n" +
        "Dirección de la estación: " + getDireccion() + "\n" + "Número de anclajes de la estación: " + getNumeroAnclajes());
    }

    public int anclajesLibres(){
        int ocupado = 0;
        for (Bicicleta i: anclajes){
            if(i != null){
                ocupado++;
            }
        }
        return numeroAnclajes - ocupado;
    }

    public void anclarBicicleta(Bicicleta bicicleta) {
        int contador = 1;
        for (Bicicleta i : anclajes) {
            if (i == null) {
                anclajes[contador -1] = bicicleta;
                mostrarAnclaje(bicicleta, contador);
                break;
            }
            contador++;
        }
    }
    public void mostrarAnclaje(Bicicleta bicicleta, int numeroAnclaje){
        System.out.println("La bicicleta " + bicicleta.getId() + " está en el anclaje " + numeroAnclaje + ".");
    }

    public void consultarAnclajes(){
        int contador = 1;
        for (Bicicleta i : anclajes) {
            if (i == null) {
                System.out.println("El anclaje " + contador + " está libre.");
            }else {
                mostrarAnclaje(i, contador);
            }
            contador++;
        }
    }
    public boolean leerTarjetaUsuario(TarjetaUsuario tarjetaUsuario){
        return tarjetaUsuario.isActivada();
    }

    public void retirarBicicleta(TarjetaUsuario tarjetaUsuario){
        if(leerTarjetaUsuario(tarjetaUsuario)){
            int contador = 0;
            for (Bicicleta i: anclajes){
                contador++;
                if(i != null){
                    mostrarBicicleta(i,contador );
                    anclajes[contador -1] = null;
                    break;

                }
            }
        }
    }
    public void mostrarBicicleta(Bicicleta bicicleta, int anclaje){
        System.out.println("Puede retirar la bicicleta " + bicicleta.getId() + " del anclaje " + anclaje + ".");
    }
}

