package co.edu.itm.software_architecture.reto;

class Revista implements Item {
    private String titulo;

    public Revista(String title) {
        this.titulo = title;
    }

    @Override
    public void prestamo() {
        System.out.println("Revista '" + titulo + "'  borrowed.");
    }

    @Override
    public void devolucion() {
        System.out.println("Revista '" + titulo + "' ha sido devuelto.");
    }

    @Override
    public void reserva() {
        throw new UnsupportedOperationException("Revistas no puede ser reservada.");
    }

    @Override
    public void renovacion() {
        throw new UnsupportedOperationException("Revistas no puede ser renovada.");
    }

    @Override
    public void adicionarAColeccion() {
        System.out.println("Revista '" + titulo + "' ha sido añadida a coleccion.");
    }

    @Override
    public void eliminarDeColeccion() {
        System.out.println("Revista '" + titulo + "' ha sido eliminado de coleccion.");
    }
}