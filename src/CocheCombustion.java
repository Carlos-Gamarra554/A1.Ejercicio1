public class CocheCombustion extends Coche {
    private static int marchas;
    private String combustible;

    public CocheCombustion(String matricula, int velocidad, int ruedas, String color, int marchas, String combustible) {
        super(matricula, velocidad, ruedas, color);
        this.combustible = combustible;
        this.marchas = marchas;
    }

    public static void marchas(){
        if (Coche.getVelocidad() < 15){
            System.out.println("Introduce la primera marcha");
        } else if(Coche.getVelocidad() > 15 && Coche.getVelocidad() < 30){
            System.out.println("Introduce la segunda marcha");
        } else if(Coche.getVelocidad() > 30 && Coche.getVelocidad() < 50){
            System.out.println("Introduce la tercera marcha");
        } else if (Coche.getVelocidad() > 50 && Coche.getVelocidad() < 80){
            System.out.println("Introduce la cuarta marcha");
        } else if(Coche.getVelocidad() > 80 && Coche.getVelocidad() < 100 ){
            System.out.println("Introduce la quinta marcha");
        } else if(marchas > 5 && Coche.getVelocidad() > 100){
            System.out.println("Introduce la sexta marcha");
        }
    }
}