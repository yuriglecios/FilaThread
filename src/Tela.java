import javax.swing.*;
import java.awt.*;

//extendemos do jdialog pois ele que gerencia as telas do swing do java
public class Tela extends JDialog {

    private JPanel Painel = new JPanel();

    public Tela(){
        // tudo o que for executado será dentro desse construtor
        setTitle("Cadastro teste");
        setSize(new Dimension(240,240));
        setLocationRelativeTo(null); // centraliza a tela e como não tem nemhum outro componente será null
        setResizable(false);
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;

        setVisible(true);
    }
}
