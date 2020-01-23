/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kontroler;

import domen.ClanskaKarta;
import domen.Delo;
import domen.Izlozba;
import domen.Postavka;
import domen.Ulaznica;
import domen.Vodic;
import domen.Zaposleni;
import java.util.ArrayList;
import java.util.List;
import komunikacija.Komunikacija;
import konstante.Operacije;
import transfer.KlijentskiZahtev;
import transfer.ServerskiOdgovor;

/**
 *
 * @author hasan
 */
public class Kontroler {
    private static Kontroler instanca;

    private Kontroler() {
    }

    public static Kontroler getInstanca() {
        if (instanca == null) {
            instanca = new Kontroler();
        }
        return instanca;
    }

    public ServerskiOdgovor prijavaZaposlenog(Zaposleni z) {
        KlijentskiZahtev kz = new KlijentskiZahtev();
        kz.setOperacija(Operacije.PRIJAVA_ZAPOSLENOG);
        kz.setParametar(z);
        Komunikacija.getInstanca().posaljiZahtev(kz);
        ServerskiOdgovor so = Komunikacija.getInstanca().primiOdgovor();
        return so;
    }

    public ServerskiOdgovor vratiListuKategorija() {
        KlijentskiZahtev kz = new KlijentskiZahtev();
        kz.setOperacija(Operacije.VRATI_LISTU_POSEBNIH_KATEGORIJA);
        Komunikacija.getInstanca().posaljiZahtev(kz);
        ServerskiOdgovor so = Komunikacija.getInstanca().primiOdgovor();
        return so;
    }

    public ServerskiOdgovor kreirajClanskuKartu(ClanskaKarta ck) {
        KlijentskiZahtev kz = new KlijentskiZahtev();
        kz.setOperacija(Operacije.KREIRAJ_CLANSKU_KARTU);
        kz.setParametar(ck);
        Komunikacija.getInstanca().posaljiZahtev(kz);
        ServerskiOdgovor so = Komunikacija.getInstanca().primiOdgovor();
        return so;
    }

    public ServerskiOdgovor vratiListuDela(Delo d) {
        KlijentskiZahtev kz = new KlijentskiZahtev();
        kz.setOperacija(Operacije.VRATI_LISTU_DELA);
        kz.setParametar(d);
        Komunikacija.getInstanca().posaljiZahtev(kz);
        ServerskiOdgovor so = Komunikacija.getInstanca().primiOdgovor();
        return so;
    }

    public ServerskiOdgovor kreirajIzlozbu(Izlozba izlozba) {
        KlijentskiZahtev kz = new KlijentskiZahtev();
        kz.setOperacija(Operacije.KREIRAJ_IZLOZBU);
        kz.setParametar(izlozba);
        Komunikacija.getInstanca().posaljiZahtev(kz);
        ServerskiOdgovor so = Komunikacija.getInstanca().primiOdgovor();
        return so;
    }

  /*  public ServerskiOdgovor vratiIzlozbaID(Izlozba izlozba) {
        KlijentskiZahtev kz = new KlijentskiZahtev();
        kz.setOperacija(Operacije.VRATI_IZLOZBA_ID);
        kz.setParametar(izlozba);
        Komunikacija.getInstanca().posaljiZahtev(kz);
        ServerskiOdgovor so = Komunikacija.getInstanca().primiOdgovor();
        return so;
    }*/

    public ServerskiOdgovor vratiListuIzlozbi(Izlozba i) {
        KlijentskiZahtev kz = new KlijentskiZahtev();
        kz.setOperacija(Operacije.VRATI_LISTU_IZLOZBI);
        kz.setParametar(i);
        Komunikacija.getInstanca().posaljiZahtev(kz);
        ServerskiOdgovor so = Komunikacija.getInstanca().primiOdgovor();
        return so;
    }

    public ServerskiOdgovor kreirajUlaznicu(Ulaznica ulaznica) {
        KlijentskiZahtev kz = new KlijentskiZahtev();
        kz.setOperacija(Operacije.KREIRAJ_ULAZNICU);
        kz.setParametar(ulaznica);
        Komunikacija.getInstanca().posaljiZahtev(kz);
        ServerskiOdgovor so = Komunikacija.getInstanca().primiOdgovor();
        return so;
    }

    public ServerskiOdgovor kreirajVodica(Vodic vodic) {
        KlijentskiZahtev kz = new KlijentskiZahtev();
        kz.setOperacija(Operacije.KREIRAJ_VODICA);
        kz.setParametar(vodic);
        Komunikacija.getInstanca().posaljiZahtev(kz);
        ServerskiOdgovor so = Komunikacija.getInstanca().primiOdgovor();
        return so;    
    }

    public ServerskiOdgovor vratiListuVodica(Vodic vodic) {
        KlijentskiZahtev kz = new KlijentskiZahtev();
        kz.setOperacija(Operacije.VRATI_LISTU_VODICA);
        kz.setParametar(vodic);
        Komunikacija.getInstanca().posaljiZahtev(kz);
        ServerskiOdgovor so = Komunikacija.getInstanca().primiOdgovor();
        return so;
    }

    public ServerskiOdgovor nadjiVodice(Vodic vodic) {
        KlijentskiZahtev kz = new KlijentskiZahtev();
        kz.setOperacija(Operacije.NADJI_VODICE);
        kz.setParametar(vodic);
        Komunikacija.getInstanca().posaljiZahtev(kz);
        ServerskiOdgovor so = Komunikacija.getInstanca().primiOdgovor();
        return so;
    }

    public ServerskiOdgovor vratiListuClanskihKarata(ClanskaKarta ck) {
        KlijentskiZahtev kz = new KlijentskiZahtev();
        kz.setOperacija(Operacije.VRATI_LISTU_CLANSKIH_KARATA);
        kz.setParametar(ck);
        Komunikacija.getInstanca().posaljiZahtev(kz);
        ServerskiOdgovor so = Komunikacija.getInstanca().primiOdgovor();
        return so;
    }

    public ServerskiOdgovor pretraziClanskeKarte(ClanskaKarta ck) {
        KlijentskiZahtev kz = new KlijentskiZahtev();
        kz.setOperacija(Operacije.PRETRAZI_CLANSKE_KARTE);
        kz.setParametar(ck);
        Komunikacija.getInstanca().posaljiZahtev(kz);
        ServerskiOdgovor so = Komunikacija.getInstanca().primiOdgovor();
        return so;
    }

    public ServerskiOdgovor vratiClanskuKartu(ClanskaKarta ck) {
        KlijentskiZahtev kz = new KlijentskiZahtev();
        kz.setOperacija(Operacije.VRATI_CLANSKU_KARTU);
        kz.setParametar(ck);
        Komunikacija.getInstanca().posaljiZahtev(kz);
        ServerskiOdgovor so = Komunikacija.getInstanca().primiOdgovor();
        return so;
    }

    public ServerskiOdgovor zapamtiClanskuKartu(ClanskaKarta ck) {
        KlijentskiZahtev kz = new KlijentskiZahtev();
        kz.setOperacija(Operacije.ZAPAMTI_CLANSKU_KARTU);
        kz.setParametar(ck);
        Komunikacija.getInstanca().posaljiZahtev(kz);
        ServerskiOdgovor so = Komunikacija.getInstanca().primiOdgovor();
        return so;
    }

    public ServerskiOdgovor nadjiIzlozbe(Izlozba i) {
        KlijentskiZahtev kz = new KlijentskiZahtev();
        kz.setOperacija(Operacije.NADJI_IZLOZBE);
        kz.setParametar(i);
        Komunikacija.getInstanca().posaljiZahtev(kz);
        ServerskiOdgovor so = Komunikacija.getInstanca().primiOdgovor();
        return so;
    }

    public ServerskiOdgovor ucitajIzlozbu(Izlozba i) {
        KlijentskiZahtev kz = new KlijentskiZahtev();
        kz.setOperacija(Operacije.UCITAJ_IZLOZBU);
        kz.setParametar(i);
        Komunikacija.getInstanca().posaljiZahtev(kz);
        ServerskiOdgovor so = Komunikacija.getInstanca().primiOdgovor();
        return so;
    }

    public ServerskiOdgovor obrisiIzlozbu(Izlozba i) {
        KlijentskiZahtev kz = new KlijentskiZahtev();
        kz.setOperacija(Operacije.OBRISI_IZLOZBU);
        kz.setParametar(i);
        Komunikacija.getInstanca().posaljiZahtev(kz);
        ServerskiOdgovor so = Komunikacija.getInstanca().primiOdgovor();
        return so;
    }

    public ServerskiOdgovor ucitajDela(Izlozba i) {
        KlijentskiZahtev kz = new KlijentskiZahtev();
        kz.setOperacija(Operacije.UCITAJ_DELA);
        kz.setParametar(i);
        Komunikacija.getInstanca().posaljiZahtev(kz);
        ServerskiOdgovor so = Komunikacija.getInstanca().primiOdgovor();
        return so;
    }

}
