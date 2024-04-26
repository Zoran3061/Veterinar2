/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VeterinarskaStanicaForma;
import Menadzeri.MenadzerPodataka;
import Modeli.VeterinarskaStanica;
import java.awt.event.ActionEvent;
import javax.swing.JButton;

/**
 *
 * @author Zoran
 */
public class SacuvajDugme extends JButton {

    /**
     *
     * @param forma
     */
    public SacuvajDugme(VeterinarskaStanicaForma forma) {
        super("Sacuvaj");
        
        addActionListener((ActionEvent e) -> {
            VeterinarskaStanica VeterinarskaStanica = forma.getVeterinarskaStanica();
            VeterinarskaStanica.setIme(
                    forma.getIme()
            );
            VeterinarskaStanica.setPrezime(
                    forma.getPrezime()
            );
            forma.dispose();
            new VeterinarskaStanicaEkran.VeterinarskaStanicaEkran();
            MenadzerPodataka.getMenadzer().sacuvaj();
        });
    }
    
}
