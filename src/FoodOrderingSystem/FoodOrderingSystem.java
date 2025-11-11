package FoodOrderingSystem;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FoodOrderingSystem extends JFrame{
    private JPanel contentPanel;

    private JButton btnOrder;

    private JCheckBox cPizza;
    private JCheckBox cBurger;
    private JCheckBox cFries;
    private JCheckBox cSoftDrinks;
    private JCheckBox cTea;
    private JCheckBox cSundae;

    private JRadioButton rbNone;
    private JRadioButton rb5;
    private JRadioButton rb10;
    private JRadioButton rb15;

    private JLabel foodsLabel;
    private JLabel discountsLabel;

    public FoodOrderingSystem(){
        setTitle("Food Ordering System");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300,280);
        setResizable(false);
        setLocationRelativeTo(null);

        btnOrder.setName("Order Button");
        foodsLabel.setName("Foods Label");
        discountsLabel.setName("Discounts Label");
        cPizza.setName("Pizza Checkbox");
        cBurger.setName("Burger Checkbox");
        cFries.setName("Fries Checkbox");
        cSoftDrinks.setName("Softdrinks Checkbox");
        cTea.setName("Tea Checkbox");
        cSundae.setName("Sundae Checkbox");
        rbNone.setName("None Radio Button");
        rb5.setName("5% Radio Button");
        rb10.setName("10% Radio Button");
        rb15.setName("15% Radio Button");

        ButtonGroup rbGroup = new ButtonGroup();
        rbGroup.add(rbNone);
        rbGroup.add(rb5);
        rbGroup.add(rb10);
        rbGroup.add(rb15);

        add(contentPanel);

        btnOrder.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double discount = calculateRawTotal() * getDiscount();
                double amount = calculateRawTotal() - discount;
                if (e.getSource() == btnOrder){
                    System.out.printf("The total price is Php %.2f\n", amount);
                }
            }
        });

        setVisible(true);
    }

    public double calculateRawTotal(){
        double total = 0.0;

        if (cPizza.isSelected()){
            total += 100;
        }
        if (cBurger.isSelected()){
            total += 80;
        }
        if (cFries.isSelected()){
            total += 65;
        }
        if (cSoftDrinks.isSelected()){
            total += 55;
        }
        if (cTea.isSelected()){
            total += 50;
        }
        if (cSundae.isSelected()){
            total += 40;
        }

        return total;
    }

    public double getDiscount(){
        if (rbNone.isSelected()){
            return 0.0;
        } else if (rb5.isSelected()){
            return 0.05;
        } else if (rb10.isSelected()){
            return 0.10;
        } else if (rb15.isSelected()){
            return 0.15;
        }
        return 0.0;
    }
}
