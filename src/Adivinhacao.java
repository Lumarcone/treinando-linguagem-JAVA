
    import java.util.Random;
    import java.util.Scanner;

    public class Adivinhacao {

        public static void main(String[] args) {
            // Gerar um número aleatório entre 0 e 100
            int numeroAleatorio = new Random().nextInt(101);

            // Inicializar o Scanner para obter a entrada do usuário
            Scanner scanner = new Scanner(System.in);

            System.out.println("Bem-vindo ao Jogo de Adivinhação!");
            System.out.println("Tente adivinhar o número entre 0 e 100.");

            int tentativas = 0;

            // Loop para controlar as tentativas
            while (tentativas < 5) {
                System.out.print("Tentativa " + (tentativas + 1) + ": Digite um número: ");
                int palpiteUsuario = scanner.nextInt();

                // Verificar se o palpite está correto
                if (palpiteUsuario == numeroAleatorio) {
                    System.out.println("Parabéns! Você acertou o número.");
                    break; // Encerrar o loop se o palpite estiver correto
                } else if (palpiteUsuario < numeroAleatorio) {
                    System.out.println("O número é maior. Tente novamente.");
                } else {
                    System.out.println("O número é menor. Tente novamente.");
                }

                tentativas++;
            }

            // Se o loop terminar sem acerto, exibir mensagem de fim de jogo
            if (tentativas == 5) {
                System.out.println("Fim de jogo. O número correto era: " + numeroAleatorio);
            }

            // Fechar o Scanner
            scanner.close();
        }
    }


