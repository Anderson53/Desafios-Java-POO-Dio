package defaultPackage;

public abstract class Conta implements IConta {

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;
    protected double fatura;
    protected double pagarFatura;
    protected double comprarNoCredito;
    protected int tipoDeConta;


    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.saldo = 0;
        this.fatura = 0;
        this.cliente = cliente;
        this.tipoDeConta = 0;
    }

    @Override
    public void sacar(double valor) {
        saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    @Override
    public void comprarNoCredito(double valor) {
        this.fatura += valor;
    }

    @Override
    public void pagarFatura() {
        if(this.saldo >= this.fatura) {
            this.saldo -= this.fatura;
            this.fatura = 0;
            System.out.println("Fatura do Cartão Paga!");
        }
        else {
            System.out.println("Saldo insuficiente para pagamento da Fatura");
        }
    }

    @Override
    public void fatura() {
        System.out.println("A fatura atual é: R$" + this.fatura);
    }

    public int getTipoDeConta() {
        return tipoDeConta;
    }

    public double getFatura() {
        return fatura;
    }

//    public double getPagarFatura() {
//        return pagarFatura;
//    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    protected void imprimirInfonsComuns() {
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Conta: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }

}
