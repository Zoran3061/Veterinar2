
package Menadzeri;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Zoran
 */
public class MenadzerPodataka  {
    private static MenadzerPodataka _menadzer;    
    
    private final MenadzerModela _menadzerVeterinarskeStanice;
    private final MenadzerModela _menadzerSela = new MenadzerSela();
    
    public static MenadzerPodataka getMenadzer() {
        if(null == _menadzer) {
            _menadzer = new MenadzerPodataka();
        }
        return _menadzer;
    }

    public MenadzerPodataka() {
        this._menadzerVeterinarskeStanice = new MenadzerVeterinarskeStanice();
        _menadzer = this;
    }

    public MenadzerModela getMenadzerKorisnika() {
        return _menadzerVeterinarskeStanice;
    }

    public MenadzerModela getMenadzerKnjiga() {
        return _menadzerSela;
    }
    
    public void sacuvaj() {
        _menadzerVeterinarskeStanice.sacuvaj();
        _menadzerSela.sacuvaj();
    }
    
    public void ucitaj() {
        try {
            _menadzerVeterinarskeStanice.ucitaj();
            _menadzerSela.ucitaj();
        } catch (IOException ex) {
            Logger.getLogger(MenadzerPodataka.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Neuspesno ucitavanje fajlova. Poruka:"+ex);
        }
    }
    
    
    
}
