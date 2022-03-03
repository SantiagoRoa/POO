package Controlador;

public abstract class Persona {

    protected String tipoId;
    protected String id;
    protected String tipo;

    public Persona() {
    }

    public Persona(String tipoId, String id, String tipo) {
        this.tipoId = tipoId;
        this.id = id;
        this.tipo = tipo;
    }

    public String getTipoId() {
        return tipoId;
    }

    public String getId() {
        return id;
    }

    public String getTipo() {
        return tipo;
    }

}
