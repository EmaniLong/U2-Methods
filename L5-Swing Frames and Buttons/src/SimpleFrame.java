import javax.swing.*;
import java.awt.event.ActionListener;

public class SimpleFrame
{

    public static void main(String[] args)
    {
    JFrame window = new JFrame("This Is A Simple Window");
    JPanel panel = new JPanel();
    JButton button = new JButton("Click for $1");

    window.setSize(800,600);
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



    window.setLocationRelativeTo(null);



    panel.add(button);
    window.add(panel);

    window.setVisible(true);
    }

    private class ButtonListener implements ActionListener{

        

    }
}
