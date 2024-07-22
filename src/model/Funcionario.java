package model;

public class Funcionario extends Pessoa {
    public Funcionario(String nome, String email) {
        super(nome, email);
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Funcionário: " + nome + ", Email: " + email);
    }
}