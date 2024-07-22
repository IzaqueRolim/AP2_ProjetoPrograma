package view;

import model.Biblioteca;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaListarLivros extends JFrame {
    Biblioteca biblioteca;
    public TelaListarLivros(Biblioteca biblioteca) {
        this.biblioteca = biblioteca;
        setTitle("Lista de Livros");
        setVisible(true);
        setSize(800, 500);
        setResizable(true);
        setLocationRelativeTo(null);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        int margemDireita = 260;

        JLabel label = new JLabel("Livros:");
        label.setFont(new Font("Arial", Font.BOLD, 20));
        label.setBounds(margemDireita+70, 30, 200, 50);
        add(label);

        JButton botaoVoltar = new JButton("Voltar");

        JTextArea text = new JTextArea(biblioteca.listarLivros());
        text.setEditable(false);
        botaoVoltar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MenuLivros menuLivros = new MenuLivros(biblioteca);
                dispose();
            }
        });

        int widthButton = 250;
        int heightInput = 30;

        text.setBounds(180, 80, 400, 300);
        botaoVoltar.setBounds(margemDireita, 400, widthButton, heightInput);

        add(text);
        add(botaoVoltar);
    }

}
