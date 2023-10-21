import javax.swing.*;
import java.awt.*;

public class Tela extends JDialog {

    private JPanel Painel = new JPanel(new GridBagLayout());

    private JLabel campoNome = new JLabel("Nome:");
    private JTextField adicionaNome = new JTextField();

    private JLabel campoEmail = new JLabel("Email:");
    private JTextField adicionaEmail = new JTextField();

    private JButton adicionar = new JButton();

    public Tela(){
        // tudo o que for executado será dentro desse construtor
        setTitle("Cadastro teste");
        setSize(new Dimension(240,240));
        setLocationRelativeTo(null); // centraliza a tela e como não tem nemhum outro componente será null
        setResizable(false);

        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        campoNome.setPreferredSize(new Dimension(200, 25));
        Painel.add(campoNome, gridBagConstraints);
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        adicionaNome.setPreferredSize(new Dimension(200, 25));
        Painel.add(adicionaNome, gridBagConstraints);

        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        campoEmail.setPreferredSize(new Dimension(200, 25));
        Painel.add(campoEmail, gridBagConstraints);
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        adicionaEmail.setPreferredSize(new Dimension(200, 25));
        Painel.add(adicionaEmail, gridBagConstraints);


        add(Painel,BorderLayout.WEST);
        setVisible(true);
    }
}
