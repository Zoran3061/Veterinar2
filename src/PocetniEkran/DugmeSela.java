/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PocetniEkran;
import SeloEkran.SeloEkran;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
/**
 *
 * @author Zoran
 */
public class DugmeSela extends JButton{
    private PocetniEkran ekran;

    public DugmeSela(PocetniEkran ekran) {
        super("Sela");
        this.ekran = ekran;
        addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                ekran.dispose();
                new SeloEkran();
            }
        });
        
    }
    
}
