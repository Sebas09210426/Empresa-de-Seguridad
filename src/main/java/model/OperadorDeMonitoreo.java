package model;

public class OperadorDeMonitoreo extends Empleado implements ITrabajable{
    private int zonasAsignadas;

    public OperadorDeMonitoreo(String nombre, String documento, TurnoAsignado turnoAsignado, double salarioBase, double horasExtra, int zonasAsignadas) {
        super(nombre, documento, turnoAsignado, salarioBase, horasExtra);
        this.zonasAsignadas = zonasAsignadas;
    }

    public int getZonasAsignadas() {
        return zonasAsignadas;
    }

    public void setZonasAsignadas(int zonasAsignadas) {
        this.zonasAsignadas = zonasAsignadas;
    }

    @Override
    public int registrarCamaras() {
        return 0;
    }

    @Override
    public double calcularSalarioTotal() {
        return salarioBase;
    }
}
