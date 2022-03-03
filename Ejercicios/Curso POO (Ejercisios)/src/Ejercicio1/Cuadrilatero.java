/**
 * 25/04/2019 06:27:48 PM
 * Autor: Santiago Roa
 */

package Ejercicio1;

public class Cuadrilatero {
    private float lado1;
    private float lado2;

    public Cuadrilatero(float lado1, float lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public Cuadrilatero(float lado1) {
        this.lado1 = this.lado2 = lado1;
    }
    
    public float getArea(float lado1, float lado2){
        float area = lado1 * lado2;
        return area;
    }
    
    public float getPerimetro(float lado1, float lado2){
        float perimetro = 2 * (lado1 + lado2);
        return perimetro;
    }
}
