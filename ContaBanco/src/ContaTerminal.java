/** Atividade repassada pela DIO.
 * @version 1.0
 * @author João Vitor
 **/



import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        String Agencia;
        Double Saldo;
        Saldo = 237.48;
        int Numero;
        String Nome_Cliente;

        System.out.print("Olá! Por favor, digite seu nome: ");
        Nome_Cliente = sc.nextLine();
        System.out.print("Por favor, digite o número da Agência: ");
        Agencia = sc.next();
        System.out.print("Digite o número da conta: ");
        Numero = sc.nextInt();

        System.out.print("Olá " +(Nome_Cliente)+ ", obrigado por criar uma conta em nosso banco, sua agência é " +(Agencia)+ ", conta " +(Numero)+ " e seu saldo de " +(Saldo)+ " já está disponível para saque.");

        sc.close();
    }
}
