package prueba;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args){
        Calculadora calculo = new Calculadora();
        //Se declaran variables que serían las notas que se piden
        double n1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota"));
        double n2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota"));
        double n3 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota"));
        //Las variables obtenidas se envían como argumentos a los parametros del método promediar
        JOptionPane.showMessageDialog(null, "El promedio es: "+calculo.promediar(n1, n2, n3));
    }
}
