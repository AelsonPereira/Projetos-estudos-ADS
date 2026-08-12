package escola;

public class Principal {

    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE GESTÃO - ESCOLA XYZ ===\n");

        Aluno aluno1 = new Aluno();
        aluno1.setNome("Lucas Silva");
        aluno1.setEndereco("Rua das Flores, 123 - São Paulo/SP");
        aluno1.setTelefone("(11) 98765-4321");
        aluno1.setEmail("lucas.silva@email.com");
        aluno1.setMatricula("XYZ-2026001");


        
        Aluno aluno2 = new Aluno(
            "Mariana Oliveira",
            "Av. Paulista, 1000 - São Paulo/SP",
            "(11) 91234-5678",
            "mariana.oliveira@email.com",
            "XYZ-2026002"
        );



        aluno1.exibirInformacoes();
        aluno2.exibirInformacoes();
    }
}
