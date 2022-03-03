/**
 * 28/04/2019 02:01:38 PM
 * Autor: Santiago Roa
 */
package clases;

public class VehiculoDeportivo extends Vehiculo {

    private int cilindrada;

    public VehiculoDeportivo(int cilindrada, String placa, String marca, String modelo) {
        super(placa, marca, modelo);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    @Override
    public String mostrarDatos() {
        return "\n La marca es: " + marca + "\n La placa es: " + placa + "\n El modelo es: " + modelo
                + "\n El cilindraje es: " + cilindrada;
    }
}
