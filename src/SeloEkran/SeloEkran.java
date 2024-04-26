
package SeloEkran;

import Menadzeri.MenadzerModela;
import Menadzeri.MenadzerPodataka;
import Modeli.Selo;
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
public class SeloEkran extends JFrame{

    public SeloEkran() {
        setTitle("Selo");
        setSize(600, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(new GridLayout(3,2,30,30));
        addComponents();
    }

    private void addComponents() {
        MenadzerModela menadzer = MenadzerPodataka.getMenadzer().getMenadzerKnjiga();
        for(int i = 1; i<=menadzer.svi().size(); i++) {
            Selo selo = (Selo) menadzer.nadji(i);
            SeloDugme button = new SeloDugme(this, Selo);
            add(button);
        }
        add(new NazadDugme(this));
        add(new DodajSeloDugme(this));
    }
    
}
