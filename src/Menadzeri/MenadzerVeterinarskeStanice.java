/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menadzeri;
import Modeli.VeterinarskaStanica;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;


/**
 *
 * @author Zoran
 */
public class MenadzerVeterinarskeStanice extends MenadzerModela<VeterinarskaStanica> {
    
    private static String _folder = "VeterinarskaStanice";

    @Override
    public String getFolder() {
        return _folder;
    }
    
    @Override
    public void ucitaj() throws FileNotFoundException, IOException{
        ArrayList<ArrayList<String>> linijeVeterinarskaStanica = super.ucitajLinije();
        for(ArrayList<String> linije: linijeVeterinarskaStanica) {
            int id;
            try {
            id = Integer.parseInt(linije.get(0));
            } catch(NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "ID nije broj kod korisnika pod id-em: "+linije.get(0));
                return;
            }
            VeterinarskaStanica VeterinarskaStanica = VeterinarskaStanica.ucitaj(id, linije.get(1), linije.get(2));
        }
    }
    
    public void sacuvaj() {
        HashMap<String, String[]> sveLinije = new HashMap();
        HashMap<Integer, VeterinarskaStanica> sviKorisnici = svi();
        for(VeterinarskaStanica korisnik: sveVeterinarskaStanice.values()) {
            String[] linije = {
                Integer.toString(korisnik.getId()),
                korisnik.getIme(),
                korisnik.getPrezime()
            };
            sveLinije.put(Integer.toString(korisnik.getId()), linije);
        }
        super.sacuvaj(sveLinije);
    }
    
}
