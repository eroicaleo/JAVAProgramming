import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AppGraphInOut {
    public static void main(String[] args) {
        new AppFrame();
    }
}

class AppFrame extends JFrame {
    private JTextField in = new JTextField(10);
    private JButton btn = new JButton("Get square root!");
    private JLabel out = new JLabel("Display");

    public AppFrame() {
        setLayout(new FlowLayout());
        getContentPane().add(in);
        getContentPane().add(btn);
        getContentPane().add(out);
        setSize(400, 400);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);
    }
}
