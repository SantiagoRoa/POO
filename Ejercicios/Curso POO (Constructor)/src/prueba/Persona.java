
package prueba;

import javax.swing.JOptionPane;

public class Persona {
    //Atributos
    String nombre;
    int edad;
    //Método constructor (es lo primero que se hace)
    //This.parametro
    public Persona(String nombre, int edad){
       this.nombre = nombre;
       this.edad = edad;
    }
    public void mostrarDatos(){
        JOptionPane.showMessageDialog(null, "El nombre es: "+nombre+"\n La edad es: "+edad);
    }
}
