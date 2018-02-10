public class TarjetaUsuario {
    private String id = "";
    private boolean activada = false;

    public TarjetaUsuario(String id, boolean activada){
        this.id = id;
        this.activada = activada;
    }

    public String getId() {
        return id;
    }

    public boolean isActivada() {
        return activada;
    }
}
