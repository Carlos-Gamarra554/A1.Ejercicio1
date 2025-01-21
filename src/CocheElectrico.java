public class CocheElectrico extends Coche {
    private static double autonomia;
    private double peso;

    public CocheElectrico(String matricula, int velocidad, int ruedas, String color, double autonomia, double peso) {
        super(matricula, velocidad, ruedas, color);
        this.autonomia = autonomia;
        this.peso = peso;
    }

    public static void autonomia() {
        if (autonomia > 0){
            System.out.println("El coche tiene batería! Te quedan " + autonomia + " km de autonomía.");
        } else if(autonomia <= 0 ){
            System.out.println("El coche no tiene batería, no lo puedes mover :(");
        }
    }
}
