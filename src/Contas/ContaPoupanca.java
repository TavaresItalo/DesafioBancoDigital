package Contas;
import Usuarios.cliente;
import Usuarios.gerente;

public class ContaPoupanca extends Conta {
    private double dinheiroGuardado;

    public ContaPoupanca(cliente cliente, gerente gerente) {
        super(cliente, gerente);
    }
    
    public void guardarDinheiro(double valor) {
        this.saldo = saldo - valor;
        this.dinheiroGuardado = dinheiroGuardado + valor;
    }

    public void exibirInfosPoupanca() {
        super.exibirInfos();
        System.out.println("===Dinheiro Guardado===");
        System.out.println("Total= " + this.dinheiroGuardado);
        
    }

    public double getDinheiroGuardado() {
        return dinheiroGuardado;
    }

    public void setDinheiroGuardado(double dinheiroGuardado) {
        this.dinheiroGuardado = dinheiroGuardado;
    }
}

