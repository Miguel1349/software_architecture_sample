package co.edu.itm.software_architecture.reto;

public class Main {
    public static void main(String[] args) {
        Item libro = new Libro("1984");
        Item revista = new Revista("National Geographic");

        AdministradorLibreria administradorLibro = new AdministradorLibreria(libro);
        AdministradorLibreria administradorRevista = new AdministradorLibreria(revista);

        System.out.println("Libro: :");
        administradorLibro.administrarItem();

        System.out.println("\nRevista: :");
        administradorRevista.administrarItem(); // Lanzará excepciones en reserve() y renew()
    }
}