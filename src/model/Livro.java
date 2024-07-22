package model;

public class Livro {
    private String codigo;
    private String titulo;
    private String autor;
    private String editora;
    private String anoPublicacao;
    private String estoque;

    public Livro(String codigo, String titulo, String autor, String editora, String anoPublicacao, String estoque) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.anoPublicacao = anoPublicacao;
        this.estoque = estoque;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getEditora() {
        return editora;
    }

    public String getAnoPublicacao() {
        return anoPublicacao;
    }

    public String getEstoque() {
        return estoque;
    }
}
