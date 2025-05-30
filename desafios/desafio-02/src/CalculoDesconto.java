public class CalculoDesconto {
    public static void main(String[] args) {
        double precoOriginal = 75.45;
        double percentualDesconto = 10;
        double valorDesconto = precoOriginal * (percentualDesconto / 100);
        double precoTotal = precoOriginal - valorDesconto;

        System.out.printf("Preço original: R$%.2f\n" , precoOriginal);
        System.out.printf("Desconto: R$%.2f\n" , valorDesconto);
        System.out.printf("Novo preço com desconto: R$%.2f" , precoTotal);
    }
}
