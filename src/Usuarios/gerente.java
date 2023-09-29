package Usuarios;
public class gerente extends usuarios {
   public gerente(String nome, String cpf, String dataNascimento) {
      super(nome, cpf, dataNascimento);
   }

   public void oferecerInvestimento(cliente cliente) {
      System.out.println("Olá Sr. " + cliente.nome);
      System.out.println("Estamos com algumas opurtunidades muito boas de investimento.");
      System.out.println("Entre elas temos: CDB, Renda Fixa e Fundos Imobiliários. ");
      System.out.println("===========");

   }
}
