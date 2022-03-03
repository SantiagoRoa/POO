/**
 * 28/04/2019 01:43:41 PM
 * Autor: Santiago Roa
 */
package Clases;

public class Control {

    public static void main(String args[]) {
        AnimalHervivoro hervivoro = new AnimalHervivoro();
        AnimalCarnivoro carnivoro = new AnimalCarnivoro();
        Planta planta = new Planta();

        hervivoro.alimentarse();
        carnivoro.alimentarse();
        planta.alimentarse();
    }

}
