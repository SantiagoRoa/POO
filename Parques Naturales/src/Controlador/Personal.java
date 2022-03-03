package Controlador;

public class Personal extends Persona {

    private String nombre;
    private String direccion;
    private String telefono;
    private double sueldo;

    public Personal() {
        super.id = "0";
    }

    public Personal(String tipoId, String id, String tipo, String nombre, String direccion, String telefono, double sueldo) {
        super(tipoId, id, tipo);
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.sueldo = sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
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
