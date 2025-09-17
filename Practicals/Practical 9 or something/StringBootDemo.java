package javapractical;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

class Grid {
    JTextField t1, t2; 
    JRadioButton rb1, rb2;
    JPanel p1; 
    JFrame f1; 
    JButton b1;

    Grid() {
        t1 = new JTextField(10);
        t2 = new JTextField(10);

        rb1 = new JRadioButton("First");
        rb2 = new JRadioButton("Second");

        b1 = new JButton("Clear");

        // Create a ButtonGroup to make sure only one radio button is selected at a time
        ButtonGroup group = new ButtonGroup();
        group.add(rb1);
        group.add(rb2);

        // Action listener for radio button 1
        rb1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (rb1.isSelected()) {
                    // Show text from t2 in t1 when "First" is selected
                    t1.setText(t2.getText());
                    t2.setText(""); // Clear t2
                }
            }
        });

        // Action listener for radio button 2
        rb2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (rb2.isSelected()) {
                    // Show text from t1 in t2 when "Second" is selected
                    t2.setText(t1.getText());
                    t1.setText(""); // Clear t1
                }
            }
        });

        // Action listener for the "Clear" button
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                t1.setText(""); // Clear the first text field
                t2.setText(""); // Clear the second text field
                rb1.setSelected(false); // Unselect both radio buttons
                rb2.setSelected(false);
            }
        });

        // Panel layout setup
        p1 = new JPanel();
        p1.setLayout(new GridLayout(4, 2));

        p1.add(t1); p1.add(new JLabel("")); // Text field 1
        p1.add(t2); p1.add(new JLabel("")); // Text field 2
        p1.add(rb1); p1.add(rb2); // Radio buttons
        p1.add(b1); // Clear button

        // Frame setup
        f1 = new JFrame(); 
        f1.add(p1);
        f1.pack();
        f1.setVisible(true);
    }
}

public class SpringBootDemo {
    public static void main(String[] args) {
        new Grid();
    }
}
