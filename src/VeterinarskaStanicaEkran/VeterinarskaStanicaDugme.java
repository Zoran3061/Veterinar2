/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VeterinarskaStanicaEkran;
import Modeli.VeterinarskaStanica;
import javax.swing.JButton;
import VeterinarskaStanicaForma.VeterinarskaStanicaForma;


/**
 *
 * @author Zoran
 */
public class VeterinarskaStanicaDugme extends JButton {

    public VeterinarskaStanicaDugme(VeterinarskaStanicaEkran ekran, VeterinarskaStanica VeterinarskaStanica) {
        super(VeterinarskaStanica.getIme());
        
        addActionListener((e) -> {
            new VeterinarskaStanicaForma(VeterinarskaStanica);
            ekran.dispose();
        });
    }
    
    
}
