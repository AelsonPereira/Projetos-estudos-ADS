package escola;

public class Aluno {
    private String nome;
    private String endereco;
    private String telefone;
    private String email;
    private String matricula;

    public Aluno() {
    }

    public Aluno(String nome, String endereco, String telefone, String email, String matricula) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail()     {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }


    public void exibirInformacoes() {
        System.out.println("----------------------------------------");
        System.out.println("Ficha de Cadastro do Aluno");
        System.out.println("----------------------------------------");
        System.out.println("Matrícula : " + this.matricula);
        System.out.println("Nome      : " + this.nome);
        System.out.println("Endereço  : " + this.endereco);
        System.out.println("Telefone  : " + this.telefone);
        System.out.println("E-mail    : " + this.email);
        System.out.println("----------------------------------------\n");
    }
}