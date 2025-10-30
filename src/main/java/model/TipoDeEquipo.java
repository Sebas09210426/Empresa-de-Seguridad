package model;

public enum TipoDeEquipo {
    RADIO("Radio"), ARMA("Arma"), VEHICULO("Vehiculo"), UNIFORME("Uniforme");

    private final String tipoDeEquipo;
    TipoDeEquipo(String tipoDeEquipo) {
        this.tipoDeEquipo = tipoDeEquipo;
    }

    @Override
    public String toString() {
        return tipoDeEquipo;
    }
}
