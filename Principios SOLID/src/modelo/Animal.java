/**
 * 25/08/2019 05:42:07 PM
 * Autor: Santiago Roa
 */
package modelo;

public  abstract class Animal implements Patas, Defensas {

    protected String especie;
    protected String habitat;

    public Animal(){
    }

    public abstract void comer();

    public abstract void reproducirse();

    public String getEspecie() {
        return especie;
    }

    public String getHabitat() {
        return habitat;
    }

}
