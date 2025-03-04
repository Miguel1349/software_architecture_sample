package co.edu.itm.software_architecture.isp.fix;

public class Chef implements IChef {
    @Override
    public void cocinar() {
        System.out.println("Cocinando...");
    }

    @Override
    public void servir() {
        System.out.println("Sirviendo plato...");
    }

    public void uniformarse(String delantal, String pantalon, String camisa, String gorro) {
        System.out.printf("Vistiendo %s...", pantalon );
        System.out.printf("Vistiendo %s...", camisa );
        System.out.printf("Vistiendo %s...", delantal );
        System.out.printf("Vistiendo %s...", gorro );
    }

    @Override
    public void empezarTurno() {
        System.out.println("Empezando turno Chef...");
    }

    @Override
    public void tomarDescanso() {
        System.out.println("Tomando descanso Chef...");
    }

    @Override
    public void finalizarTurno() {
        System.out.println("Finalizando turno Chef...");
    }
}
