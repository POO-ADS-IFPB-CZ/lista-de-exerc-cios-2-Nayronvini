import java.util.Scanner;

public class OperadorContas {
    public static void main(String[] args){
        String funcao;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número da conta: ");
        int numero = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Digite o nome do titular: ");
        String titular = scanner.nextLine();

        ContaCorrente user = new ContaCorrente(numero, titular, 0);
        do {
            System.out.println("""
                Escolha o que você quer fazer:
                • Saque
                • Deposito
                • Consulta
                • Sair
            """);
            funcao = scanner.nextLine();

            if (funcao.equalsIgnoreCase("Saque")){
                System.out.print("Digite o valor a ser sacado: ");
                float valor = scanner.nextFloat();
                scanner.nextLine();
                user.sacar(valor);
            } else if (funcao.equalsIgnoreCase("Deposito")) {
                System.out.print("Digite o valor a ser depositado: ");
                float valor = scanner.nextFloat();
                scanner.nextLine();
                user.depositar(valor);
            } else if (funcao.equalsIgnoreCase("Consulta")) {
                user.consultarSaldo();
            }
        }while (!funcao.equalsIgnoreCase("Sair"));
    }
}
