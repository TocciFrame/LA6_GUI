package FoodOrderingSystem;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                FoodOrderingSystem foodOrderingSystem = new FoodOrderingSystem();
                foodOrderingSystem.setVisible(true);
            }
        });
    }
}
