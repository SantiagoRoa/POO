/**
 * 28/04/2019 02:31:50 PM
 * Autor: Santiago Roa
 */
package Ejercicio3;

public class Rectangulo extends Poligono {

    private double lado1;
    private double lado2;

    public Rectangulo(double lado1, double lado2) {
        super(2);
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    @Override
    public double area() {
        double area = lado1 * lado2;
        return area;
    }

    @Override
    public String toString() {
        String mostrar = "Rectangulo\nLado 1: " + lado1 + "\nLado 2: " + lado2;
        return mostrar;
    }
}
