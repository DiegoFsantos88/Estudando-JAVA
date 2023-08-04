package aula_0408.exercicio;

import java.util.ArrayList;
import java.util.List;

public class Banco {

    private List<Conta> contas;

    public Banco() {
        this.contas = new ArrayList<Conta>();
    }

    public Banco(List<Conta> contas) {
        this.contas = contas;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }

    public void criarConta(Cliente cliente) {
        Conta conta = new Conta();
        conta.setCliente(cliente);
        conta.setSaldo(0.0);
        conta.setNumero(this.contas.size()+1);
        this.contas.add(conta);
    }

    public Conta buscarConta(Integer numero) {
        for(Conta conta : contas) {
            if(conta.getNumero().equals(numero)) {
                return conta;
            }
        }
        return null;
    }

    public void listarContas() {
        for(Conta conta : contas) {
            System.out.println(conta);
        }
    }
}