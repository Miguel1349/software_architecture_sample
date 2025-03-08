package co.edu.itm.software_architecture;

import co.edu.itm.software_architecture.controller.fix.LoginUI;
import co.edu.itm.software_architecture.isp.codesmell.Chef;
import co.edu.itm.software_architecture.isp.codesmell.Empleado;
import co.edu.itm.software_architecture.isp.codesmell.Mesero;

public class Main {
    public static void main(String[] args) {
       //============ Violentando ISP ============"
      /*  Empleado mesero = new Mesero();
        mesero.empezarTurno();
        mesero.uniformarse(
                null,
                "Pantalón de mesero",
                "Camisa de mesero",
                "Gorro de mesero",
                "Corbata"
        );
        mesero.tomarOrden();
        mesero.entregarOrden();
        mesero.tomarDescanso();
        mesero.finalizarTurno();

        Empleado chef = new Chef();
        chef.empezarTurno();
        chef.uniformarse(
                "Delantal",
                "Pantalón de chef",
                "Camisa de chef",
                "Gorro de chef",
                null
        );
        chef.cocinar();
        chef.servir();
        chef.tomarDescanso();
        chef.finalizarTurno();
        //============ Violentando ISP ============

        //============ ISP Refactorizado ============
        co.edu.itm.software_architecture.isp.fix.Mesero meseroFixed =
                new co.edu.itm.software_architecture.isp.fix.Mesero();
        meseroFixed.empezarTurno();
        meseroFixed.uniformarse(
                "Pantalón de mesero",
                "Camisa de mesero",
                "Gorro de mesero",
                "Corbata"
        );
        meseroFixed.tomarOrden();
        meseroFixed.entregarOrden();
        meseroFixed.tomarDescanso();
        meseroFixed.finalizarTurno();

        co.edu.itm.software_architecture.isp.fix.Chef chefFixed =
                new co.edu.itm.software_architecture.isp.fix.Chef();
        chefFixed.empezarTurno();
        chefFixed.uniformarse(
                "Delantal",
                "Pantalón de chef",
                "Camisa de chef",
                "Gorro de chef"
        );
        chefFixed.cocinar();
        chefFixed.servir();
        chefFixed.tomarDescanso();
        chefFixed.finalizarTurno();
        //============ ISP Refactorizado ============"

        // ============= Controller CodeSmell =============
        LoginUI loginUI = new LoginUI();
        loginUI.render();
        // ============= Controller CodeSmell =============

        LoginUI loginUI = new LoginUI();
        loginUI.render();*/

        LoginUI loginUI = new LoginUI();
        loginUI.render();
    }
}
