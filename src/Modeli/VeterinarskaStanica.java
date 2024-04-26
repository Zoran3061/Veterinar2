package Modeli;
import Menadzeri.MenadzerModela;
import Menadzeri.MenadzerPodataka;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Zoran
 */
public class VeterinarskaStanica  extends Model{
    private String _ime, _prezime;

    public Korisnik() {
        super(MenadzerPodataka.getMenadzer().getMenadzerKorisnika());
    }

    private Korisnik(int id, MenadzerModela menadzer) {
        super(id, menadzer);
    }
    
    public static Korisnik ucitaj(int id, String ime, String prezime) {
        Korisnik korisnik = new Korisnik(id, MenadzerPodataka.getMenadzer().getMenadzerKorisnika());
        korisnik.setIme(ime);
        korisnik.setPrezime(prezime);
        return korisnik;
    }

    public Korisnik(String ime, String prezime) {
        super(MenadzerPodataka.getMenadzer().getMenadzerKorisnika());
        this._ime = ime;
        this._prezime = prezime;
    }
    

    public String getIme() {
        return _ime;
    }

    public void setIme(String _ime) {
        this._ime = _ime;
    }

    public String getPrezime() {
        return _prezime;
    }

    public void setPrezime(String _prezime) {
        this._prezime = _prezime;
    }

    public int getId() {
        return _id;
    }

    @Override
    public String toString() {
        return _ime + " " + _prezime;
    }
    
}
