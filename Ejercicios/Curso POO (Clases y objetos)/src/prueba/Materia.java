
package prueba;

// Clases
public class Materia {
    
    // Atributos
    int codigo;
    String nombre;
    int creditos;
    
    //Método
    public static void main(String[] args){
        
        //Objeto (tiene los atributos de la clase donde se crea)
        Materia calculo = new Materia();
        
        Materia programacion = new Materia();
        
        //Se instancia el objeto (se definen los atributos del objeto)
        calculo.codigo = 1;
        calculo.nombre = "Cálculo integral";
        calculo.creditos = 3;
        
        programacion.codigo = 2;
        programacion.creditos = 3;
        programacion.nombre = "Programación orientada a objetos";
        
        System.out.println("La materia "+calculo.nombre+" con código "+calculo.codigo+" tiene "+calculo.creditos+" créditos.");
        System.out.println("La materia "+programacion.nombre+" con código "+programacion.codigo+" tiene "+programacion.creditos+" créditos.");
    }
    
}
