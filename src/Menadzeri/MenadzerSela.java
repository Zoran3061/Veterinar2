/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menadzeri;
import Modeli.Selo;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;
/**
 *
 * @author Zoran
 */
public class MenadzerSela extends MenadzerModela<Selo> {
    
    private static String folder = "Sela";

    public String getFolder() {
        return folder;
    }
    
    public void ucitaj() throws FileNotFoundException, IOException{
        ArrayList<ArrayList<String>> linijeKorisnika = super.ucitajLinije();
        for(ArrayList<String> linije: linijeKorisnika) {
            int id, godinaIzdavanja, idKorisnika;
            try {
                id = Integer.parseInt(linije.get(0));
                godinaIzdavanja = Integer.parseInt(linije.get(3));
                idKorisnika = Integer.parseInt(linije.get(4));
            } catch(NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "ID nije broj kod Veterinarske stanice pod id-em: "+linije.get(0));
                return;
            }
            Selo VeterinarskaStanica = Selo.ucitaj(id, linije.get(1), linije.get(2), godinaIzdavanja, idKorisnika);
        }
    }
    
    public void sacuvaj() {
        HashMap<String, String[]> sveLinije = new HashMap();
        HashMap<Integer, Selo> sveKnjige = svi();
        for(Selo knjiga: svaSela.values()) {
            String[] linije = {
                Integer.toString(knjiga.getId()),
                knjiga.getIme(),
                knjiga.getAutor(),
                Integer.toString(knjiga.getGodinaIzdavanja()),
                Integer.toString(knjiga.getIdKorisnika())
                
            };
            sveLinije.put(Integer.toString(knjiga.getId()), linije);
        }
        super.sacuvaj(sveLinije);
    }
    
}
