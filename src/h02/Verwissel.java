package h02;

import javax.swing.*;

public class Verwissel extends JFrame {

    public Verwissel()
    {
        JFrame venster = new JFrame();
        venster.setSize(400, 300);
        venster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        venster.setTitle("Oefening 2.1 Velden verwisselen");
        venster.setLocation(100, 100);
        venster.add(new Verwisselpaneel());
        venster.setVisible(true);
    }

    public static void main( String[ ] args) { new Verwissel(); }
}
