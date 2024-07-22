package view;

import model.Biblioteca;
import model.Livro;
import model.Usuario;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaAdicionarLivro extends JFrame {
    Biblioteca biblioteca;
    public TelaAdicionarLivro(Biblioteca biblioteca) {
        this.biblioteca = biblioteca;
        setTitle("Adicionar Livro");
        setVisible(true);
        setSize(800, 500);
        setResizable(true);
        setLocationRelativeTo(null);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        int margemDireita = 260;

        JLabel label = new JLabel("Adicionar Usuario");
        label.setFont(new Font("Arial", Font.BOLD, 20));
        label.setBounds(margemDireita+30, 20, 200, 50);
        add(label);
        // label.setHorizontalAlignment(SwingConstants.CENTER);

        JLabel labelCodigo = new JLabel("Codigo do Livro");
        JTextField textFieldCodigo = new JTextField();

        JLabel labelTitulo= new JLabel("Titulo do Livro");
        JTextField textFieldTitulo = new JTextField();

        JLabel labelAutor = new JLabel("Autor do Livro");
        JTextField textFieldAutor = new JTextField();

        JLabel labelAnoPublicacao = new JLabel("Ano De Publicação");
        JTextField textFieldAnoPublicacao = new JTextField();

        JLabel labelEditora = new JLabel("Editora do Livro");
        JTextField textFieldEditora = new JTextField();

        JLabel labelEstoque = new JLabel("Ano De Publicação");
        JTextField textFieldEstoque = new JTextField();

        JButton botaoSalvar = new JButton("Salvar");
        JButton botaoVoltar = new JButton("Voltar");

        botaoSalvar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String codigo = textFieldCodigo.getText();
                String titulo = textFieldTitulo.getText();
                String autor = textFieldAutor.getText();
                String anoPublicacao = textFieldAnoPublicacao.getText();
                String editora = textFieldEditora.getText();
                String estoque = textFieldEstoque.getText();
                Livro livro = new Livro(codigo,titulo,autor,editora,anoPublicacao,estoque);

                try {
                    biblioteca.adicionarLivro(livro);
                    JOptionPane.showMessageDialog(null, "Livro adicionado com sucesso!");

                    System.out.println(biblioteca.listarLivros());

                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Erro ao adicionar usuário: " + ex.getMessage());
                }

            }
        });

        botaoVoltar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MenuLivros menuUsuarios = new MenuLivros(biblioteca);
                dispose();
            }
        });

        int widthButton = 250;
        int heightInput = 20;

        labelCodigo.setBounds(margemDireita, 70, 200, 30);
        textFieldCodigo.setBounds(margemDireita, 100, widthButton, heightInput);
        labelTitulo.setBounds(margemDireita, 120, 200, 30);
        textFieldTitulo.setBounds(margemDireita, 150, widthButton, heightInput);
        labelAutor.setBounds(margemDireita, 170, 200, 30);
        textFieldAutor.setBounds(margemDireita, 200, widthButton, heightInput);
        labelAnoPublicacao.setBounds(margemDireita, 220, 200, 30);
        textFieldAnoPublicacao.setBounds(margemDireita, 250, widthButton, heightInput);
        labelEditora.setBounds(margemDireita, 270, 200, 30);
        textFieldEditora.setBounds(margemDireita, 300, widthButton, heightInput);
        labelEstoque.setBounds(margemDireita, 320, 200, 30);
        textFieldEstoque.setBounds(margemDireita, 350, widthButton, heightInput);
        botaoSalvar.setBounds(margemDireita, 380, widthButton, heightInput);
        botaoVoltar.setBounds(margemDireita, 410, widthButton, heightInput);


        add(labelCodigo);
        add(textFieldCodigo);
        add(labelTitulo);
        add(textFieldTitulo);
        add(labelAutor);
        add(textFieldAutor);
        add(labelAnoPublicacao);
        add(textFieldAnoPublicacao);
        add(labelEditora);
        add(textFieldEditora);
        add(labelEstoque);
        add(textFieldEstoque);
        add(botaoSalvar);
        add(botaoVoltar);
    }
}