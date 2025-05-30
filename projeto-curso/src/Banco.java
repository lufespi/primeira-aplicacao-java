import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Digite o seu nome:");
        String nomeCliente = sc.nextLine();
        String tipoConta = "Corrente";
        double saldoInicial = 2500.00;
        int option = 0;

        String displayInicial = String.format("""
                *********************************
                Dados iniciais do cliente:
                
                Nome: %s
                Tipo de conta: %s
                Saldo inicial: R$%.2f
                *********************************
                """, nomeCliente, tipoConta, saldoInicial);

        String menuOperacoes = """
                Operações:
                
                1 - Consultar saldos
                2 - Receber valor
                3 - Transferir valor
                4 - Sair
                """;

        double saldoTotal = saldoInicial;

        System.out.println(displayInicial);

        while (option != 4) {
            System.out.println(menuOperacoes);
            option = sc.nextInt();

            switch (option) {
                case 1:
                    System.out.printf("Seu saldo é de R$: %.2f\n\n" , saldoTotal);
                    break;
                case 2:
                    System.out.println("Valor a receber:");
                    double saldoReceber = sc.nextDouble();

                    saldoTotal += saldoReceber;
                    System.out.printf("Saldo atualizado: R$ %.2f\n\n" , saldoTotal);
                    break;
                case 3:
                    System.out.println("Valor a transferir:");
                    double saldoTransferir = sc.nextDouble();

                    if (saldoTransferir > saldoTotal) {
                        System.out.println("Saldo insuficiente para realizar essa transferência.\n");
                    } else {
                        saldoTotal -= saldoTransferir;
                        System.out.printf("Saldo atualizado: R$ %.2f\n\n" , saldoTotal);
                    }
                    break;
                case 4:
                    System.out.println("Encerrando o programa. Obrigado por usar nosso banco!");
                    break;
                default:
                    System.out.println("Opção Inválida. Tente novamente!\n");
                    break;
            }
        }
        sc.close();
    }
}
