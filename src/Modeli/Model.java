/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modeli;
import Menadzeri.MenadzerModela;
/**
 *
 * @author Zoran
 */
public class Model {
     protected int _id;

    public Model(MenadzerModela menadzer) {
        this._id = menadzer.dodaj(this);
    }

    public Model(int id, MenadzerModela menadzer) {
        this._id = id;
        menadzer.dodaj(id, this);
    }
    
    
}
