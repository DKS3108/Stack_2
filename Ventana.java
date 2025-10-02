import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana {
    private JPanel principal;
    private JTextArea textcodigo;
    private JButton btncomprobar;
    private JLabel lblresultado;

    Pila pila = new Pila();

    public Ventana() {
        btncomprobar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String codigo = textcodigo.getText();
                    if (pila.balanceado(codigo)) {
                        lblresultado.setText("codigo balanceado");
                    } else {
                        lblresultado.setText("codigo no balanceado");
                    }
                } catch (Exception ex) {
                    lblresultado.setText(ex.getMessage());
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Ventana");
        frame.setContentPane(new Ventana().principal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

}
