/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VeterinarskaStanicaForma;
import VeterinarskaStanicaEkran.VeterinarskaStanicaEkran;
import javax.swing.JButton;


/**
 *
 * @author Zoran
 */
public class NazadDugme extends JButton{
    
    private VeterinarskaStanicaForma ekran;

    public NazadDugme(VeterinarskaStanicaForma ekran) {
        super("Nazad");
        this.ekran = ekran;
        addActionListener((e) -> {
            this.naKlik();
        });
    }

    private void naKlik() {
        ekran.dispose();
        new VeterinarskaStanicaEkran();
    }
    
}
