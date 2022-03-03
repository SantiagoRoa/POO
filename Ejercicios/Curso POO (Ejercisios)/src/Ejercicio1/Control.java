package Ejercicio1;

import javax.swing.JOptionPane;

/*
 * Universidad Distrital Francisco José De Caldas
 * Nelson Santiago Roa Garzón
 * Código: 20172020099
 * 25/04/2019 06:27:12 PM
 */
public class Control {

    public static void main(String[] args) {

        Cuadrilatero figura = null;

        Float lado1, lado2;

        lado1 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el lado 1"));
        lado2 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el lado 2"));

        if (lado1 == lado2) {
            figura = new Cuadrilatero(lado1);            
        } else {
            figura = new Cuadrilatero(lado1, lado2);
        }
        JOptionPane.showMessageDialog(null, "El area del cuadrilatero es " + figura.getArea(lado1, lado2)
                    + " y su perimetro es " + figura.getPerimetro(lado1, lado2));
    }

}
