package HashMap;

import java.util.HashMap;
import java.util.Map;

public class tienda {
    Map<String, Integer> productos = new HashMap<>();

    public tienda() {
        this.productos.put("refresco", 5);
        this.productos.put("fresa", 7);
        this.productos.put("galletas", 9);
        this.productos.put("tortilla", 10);
        this.productos.put("pan", 15);

    }

    public void agregarProductos(String NombreProducto, Integer cantidad) {

        boolean notExistProduct;
        notExistProduct = agregarReducirProducto(NombreProducto, cantidad);
        if (notExistProduct) {
            this.productos.put(NombreProducto, cantidad);
        }


    }

    public void reducirProducto(String NombreProducto, Integer cantidad) {
        agregarReducirProducto(NombreProducto, cantidad * -1);
    }

    private boolean agregarReducirProducto(String NombreProducto, Integer cantidad) {
        int suma;
        if (this.productos.containsKey(NombreProducto)) {
            suma = cantidad + productos.get(NombreProducto);
            productos.put(NombreProducto, suma);
            if (productos.get(NombreProducto) <= 0) {
                productos.remove(NombreProducto);
            }
            return false;
        } else {
            return true;
        }

    }

    public void Mostrar() {
        for (String key : this.productos.keySet()) {
            System.out.println("Producto: " + key + " cantidad: " + productos.get(key));
        }
    }

    public void Buscar(String NombreProducto) {
        if (this.productos.containsKey(NombreProducto)) {
            System.out.println("Producto: " + NombreProducto + " cantidad: " + productos.get(NombreProducto));
        } else {
            System.out.println("no se encontro el producto");
        }
    }


}
