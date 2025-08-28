import javax.swing.JOptionPane;

public class SistemaDeAvaliacao {

    public static void main(String[] args) {
        try {

            // Entrada das duas provas

            String nota1Str = JOptionPane.showInputDialog("Digite a nota da 1ª prova:");
            double nota1 = Double.parseDouble(nota1Str);

            String nota2Str = JOptionPane.showInputDialog("Digite a nota da 2ª prova:");
            double nota2 = Double.parseDouble(nota2Str);

            // Entrada do trabalho

            String trabalhoStr = JOptionPane.showInputDialog("Digite a nota do trabalho:");
            double notaTrabalho = Double.parseDouble(trabalhoStr);

            // Cálculo da média

            double media = (nota1 + nota2 + notaTrabalho) / 3;

            // Verificação de aprovação

            String status = (media >= 6.0) ? "Aprovado" : "Reprovado";

            // Exibir resultado

            String mensagem = String.format("Média: %.2f\nStatus: %s", media, status);
            JOptionPane.showMessageDialog(null, mensagem, "Resultado", JOptionPane.INFORMATION_MESSAGE);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Erro: Digite apenas números válidos.", "Entrada inválida", JOptionPane.ERROR_MESSAGE);
        }
    }
}

