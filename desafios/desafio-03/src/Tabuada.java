import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor = 0;
        int total = 0;
        int x = 0;

        System.out.println("Digite um valor:");
        valor = sc.nextInt();

        for (int i = 0; i < 10; i++) {
            x++;

            total = valor * x;
            System.out.println(valor + " x " + x + " = " + total);
        }

    }
}
