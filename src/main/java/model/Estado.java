package model;

public enum Estado {
    ACTIVO("Activo"), SUSPENDIDO("Suspendido"), FINALIZADO("Finalizado");

    private final String estado;
    Estado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return estado;
    }
}
