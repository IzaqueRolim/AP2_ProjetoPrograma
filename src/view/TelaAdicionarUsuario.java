package view;

import model.Biblioteca;
import model.Usuario;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaAdicionarUsuario extends JFrame{
    Biblioteca biblioteca;
    public TelaAdicionarUsuario(Biblioteca biblioteca) {
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
        label.setBounds(margemDireita+30, 60, 200, 50);
        add(label);
        // label.setHorizontalAlignment(SwingConstants.CENTER);

        JLabel labelNome = new JLabel("Nome do Usuario");
        labelNome.setBounds(margemDireita, 120, 200, 30);
        JTextField textFieldNome = new JTextField();


        JLabel labelEmail= new JLabel("Email do Usuario");
        labelEmail.setBounds(margemDireita, 190, 200, 30);
        JTextField textFieldEmail = new JTextField();

        JLabel labelSenha= new JLabel("Senha do Usuario");
        labelSenha.setBounds(margemDireita, 265, 200, 30);
        JPasswordField textFieldSenha = new JPasswordField();

        JButton botaoSalvar = new JButton("Salvar");
        JButton botaoVoltar = new JButton("Voltar");

        botaoSalvar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nome = textFieldNome.getText();
                String email = textFieldEmail.getText();
                Usuario usuario = new Usuario(nome, email);

                try {
                    biblioteca.adicionarPessoa(usuario);
                    JOptionPane.showMessageDialog(null, "Usuário adicionado com sucesso!");
                    textFieldEmail.setText("");
                    textFieldNome.setText("");
                    textFieldSenha.setText("");
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Erro ao adicionar usuário: " + ex.getMessage());
                }

            }
        });

        botaoVoltar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Usuarios menuUsuarios = new Usuarios(biblioteca);
                dispose();
            }
        });

        int widthButton = 250;
        int heightInput = 30;

        textFieldNome.setBounds(margemDireita, 150, widthButton, heightInput);
        textFieldEmail.setBounds(margemDireita, 220, widthButton, heightInput);
        textFieldSenha.setBounds(margemDireita, 290, widthButton, heightInput);
        botaoSalvar.setBounds(margemDireita, 360, widthButton, heightInput);
        botaoVoltar.setBounds(margemDireita, 400, widthButton, heightInput);


        add(labelNome);
        add(textFieldNome);
        add(labelEmail);
        add(textFieldEmail);
        add(labelSenha);
        add(textFieldSenha);
        add(botaoSalvar);
        add(botaoVoltar);
    }
}