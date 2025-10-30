package model;

public enum TurnoAsignado {
    DIA("Día"), NOCHE("Noche"), DEFAULT("DEFAULT");

    private final String turnoAsignado;

    TurnoAsignado(String turnoAsignado) {
        this.turnoAsignado = turnoAsignado;
    }

    @Override
    public String toString() {
        return turnoAsignado;
    }
}
