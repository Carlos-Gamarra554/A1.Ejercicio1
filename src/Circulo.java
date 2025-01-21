public class Circulo {
    private static double radio;

    public Circulo(double radio) {
        if (radio < 0) {
            this.radio = 0;
        } else {
            this.radio = radio;
        }
    }

    public static double getRadio() {
        return radio;
    }

    public static double getArea() {
        return Math.PI * radio * radio;
    }
}
