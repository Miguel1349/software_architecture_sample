package co.edu.itm.software_architecture.isp.codesmell;

public interface Empleado {

    public  void cocinar();

    public  void servir();

    public void tomarOrden();

    public void entregarOrden();

    public void  uniformarse(String delantal, String pantalon, String camisa, String gorro, String corbata);

    public void empezarTurno();

    public void tomarDescanso();

    public void finalizarTurno();

}
