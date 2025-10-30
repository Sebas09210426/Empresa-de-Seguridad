package model;

public abstract class Servicio {
    private String codigoDeContraro;
    private String cliente;
    private double tarifaMensual;
    private Estado estado;

    public Servicio(String codigoDeContraro, String cliente, double tarifaMensual, Estado estado) {
        this.codigoDeContraro = codigoDeContraro;
        this.cliente = cliente;
        this.tarifaMensual = tarifaMensual;
        this.estado = estado;
    }

    public String getCodigoDeContrato() {
        return codigoDeContraro;
    }

    public void setCodigoDeContraro(String codigoDeContraro) {
        this.codigoDeContraro = codigoDeContraro;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public double getTarifaMensual() {
        return tarifaMensual;
    }

    public void setTarifaMensual(double tarifaMensual) {
        this.tarifaMensual = tarifaMensual;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public abstract double calcularCostoMensual();
}
