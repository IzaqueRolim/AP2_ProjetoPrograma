package view;

import model.Biblioteca;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuPrincipal extends JFrame {
    Biblioteca biblioteca;
    public MenuPrincipal(Biblioteca biblioteca) {
        this.biblioteca = biblioteca;
        setTitle("Menu Principal");
        setVisible(true);
        setSize(800,500);
        setResizable(true);
        setLocationRelativeTo(null);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        int margemDireita = 300;

        JLabel label = new JLabel("Menu Principal");
        label.setFont(new Font("Arial", Font.BOLD, 20));
        label.setBounds(margemDireita,50,200,50);
        add(label);
        // label.setHorizontalAlignment(SwingConstants.CENTER);

        JButton botaoUsuario = new JButton("Usuarios");
        JButton botaoLivros = new JButton("Livros");
        JButton botaoSair = new JButton("Sair");

        botaoUsuario.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                Usuarios usuarios = new Usuarios(biblioteca);
                dispose();
            }
        });
        botaoLivros.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                MenuLivros livros = new MenuLivros(biblioteca);
                dispose();
            }
        });
        int widthButton = 150;
        int heightButton = 50;

        botaoUsuario.setBounds(margemDireita,150,widthButton,heightButton);
        botaoLivros.setBounds(margemDireita,220,widthButton,heightButton);
        botaoSair.setBounds(margemDireita,290,widthButton,heightButton);

        add(botaoUsuario);
        add(botaoLivros);
        add(botaoSair);
    }


}
