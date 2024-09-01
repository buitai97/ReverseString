import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class App implements ActionListener{
    String str;
    int count;
    JFrame frame;
    JLabel label;
    JPanel panel;
    JTextField text; 
    public App(){
        frame = new JFrame();
        JButton button = new JButton("Click");
        button.addActionListener(this);
        label = new JLabel();
        text = new JTextField();
        panel = new JPanel();

        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel.setLayout(new GridLayout(0, 1));
        panel.add(text);
        panel.add(button);
        panel.add(label);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Reverse A String");
        frame.pack();
        frame.setVisible(true); 
    }
    public static void main(String[] args){
        new App();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String str = text.getText();
        String reversedString = "";
        for (int i = str.length() - 1; i >= 0; i--){
            reversedString += str.charAt(i); 
        }
        text.setText("");

        label.setText("Reversed string: " + reversedString );
        frame.pack();

    }
}
