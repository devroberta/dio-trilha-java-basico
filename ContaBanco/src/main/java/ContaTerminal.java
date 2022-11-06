import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    int conta;
    String agencia;
    String nomeCliente;
    double saldo;

    System.out.print("Digite o número da conta: ");
    conta = sc.nextInt();

    System.out.print("Digite a Agência: ");
    agencia = sc.next();

    System.out.print("Digite o nome do Cliente: ");
    sc.nextLine();
    nomeCliente = sc.nextLine();

    System.out.print("Digite o saldo da conta: ");
    saldo = sc.nextDouble();

    System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d "
            + "e seu saldo %.2f já está disponível para saque", nomeCliente, agencia, conta, saldo);

    sc.close();
  }
}
