/*
 * Universidad Distrital Francisco José De Caldas
 * Nelson Santiago Roa Garzón
 * Código: 20172020099
 * 24/04/2019 10:43:38 PM
 */
package prueba;

/**
 * 24/04/2019 10:43:38 PM Autor: Santiago Roa
 */
public class Persona {
    public static Persona persona = new Persona();
    /*
    Elementos se encapsulan para evitar que otras clases puedan acceder a ellos
    -private: los elementos pueden ser vistos unicamente por la clase que los 
    contiene
    -protected: los elementos pueden ser vistos por la clase que los contiene 
    y por las clases heredadas de esta
    -sin identificador: los elementos pueden ser vistos por la clase que los 
    contiene y las demas clases que comparten paquete con esta
     */
    private int edad;
    private String nombre;

    //Método get sirve para obtener el valor del atributo desde cualquier clase
    public int getEdad() {
        return edad;
    }

    //Método set que sirve para modificar el atributo desde cualquier clase
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
