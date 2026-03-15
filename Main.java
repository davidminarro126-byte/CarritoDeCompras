/**
 * Clase principal que ejecuta la lógica de negocio del carrito.
 */
public class Main {
    public static void main(String[] args) {
        CarritoDeCompras carrito = new CarritoDeCompras();

        try {
            // Creamos ítems
            Item item1 = new Item("Camiseta", 20.99, 1);
            Item item2 = new Item("Pantalones", 34.99, 2);

            // Agregamos ítems al carrito
            carrito.agregarItem(item1);
            carrito.agregarItem(item2);

            // Imprimimos detalles
            carrito.imprimirDetalle();

            // Ejemplo de manejo de excepciones al intentar eliminar un ítem inexistente
            carrito.removerItem("Calcetines");

        } catch (IllegalArgumentException e) {
            System.err.println("Error en el precio: " + e.getMessage());
        } catch (java.util.NoSuchElementException e) {
            System.err.println("Error de inventario: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Ocurrió un error inesperado: " + e.getMessage());
        }
    }
}