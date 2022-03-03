/**
 * 28/04/2019 02:31:19 PM
 * Autor: Santiago Roa
 */
package Ejercicio3;

public class Triangulo extends Poligono {

    private double lado1;
    private double lado2;
    private double lado3;

    public Triangulo(double lado1, double lado2, double lado3) {
        super(3);
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    @Override
    public double area() {
        double semi = (lado1 + lado2 + lado3) / 2;
        double area = Math.sqrt(semi * (semi - lado1) * (semi - lado2) * (semi - lado3));
        return area;
    }

    @Override
    public String toString() {
        String mostrar = "Triangulo\nLado 1: " + lado1 + "\nLado 2: " + lado2 + "\nLado 3: " + lado3;
        return mostrar;
    }
}
