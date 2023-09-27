package Contas;
import Usuarios.cliente;
import Usuarios.gerente;

public class ContaCorrente extends Conta {
    double faturaCartao;
    
    public ContaCorrente(cliente cliente, gerente gerente) {
        super(cliente, gerente);
    }

    public void usarCredito(double valor) {
        this.faturaCartao = faturaCartao + valor;
    }

    public void exibirInfosCC() {
        super.exibirInfos();
        System.out.println("===Fatura do cartão===");
        System.out.println("Fatura: " + this.faturaCartao);
    }
}
