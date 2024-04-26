/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SeloEkran;
import Menadzeri.MenadzerPodataka;
import Modeli.Selo;
import java.awt.event.ActionEvent;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JButton;

/**
 *
 * @author Zoran
 */
public class DodajSeloDugme extends JButton {
    private SeloEkran ekran;

    public DodajSeloDugme(SeloEkran ekran) {
        super("Dodaj selo");
        
        this.ekran = ekran;
        
        addActionListener((ActionEvent e) -> {
            naKlik();
        });
    }
    
    private void naKlik() {
        Date datum = new Date();
        Calendar kalendar = new GregorianCalendar();
        kalendar.setTime(datum);
        int godina = kalendar.get(Calendar.YEAR);
        Sela sela = new Selo("Selo", "", godina);
        MenadzerPodataka.getMenadzer().sacuvaj();
        new SeloEkran();
        ekran.dispose();
    }
    
}
