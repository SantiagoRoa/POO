package Controlador;

public class CAR {

    private String rombre;
    private String region;
    private int numParques;

    private Parque parque[];

    public CAR(String rombre, String region, int numParques) {
        this.rombre = rombre;
        this.region = region;
        this.numParques = numParques;
        if (numParques > 0) {
            crearParques(numParques);
        }
    }

    public void crearParques(int numParques) { // Crea un arreglo de cabanas
        this.parque = new Parque[numParques];
        for (int i = 0; i < numParques; i++) {
            this.parque[i] = new Parque();
        }
    }

    public void adicionarParque(String nombre, String fecha, int numRes, double extension, double altura, double temperatura, boolean estado, boolean hospedaje, String ubicacion, int numCabanas, int aforo, int vacantes) {
        for (int i = 0; i < this.numParques; i++) {
            if(this.parque[i].getId()=="0"){
                this.parque[i] = new Parque(nombre, fecha, numRes, extension, altura, temperatura, estado, hospedaje, ubicacion, numCabanas, aforo, vacantes);
            }
        }
    }

    public String getRombre() {
        return rombre;
    }

    public void setRombre(String rombre) {
        this.rombre = rombre;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public int getNumParques() {
        return numParques;
    }

    public Parque[] getParque() {
        return parque;
    }
    
    

}
