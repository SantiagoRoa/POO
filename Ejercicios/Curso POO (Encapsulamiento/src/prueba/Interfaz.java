/*
 * Universidad Distrital Francisco José De Caldas
 * Nelson Santiago Roa Garzón
 * Código: 20172020099
 * 24/04/2019 10:43:48 PM
 */
package prueba;

import javax.swing.JOptionPane;

/**
 * 24/04/2019 10:43:48 PM Autor: Santiago Roa
 */
public class Interfaz {

    public void preguntarNombre() {
        Persona.persona.setNombre(JOptionPane.showInputDialog("Ingrese el nombre"));
    }

    public void preguntarEdad() {
        Persona.persona.setEdad(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad")));
    }

    public void mostrarRespuesta() {
        JOptionPane.showMessageDialog(null, "Su nombre es " + Persona.persona.getNombre() + " y su edad es " + Persona.persona.getEdad());
    }

    public void ejecutar() {
        preguntarNombre();
        preguntarEdad();
        mostrarRespuesta();
    }

}
