package model;

public class MonitoreoRemoto extends Servicio{
    private int numeroDeDispositivosVigilados;

    public MonitoreoRemoto(String codigoDeContraro, String cliente, double tarifaMensual, Estado estado, int numeroDeDispositivosVigilados) {
        super(codigoDeContraro, cliente, tarifaMensual, estado);
        this.numeroDeDispositivosVigilados = numeroDeDispositivosVigilados;
    }

    public int getNumeroDeDispositivosVigilados() {
        return numeroDeDispositivosVigilados;
    }

    public void setNumeroDeDispositivosVigilados(int numeroDeDispositivosVigilados) {
        this.numeroDeDispositivosVigilados = numeroDeDispositivosVigilados;
    }

    @Override
    public double calcularCostoMensual() {
        return getTarifaMensual();
    }
}
