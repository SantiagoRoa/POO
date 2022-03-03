/**
 * 25/04/2019 03:03:04 PM
 * Autor: Santiago Roa
 */
package clases;

public class Persona {

    public final String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
}
