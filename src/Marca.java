public class Marca extends Coche {
    private String marca;
    private double precio;

    public Marca(String matricula, int velocidad, int ruedas, String color, String marca, double precio) {
        super(matricula, velocidad, ruedas, color);
        this.marca = marca;
        this.precio = precio;
    }
}
