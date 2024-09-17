import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        //criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Digite seu nome completo");
        String nome = scanner.next();
        
        System.out.println("Digite a sua Agencia Bancária");
        int agencia = scanner.nextInt();

        System.out.println("Digite sua conta");
        int numeroConta = scanner.nextInt();
        
        System.out.println("Digite seu saldo");
        double saldo = scanner.nextDouble();

        
        //imprimindo os dados obtidos pelo usuario
        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia + ", conta " + numeroConta + " e seu saldo " +  saldo+ " já está disponível para saque");
        
        
    }
}