/**
 * 25/08/2019 06:06:31 PM
 * Autor: Santiago Roa
 */
package modelo;

public class Gato extends Mamifero {

    public Gato(String especie, String habitat){
        super();
        super.especie = especie;
        super.habitat = habitat;
    }

    @Override
    public void comer() {
        System.out.println("Come carne principalmente.");
    }

    @Override
    public void caminar() {
        System.out.println("Tiene 4 patas para caminar.");
    }

    @Override
    public void defenderse() {
        System.out.println("Se defiende con sus garras.");
    }

    @Override
    public void moverCola() {
        System.out.println("Tiene cola para mantener el equilibrio.");
    }
}
