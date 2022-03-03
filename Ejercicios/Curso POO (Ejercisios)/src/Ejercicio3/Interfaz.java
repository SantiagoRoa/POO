/**
 * 28/04/2019 03:15:27 PM
 * Autor: Santiago Roa
 */
package Ejercicio3;

import java.util.ArrayList;
import javax.swing.*;

public class Interfaz {

    //Se crea un arreglo dinámico de poligonos que almacenara triangulos y rectangulos
    public static ArrayList<Poligono> poligono = new ArrayList<Poligono>();

    public void llenarTriangulo() {
        double lado1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la medida del lado 1"));
        double lado2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la medida del lado 2"));
        double lado3 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la medida del lado 3"));
        Triangulo triangulo = new Triangulo(lado1, lado2, lado3);
        //Se crea un objeto y se almacena en el arreglo de poligonos
        poligono.add(triangulo);
        JOptionPane.showMessageDialog(null, "Se ha llenado un triangulo \nLado 1: " + lado1
                + "\nLado 2: " + lado2 + "\nLado 3: " + lado3);
    }

    public void llenarRectangulo() {
        double lado1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la medida del lado 1"));
        double lado2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la medida del lado 2"));
        Rectangulo rectangulo = new Rectangulo(lado1, lado2);
        poligono.add(rectangulo);
        JOptionPane.showMessageDialog(null, "Se ha llenado un rectangulo \nLado 1: " + lado1
                + "\nLado 2: " + lado2);
    }

    public void preguntar() {
        String[] opciones = {"Rectangulo", "Triangulo"};
        boolean opcion = true;
        do {
            String seleccion = (String) JOptionPane.showInputDialog(null, "Seleccione un poligono para agregar",
                    "Poligono", JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);

            switch (seleccion) {
                case ("Triangulo"): {
                    llenarTriangulo();
                    break;
                }
                case ("Rectangulo"): {
                    llenarRectangulo();
                    break;
                }
            }
            int agregar = JOptionPane.showConfirmDialog(null, "¿Desea agregar otro poligono?", " ", JOptionPane.YES_NO_OPTION);
            if (agregar == JOptionPane.YES_OPTION) {
                opcion = true;
            } else if (agregar == JOptionPane.NO_OPTION) {
                opcion = false;
            }
        } while (opcion == true);
    }

    public void mostrarDatos() {
        for (Poligono poligonos : poligono) {
            JOptionPane.showMessageDialog(null, poligonos.toString() + "\nEl área es: " + poligonos.area());
        }
    }

    public void ejecutar() {
        preguntar();
        mostrarDatos();
    }
}
