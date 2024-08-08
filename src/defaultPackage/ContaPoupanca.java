package defaultPackage;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
        super.tipoDeConta = 2;
    }

    public void imprimirExtrato() {
        System.out.println(" *** Extrato Conta Poupanca ***");
        super.imprimirInfonsComuns();
    }


}
