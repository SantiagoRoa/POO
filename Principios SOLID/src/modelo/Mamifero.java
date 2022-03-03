/**
 * 25/08/2019 05:44:48 PM
 * Autor: Santiago Roa
 */
package modelo;

public abstract class Mamifero extends Animal implements Cola{

    public Mamifero(){
        super();
        
    }

    @Override
    public void reproducirse() {
        System.out.println("Se embaraza de una cría.");
    }
}
