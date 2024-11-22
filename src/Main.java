import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args) throws Exception {
        SwingUtilities.invokeLater(() -> {
            CadastroUsuarioGUI janela = new CadastroUsuarioGUI();
            janela.setVisible(true);
        });

    }
}
