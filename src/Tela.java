import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Tela extends JDialog {

    private JPanel painel = new JPanel(new GridBagLayout());

    private JLabel campoNome = new JLabel("Digite seu nome:");
    private JTextField adicionaNome = new JTextField();

    private JLabel campoEmail = new JLabel("Digite seu email:");
    private JTextField adicionaEmail = new JTextField();

    private JButton adicionar = new JButton("Add");
    private  JButton parar = new JButton("Parar");

    private Implementacao fila = new Implementacao();

    public Tela(){
        // tudo o que for executado será dentro desse construtor
        setTitle("Cadastro teste");
        setSize(new Dimension(240,240));
        setLocationRelativeTo(null); // centraliza a tela e como não tem nemhum outro componente será null
        setResizable(false);

        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = GridBagConstraints.WEST;
        gridBagConstraints.insets = new Insets(5,0,0,0);

        campoNome.setPreferredSize(new Dimension(200, 25));
        painel.add(campoNome, gridBagConstraints);
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        adicionaNome.setPreferredSize(new Dimension(240, 25));
        painel.add(adicionaNome, gridBagConstraints);

        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        campoEmail.setPreferredSize(new Dimension(200, 25));
        painel.add(campoEmail, gridBagConstraints);
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        adicionaEmail.setPreferredSize(new Dimension(240, 25));
        painel.add(adicionaEmail, gridBagConstraints);

        gridBagConstraints.gridwidth = 1;
        gridBagConstraints.gridy ++; // além da forma anterior podemos fazer dessa forma
        gridBagConstraints.gridx = 0;
        adicionar.setPreferredSize(new Dimension(100,25));
        painel.add(adicionar,gridBagConstraints);
        adicionar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (fila == null){
                    fila = new Implementacao();
                    fila.start();
                }

                for (int pos = 0; pos < 20; pos ++){
                    ObjetoFilaThread objetoFilaThread = new ObjetoFilaThread();
                    objetoFilaThread.setNome(adicionaNome.getText());
                    objetoFilaThread.setEmail(adicionaEmail.getText());
                    fila.add(objetoFilaThread);
                }

            }
        });

        gridBagConstraints.gridx ++;
        parar.setPreferredSize(new Dimension(100,25));
        painel.add(parar,gridBagConstraints);

        parar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fila.stop();
                fila = null;
            }
        });

        fila.start();
        add(painel,BorderLayout.WEST);
        setVisible(true);
    }
}
