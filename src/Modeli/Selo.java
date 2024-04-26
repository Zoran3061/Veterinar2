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
public class Selo extends Model {
    private String _ime, _autor;
    private int _godinaIzdavanja, _idKorisnika;
    

    public Knjiga(String ime, String autor, int godinaIzdavanja) {
        super(MenadzerPodataka.getMenadzer().getMenadzerKnjiga());
        this._ime = ime;
        this._autor = autor;
        this._godinaIzdavanja = godinaIzdavanja;
    }

    private Knjiga(int id, MenadzerModela menadzer) {
        super(id, menadzer);
    }
    
    public static Knjiga ucitaj(int id, String ime, String autor, int godinaIzdavanja, int idKorisnika) {
        Knjiga knjiga = new Knjiga(id, MenadzerPodataka.getMenadzer().getMenadzerKnjiga());
        knjiga.setIme(ime);
        knjiga.setAutor(autor);
        knjiga.setIdKorisnika(idKorisnika);
        return knjiga;
    }
    
    public boolean knjigaJeIzdata(){
        return 0 != _idKorisnika;
    }
    public void izdajKnjigu(Korisnik korisnik){
        _idKorisnika = korisnik.getId();
    }
    public int getId() {
        return _id;
    }

    public String getIme() {
        return _ime;
    }

    public void setIme(String _ime) {
        this._ime = _ime;
    }

    public String getAutor() {
        return _autor;
    }

    public void setAutor(String _autor) {
        this._autor = _autor;
    }

    public int getGodinaIzdavanja() {
        return _godinaIzdavanja;
    }

    public void setGodinaIzdavanja(int _godinaIzdavanja) {
        this._godinaIzdavanja = _godinaIzdavanja;
    }

    public int getIdKorisnika() {
        return _idKorisnika;
    }

    public void setIdKorisnika(int _idKorisnika) {
        this._idKorisnika = _idKorisnika;
    }

    public Knjiga() {
        super(MenadzerPodataka.getMenadzer().getMenadzerKnjiga());
    }

    @Override
    public String toString() {
        return "Knjiga{" + "_ime=" + _ime + ", _autor=" + _autor + ", _godinaIzdavanja=" + _godinaIzdavanja + ", _idKorisnika=" + _idKorisnika + '}';
    }
    
}
