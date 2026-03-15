import java.util.*;

/**
 * Gestiona una colección eficiente de ítems.
 */
public class CarritoDeCompras {
    // Usamos Map para escalabilidad (búsqueda O(1) por nombre)
    private Map<String, Item> items = new HashMap<>();
    
    private static final String SIMBOLO_MONEDA = "€";

    public void agregarItem(Item item) {
        // Lógica para incrementar cantidad si ya existe
    }

    public void removerItem(String nombre) throws NoSuchElementException {
        if (!items.containsKey(nombre)) {
            throw new NoSuchElementException("El ítem no existe en el carrito.");
        }
        items.remove(nombre);
    }

    public double calcularTotal() {
        return items.values().stream()
                .mapToDouble(i -> i.getPrecio() * i.getCantidad())
                .sum();
    }

    public void imprimirDetalle() {
        System.out.println("--- Detalles del Carrito ---");
        items.values().forEach(System.out::println);
        System.out.println("Total: " + calcularTotal() + SIMBOLO_MONEDA);
    }
}