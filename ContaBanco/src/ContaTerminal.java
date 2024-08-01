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
        int acao;
        int valorSolicitado;
        int deposito;

        System.out.print("Olá! Por favor, digite seu nome: ");
        Nome_Cliente = sc.nextLine();
        System.out.print("Por favor, digite o número da Agência: ");
        Agencia = sc.next();
        System.out.print("Digite o número da conta: ");
        Numero = sc.nextInt();

        System.out.print("Olá " +(Nome_Cliente)+ ", obrigado por criar uma conta em nosso banco, sua agência é " +(Agencia)+ ", conta " +(Numero)+ " e seu saldo de " +(Saldo)+ " já está disponível para saque. O que deseja fazer?\n");

        System.out.print("Digite (1) para sacar - Digite (2) para ver o saldo - Digite (3) para depositar: ");
        acao = sc.nextInt();

        if(acao == 1){ //Solicitando o saque
            System.out.print("Qual valor você deseja sacar? ");
            valorSolicitado = sc.nextInt();
            Saldo = Saldo - valorSolicitado;
            System.out.print("Seu saldo atualizado é de: " +Saldo);
        }else if(acao == 2){ //Solicitando o saldo
            System.out.print("Seu saldo é de: " +Saldo);
        }else if(acao == 3){ //Solicitando o deposito
            System.out.print("Qual o valor deseja depositar? ");
            deposito = sc.nextInt();
            Saldo = Saldo + deposito;
            System.out.print("Seu saldo atual é de: " +Saldo);
        }else{
            System.out.print("Número digitado é inválido");
        }
        sc.close();
    }
}
