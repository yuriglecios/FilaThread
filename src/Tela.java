import javax.swing.*;
import java.awt.*;

public class Tela extends JDialog {

    private JPanel Painel = new JPanel(new GridBagLayout());

    private JLabel campoNome = new JLabel("Nome:");
    private JLabel campoEmail = new JLabel("Email:");

    public Tela(){
        // tudo o que for executado será dentro desse construtor
        setTitle("Cadastro teste");
        setSize(new Dimension(240,240));
        setLocationRelativeTo(null); // centraliza a tela e como não tem nemhum outro componente será null
        setResizable(false);

        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        campoNome.setPreferredSize(new Dimension(200, 50));
        Painel.add(campoNome);


        add(Painel,BorderLayout.WEST);
        setVisible(true);
    }
}
