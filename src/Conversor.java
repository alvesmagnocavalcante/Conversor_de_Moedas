import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class Conversor extends JFrame {
    private JPanel mainPanel;
    private JTextField DolarTextField;
    private JButton btnConverter;
    private JLabel labelDolares;
    private JLabel labelReais;

    public Conversor(String title){
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();
        btnConverter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DecimalFormat df = new DecimalFormat("00.00");
                double dolarDigitados = Double.parseDouble(DolarTextField.getText());
                double valorEmReais = dolarDigitados * 4.80;
                labelReais.setText("R$"+df.format(valorEmReais));
            }
        });
    }
    public static void main(String[] args) {
        JFrame frame = new Conversor("Titulo");
        frame.setVisible(true);
    }
}
