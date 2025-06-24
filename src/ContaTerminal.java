import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.println("\nPor favor, digite o número da Conta:");
        numero = sc.nextInt();
        sc.nextLine(); // Consome a quebra de linha pendente após nextInt()

        System.out.println("Digite a Agência:");
        agencia = sc.nextLine();

        System.out.println("Qual o seu nome?");
        nomeCliente = sc.nextLine();

        System.out.println("Qual valor será depositado?");
        saldo = sc.nextDouble();

        System.out.println();
        System.out.printf(
                "Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.",
                nomeCliente, agencia, numero, saldo);

        System.out.println();
        sc.close();
    }
}
