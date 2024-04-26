package podela.sela.veterinarskim.stanicama.u.opstini.mionica;
import Menadzeri.MenadzerPodataka;
import PocetniEkran.PocetniEkran;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Zoran
 */
public class PodelaSelaVeterinarskimStanicamaUOpstiniMionica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    MenadzerPodataka menadzerPodataka = new MenadzerPodataka();
        menadzerPodataka.ucitaj();
        new PocetniEkran();
    }
    
}
