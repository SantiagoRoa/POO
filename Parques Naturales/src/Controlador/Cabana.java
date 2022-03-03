package Controlador;

public class Cabana {
    private String id;
    private String zona;
    private boolean estado;
    private int capacidad;

    public Cabana(){
        this.id = "0";
    }
    
    public Cabana(String id, String zona, boolean estado, int capacidad) {
        this.id = id;
        this.zona = zona;
        this.estado = estado;
        this.capacidad = capacidad;
    }  

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
}
