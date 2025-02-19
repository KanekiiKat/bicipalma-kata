package ies.estatuas.domain.tarjetausuario;

public class TarjetaUsuario {

    private final String id;
    private boolean activada ;

    public boolean isActivada(){
        return activada;
    }

    public void setActivada(boolean activada){
        this.activada = activada;
    }

    public String toString() {
        return id;
    }
}