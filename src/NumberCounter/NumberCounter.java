package NumberCounter;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NumberCounter extends JFrame {
    private JPanel contentPane;
    private JButton decreaseButton;
    private JButton increaseButton;
    private JLabel countLabel;

    private int counter = 0;

    public NumberCounter(){

        setTitle("Number Counter");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(320, 195);
        setLocationRelativeTo(null);

        decreaseButton.setName("Decrease Button");
        increaseButton.setName("Increase Button");
        countLabel.setName("Count Label");

        add(contentPane);

        decreaseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == decreaseButton){
                    counter--;
                }

                countLabel.setText(String.valueOf(counter));
            }
        });

        increaseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == increaseButton){
                    counter++;
                }

                countLabel.setText(String.valueOf(counter));
            }
        });

        setVisible(true);
    }
}
