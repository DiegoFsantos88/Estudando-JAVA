package aula_0408.exercicio;

public class Conta {

    private Integer numero;
    private Double saldo;
    private Cliente cliente;

    public Conta() {
    }

    public Conta(Integer numero, Double saldo, Cliente cliente) {
        this.numero = numero;
        this.saldo = saldo;
        this.cliente = cliente;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void depositar(Double valor) {
        if(valor > 0.0) {
            this.saldo += valor;
        }
    }

    public void sacar(Double valor) {
        if(this.saldo >= valor) {
            this.saldo -= valor;
        }
    }

    @Override
    public String toString() {
        return "numero: " + numero + " saldo: " + saldo + " cliente:" + cliente;
    }
}