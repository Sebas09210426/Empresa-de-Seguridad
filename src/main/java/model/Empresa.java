package model;

import java.util.LinkedList;

public class Empresa {
    private String nombre;
    private String nit;
    private LinkedList<Vigilante> vigilantesRegistrados;
    private LinkedList<Supervisor> supervisoresRegistrados;
    private LinkedList<OperadorDeMonitoreo>  operadoresDeMonitoreoRegistrados;
    private LinkedList<CustodiaFija> custodiasFijasRegistrados;
    private LinkedList<PatrullajeMovil> patrullajesMovilesRegistrados;
    private LinkedList<MonitoreoRemoto>  monitoreosRemotosRegistrados;
    private LinkedList<Equipo> equiposRegistrados;

    public Empresa(String nombre, String nit) {
        this.nombre = nombre;
        this.nit = nit;
        this.vigilantesRegistrados = new LinkedList<>();
        this.supervisoresRegistrados = new LinkedList<>();
        this.operadoresDeMonitoreoRegistrados = new LinkedList<>();
        this.custodiasFijasRegistrados = new LinkedList<>();
        this.patrullajesMovilesRegistrados = new LinkedList<>();
        this.monitoreosRemotosRegistrados = new LinkedList<>();
        this.equiposRegistrados = new LinkedList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public LinkedList<Vigilante> getVigilantesRegistrados() {
        return vigilantesRegistrados;
    }

    public void setVigilantesRegistrados(LinkedList<Vigilante> vigilantesRegistrados) {
        this.vigilantesRegistrados = vigilantesRegistrados;
    }

    public LinkedList<Supervisor> getSupervisoresRegistrados() {
        return supervisoresRegistrados;
    }

    public void setSupervisoresRegistrados(LinkedList<Supervisor> supervisoresRegistrados) {
        this.supervisoresRegistrados = supervisoresRegistrados;
    }

    public LinkedList<OperadorDeMonitoreo> getOperadoresDeMonitoreoRegistrados() {
        return operadoresDeMonitoreoRegistrados;
    }

    public void setOperadoresDeMonitoreoRegistrados(LinkedList<OperadorDeMonitoreo> operadoresDeMonitoreoRegistrados) {
        this.operadoresDeMonitoreoRegistrados = operadoresDeMonitoreoRegistrados;
    }

    public LinkedList<CustodiaFija> getCustodiasFijasRegistrados() {
        return custodiasFijasRegistrados;
    }

    public void setCustodiasFijasRegistrados(LinkedList<CustodiaFija> custodiasFijasRegistrados) {
        this.custodiasFijasRegistrados = custodiasFijasRegistrados;
    }

    public LinkedList<PatrullajeMovil> getPatrullajesMovilesRegistrados() {
        return patrullajesMovilesRegistrados;
    }

    public void setPatrullajesMovilesRegistrados(LinkedList<PatrullajeMovil> patrullajesMovilesRegistrados) {
        this.patrullajesMovilesRegistrados = patrullajesMovilesRegistrados;
    }

    public LinkedList<MonitoreoRemoto> getMonitoreosRemotosRegistrados() {
        return monitoreosRemotosRegistrados;
    }

    public void setMonitoreosRemotosRegistrados(LinkedList<MonitoreoRemoto> monitoreosRemotosRegistrados) {
        this.monitoreosRemotosRegistrados = monitoreosRemotosRegistrados;
    }

    public LinkedList<Equipo> getEquiposRegistrados() {
        return equiposRegistrados;
    }

    public void setEquiposRegistrados(LinkedList<Equipo> equiposRegistrados) {
        this.equiposRegistrados = equiposRegistrados;
    }

    public Vigilante getVigilante(String identificacion) {
        for (Vigilante vigilante : vigilantesRegistrados) {
            if (vigilante.getDocumento().equals(identificacion)) {
                return vigilante;
            }
        }
        return null;
    }

    public Supervisor getSupervisor(String identificacion) {
        for (Supervisor supervisor : supervisoresRegistrados) {
            if (supervisor.getDocumento().equals(identificacion)) {
                return supervisor;
            }
        }
        return null;
    }

    public OperadorDeMonitoreo getOperadorDeMonitoreo(String identificacion) {
        for (OperadorDeMonitoreo operador : operadoresDeMonitoreoRegistrados) {
            if (operador.getDocumento().equals(identificacion)) {
                return operador;
            }
        }
        return null;
    }

    public CustodiaFija getCustodiaFija(String codigo) {
        for (CustodiaFija custodiaFija : custodiasFijasRegistrados) {
            if (custodiaFija.getCodigoDeContrato().equals(codigo)) {
                return custodiaFija;
            }
        }
        return null;
    }

    public PatrullajeMovil getPatrullajeMovil(String codigo) {
        for (PatrullajeMovil patrullaje : patrullajesMovilesRegistrados) {
            if (patrullaje.getCodigoDeContrato().equals(codigo)) {
                return patrullaje;
            }
        }
        return null;
    }

    public MonitoreoRemoto getMonitoreoRemoto(String codigo) {
        for (MonitoreoRemoto monitoreo : monitoreosRemotosRegistrados) {
            if (monitoreo.getCodigoDeContrato().equals(codigo)) {
                return monitoreo;
            }
        }
        return null;
    }

    public Equipo getEquipo(String codigo) {
        for (Equipo equipo : equiposRegistrados) {
            if (equipo.getCodigo().equals(codigo)) {
                return equipo;
            }
        }
        return null;
    }

    public void setVigilante(Vigilante vigilante) {
        for (Vigilante vigilante1 : vigilantesRegistrados) {

        }
    }
}
