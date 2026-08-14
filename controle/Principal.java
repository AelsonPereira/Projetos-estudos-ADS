package controle;

import modelo.Cliente;
import modelo.Veiculo;

public class Principal {

    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("123.456.789-00", "Joao da Silva", "Rua das Flores, 100", "(11) 98888-7777", "joao@email.com");

        Veiculo veiculo1 = new Veiculo("ABC-1234", "Gol", 2015, "Volkswagen", "Prata");

        cliente1.exibirDados();
        System.out.println();
        veiculo1.exibirDados();

        System.out.println();
        System.out.println("Veiculo do cliente " + cliente1.getNome() + " deu entrada na oficina.");
    }
}
