package Cars;

import javax.swing.JFrame;

public class Car extends JFrame {
    public static void main(String[] args) {
        JFrame app = new JFrame();
        Work w = new Work();
        app.add(w);
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setSize(500, 700);
        app.setVisible(true);
    }

}
