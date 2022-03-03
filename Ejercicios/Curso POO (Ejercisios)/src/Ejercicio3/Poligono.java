/**
 * 28/04/2019 02:31:07 PM
 * Autor: Santiago Roa
 */
package Ejercicio3;

public abstract class Poligono {

    protected int numeroLados;

    public Poligono(int numeroLados) {
        this.numeroLados = numeroLados;
    }

    public int getNumeroLados() {
        return numeroLados;
    }

    public abstract double area();
    
    public String toString() {
        String mostrar = "El poligono tiene " + numeroLados + " lados";
        return mostrar;
    }
}
