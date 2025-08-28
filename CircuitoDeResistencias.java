import javax.swing.JOptionPane;

public class CircuitoDeResistencias {

    public static void main(String[] args) {
        try {
            
            // Vetor para armazenar as resistências

            double[] resistencias = new double[4];

            // Entrada das 4 resistências

            for (int i = 0; i < 4; i++) {
                String entrada = JOptionPane.showInputDialog("Digite o valor da resistência " + (i + 1) + " (em ohms):");
                resistencias[i] = Double.parseDouble(entrada);
            }

            // Cálculo da resistência equivalente (soma)

            double resistenciaEquivalente = 0;
            double maior = resistencias[0];
            double menor = resistencias[0];

            for (double r : resistencias) {
                resistenciaEquivalente += r;

                if (r > maior) {
                    maior = r;
                }
                if (r < menor) {
                    menor = r;
                }
            }

            // Montagem da mensagem de resultado

            String mensagem = String.format(
                "Resistência equivalente: %.2f ohms\nMaior resistência: %.2f ohms\nMenor resistência: %.2f ohms",
                resistenciaEquivalente, maior, menor
            );

            // Exibição dos resultados

            JOptionPane.showMessageDialog(null, mensagem, "Resultado", JOptionPane.INFORMATION_MESSAGE);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Erro: Digite apenas números válidos.", "Entrada inválida", JOptionPane.ERROR_MESSAGE);
        }
    }
}
