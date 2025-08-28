import javax.swing.JOptionPane;

public class CalculadoraDeAposentadoria {

    public static void main(String[] args) {
        try {
            // Entrada da idade
            String idadeStr = JOptionPane.showInputDialog("Digite sua idade:");
            int idade = Integer.parseInt(idadeStr);

            // Entrada do sexo
            String sexo = JOptionPane.showInputDialog("Digite seu sexo (M/F):").toUpperCase();

            // Entrada dos anos de contribuição
            String contribuicaoStr = JOptionPane.showInputDialog("Digite seus anos de contribuição:");
            int anosContribuicao = Integer.parseInt(contribuicaoStr);

            // Variáveis de requisitos
            int idadeMinima = sexo.equals("F") ? 62 : 65;
            int contribuicaoMinima = sexo.equals("F") ? 30 : 35;

            boolean podePorIdade = idade >= idadeMinima;
            boolean podePorContribuicao = anosContribuicao >= contribuicaoMinima;

            String mensagem;

            if (podePorIdade || podePorContribuicao) {
                mensagem = "Você já pode se aposentar!";
            } else {
                int anosFaltandoIdade = idadeMinima - idade;
                int anosFaltandoContribuicao = contribuicaoMinima - anosContribuicao;

                mensagem = "Você ainda não pode se aposentar.\n";

                if (anosFaltandoIdade > 0) {
                    mensagem += "Faltam " + anosFaltandoIdade + " ano(s) para aposentadoria por idade.\n";
                }

                if (anosFaltandoContribuicao > 0) {
                    mensagem += "Faltam " + anosFaltandoContribuicao + " ano(s) para aposentadoria por tempo de contribuição.";
                }
            }

            JOptionPane.showMessageDialog(null, mensagem, "Resultado", JOptionPane.INFORMATION_MESSAGE);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Erro: Insira apenas números válidos.", "Entrada inválida", JOptionPane.ERROR_MESSAGE);
        }
    }
}
