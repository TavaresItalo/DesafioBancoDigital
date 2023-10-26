package Contas;
import Usuarios.cliente;
import Usuarios.gerente;

public class Conta {
    private static String AGENCIA_PADRAO = "1";
    private static int numeroSequencial = 1;

    private int numero;
    private String agencia;
    protected double saldo;
    private cliente cliente;
    private gerente gerente;

    public Conta (cliente cliente, double saldo) {
        this.numero = numeroSequencial++;
        this.agencia = Conta.AGENCIA_PADRAO;
        this.cliente = cliente;
        this.saldo = saldo;
    }

    public void sacar(double valor) throws SaldoInsuficienteException {
        this.saldo = saldo - valor;

        if(valor > this.saldo) {
            throw new SaldoInsuficienteException("Você não possui saldo suficiente.");
        }
    }

    public void depositar(double valor) {
        this.saldo = saldo + valor;
    }

    public void exibirInfos() {
        System.out.println("===Extrato===");
        System.out.println("Saldo: " + this.saldo);
        System.out.println("Numero: " + this.numero);
        System.out.println("Agencia: " + this.agencia);
        System.out.println("===========");
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

    public gerente getGerente() {
        return gerente;
    }

    public void setGerente(gerente gerente) {
        this.gerente = gerente;
    }

    public cliente getCliente() {
        return cliente;
    }

    public void setCliente(cliente cliente) {
        this.cliente = cliente;
    }
}
