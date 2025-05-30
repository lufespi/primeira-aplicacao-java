import java.util.Scanner;

public class PositivoNegativo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroDigitado = 0;

        System.out.println("Digite um valor inteiro: ");
        numeroDigitado = sc.nextInt();

        if (numeroDigitado >= 0) {
            System.out.println("Número Positivo");
        } else {
            System.out.println("Número Negativo");
        }

        sc.close();
    }
}
