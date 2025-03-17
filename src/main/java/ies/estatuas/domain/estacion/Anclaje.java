package ies.estatuas.domain.estacion;

import ies.estatuas.domain.bicicleta.Movil;

class Anclaje {

    private boolean ocupado = false;

    private Movil bici = null;

    Anclaje() {
    };

    boolean isOcupado() {
        return this.ocupado;
    }

    Movil getBici() {
        return this.bici;
    }

    void anclarBici(Movil bici) {
        this.bici = bici;
        this.ocupado = true;
    }

    void liberarBici() {
        this.bici = null;
        this.ocupado = false;
    }

    @Override
    public String toString() {
        return "ocupado: " + Boolean.toString(isOcupado());
    }
}