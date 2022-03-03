package Controlador;

public class Parque {

    private String id;
    private String nombre;
    private String fecha;
    private int numRes;
    private double extension;
    private double altura;
    private double temperatura;
    private boolean estado;
    private boolean hospedaje;
    private String ubicacion;
    private int numCabanas;
    private int aforo;
    private int vacantes;

    private Personal personal[];
    private Visitante visitantes[];
    private Cabana cabana[];

    public Parque() {
        this.id = "0";
    }

    public Parque(String nombre, String fecha, int numRes, double extension, double altura, double temperatura, boolean estado, boolean hospedaje, String ubicacion, int numCabanas, int aforo, int vacantes) {
        this.id = nombre+fecha+numRes;
        this.nombre = nombre;
        this.fecha = fecha;
        this.numRes = numRes;
        this.extension = extension;
        this.altura = altura;
        this.temperatura = temperatura;
        this.estado = estado;
        this.hospedaje = hospedaje;
        this.ubicacion = ubicacion;
        this.numCabanas = numCabanas;
        this.aforo = aforo;
        this.vacantes = vacantes;

        crearCabanas(numCabanas);
        crearPersonal(vacantes);
        crearVisitantes(aforo);
    }

    public void crearCabanas(int numCabanas) { // Crea un arreglo de cabanas
        numCabanas = this.numCabanas;
        this.cabana = new Cabana[numCabanas];
        for (int i = 0; i < numCabanas; i++) {
            cabana[i] = new Cabana();
        }
    }

    public void crearPersonal(int vacantes) {
        vacantes = this.vacantes;
        this.personal = new Personal[vacantes];
        for (int i = 0; i < vacantes; i++) {
            this.personal[i] = new Personal();
        }
    }

    public void crearVisitantes(int aforo) {
        aforo = this.aforo;
        this.visitantes = new Visitante[aforo];
        for (int i = 0; i < aforo; i++) {
            this.visitantes[i] = new Visitante();
        }
    }

    public void adicionarPersonal(String tipoId, String id, String tipo, String nombre, String direccion, String telefono, double sueldo) {

        for (int i = 0; i < this.vacantes; i++) {
            if ("0".equals(this.personal[i].getId())) {
                this.personal[i] = new Personal(tipoId, id, tipo, nombre, direccion, telefono, sueldo);
            }
        }
    }

    public void adicionarVisitantes(String tipoId, String id, String tipo, int edad) {

        for (int i = 0; i < this.aforo; i++) {
            if ("0".equals(this.visitantes[i].getId())) {
                this.visitantes[i] = new Visitante(tipoId, id, tipo, edad);
            }
        }
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getNumRes() {
        return numRes;
    }

    public void setNumRes(int numRes) {
        this.numRes = numRes;
    }

    public double getExtension() {
        return extension;
    }

    public void setExtension(double extension) {
        this.extension = extension;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public boolean isHospedaje() {
        return hospedaje;
    }

    public void setHospedaje(boolean hospedaje) {
        this.hospedaje = hospedaje;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getNumCabanas() {
        return numCabanas;
    }

    public int getAforo() {
        return aforo;
    }

    public int getVacantes() {
        return vacantes;
    }

    public Personal[] getPersonal() {
        return personal;
    }

    public Visitante[] getVisitantes() {
        return visitantes;
    }

    public Cabana[] getCabana() {
        return cabana;
    }

}
