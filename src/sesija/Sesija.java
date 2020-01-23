/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesija;

import domen.Zaposleni;

/**
 *
 * @author hasan
 */
public class Sesija {
    private static Sesija instanca;
    public Zaposleni zaposleni;

    private Sesija() {
    }

    public static Sesija getInstanca() {
        if(instanca == null){
            instanca = new Sesija();
        }
        return instanca;
    }

    public Zaposleni getZaposleni() {
        return zaposleni;
    }

    public void setZaposleni(Zaposleni zaposleni) {
        this.zaposleni = zaposleni;
    }
    
    
}
