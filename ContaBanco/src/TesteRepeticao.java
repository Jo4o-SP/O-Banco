import java.util.Scanner;

/* Teste de repetições
 * Repetição em For
 * Repetição em While
 * Repticção em Do While
 */

public class TesteRepeticao {
    public static void main(String[] args) {

        //Disponibilização de crédito mensal
        /*int credito;
        for(credito=0; credito<=12; credito++){
            System.out.println("Crédito mensal disponibilizado: " + credito);
        }
        System.out.println("Crédito pendente de analise");*/

        //Teste for/each
        /*String medalhas [] ={"OURO", "PRATA", "BRONZE"};

        for(String medalha : medalhas){
            System.out.println(medalha);
        }*/
        //Break e Continue
        /*for(int pensao = 1; pensao <= 5; pensao++){
            if(pensao == 4){ 
            continue;
            }
            System.out.println(pensao);
        }*/
        //While e Scanner
        Scanner sc = new Scanner(System.in);

        Double pensao = 768.9;
        while (pensao <= 768.9) {
            System.out.print("Digite o valor para ser depositado: ");
            pensao = sc.nextDouble();
        }
        System.out.println("Valor total depositadi da pensão: " +pensao);
    }
}
