
    import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

    public class Event {
        public static void main(String[] args) {
            JFrame frame = new JFrame("Event Handling Example");
            JButton button = new JButton("Click Me");

            button.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    // This code will be executed when the button is clicked
                    JOptionPane.showMessageDialog(null, "Button clicked!");
                }
            });

            frame.getContentPane().add(button);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.pack();
            frame.setVisible(true);
        }
    }

