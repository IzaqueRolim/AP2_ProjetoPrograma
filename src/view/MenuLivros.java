package view;

import model.Biblioteca;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuLivros extends JFrame {
    Biblioteca biblioteca;
    public MenuLivros(Biblioteca biblioteca) {
        this.biblioteca = biblioteca;
        setTitle("Menu Livros");
        setVisible(true);
        setSize(800,500);
        setResizable(true);
        setLocationRelativeTo(null);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        int margemDireita = 300;

        JLabel label = new JLabel("Menu Livros");
        label.setFont(new Font("Arial", Font.BOLD, 20));
        label.setBounds(margemDireita,60,200,50);
        add(label);
        // label.setHorizontalAlignment(SwingConstants.CENTER);

        JButton botaoAdicionarLivro = new JButton("Adicionar Livros");

        JButton botaoListarLivro = new JButton("Listar Livros");
        JButton botaoVoltar = new JButton("Voltar");

        botaoAdicionarLivro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                TelaAdicionarLivro telaAdicionarLivro = new TelaAdicionarLivro(biblioteca);
            }
        });
        botaoListarLivro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                TelaListarLivros telaListarLivro = new TelaListarLivros(biblioteca);
            }
        });

        botaoVoltar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                MenuPrincipal menuPrincipal = new MenuPrincipal(biblioteca);
            }
        });

        int widthButton = 150;
        int heightButton = 50;

        botaoAdicionarLivro.setBounds(margemDireita,150,widthButton,heightButton);
        botaoListarLivro.setBounds(margemDireita,220,widthButton,heightButton);
        botaoVoltar.setBounds(margemDireita,360,widthButton,heightButton);

        add(botaoAdicionarLivro);
        add(botaoListarLivro);
        add(botaoVoltar);
    }


}