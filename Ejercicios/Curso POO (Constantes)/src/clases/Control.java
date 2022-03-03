/*
 * Universidad Distrital Francisco José De Caldas
 * Nelson Santiago Roa Garzón
 * Código: 20172020099
 * 25/04/2019 05:52:42 PM
 */

package clases;

public class Control {

    public static void main(String[] args) {
        Persona persona1 = new Persona("Santiago", 21);
        System.out.print("Su nombre es "+persona1.nombre+" y su edad es "+persona1.getEdad());
    }

}