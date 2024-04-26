package PocetniEkran;
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
public class PocetniEkran extends JFrame{
    private DugmeSela sela = new DugmeSela(this);
    private DugmeVeterinarskeStanice VeterinarskeStanice = new DugmeVeterinarskeStanice(this);
    
    public PocetniEkran() {
        setTitle("Podela sela veterinarskim stanicama u Opstini Mionica");
        setSize(600, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(new GridLayout(2,2,50,50));
        addComponents();
    }

    private void addComponents() {
        add(sela);
        add(VeterinarskeStanice);
        
    }

    
}
