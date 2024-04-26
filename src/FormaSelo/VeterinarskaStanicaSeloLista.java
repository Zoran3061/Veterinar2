/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FormaSelo;
import Menadzeri.MenadzerModela;
import Menadzeri.MenadzerPodataka;
import Modeli.Selo;
import Modeli.VeterinarskaStanica;
import java.util.HashMap;
import javax.swing.JComboBox;


/**
 *
 * @author Zoran
 */
public class VeterinarskaStanicaSeloLista  extends JComboBox<VeterinarskaStanica> {

    public VeterinarskaStanicaSeloLista(Selo Selo) {
        super();
        MenadzerModela menadzerKorisnika = MenadzerPodataka.getMenadzer().getMenadzerKorisnika();
        HashMap<Integer, Object> VeterinarskaStanica = menadzerKorisnika.svi();
        addItem(null);
        for(int i=1; i<=VeterinarskaStanica.size(); i++) {
            VeterinarskaStanica VeterinarskaStanica = (VeterinarskaStanica) korisnici.get(i);
            addItem(VeterinarskaStanica);
        }
        setSelectedIndex(Selo.getIdKorisnika());
    }
    
}
