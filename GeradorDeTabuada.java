import javax.swing.JOptionPane;

public class GeradorDeTabuada {

    public static void main(String[] args) {
        try {
            // Solicita o número ao usuário
            String numeroStr = JOptionPane.showInputDialog("Digite um número para ver sua tabuada:");
            int numero = Integer.parseInt(numeroStr);

            // Gera a tabuada de 1 a 10
            StringBuilder tabuada = new StringBuilder();
            for (int i = 1; i <= 10; i++) {
                tabuada.append(numero)
                       .append(" x ")
                       .append(i)
                       .append(" = ")
                       .append(numero * i)
                       .append("\n");
            }

            // Exibe o resultado
            JOptionPane.showMessageDialog(null, tabuada.toString(), "Tabuada do " + numero, JOptionPane.INFORMATION_MESSAGE);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Erro: Digite apenas números inteiros válidos.", "Entrada inválida", JOptionPane.ERROR_MESSAGE);
        }
    }
}