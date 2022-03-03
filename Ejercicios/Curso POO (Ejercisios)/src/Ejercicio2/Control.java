/*
 * Universidad Distrital Francisco José De Caldas
 * Nelson Santiago Roa Garzón
 * Código: 20172020099
 * 26/04/2019 07:30:06 PM
 */

package Ejercicio2;

import javax.swing.JOptionPane;


public class Control {
    //Metodo estatico obtiene el entero de la posicion del vehiculo mas barato
    public static int masBarato(Vehiculo carro[]){
        int posicionBarato = 0;
        Float precioMasBarato = carro[0].getPrecio();
        // Ciclo establece cual es el carro mas barato comparandolo con el siguiente
        for(int i = 1; i < carro.length; i++){
            if (carro[i].getPrecio() > precioMasBarato){
                precioMasBarato = carro[i].getPrecio();
                posicionBarato = i;
            }
        }
        return posicionBarato;
    }
    
    public static void main(String[] args) {
        String marca, modelo;
        Float precio;
        int carroMasBarato;
        int numVehiculos;
        numVehiculos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de vehículos necesarios")); 
        //Crea arreglo de vehículos
        Vehiculo carro[] = new Vehiculo[numVehiculos];
        //Ciclo rellena los atributos de cada objetos
        for (int i = 0; i < carro.length; i++){
            JOptionPane.showMessageDialog(null,"Introduzca las caracteristicas del vehículo "+(i+1));
            marca = (String) JOptionPane.showInputDialog("Introduzca la marca del vehiculo");
            modelo = (String) JOptionPane.showInputDialog("Introduzca el modelo del vehiculo");
            precio = Float.parseFloat(JOptionPane.showInputDialog("Introduzca el precio del vehiculo"));
            carro[i] = new Vehiculo(marca, modelo, precio);
        }
        carroMasBarato = masBarato(carro);
        JOptionPane.showMessageDialog(null, "El carro mas barato es el "+carro[carroMasBarato].mostrarDatos());
    }

}
