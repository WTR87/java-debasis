package h02;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Etikettenpaneel
{
    @FXML private TextField aantalEtikettenVeld;
    @FXML private TextField etikettenPerBladVeld;
    @FXML private TextArea resultaatVeld;

    private void toonResultaat(int aantalEtiketten, int etikettenPerBlad)
    {
        int vellenNodig = ((aantalEtiketten - 1) / etikettenPerBlad) + 1;
        int over = vellenNodig * etikettenPerBlad - aantalEtiketten;
        String resultaat = "Aantal vellen nodig: " + vellenNodig + "\n" + "Aantal etiketten onbedrukt: " + over;
        resultaatVeld.setText(resultaat);
    }

    @FXML protected void actionPerformed(ActionEvent event)
    {
        int aantalEtiketten = Integer.parseInt(aantalEtikettenVeld.getText());
        int etikettenPerBlad = Integer.parseInt(etikettenPerBladVeld.getText());
        toonResultaat(aantalEtiketten, etikettenPerBlad);
    }
}
