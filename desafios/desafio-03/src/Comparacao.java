import java.util.Scanner;

public class Comparacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valorA = 0, valorB = 0;

        System.out.println("Digite o valor A:");
        valorA = sc.nextInt();

        System.out.println("Digite o valor B:");
        valorB = sc.nextInt();

        if (valorA == valorB) {
            System.out.println("O valor A é igual ao valor B!");
        } else if (valorA > valorB) {
            System.out.println("O valor A é maior que o valor B!");
        } else {
            System.out.println("O valor A é menor que o valor B!");
        }

        sc.close();
    }
}
