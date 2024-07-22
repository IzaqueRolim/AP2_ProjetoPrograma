package model;

import controller.GerenciamentoBiblioteca;

import java.util.ArrayList;
import java.util.List;
import java.lang.Override;

public class Biblioteca implements GerenciamentoBiblioteca {
    private List<Livro> livros;
    private List<Pessoa> pessoas;

    public Biblioteca() {
        livros = new ArrayList<>();
        pessoas = new ArrayList<>();
    }

    @Override
    public void adicionarLivro(String livro) throws Exception {

    }

    @Override
    public void adicionarLivro(Livro livro) throws Exception {
        if (livros.contains(livro)) {
            throw new Exception("O livro já está na biblioteca.");
        }
        livros.add(livro);
    }

    @Override
    public void removerLivro(String livro) throws Exception {
        if (!livros.contains(livro)) {
            throw new Exception("O livro não está na biblioteca.");
        }
        livros.remove(livro);
    }

    @Override
    public String listarLivros() {
        System.out.println("Livros na Biblioteca:");
        String livrosList = "";
        for (Livro livro : livros) {
            livrosList+=(livro.getTitulo()+", "+livro.getAutor()+", "+livro.getAnoPublicacao()+'\n');
        }
        return livrosList;
    }

    @Override
    public void adicionarPessoa(Pessoa pessoa) throws Exception {
        if (pessoas.contains(pessoa)) {
            throw new Exception("A pessoa já está na biblioteca.");
        }
        pessoas.add(pessoa);
    }

    @Override
    public void removerPessoa(Pessoa pessoa) throws Exception {
        if (!pessoas.contains(pessoa)) {
            throw new Exception("A pessoa não está na biblioteca.");
        }
        pessoas.remove(pessoa);
    }

    @Override
    public String listarPessoas() {
        String pessoasList = "";
        for (Pessoa pessoa : pessoas) {
            pessoasList+=(pessoa.nome+", email: "+pessoa.email+'\n');
        }
        return pessoasList;
    }
}

