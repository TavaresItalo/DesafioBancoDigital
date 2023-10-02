package Contas;

import Usuarios.cliente;

public class ContaTesouroDireto extends ContaPoupanca{
    
    public ContaTesouroDireto(cliente cliente, double saldo) {
        super(cliente, saldo);
    }

    public void aplicarJuros() {
        this.saldo = this.saldo * 1.01;
    }
    
}
