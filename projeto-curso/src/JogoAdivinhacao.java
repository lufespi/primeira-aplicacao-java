import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        int numeroAleatorio = new Random().nextInt(100);
        Scanner entradaDadosUsuario = new Scanner(System.in);
        int totalTentativas = 5;
        int numeroDigitado = 0;


        for (int i = 0; i < totalTentativas; i++) {
            System.out.println("Digite um número entre 0 e 100: ");
            numeroDigitado = entradaDadosUsuario.nextInt();

            if(numeroDigitado == numeroAleatorio) {
                System.out.println("Parabéns, você acertou o número em " + i + 1 + " tentativas!");
                break;
            } else if (numeroDigitado < numeroAleatorio) {
                System.out.println("O número digitado é menor que o número aleatório.");
            } else {
                System.out.println("O número digitado é maior que o número aleatório.");
            }

        }

        if (numeroDigitado != numeroAleatorio) {
            System.out.println("Fim de Jogo. O número aleatório era: " + numeroAleatorio);
        }

        entradaDadosUsuario.close();
    }
}
