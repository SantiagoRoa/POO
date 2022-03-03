package Controlador;

import Vista.Home;

public class Control {

    public static void llenarDatos() {
        CAR car1 = new CAR("Corporinoquía", "Orinoquía", 3);

        //Nombre fecha resolucion extension altura temperatura estado hospedaje ubicacion numcabanas aforo vacantes
        car1.adicionarParque("Parque Nacional Natural Sierra de la Macarena", "24/11/1948", 52, 6200, 1600, 18.5, true, false, "Orinoquía", 0, 500, 50);
        car1.adicionarParque("Parque Nacional Natural el Tuparro", "05/08/1982", 27, 5480, 215, 27, true, true, "Orinoquía", 20, 250, 30);
        car1.adicionarParque("Parque Nacional Natural Chingaza", "24/06/1968", 65, 766, 2410, 12.5, true, false, "Orinoquía", 0, 1000, 0);
    }

    public static void main(String[] args) {

        Home view = new Home();
        view.setVisible(true);
        view.setLocationRelativeTo(null);
    }

}
