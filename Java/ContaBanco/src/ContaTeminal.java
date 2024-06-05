import java.util.Locale;
import java.util.Scanner;

public class ContaTeminal {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor informe o numero da conta!");
        int numero = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Agora você deve informar o numero da agência!");
        String agencia = scanner.nextLine();

        System.out.println("Como devemos te chamar!");
        String nomeCliente = scanner.nextLine();
        

        System.out.println("Quanto você deseja depositar na sua conta? ");
        float saldo = scanner.nextFloat();

        System.out.println("Conta criada com sucesso!!!");
        System.out.format("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %f já está disponível para saque", nomeCliente, agencia, numero, saldo);

    }
}
