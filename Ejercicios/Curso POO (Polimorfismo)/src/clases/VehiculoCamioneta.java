/**
 * 28/04/2019 02:01:46 PM
 * Autor: Santiago Roa
 */
package clases;

public class VehiculoCamioneta extends Vehiculo {

    private int carga;

    public VehiculoCamioneta(int carga, String placa, String marca, String modelo) {
        super(placa, marca, modelo);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    @Override
    public String mostrarDatos() {
        return "\n La marca es: " + marca + "\n La placa es: " + placa + "\n El modelo es: " + modelo
                + "\n La carga es: " + carga;
    }
}
