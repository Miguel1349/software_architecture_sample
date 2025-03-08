package co.edu.itm.software_architecture.reto;

class AdministradorLibreria {
    private Item item;

    public AdministradorLibreria(Item item) {
        this.item = item;
    }

    public void administrarItem() {
        item.prestamo();
        item.devolucion();
        item.reserva();
        item.renovacion();
        item.adicionarAColeccion();
        item.eliminarDeColeccion();
    }
}