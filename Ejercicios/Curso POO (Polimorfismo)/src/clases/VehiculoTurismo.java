/**
 * 28/04/2019 02:01:28 PM
 * Autor: Santiago Roa
 */
package clases;

public class VehiculoTurismo extends Vehiculo {

    private int numeroPuertas;

    public VehiculoTurismo(int numeroPuertas, String placa, String marca, String modelo) {
        super(placa, marca, modelo);
        this.numeroPuertas = numeroPuertas;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    @Override
    public String mostrarDatos() {
        return "\n La marca es: " + marca + "\n La placa es: " + placa + "\n El modelo es: " + modelo
                + "\n El número de puertas es: " + numeroPuertas;
    }
}
