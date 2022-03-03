/*
 * Universidad Distrital Francisco José De Caldas
 * Nelson Santiago Roa Garzón
 * Código: 20172020099
 * 25/08/2019 05:41:05 PM
 */
package controlador;

import java.util.Scanner;
import modelo.Abeja;
import modelo.Gato;
import modelo.Insecto;
import modelo.Mamifero;

public class Control {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Seleccione la opción deseada para ver sus características:");
        System.out.println("1. Gato\n2. Abeja\n");
        int s = in.nextInt();
        if (s == 1) {
            Mamifero a = new Gato("Felis Catus", "Domestico");
            System.out.println("\nGato:\n" + a.getEspecie() + "\n" + a.getHabitat());
            a.caminar();
            a.comer();
            a.reproducirse();
            a.moverCola();
        } else if (s == 2) {
            Insecto a = new Abeja("Apis Melifera", "Salvaje");
            System.out.println("\nAbeja:\n" + a.getEspecie() + "\n" + a.getHabitat());
            a.caminar();
            a.comer();
            a.reproducirse();
            a.volar();
        } else {
            System.out.println("Ingresó una opción incorrecta.");
        }

    }
}
