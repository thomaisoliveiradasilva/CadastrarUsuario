import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CadastroUsuarioGUI extends JFrame {

    // componentes de interface Grafica

    private JTextField txtNome;
    private JTextField txtIdade;
    private JTextField txtTelefone;
    private JTextField txtEndereco;
    private JTextField txtLogin;
    private JPasswordField txtSenha;
    private JButton btCadastrar;
    private JButton btExibir;

    // aqui colocamos o objeto que criamos em outra clase
    private CadastroUsuario usuario;

    // Construtor da clase CadstroUsuarioGUI

    public CadastroUsuarioGUI() {
        // vamos iniciar e carregar o objeto da classe CadastrUario
        usuario = new CadastroUsuario();

        // vamos configurar a janela de exibição do programa
        setTitle("SISTEMA DE CADASTRO");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(8, 2, 5, 5)); // layout vom 8 linhas e 2 colunas
        //setLocationRelativeTo(null);

        // iniciando os componentes
        JLabel lblnome = new JLabel("Nome");
        txtNome = new JTextField();

        JLabel lblIdade = new JLabel("Idade");
        txtIdade = new JTextField();

        JLabel lblTelefone = new JLabel("Telefone");
        txtTelefone = new JTextField();

        JLabel lblEndereco = new JLabel("Endereço");
        txtEndereco = new JTextField();

        JLabel lblLogin = new JLabel("Login");
        txtLogin = new JTextField();

        JLabel lblSenha = new JLabel("Senha");
        txtSenha = new JPasswordField();

        btCadastrar = new JButton("Cadastrar");
        btExibir = new JButton("Exibir cadastro");

        // Vamos adicionar agora os componentes que criamos acima na janela para se
        // tornar visivel

        add(lblnome);
        add(txtNome);

        add(lblIdade);
        add(txtIdade);

        add(lblTelefone);
        add(txtTelefone);

        add(lblEndereco);
        add(txtEndereco);

        add(lblLogin);
        add(txtLogin);

        add(lblSenha);
        add(txtSenha);

        add(btCadastrar);
        add(btExibir);

        // Agora vamos adicionar a ação dos botões, significa que quando clicar ele vai
        // fazer alguma coisa

        btCadastrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cadastrarUsuario();
            }
        });

        btExibir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                exibirCadastro();
            }

        });

    }

    // Agora vamos criar o metodo para cadastrar o usuário
    private void cadastrarUsuario() {
        try {
            usuario.setNome(txtNome.getText());
            usuario.setIdade(Integer.parseInt(txtIdade.getText()));
            usuario.setTelefone(txtTelefone.getText());
            usuario.setEndereco(txtEndereco.getText());
            usuario.setLogin(txtLogin.getText());
            usuario.setSenha(new String(txtSenha.getPassword()));

            JOptionPane.showMessageDialog(this, "Cadastro Realizado com sucesso");

            // Aqui os campos escritos serão limpos apos ser preechido o cadastro

            txtNome.setText("");
            txtIdade.setText("");
            txtTelefone.setText("");
            txtEndereco.setText("");
            txtLogin.setText("");
            txtSenha.setText("");

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Erro: A idade dever ser um número Válido, ", "erro ",
                    JOptionPane.WARNING_MESSAGE);
        }
    }

    // Metodos para exibir os dados cadastrados
    private void exibirCadastro() {
        if (usuario.getNome() == null || usuario.getNome().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Nem um usuário cadastrado. ", "Aviso ", JOptionPane.WARNING_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this,
                    "=== Dados do Usuário ===\n" +
                            "Nome: " + usuario.getNome() + "\n" +
                            "Idade: " + usuario.getIdade() + "\n" +
                            "Telefone " + usuario.getTelefone() + "\n" +
                            "Endereço " + usuario.getEndereco() + "\n" +
                            "Login " + usuario.getLogin(),
                    "Cadastro", JOptionPane.INFORMATION_MESSAGE);

        }

    }
}
