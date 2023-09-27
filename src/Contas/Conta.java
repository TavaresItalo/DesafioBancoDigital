package Contas;
import Usuarios.cliente;
import Usuarios.gerente;

public abstract class Conta {
    private static String AGENCIA_PADRAO = "1";
    private static int numeroSequencial = 1;

    protected int numero;
    protected String agencia;
    protected double saldo;
    protected cliente cliente;
    protected gerente gerente;

    public Conta (cliente cliente, gerente gerente) {
        this.numero = numeroSequencial++;
        this.agencia = Conta.AGENCIA_PADRAO;
        this.cliente = cliente;
        this.gerente = gerente;
    }

    public void sacar(double valor) {
        this.saldo = saldo - valor;
    }

    public void depositar(double valor) {
        this.saldo = saldo + valor;
    }

    public void exibirInfos() {
        System.out.println("===Extrato===");
        System.out.println("Saldo: " + this.saldo);
        System.out.println("Numero: " + this.numero);
        System.out.println("Agencia: " + this.agencia);
    }

    public String getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }
}
