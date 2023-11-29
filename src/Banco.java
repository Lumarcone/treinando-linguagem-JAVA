import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao Banco Sorocabano!");

        String cpf = "123.456.789-00";
        String senha = "01020304";
        double saldo = 1000.0;

        System.out.print("Digite seu CPF: ");
        String inputCpf = scanner.nextLine();
        System.out.print("Digite sua Senha: ");
        String inputSenha = scanner.nextLine();

        if (cpf.equals(inputCpf) && senha.equals(inputSenha)) {
            int opcao;

            do {
                System.out.println("\nMenu:");
                System.out.println("1 - Saldo");
                System.out.println("2 - Depósito");
                System.out.println("3 - Saque");
                System.out.println("0 - Sair");

                System.out.print("Escolha uma opção: ");
                opcao = scanner.nextInt();

                switch (opcao) {
                    case 1:

                        System.out.println("Saldo atual: R$" + saldo);
                        break;
                    case 2:

                        System.out.print("Digite o valor do depósito: ");
                        double deposito = scanner.nextDouble();
                        saldo += deposito;
                        System.out.println("Depósito realizado com sucesso.");
                        break;
                    case 3:

                        System.out.print("Digite o valor do saque: ");
                        double saque = scanner.nextDouble();

                        if (saque > saldo) {
                            System.out.println("Saldo insuficiente. Saque não realizado.");
                        } else {
                            saldo -= saque;
                            System.out.println("Saque realizado com sucesso.");
                        }
                        break;
                    case 0:

                        System.out.println("Obrigado por usar o Sistema Bancário. Até mais!");
                        break;
                    default:

                        System.out.println("Opção inválida. Tente novamente.");
                        break;
                }

            } while (opcao != 0);

        } else {
            System.out.println("CPF ou Senha incorretos.");
        }
    }
}
