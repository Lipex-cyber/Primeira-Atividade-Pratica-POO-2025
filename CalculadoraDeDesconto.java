import java.util.Scanner;

public class CalculadoraDeDesconto {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada do valor do produto
        System.out.print("Digite o valor do produto: R$ ");
        double valorProduto = scanner.nextDouble();

        // Entrada da porcentagem de desconto
        System.out.print("Digite a porcentagem de desconto (%): ");
        double percentualDesconto = scanner.nextDouble();

        // Cálculo do valor do desconto
        double valorDesconto = (valorProduto * percentualDesconto) / 100;

        // Cálculo do valor final com desconto
        double valorFinal = valorProduto - valorDesconto;

        // Exibição dos resultados
        System.out.printf("Valor do desconto: R$ %.2f%n", valorDesconto);
        System.out.printf("Valor final do produto: R$ %.2f%n", valorFinal);

        scanner.close();
    }
}
