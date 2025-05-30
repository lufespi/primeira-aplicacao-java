import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor:");
        int valor = sc.nextInt();
        int fatorial = 1;

        for (int i = 1; i <= valor; i++) {
            fatorial *= i;
        }

        System.out.println("Fatorial de " + valor + " é: " + fatorial);
    }
}
