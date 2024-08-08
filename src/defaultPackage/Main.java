package defaultPackage;

public class Main {

    public static void main(String[] args) {
        Banco Santander = new Banco("Santander");


        Cliente Anderson = new Cliente("Anderson");
        Cliente Jeniffer = new Cliente("Jeniffer");


        Conta cc = new ContaCorrente(Anderson);
        Conta cp = new ContaPoupanca(Jeniffer);


        cc.depositar(250);
        cp.depositar(200);

        cc.imprimirExtrato();
        cp.imprimirExtrato();

        cc.transferir(80, cp);
        cc.imprimirExtrato();
        cp.imprimirExtrato();

        Santander.addConta(cc);
        Santander.addConta(cp);
        Santander.listagemDeContas();


        cc.comprarNoCredito(60);
        cp.comprarNoCredito(80);
        cc.pagarFatura();
        cp.pagarFatura();
    }
}
