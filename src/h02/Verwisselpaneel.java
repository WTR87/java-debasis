package h02;

import javax.swing.*;
import java.awt.event.*;

public class Verwisselpaneel extends JPanel implements ActionListener
{
    private JButton actieknop;
    private JTextField veld1;
    private JTextField veld2;
    private String text1;
    private String text2;

    public Verwisselpaneel()
    {
        actieknop = new JButton("Verwissel");
        actieknop.addActionListener(this);
        veld1 = new JTextField(30);
        veld2 = new JTextField(30);
        add(veld1);
        add(actieknop);
        add(veld2);
    }

    public void actionPerformed(ActionEvent e) {
        text1 = veld1.getText();
        text2 = veld2.getText();

        veld1.setText(text2);
        veld2.setText(text1);
    }
}
