package model;

public abstract class Empleado {
    protected String nombre;
    protected String documento;
    protected TurnoAsignado turnoAsignado;
    protected double salarioBase;
    protected double horasExtra;

    public Empleado(String nombre, String documento, TurnoAsignado turnoAsignado, double salarioBase, double horasExtra) {
        this.nombre = nombre;
        this.documento = documento;
        this.turnoAsignado = turnoAsignado;
        this.salarioBase = salarioBase;
        this.horasExtra = horasExtra;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public TurnoAsignado getTurnoAsignado() {
        return turnoAsignado;
    }

    public void setTurnoAsignado(TurnoAsignado turnoAsignado) {
        this.turnoAsignado = turnoAsignado;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getHorasExtra() {
        return horasExtra;
    }

    public void setHorasExtra(double horasExtra) {
        this.horasExtra = horasExtra;
    }

    public abstract double calcularSalarioTotal();
}
