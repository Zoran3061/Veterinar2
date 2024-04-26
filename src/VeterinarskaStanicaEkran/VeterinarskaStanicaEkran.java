
package VeterinarskaStanicaEkran;
import Menadzeri.MenadzerModela;
import Menadzeri.MenadzerPodataka;
import Modeli.VeterinarskaStanica;
import java.awt.GridLayout;
import javax.swing.JFrame;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Zoran
 */
public class VeterinarskaStanicaEkran extends JFrame{

    public VeterinarskaStanicaEkran() {
        setTitle("VeterinarskeStanice");
        setSize(600, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(new GridLayout(2,2,30,30));
        addComponents();
    }

    private void addComponents() {
        MenadzerModela menadzer = MenadzerPodataka.getMenadzer().getMenadzerKorisnika();
        for(int i = 1; i<=menadzer.svi().size(); i++) {
            VeterinarskaStanica korisnik = (VeterinarskaStanica) menadzer.nadji(i);
            VeterinarskaStanicaDugme button = new VeterinarskaStanicaDugme(this, VeterinarskaStanica);
            add(button);
        }
        add(new NazadDugme(this));
        add(new DodajVeterinarskuStanicuDugme(this));
    }
    
}
