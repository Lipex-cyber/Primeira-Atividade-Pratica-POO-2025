import javax.swing.JOptionPane;

public class SistemaDeLogin {

    public static void main(String[] args) {
        final String loginCorreto = "java8";
        final String senhaCorreta = "java8";

        int tentativas = 3;

        while (tentativas > 0) {
            String login = JOptionPane.showInputDialog("Digite o login:");
            String senha = JOptionPane.showInputDialog("Digite a senha:");

            if (login.equals(loginCorreto) && senha.equals(senhaCorreta)) {
                JOptionPane.showMessageDialog(null, "✅ Acesso concedido!", "Login", JOptionPane.INFORMATION_MESSAGE);
                return;
            } else {
                tentativas--;
                if (tentativas > 0) {
                    JOptionPane.showMessageDialog(null,
                        "❌ Login ou senha incorretos.\nTentativas restantes: " + tentativas,
                        "Erro de autenticação", JOptionPane.WARNING_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null,
                        "⛔ Acesso bloqueado após 3 tentativas.",
                        "Bloqueado", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }
}
