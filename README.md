# Primeira Atividade Pratica POO- 2025/2
Atividades de Programação em Java

1. Calculadora de Desconto:
   
    Desenvolva uma classe que utilize a classe Scanner para receber o valor de um produto e uma porcentagem de desconto. Calcule e exiba o valor do desconto e o preço final do produto após aplicar o desconto.

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

2. Calculadora de ITBI:

   Crie uma classe que utilize a JOptionPane para entrada de dados. Receba o valor de transação de um imóvel, o valor venal e a porcentagem do imposto ITBI. Calcule o imposto com base no maior valor entre o valor de transação e o valor venal.

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

3. Sistema de Avaliação:

   Utilizando JOptionPane, desenvolva uma classe que receba as notas de duas provas e de um trabalho. Calcule e mostre a média e indique se o aluno está aprovado (média >= 6) ou reprovado.

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

   
5. Calculadora de Aposentadoria:

   Elabore uma classe que receba idade, sexo e anos de contribuição de uma pessoa. Determine se ela já pode se aposentar ou quantos anos faltam para isso, baseado nas regras de aposentadoria por idade ou por tempo de contribuição.

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

   
7. Circuito de Resistências:

   Faça uma classe que receba o valor de quatro resistências ligadas em série. Calcule e exiba a resistência equivalente, a maior e a menor resistência.

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

  
9. Sistema de Login:

    Crie uma classe que simule o acesso a um sistema solicitando login e senha. Compare os dados inseridos com os valores "java8". O usuário tem três tentativas para acertar, com mensagens de erro informativas a cada falha.

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
   
11. Gerador de Tabuada:

    Desenvolva uma classe que peça ao usuário um número e apresente a tabuada deste número de 1 a 10, utilizando um loop para gerar os resultados.

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
