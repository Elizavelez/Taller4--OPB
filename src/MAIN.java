import java.util.Scanner;

public class MAIN {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        int numeroIf = 0;

        numeroIf = reader.nextInt();

        if (numeroIf > 0) {
            System.out.println("El numero " + numeroIf +" es positivo");
        } else if (numeroIf < 0){
            System.out.println("El numero " + numeroIf + " es negativo");
        } else {
            System.out.println("El numero es cero");
        }

    }
}
