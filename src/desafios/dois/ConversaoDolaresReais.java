package desafios.dois;

public class ConversaoDolaresReais {
    public static void main(String[] args) {
        double valorEmDolares = 850.45;
        double cotacao = 4.94;
        double valorEmReais = valorEmDolares * cotacao;

        String saida = String.format("""
                Valor em Dólares: $%.2f
                Valor Dólar: %.2f
                Valor em Reais: R$%.2f
                """, valorEmDolares, cotacao, valorEmReais);

        System.out.printf(saida);
    }
}