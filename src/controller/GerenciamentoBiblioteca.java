package controller;

import model.Livro;
import model.Pessoa;

import java.util.List;

public interface GerenciamentoBiblioteca {
    void adicionarLivro(String livro) throws Exception;

    void adicionarLivro(Livro livro) throws Exception;

    void removerLivro(String livro) throws Exception;
    String listarLivros();

    void adicionarPessoa(Pessoa pessoa) throws Exception;
    void removerPessoa(Pessoa pessoa) throws Exception;

    String listarPessoas();
}
