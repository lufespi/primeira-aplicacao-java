import java.util.Scanner;

public class CalculadoraArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao = 0;
        String menu;

        menu = """
                Selecione uma das opções abaixo:
                1. Calcular área do quadrado.
                2. Calcular área do círculo.
                3. Sair\n
                """;


        while (opcao != 3) {
            System.out.println(menu);
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o valor da base do quadrado:");
                    double baseQuadrado = sc.nextDouble();
                    System.out.println("Digite o valor da altura do quadrado:");
                    double alturaQuadrado = sc.nextDouble();
                    double areaQuadrado = baseQuadrado * alturaQuadrado;

                    System.out.printf("Área do Quadrado: %.2f\n" , areaQuadrado);
                    break;
                case 2:
                    System.out.println("Digite o valor do raio:");
                    double raio = sc.nextDouble();
                    double areaCirculo = 3.14 * (raio * raio);

                    System.out.printf("Área do Círculo: %.2f\n" , areaCirculo);
                    break;
                case 3:
                    System.out.println("Saindo do programa...\n");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.\n");
                    break;
            }
        }
        sc.close();
    }
}
