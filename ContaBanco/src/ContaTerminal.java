import java.util.Random;
import java.util.Scanner;


public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);


        int numeroConta = random.nextInt(1000);
        // String numeroFormatado = String.format("%04d", numeroConta);
        String agencia;
        String nome;
        String sobrenome;
        double saldo = 0;


        System.out.println("Vamos abrir uma conta no banco!");
        System.out.println("Insira os dados solicitados!");
        System.out.println("Qual seu nome:");
        nome = scanner.nextLine();
        System.out.println("Qual seu sobrenome:");
        sobrenome = scanner.nextLine();
        

        while (true) {
            System.out.println("Digite numero da agencia que voce gostaria de abrir a conta:");
            agencia = scanner.nextLine();
            
            // Verifica se a entrada está no formato NNNN-N
            if (agencia.matches("\\d{4}-\\d")) {
                break;
            } else {
                System.out.println("Entrada inválida. Exemplo 067-8. Por favor, digite novamente");
            }
        }

        
        
        System.out.println("Olá "+ nome +", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia +", conta "+ String.format("%04d", numeroConta) +" e seu saldo "+ saldo +" já está disponível para saque");


        
        scanner.close();
    }
}
