package Dados;

public class Dados {

    private String nome;
    private int conta;
    private double saldoInicial;
    private double deposito;
    private double saque;
    private double extrato;

    public Dados(String nome, int conta, double saldoInicial) {
        this.nome = nome;
        this.conta = conta;
        this.saldoInicial = saldoInicial;
    }


    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }


    public int getConta() {
        return conta;
    }
    public void setConta(int conta) {
        this.conta = conta;
    }


    public double getSaldoInicial() {
        return saldoInicial;
    }
    public void setSaldoInicial(double saldoInicial) {
        this.saldoInicial = saldoInicial;
    }

    //Ações
    public double getDeposito() {
        return deposito;
    }
    public void setDeposito(double deposito) {
        setSaldoInicial(saldoInicial + deposito);
        System.out.println("Depósito de R$ "  + deposito + " realizado com êxito!");  
    }


    public double getSaque() {
        return saque;
    }
    public void setSaque(double saque) {
        if (saque >= 5000){
            System.out.println("Erro: Valor de saque acima do permitido.");
        } else if (saque > saldoInicial) {
            System.out.println("Erro: Saldo insuficiente!");
        } else{
            setSaldoInicial(saldoInicial - saque);
            System.out.println("Saque de R$ " + saque + " realizado com êxito.");
        }
    }


    public double getExtrato() {
        return extrato;
    }
    public void setExtrato() {
       System.out.println("Você tem R$ "+ saldoInicial + " de saldo.");
    }
}


