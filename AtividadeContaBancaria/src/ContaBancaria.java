import java.util.Scanner;
import Dados.Dados;

public class ContaBancaria {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Dados dados = new Dados(null, 0, 0);
        
        System.out.println("Conta Bancária: ");
        System.out.print("Escreva seu nome completo: ");
        String nome = scanner.nextLine();
        dados.setNome(nome);

        System.out.print("Digite o número da conta: ");
        int nConta = scanner.nextInt();
        dados.setConta(nConta);

        System.out.print("Informe o saldo inicial da conta: R$ ");
        double saldoInicial = scanner.nextDouble();
        dados.setSaldoInicial(saldoInicial);

        System.out.println("Conta bancária criada com sucesso!");

        int decisao;
        do {
            System.out.println("\nEscolha a ação que deseja realizar:");
            System.out.println("(1) - Deposito");
            System.out.println("(2) - Saque");
            System.out.println("(3) - Extrato");
            System.out.println("(0) - Para sair.");
            decisao = scanner.nextInt();
            
            switch (decisao) {
                case  1:
                    System.out.print("Digite o valor a ser depositado: R$ ");
                    double valorDeposito = scanner.nextDouble();
                    dados.setDeposito(valorDeposito);
            
                    break;


                case 2:
                    System.out.print("Digite o valor para ser sacado: R$ ");
                    double valorSaque = scanner.nextDouble();
                    dados.setSaque(valorSaque);
                    break;


                case 3:
                    dados.setExtrato();
                    break;
  
                    
                case 0:
                    System.out.println("Programa encerrado");
                    break;


                default:
                    System.out.println("Erro: Opção inválida!");
                    break;
            }

            
        } while (decisao != 0);
    scanner.close();
    }
}
