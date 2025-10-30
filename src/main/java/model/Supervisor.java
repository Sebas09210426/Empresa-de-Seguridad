package model;

import java.util.LinkedList;

public class Supervisor extends Empleado {
    private LinkedList<Vigilante> vigilantesAsignados;
    private double bono;

    public Supervisor(String nombre, String documento, TurnoAsignado turnoAsignado, double salarioBase, double horasExtra, LinkedList<Vigilante> vigilantesAsignados, double bono) {
        super(nombre, documento, turnoAsignado, salarioBase, horasExtra);
        this.vigilantesAsignados = vigilantesAsignados;
        this.bono = bono;
    }

    public LinkedList<Vigilante> getVigilantesAsignados() {
        return vigilantesAsignados;
    }

    public void setVigilantesAsignados(LinkedList<Vigilante> vigilantesAsignados) {
        this.vigilantesAsignados = vigilantesAsignados;
    }

    public double getBono() {
        return bono;
    }

    public void setBono(double bono) {
        this.bono = bono;
    }

    @Override
    public double calcularSalarioTotal() {
        return salarioBase + bono;
    }
}
