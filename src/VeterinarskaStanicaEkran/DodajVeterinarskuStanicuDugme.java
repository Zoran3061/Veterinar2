/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VeterinarskaStanicaEkran;
import Menadzeri.MenadzerPodataka;
import Modeli.VeterinarskaStanica;
import java.awt.event.ActionEvent;
import javax.swing.JButton;

/**
 *
 * @author Zoran
 */
public class DodajVeterinarskuStanicuDugme extends JButton {
    private VeterinarskaStanicaEkran ekran;

    public DodajVeterinarskuStanicuDugme(VeterinarskaStanicaEkran ekran) {
        super("Dodaj Veterinarsku Stanicu");
        
        this.ekran = ekran;
        
        addActionListener((ActionEvent e) -> {
            naKlik();
        });
        
    }
    
    private void naKlik() {
        new VeterinarskaStanica("Ime",);
        MenadzerPodataka.getMenadzer().sacuvaj();
        new VeterinarskaStanicaEkran();
        ekran.dispose();
    }
    
}
