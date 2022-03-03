/**
 * 28/04/2019 02:01:16 PM
 * Autor: Santiago Roa
 */
package clases;

public class Vehiculo {

    protected String placa;
    protected String marca;
    protected String modelo;

    public Vehiculo(String placa, String marca, String modelo) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String mostrarDatos() {
        return "\n La marca es: "+marca+"\n La placa es: "+placa+"\n El modelo es: "+modelo;
    }
}
