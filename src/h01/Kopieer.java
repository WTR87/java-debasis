package h01;

import javax.swing.*;

public class Kopieer extends JFrame
{
    public Kopieer()
    {
        JFrame venster = new JFrame();
        venster.setSize(500,200);
        venster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        venster.setTitle("Voorbeeld 1 van hoofdstuk 1");
        venster.setLocation(100,100);
        venster.add(new Kopieerpaneel());
        venster.setVisible(true);
    }

    public static void main( String[ ] args)
    {
        new Kopieer();
    }
}
