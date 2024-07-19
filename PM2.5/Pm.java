
import javax.swing.*;
import java.awt.*;


public class Pm {
     public static void main(String[] args) {
          JFrame frame = new JFrame("My Application");
          frame.setSize(800,400); 
          frame.setLocationRelativeTo(null);
          frame.setLayout(new GridLayout());

          JPanel panel = new JPanel();
          panel.setLayout(new GridBagLayout());

          Color color = new Color(153, 255, 255);
          panel.setBackground(color);

          JButton button1 = new JButton("Strat !!!");
          button1.setPreferredSize(new Dimension(150, 40));
          JButton button2 = new JButton("Creator ");
          button2.setPreferredSize(new Dimension(150, 40));
          JButton button3 = new JButton("## Exit ##");
          button3.setPreferredSize(new Dimension(150, 40));

          GridBagConstraints gbc = new GridBagConstraints();
          gbc.insets = new Insets(2, 5, 2, 5);

          gbc.gridx = 0;
          gbc.gridy = 0;
          gbc.gridwidth = 1;
          panel.add(button1, gbc);

          gbc.gridx = 0;
          gbc.gridy = 1;
          panel.add(button2);

          gbc.gridwidth = 2; 
          panel.add(button3, gbc);


          frame.add(panel);
          frame.setVisible(true);
          frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     }
}

// gbc.insets = new Insets(5, 5, 5, 5);
// gbc.gridx = 1 ;

// gbc.gridx = 0;
// gbc.gridy = 0;
// gbc.gridwidth = 1;
// panel.add(button1, gbc);

// gbc.gridx = 0;
// gbc.gridy = 1;
// gbc.gridwidth = 2; 
// panel.add(button2);

// gbc.gridx = 0;
// gbc.gridy = 1;
// gbc.gridwidth = 2; 
// panel.add(button3, gbc);


