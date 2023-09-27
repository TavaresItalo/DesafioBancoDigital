package Usuarios;


public abstract class usuarios {
   protected String nome;
   protected String cpf;
   protected String dataNascimento;

    public usuarios(String nome,String cpf,String dataNascimento) {
       this.nome = nome;
       this.cpf = cpf;
       this.dataNascimento = dataNascimento;
    }

    public void exibirInfosUsuarios() {
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF; " + this.cpf);
        System.out.println("Data de nascimento: " + this.dataNascimento);
    }

    public String getCpf() {
        return cpf;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
