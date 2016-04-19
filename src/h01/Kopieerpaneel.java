package h01;

import javax.swing.*;
import java.awt.event.*;

public class Kopieerpaneel extends JPanel implements ActionListener
{
    private JTextArea veld1;
    private JTextArea veld2;
    private JButton actieknop;

    public Kopieerpaneel()
    {
        actieknop = new JButton(">Kopieer>");
        actieknop.addActionListener(this);
        veld1 = new JTextArea(3,40);
        veld2 = new JTextArea(3,40);
        veld1.setToolTipText("Vul in dit vak een woord in");
        veld2.setToolTipText("Hier komt een kopie van het linkerveld");
        actieknop.setToolTipText("Klik om de tekst van links naar rechts te brengen");
        add(veld1);
        add(actieknop);
        add(veld2);
    }

    public void actionPerformed(ActionEvent e)
    {
        veld2.setText(veld1.getText());
    }
}
