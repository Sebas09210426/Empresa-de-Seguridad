package model;

public class Vigilante extends Empleado{
    private int puestosAsignados;
    private TipoDeArma tipoDeArma;

    public Vigilante(String nombre, String documento, TurnoAsignado turnoAsignado, double salarioBase, double horasExtra, int puestosAsignados, TipoDeArma tipoDeArma) {
        super(nombre, documento, turnoAsignado, salarioBase, horasExtra);
        this.puestosAsignados = puestosAsignados;
        this.tipoDeArma = tipoDeArma;
    }

    public int getPuestosAsignados() {
        return puestosAsignados;
    }

    public void setPuestosAsignados(int puestosAsignados) {
        this.puestosAsignados = puestosAsignados;
    }

    public TipoDeArma getTipoDeArma() {
        return tipoDeArma;
    }

    public void setTipoDeArma(TipoDeArma tipoDeArma) {
        this.tipoDeArma = tipoDeArma;
    }

    @Override
    public double calcularSalarioTotal() {
        return salarioBase;
    }
}
