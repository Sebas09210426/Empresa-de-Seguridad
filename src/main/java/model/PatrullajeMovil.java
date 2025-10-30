package model;

public class PatrullajeMovil extends Servicio{
    private int vehiculos;
    private int cantidadDeRutas;
    private double kilometrosRecorridos;

    public PatrullajeMovil(String codigoDeContraro, String cliente, double tarifaMensual, Estado estado, int vehiculos, int cantidadDeRutas, double kilometrosRecorridos) {
        super(codigoDeContraro, cliente, tarifaMensual, estado);
        this.vehiculos = vehiculos;
        this.cantidadDeRutas = cantidadDeRutas;
        this.kilometrosRecorridos = kilometrosRecorridos;
    }

    public int getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(int vehiculos) {
        this.vehiculos = vehiculos;
    }

    public int getCantidadDeRutas() {
        return cantidadDeRutas;
    }

    public void setCantidadDeRutas(int cantidadDeRutas) {
        this.cantidadDeRutas = cantidadDeRutas;
    }

    public double getKilometrosRecorridos() {
        return kilometrosRecorridos;
    }

    public void setKilometrosRecorridos(double kilometrosRecorridos) {
        this.kilometrosRecorridos = kilometrosRecorridos;
    }

    @Override
    public double calcularCostoMensual() {
        return getTarifaMensual();
    }
}
