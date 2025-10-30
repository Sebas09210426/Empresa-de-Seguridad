package model;

public enum TipoDeArma {
    LETAL("Letal"), NO_LETAL("No letal"), SIN_ARMA("Sin arma"), DEFAULT("DEFAULT");

    private final String tipoDeArma;

    TipoDeArma(String descripcion) {
        this.tipoDeArma = descripcion;
    }

    @Override
    public String toString() {
        return this.tipoDeArma;
    }
}
