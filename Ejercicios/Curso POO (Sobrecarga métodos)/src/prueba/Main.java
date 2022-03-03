package prueba;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String args[]){
        String name = JOptionPane.showInputDialog("Ingrese su nombre");
        int age = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad"));
        int id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cédula"));
        Persona p1 = new Persona(name, age);
        Persona _p1 = new Persona(id);
        p1.correr();
        _p1.displayId(id);
    }
}
