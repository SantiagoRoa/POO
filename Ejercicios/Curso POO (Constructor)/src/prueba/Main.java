package prueba;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args){
        // Método define 2 parametros en el constructor
        String name = JOptionPane.showInputDialog("Ingrese su nombre");
        int age = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad"));
        Persona p1 = new Persona(name,age);
        p1.mostrarDatos();
    }
}
