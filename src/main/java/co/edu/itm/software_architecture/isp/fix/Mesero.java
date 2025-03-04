package co.edu.itm.software_architecture.isp.fix;

public class Mesero implements IMesero {

    @Override
    public void tomarOrden() {
        System.out.println("Tomando orden...");
    }

    @Override
    public void entregarOrden() {
        System.out.println("Entregando orden...");
    }

    public void uniformarse(String pantalon, String camisa, String gorro, String corbata) {
        System.out.printf("Vistiendo %s...", pantalon );
        System.out.printf("Vistiendo %s...", camisa );
        System.out.printf("Vistiendo %s...", gorro );
        System.out.printf("Vistiendo %s...", corbata );
    }

    @Override
    public void empezarTurno() {
        System.out.println("Empezando turno Mesero...");
    }

    @Override
    public void tomarDescanso() {
        System.out.println("Tomando descanso Mesero...");
    }

    @Override
    public void finalizarTurno() {
        System.out.println("Finalizando turno Mesero...");
    }
}
