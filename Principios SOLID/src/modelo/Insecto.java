/**
 * 25/08/2019 05:45:04 PM
 * Autor: Santiago Roa
 */
package modelo;

public abstract class Insecto extends Animal implements Alas {

    public Insecto(){
        super();
    }

    @Override
    public void reproducirse() {
        System.out.println("Pone huevos.");
    }

}
