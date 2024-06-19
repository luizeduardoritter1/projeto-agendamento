package br.com.barbearia.view;

import javax.swing.*;  // Importa todas as classes da biblioteca javax.swing
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainView extends JFrame { // Declaração da classe MainView que herda de JFrame

    JButton btnCadastrarCliente; // Botão para acessar a tela de cadastro de cliente
    JButton btnCadastrarServico; // Botão para acessar a tela de cadastro de serviço
    JButton btnAgendar; //Botão para acessar a tela de agendamento
    JButton btnConsultar; //Botão para acessar a tela de consulta de agendamento

    public MainView () { //Construtor da classe MainView

        btnCadastrarCliente = new JButton("Cadastrar Cliente"); // Inicializa o botão de cadastro de clientes
        btnCadastrarServico = new JButton("Cadastrar Serviço"); // Inicializa o botão de cadastro de serviço
        btnAgendar = new JButton("Agendar"); // Inicializa o botão de agendar
        btnConsultar = new JButton("Cunsultar Agendamentos"); // Inicializa o botão de consultar agendamentos

        setLayout(new java.awt.GridLayout(2,2)); // Define o layout da janela como um grid de 2x2
        add(btnCadastrarCliente); // Adiciona o botão de cadastro de clientes à janela
        add(btnCadastrarServico); // Adiciona o botão de cadastro de serviço à janela
        add(btnAgendar); // Adiciona o botão de agendamento à janela
        add(btnConsultar); // Adiciona o botão de consulta de agendamento à janela

        btnCadastrarCliente.addActionListener(new ActionListener() { // Adiciona um listener ao botão de cadastro de clientes
            @Override
            public void actionPerformed(ActionEvent e) { // Define a ação a ser executada quando o botão for pressionado
                new ClienteView(); // Abre a tela de cadastro de clientes
            }
        });

        btnCadastrarServico.addActionListener(new ActionListener() { // Adiciona um listener ao botão de cadastro de serviços
            @Override
            public void actionPerformed(ActionEvent e) { // Define a ação a ser executada quando o botão for pressionado
                new ServicoView(); // Abre a tela de cadastro de serviços
            }
        });

        btnAgendar.addActionListener(new ActionListener() { // Adiciona um listener ao botão de agendamento
            @Override
            public void actionPerformed(ActionEvent e) { // Define a ação a ser executada quando o botão for pressionado
                new AgendamentoView(); // Abre a tela de agendamento
            }
        });

        btnConsultar.addActionListener(new ActionListener() { // Adiciona um listener ao botão de consulta de agendamentos
            @Override
            public void actionPerformed(ActionEvent e) { // Define a ação a ser executada quando o botão for pressionado
                new ConsultarView(); // Abre a tela de consulta de agendamentos
            }
        });

        setSize(800, 500); //Define o tamanho
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Define a ação de fechar a janela como encerrar o programa
        setVisible(true); //Torna a janela visível

    }

    public static void main(String[] args) {
        new MainView(); // Cria uma nova instância da janela principal
    }
}
