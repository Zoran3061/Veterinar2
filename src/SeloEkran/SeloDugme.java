/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SeloEkran;
import Modeli.Selo;
import javax.swing.JButton;
/**
 *
 * @author Zoran
 */
public class SeloDugme extends JButton {
    
    private Selo selo;
    private SeloEkran ekran;

    public SeloDugme(SeloEkran ekran, Selo knjiga) {
        super(knjiga.getIme() + " - " + Selo.getOblast());
        this.ekran = ekran;
        this.selo = knjiga;
        addActionListener((e) -> {
            this.naKlik();
        });
    }

    private void naKlik() {
        ekran.dispose();
        new FormaSelo.FormaSelo(selo);
    }
    
}
