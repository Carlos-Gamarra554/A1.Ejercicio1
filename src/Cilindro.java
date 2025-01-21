public class Cilindro extends Circulo{
    private static double altura;

    public Cilindro(double radio, double altura) {
        super(radio);
        if (altura < 0){
            this.altura = 0;
        } else {
            this.altura = altura;
        }
    }

    public static double getAltura() {
        return altura;
    }

    public static double getVolume() {
        return Circulo.getArea() * getAltura();
    }
}
