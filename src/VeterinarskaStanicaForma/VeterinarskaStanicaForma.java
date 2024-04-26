
package VeterinarskaStanicaForma;
import Modeli.VeterinarskaStanica;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Zoran
 */
public class VeterinarskaStanicaForma extends JFrame {
    private VeterinarskaStanica korisnik;
    private JTextField ime;
    private JTextField prezime;
    private SacuvajDugme sacuvaj;

    public VeterinarskaStanicaForma(VeterinarskaStanica VeterinarskaStanica) {
        super("Izmeni Veterinarsku Stanicu");
        this.korisnik = korisnik;
        setupComponents();
        setSize(500, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(new GridLayout(3,2,30,30));
        addComponents();
    }
    
    private void setupComponents() {
        ime = new JTextField(korisnik.getIme());
        sacuvaj = new SacuvajDugme(this);
    }

    private void addComponents() {
        add(new JLabel("Ime"));
        add(ime);
        add(new NazadDugme(this));
        add(sacuvaj);
    }

    public VeterinarskaStanica getVeterinarskaStanica() {
        return VeterinarskaStanica;
    }

    public String getIme() {
        return ime.getText();
    }
    
}
