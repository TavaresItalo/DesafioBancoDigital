package Contas;
import Usuarios.cliente;

public class ContaCorrente extends Conta {
    double faturaCartao;
    
    public ContaCorrente(cliente cliente, double saldo) {
        super(cliente, saldo );
    }

    public void usarCredito(double valor) {
        this.faturaCartao = faturaCartao + valor;
    }

    public void exibirInfos() {
        super.exibirInfos();
        System.out.println("===Fatura do cartão===");
        System.out.println("Fatura: " + this.faturaCartao);
    }
}
