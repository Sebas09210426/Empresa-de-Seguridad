package model;

public class Equipo {
    private String codigo;
    private TipoDeEquipo tipoDeEquipo;
    private String estado;
    private double valorDeReposicion;

    public Equipo(String codigo, TipoDeEquipo tipoDeEquipo, String estado, double valorDeReposicion) {
        this.codigo = codigo;
        this.tipoDeEquipo = tipoDeEquipo;
        this.estado = estado;
        this.valorDeReposicion = valorDeReposicion;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public TipoDeEquipo getTipoDeEquipo() {
        return tipoDeEquipo;
    }

    public void setTipoDeEquipo(TipoDeEquipo tipoDeEquipo) {
        this.tipoDeEquipo = tipoDeEquipo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public double getValorDeReposicion() {
        return valorDeReposicion;
    }

    public void setValorDeReposicion(double valorDeReposicion) {
        this.valorDeReposicion = valorDeReposicion;
    }
}
