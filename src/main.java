
import Usuarios.cliente;
import Usuarios.gerente;
import Contas.ContaCorrente;
import Contas.ContaPoupanca;
import Contas.ContaTesouroDireto;

public class main {
    public static void main(String[] args) {
        
        cliente italo = new cliente("Ítalo Tavares", "000025163", "09/04/2001");
        cliente jefferson = new cliente("Jefferson Sousa", "518166819", "11/05/1999");
        gerente wellington = new gerente("Wellington Nem", "892925789", "11/08/1985");

        ContaCorrente conta1 = new ContaCorrente(italo, 1000);
        ContaPoupanca conta2 = new ContaPoupanca(jefferson, 4000);

       conta1.exibirInfos();
       conta1.depositar(100);
       conta1.exibirInfos();
       conta1.depositar(400);
       conta1.exibirInfos();
       conta1.sacar(200);
       conta1.exibirInfos();

        
        
        conta2.guardarDinheiro(1000);
        conta2.exibirInfos();
        conta2.aplicarJuros();
        conta2.exibirInfos();

        ContaPoupanca[] arrayContaPoupanca = new ContaPoupanca[10];

        ContaTesouroDireto contaTesouro = new ContaTesouroDireto(jefferson, 1000);
        arrayContaPoupanca[0] = contaTesouro;

        ContaPoupanca contaPoupanca = new ContaPoupanca(italo, 1000);
        arrayContaPoupanca[1] = contaPoupanca;

        

        System.out.println(arrayContaPoupanca[0].getSaldo());
        System.out.println(arrayContaPoupanca[1].getSaldo());
        arrayContaPoupanca[0].depositar(500);
        System.out.println(arrayContaPoupanca[0].getSaldo());
        arrayContaPoupanca[1].depositar(500);
        System.out.println(arrayContaPoupanca[1].getSaldo());
        arrayContaPoupanca[0].aplicarJuros();
        System.out.println(arrayContaPoupanca[0].getSaldo());
        arrayContaPoupanca[1].aplicarJuros();
        System.out.println(arrayContaPoupanca[1].getSaldo());
    


    

    }
}
    

