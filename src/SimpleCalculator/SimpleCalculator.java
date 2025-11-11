package SimpleCalculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCalculator extends JFrame {
    private JPanel contentPanel;
    private JButton btnCompute;
    private JTextField tfNumber1;
    private JTextField tfNumber2;
    private JComboBox<String> cbOperations;
    private JLabel lblResult;

    public SimpleCalculator(){
        setTitle("Simple Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(375, 175);
        setResizable(false);
        setLocationRelativeTo(null);

        btnCompute.setName("Compute Button");
        tfNumber1.setName("1st Number");
        tfNumber2.setName("2nd Number");
        cbOperations.setName("Operations Combo Box");
        lblResult.setName("Result Label");

        lblResult.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 1));
        lblResult.setOpaque(true);

        cbOperations.addItem("+");
        cbOperations.addItem("-");
        cbOperations.addItem("*");
        cbOperations.addItem("/");

        add(contentPanel);

        btnCompute.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == btnCompute){
                    lblResult.setText(String.valueOf(calculator()));
                }
            }
        });

        setVisible(true);
    }

    public int calculator(){
        int a = Integer.parseInt(tfNumber1.getText());
        int b = Integer.parseInt(tfNumber2.getText());
        int res = 0;
        String ops = (String) cbOperations.getSelectedItem();

        switch (ops){
            case "+": res = a + b; break;
            case "-": res = a - b; break;
            case "*": res = a * b; break;
            case "/": res = a / b; break;
        }
        return res;
    }
}
