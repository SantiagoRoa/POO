/**
 * 26/04/2019 11:02:01 PM
 * Autor: Santiago Roa
 */
package Clases;

import javax.swing.JOptionPane;

public class Estudiante extends Persona {

    private int codigoEstudiante;
    private float notaFinal;
    
    // Constructor clase heredada
    public Estudiante(String nombre,String apellido, int edad, int codigoEstudiante, float notaFinal){
        super(nombre, apellido, edad);
        this.codigoEstudiante = codigoEstudiante;
        this.notaFinal = notaFinal;
    }
    
    public void mostrarDatos() {
        JOptionPane.showMessageDialog(null, "Su nombre es "+getNombre()+" "+getApellido()+", su edad es "+getEdad()+
                ", su codigo es "+codigoEstudiante+" y su nota final es "+notaFinal);
    }
}
