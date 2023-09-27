
import Usuarios.cliente;
import Usuarios.gerente;
import Contas.ContaCorrente;
import Contas.ContaPoupanca;

public class main {
    public static void main(String[] args) {
        
        cliente italo = new cliente("Ítalo Tavares", "000025163", "09/04/2001");
        cliente jefferson = new cliente("Jefferson Sousa", "518166819", "11/05/1999");
        gerente wellington = new gerente("Wellington Nem", "892925789", "11/08/1985");

        ContaCorrente conta1 = new ContaCorrente(italo, wellington);
        ContaPoupanca conta2 = new ContaPoupanca(jefferson, wellington);

        conta1.depositar(1000);
        conta1.sacar(200);
        conta1.exibirInfosCC();
        System.out.println("===========");

        conta2.depositar(5000);
        conta2.sacar(500);
        conta2.exibirInfosPoupanca();
        System.out.println("===========");

        italo.exibirInfosUsuarios();
        System.out.println("===========");
        jefferson.exibirInfosUsuarios();
        System.out.println("===========");
        wellington.exibirInfosUsuarios();
        System.out.println("===========");

        wellington.oferecerInvestimento(jefferson);
        System.out.println("===========");

        conta1.usarCredito(200);
        conta1.exibirInfosCC();
        System.out.println("===========");

        conta2.guardarDinheiro(1000);
        conta2.exibirInfosPoupanca();
    

    }
}
    

