package Entidades;


public class Cliente {
    String nombre;
    int DNI;
    double montopago;

    public Cliente(String nombre, int DNI, double montoapagar) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.montopago = montoapagar;
    }
    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDNI() {
        return DNI;
    }
    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public double getMontoapagar() {
        return montopago;
    }
    public void setMontoapagar(double montoapagar) {
        this.montopago = montoapagar;
    }
}
