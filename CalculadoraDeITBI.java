import javax.swing.JOptionPane;
public class CalculadoraDeITBI {

    public static void main(String[] args) {
        try {
            // Entrada: valor de transação

            String valorTransacaoStr = JOptionPane.showInputDialog("Digite o valor de transação do imóvel (R$):");
            double valorTransacao = Double.parseDouble(valorTransacaoStr);

            // Entrada: valor venal

            String valorVenalStr = JOptionPane.showInputDialog("Digite o valor venal do imóvel (R$):");
            double valorVenal = Double.parseDouble(valorVenalStr);

            // Entrada: porcentagem do ITBI

            String itbiStr = JOptionPane.showInputDialog("Digite a porcentagem do ITBI (%):");
            double percentualITBI = Double.parseDouble(itbiStr);

            // Determinar o maior valor

            double baseCalculo = Math.max(valorTransacao, valorVenal);

            // Calcular o valor do ITBI

            double imposto = (baseCalculo * percentualITBI) / 100;

            // Exibir resultado

            String mensagem = String.format(
                "Base de cálculo: R$ %.2f\nImposto ITBI: R$ %.2f",
                baseCalculo, imposto
            );
            JOptionPane.showMessageDialog(null, mensagem, "Resultado do Cálculo", JOptionPane.INFORMATION_MESSAGE);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Erro: Insira apenas números válidos.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
}
