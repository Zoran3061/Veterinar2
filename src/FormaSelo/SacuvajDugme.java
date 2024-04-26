/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FormaSelo;
import Menadzeri.MenadzerPodataka;
import Modeli.Selo;
import javax.swing.JButton;
import javax.swing.JOptionPane;


/**
 *
 * @author Zoran
 */
public class SacuvajDugme extends JButton {
    private FormaSelo forma;

    public SacuvajDugme(FormaSelo forma) {
        super("Sacuvaj");
        
        this.forma = forma;
        
        addActionListener((e) -> {
            naKlik();
        });
        
    }

    private void naKlik() {
        int godinaIzdanja;        
        try {
            godinaIzdanja = forma.getGodina();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Godina dodele mora biti broj");
            return;
        }
        Selo Selo = forma.getSelo();
        Selo.setIme(forma.getIme());
        Selo.setOblast(forma.getOblast());
        Selo.setGodinadodele(godinadodele);
        Selo.setIdVeterinarskaStanica(forma.getVeterinarskaStanicaId());
        MenadzerPodataka.getMenadzer().sacuvaj();
    }
    
}
