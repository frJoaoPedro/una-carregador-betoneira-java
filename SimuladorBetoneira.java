import java.util.Scanner;
public class SimuladorBetoneira{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double pesoAlvo = 500.0;
        double pesoAtual = 0.0;

        int ciclo = 0;

        System.out.println("Simulador de peso ");
        System.out.println("Iniciando...");
        System.out.println("========================================");

        System.out.println(" Meta: "+ pesoAlvo +"kg de brita 1");
        
        do{ 
            System.out.println("Digite o peso de brita 1 adicionada em kg: ");
            double pesoAdd = sc.nextDouble();
            pesoAtual += pesoAdd;
            ciclo ++;

            if(pesoAtual >= pesoAlvo){
                System.out.println("Meta atingida em " + ciclo + "ciclos!");
                break;
            }
        }while ( true );
        
        if( pesoAtual > (pesoAlvo * 1.05)){
            System.out.println("Cuidado, Você pode ultrapassar a meta em mais de 5%");
            System.out.println("pode estar com problemas de estabilidade");
            System.out.println("Você fez demais pode diminuir isso.");
        }
        else{
            System.out.println("Dentro dos padrões de limite acessível");
            System.out.println("Boa, Você é bom em.");
        }
        sc.close();
    }
}