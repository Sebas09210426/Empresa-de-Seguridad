package model;

public class CustodiaFija extends Servicio{
    private String puesto;

    public CustodiaFija(String codigoDeContraro, String cliente, double tarifaMensual, Estado estado, String puesto) {
        super(codigoDeContraro, cliente, tarifaMensual, estado);
        this.puesto = puesto;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    @Override
    public double calcularCostoMensual() {
        return getTarifaMensual();
    }
}
