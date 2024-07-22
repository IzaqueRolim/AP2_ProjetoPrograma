package model;

public class Usuario extends Pessoa {
    public Usuario(String nome, String email) {
        super(nome, email);
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Usuário: " + nome + ", Email: " + email);
    }
}
