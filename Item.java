/**
 * Representa un producto en el carrito.
 */
public class Item {
    private String nombre;
    private double precio;
    private int cantidad;

    public static final double PRECIO_MINIMO = 0.0;
    public static final double PRECIO_MAXIMO = 10000.0;

    public Item(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        setPrecio(precio);
        this.cantidad = cantidad;
    }

    public void setPrecio(double precio) {
        if (precio < PRECIO_MINIMO || precio > PRECIO_MAXIMO) {
            throw new IllegalArgumentException("Precio fuera de rango permitido.");
        }
        this.precio = precio;
    }

    // Getters y otros setters necesarios...
    
    @Override
    public String toString() {
        return String.format("%s - %.2f€ (x%d)", nombre, precio, cantidad);
    }
}