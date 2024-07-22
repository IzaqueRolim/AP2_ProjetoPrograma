package view;

import model.Biblioteca;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Usuarios extends JFrame {
    Biblioteca biblioteca;
    public Usuarios(Biblioteca biblioteca) {
        this.biblioteca = biblioteca;
        setTitle("Usuarios");
        setVisible(true);
        setSize(800,500);
        setResizable(true);
        setLocationRelativeTo(null);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        int margemDireita = 300;

        JLabel label = new JLabel("Menu Usuarios");
        label.setFont(new Font("Arial", Font.BOLD, 20));
        label.setBounds(margemDireita,60,200,50);
        add(label);
        // label.setHorizontalAlignment(SwingConstants.CENTER);

        JButton botaoAdicionarUsuario = new JButton("Adicionar Usuarios");
        JButton botaoRemoverUsuario = new JButton("Remover Usuarios");
        JButton botaoListarUsuario = new JButton("Listar Usuarios");
        JButton botaoVoltar = new JButton("Voltar");

        int widthButton = 150;
        int heightButton = 50;

        botaoAdicionarUsuario.setBounds(margemDireita,150,widthButton,heightButton);
        botaoListarUsuario.setBounds(margemDireita,220,widthButton,heightButton);
        botaoVoltar.setBounds(margemDireita,360,widthButton,heightButton);

        botaoAdicionarUsuario.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TelaAdicionarUsuario menuPrincipal = new TelaAdicionarUsuario(biblioteca);
                dispose();
            }
        });
        botaoListarUsuario.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TelaListarUsuario telaListarUsuario = new TelaListarUsuario(biblioteca);
                dispose();
            }
        });
        botaoVoltar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MenuPrincipal menuPrincipal = new MenuPrincipal(biblioteca);
                dispose();
            }
        });
        add(botaoAdicionarUsuario);
        add(botaoRemoverUsuario);
        add(botaoListarUsuario);
        add(botaoVoltar);
    }


}