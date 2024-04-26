/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menadzeri;
import Izuzetci.NeuspesnoPravljenjeFolderaIzuzetak;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Zoran
 * @param <E>
 */
public abstract class MenadzerModela<E> {
    private int _poslednjiId = 0;
    
    private HashMap<Integer, E> _instance = new HashMap();

    public MenadzerModela() {
    }
    
    public int dodaj(E element){
        _poslednjiId++;
        _instance.put(_poslednjiId, element);
        return _poslednjiId;
    }
    
    public void dodaj(int id, E element){
        if(id > _poslednjiId) {
            _poslednjiId = id;
        }
        _instance.put(id, element);
    }

    public HashMap<Integer, E> svi() {
        return _instance;
    }
    
    public E nadji(int id) {
        return _instance.get(id);
    }
    
    abstract public void ucitaj() throws FileNotFoundException, IOException;
    
    protected ArrayList<ArrayList<String>> ucitajLinije() throws FileNotFoundException, IOException {
        ArrayList<ArrayList<String>> linije = new ArrayList<>();
        File folder = new File(getFolder());
        File[] listOfFiles = folder.listFiles();

        for (int i = 0; i < listOfFiles.length; i++) {
          if (listOfFiles[i].isFile()) {
                String imeFajla = getFolder()+"/"+listOfFiles[i].getName();
                FileReader in = new FileReader(imeFajla);
                BufferedReader br = new BufferedReader(in);
                ArrayList<String> linijeZaModel = new ArrayList();
                String line;
                while ((line = br.readLine()) != null) {
                    linijeZaModel.add(line);
                }
                linije.add(linijeZaModel);
                in.close();
          }
        }
        return linije;
    }
    abstract public void sacuvaj();
    
    abstract String getFolder();
    
    protected void sacuvaj(HashMap<String, String[]> sveLinije) {
        try {
            napraviFolderAkoNePostoji(getFolder());
        } catch (NeuspesnoPravljenjeFolderaIzuzetak ex) {
            Logger.getLogger(MenadzerSela.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Neuspesno pravljenje foldera "+getFolder()+".");
            return;
        }
        
        for(Map.Entry<String, String[]> linije: sveLinije.entrySet()) {
            PrintWriter pw;
            FileWriter fw;
            try {
                fw = new FileWriter(getFolder()+"/"+linije.getKey()+".txt", false);
            } catch (IOException ex) {
                Logger.getLogger(MenadzerSela.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "Neuspesno cuvanje.");
                return;
            }
            pw = new PrintWriter(fw);
            for(String linija: linije.getValue()) {
                pw.println(linija);
            }
            pw.close();
        }
        
    }
    
    protected void napraviFolderAkoNePostoji(String imeFoldera) throws NeuspesnoPravljenjeFolderaIzuzetak {
        File folder = new File(imeFoldera);
        if (!folder.exists()) {
            try {
                folder.mkdir();
            } catch (SecurityException ex) {
                JOptionPane.showMessageDialog(null, "Neuspesno pravljenje foldera");
                throw new NeuspesnoPravljenjeFolderaIzuzetak();
            }
        }
    }
    
}
