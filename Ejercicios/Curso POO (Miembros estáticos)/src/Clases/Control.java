/*
 * Universidad Distrital Francisco José De Caldas
 * Nelson Santiago Roa Garzón
 * Código: 20172020099
 * 25/04/2019 06:18:15 PM
 */

package Clases;

public class Control {
    
    private static String nombre = "Santiago";
    public static int Sumar(int a, int b){
        int suma = a + b;
        return suma;
    }
    
    public static void main(String[] args) {
        
        System.out.println("La suma es: "+Control.Sumar(2, 3));
        System.out.println("Su nombre es: "+Control.nombre);
    }

}