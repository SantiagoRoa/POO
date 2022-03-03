package prueba;

import javax.swing.JOptionPane;

public class Persona {
    String nombre;
    int edad;
    int cédula;
    
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public Persona(int cédula) {
        this.cédula = cédula;
    }
    
    public void correr(){
        JOptionPane.showMessageDialog(null, "Soy "+nombre+" tengo "+edad+" años y estoy corriendo.");        
    }
    
    public void correr(int distancia){
        JOptionPane.showMessageDialog(null, "He corrido "+distancia+" Km.");
    }
    
    public void displayId(int cedula){
        JOptionPane.showMessageDialog(null, "Mi cédula es: "+cedula);
    }
}
