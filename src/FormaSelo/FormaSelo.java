package FormaSelo;
import Modeli.Selo;
import Modeli.VeterinarskaStanica;
import PocetniEkran.PocetniEkran;
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
public class FormaSelo extends JFrame {
    
    private Selo Selo;
    private JTextField ime = new JTextField();
    private JTextField Oblast = new JTextField();
    private JTextField godina = new JTextField();
    private VeterinarskaStanicaSeloLista VeterinarskaStanica;
    private PocetniEkran ekran;

    public FormaSelo(Selo Selo) {
        super("Izmeni Selo");
        setupComponents(Selo);
        setSize(500, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(new GridLayout(5,2,30,30));
        addComponents();
    }

    private void addComponents() {
        add(new JLabel("  Ime"));
        add(ime);
        add(new JLabel("  Oblast"));
        add(Oblast);
        add(new JLabel("  Godina dodele"));
        add(godina);
        add(new JLabel("  Korisnik Knjige"));
        add(VeterinarskaStanica);
        add(new NazadDugme(this));
        add(new SacuvajDugme(this));
    }

    private void setupComponents(Selo Selo) {
        this.Selo = Selo;
        VeterinarskaStanica = new VeterinarskaStanicaSeloLista(Selo);
        ime.setText(Selo.getIme());
        VeterinarskaStanica.setText(Selo.getOblast());
        godina.setText(
                Integer.toString(Selo.getGodinaDodele())
        );
    }

    public Selo getSelo() {
        return Selo;
    }

    public String getIme() {
        return ime.getText();
    }

    public String getAutor() {
        return Oblast.getText();
    }

    public int getGodina() throws NumberFormatException {
        return Integer.parseInt(
                godina.getText()
        );
    }

    public int getVeterinarskaStanicaId() {
        VeterinarskaStanica VeterinarskaStanica = (VeterinarskaStanica) this.VeterinarskaStanica.getSelectedItem();
        if(null == VeterinarskaStanica) {
            return 0;
        }
        return VeterinarskaStanica.getId();
    }
    
}
