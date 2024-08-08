package defaultPackage;

import java.util.ArrayList;
import java.util.List;

public class Banco {

    private String nome;
    private List<Conta> contas = new ArrayList<>();

    public Banco(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }


    public List<Conta> getContas() {
        return contas;
    }


    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }

    public void addConta(Conta contaNova){
        this.contas.add(contaNova);
    }

    public void listagemDeContas(){
        this.contas.forEach(n -> n.imprimirExtrato());
    }

}
