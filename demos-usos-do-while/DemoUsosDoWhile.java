import java.util.Random;
import java.util.Scanner;
public class DemoUsosDoWhile {

    public static void adivinaNumero() {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int numeroAleatorio = random.nextInt(5) + 1;
        int numero = 0;
        String sobrenombre = "";

        do {
            System.out.println("Introduce un número entre 1 y 5:");
            numero = scanner.nextInt();
            
            if (numero == numeroAleatorio) {
                System.out.println("¡Felicidades, has acertado el número!");
            } else {
                switch (numero) {
                    case 1:
                        sobrenombre = "El galán";
                        break;
                    case 2:
                        sobrenombre = "El patito";
                        break;
                    case 3:
                        sobrenombre = "San Cono";
                        break;
                    case 4:
                        sobrenombre = "La cama";
                        break;
                    case 5:
                        sobrenombre = "El galo";
                        break;
                    default:
                        sobrenombre = "desconocido";
                        break;
                }
                System.out.println("¡Has fallado! El número " + numero + " es " + sobrenombre + " en el bingo. Sigue probando, este no es el número correcto.");
            }
        } while (numero != numeroAleatorio);

        scanner.close();
    }
}