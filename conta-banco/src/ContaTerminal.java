import java.util.Scanner;


public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        float saldo = 237.48f;

        System.out.print("Por favor, digite o nome do cliente: ");
        String nomeCliente = scanner.nextLine();

        System.out.print("Por favor, digite o número da Agência: ");
        String agencia = scanner.nextLine();
        
        System.out.print("Por favor, digite o número da Conta: ");
        int conta = scanner.nextInt();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.\n", nomeCliente, agencia, conta, saldo);


    }
}
