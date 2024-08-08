package defaultPackage;

public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente) {
        super(cliente);
        super.tipoDeConta = 1;
    }

    public void imprimirExtrato() {
        System.out.println(" *** Extrato Conta Corrente ***");
        super.imprimirInfonsComuns();
    }
}
