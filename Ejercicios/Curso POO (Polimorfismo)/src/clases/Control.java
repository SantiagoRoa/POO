/*
 * Universidad Distrital Francisco José De Caldas
 * Nelson Santiago Roa Garzón
 * Código: 20172020099
 * 28/04/2019 02:01:04 PM
 */

package clases;

public class Control {

    public static void main(String[] args) {
        Vehiculo misVehiculos[] = new Vehiculo[4];
        misVehiculos[0] = new Vehiculo("BNH375","Mazda","Allegro");
        misVehiculos[1] = new VehiculoTurismo(3,"FNT313","Lada","Zamara");
        misVehiculos[2] = new VehiculoDeportivo(2300,"SPS535","Audi","R8");
        misVehiculos[3] = new VehiculoCamioneta(1500,"CMD710","Chevrolet","Zafira");
        for(Vehiculo vehiculos: misVehiculos){
            System.out.println(vehiculos.mostrarDatos());
        }
    }

}