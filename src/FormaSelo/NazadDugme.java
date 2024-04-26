/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FormaSelo;
import SeloEkran.SeloEkran;
import javax.swing.JButton;


/**
 *
 * @author Zoran
 */
public class NazadDugme extends JButton{
    
    private FormaSelo ekran;

    public NazadDugme(FormaSelo ekran) {
        super("Nazad");
        this.ekran = ekran;
        addActionListener((e) -> {
            this.naKlik();
        });
    }

    private void naKlik() {
        ekran.dispose();
        new FormaSelo();
    }
    
}
