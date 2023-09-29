package Contas;
import Usuarios.cliente;
import Usuarios.gerente;

public class ContaPoupanca extends Conta {
    private double dinheiroGuardado;

    public ContaPoupanca(cliente cliente, double saldo) {
        super(cliente, saldo );
    }
    
    public void guardarDinheiro(double valor) {
        this.saldo = this.saldo - valor;
        this.dinheiroGuardado = this.dinheiroGuardado + valor;
    }

    public void aplicarJuros(int qtdMeses) {
        this.dinheiroGuardado = this.getDinheiroGuardado() +((this.dinheiroGuardado * 0.05) * qtdMeses);
    }

    public void exibirInfos() {
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

