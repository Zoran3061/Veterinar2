/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PocetniEkran;
import VeterinarskaStanicaEkran.VeterinarskaStanicaEkran;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author Zoran
 */
public class DugmeVeterinarskeStanice extends JButton{
    private PocetniEkran ekran;

    public DugmeVeterinarskeStanice(PocetniEkran ekran) {
        super("VeterinarskaStanice");
        this.ekran = ekran;
        addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                ekran.dispose();
                new VeterinarskaStanicaEkran();
            }
        });
    }
    
}
