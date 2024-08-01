//Teste de condição utilizando switch/case
public class EmprestimoBanco {
    public static void main(String[] args) {

        String situacao = "Nome_Sujo";
        
        switch(situacao){
            case "Nome_Limpo":{
                System.out.print("Crédito Liberado!");
                break;
            }
            case "Contas_Pendentes":{
                System.out.print("Crédito Sob Análise!");
                break;
            }
            case "Nome_Sujo":{
                System.out.print("Crédito Revogado!");
                break;
            }
            
        }
    }
    
}
