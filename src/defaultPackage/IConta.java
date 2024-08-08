package defaultPackage;

public interface IConta {

    void sacar(double valor);

    void depositar(double valor);

    void transferir(double valor, Conta contaDestino);

    void comprarNoCredito(double valor);

    void pagarFatura();

    void fatura();

    void imprimirExtrato();
}
