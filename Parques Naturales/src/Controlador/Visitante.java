package Controlador;

public class Visitante extends Persona {

    private int edad;

    public Visitante() {
        super.id = "0";
    }

    public Visitante(String tipoId, String id, String tipo, int edad) {
        super(tipoId, id, tipo);
        this.edad = edad;
    }
    
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setTipoId(String tipoId) {
        this.tipoId = tipoId;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

}
