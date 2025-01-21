import java.util.Scanner;

public class Coche extends Vehiculo {
    private static String matricula;
    private static int velocidad;

    public Coche(String matricula, int velocidad, int ruedas, String color) {
        super(ruedas, color);
        this.matricula = matricula;
        this.velocidad = velocidad;
    }

    public static int getVelocidad() {
        return velocidad;
    }

    public static void mover() {
        Scanner sc = new Scanner(System.in);
        System.out.print("El coche va a " + getVelocidad() + " km/h. ¿Quieres acelerar el coche o frenarlo?\n" +
                "(Introduce 0 para frenar o 1 para acelerar): ");
        int estado = sc.nextInt();


            if (estado == 1) {
                System.out.println("Aceleras! El coche con matrícula " + matricula + " se está moviendo a: " + (getVelocidad() + 10) + " km/h");
            } else if (estado == 0) {
                if (getVelocidad() <= 0) {
                    System.out.println("El coche está parado, no puedes frenar más.");
                } else {
                    System.out.println("Frenas! El coche con matrícula " + matricula + " se está moviendo a: " + (getVelocidad() - 10) + " km/h");
                }
            } else if (estado != 0 || estado != 1 || estado != 2) {
                System.out.print("Valor no válido, inténtalo de nuevo: ");
                estado = sc.nextInt();
            }
        }
}
