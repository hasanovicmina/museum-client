/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeli;

import domen.ClanskaKarta;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author hasan
 */
public class ModelTabeleClanskeKarte extends AbstractTableModel{

    List<ClanskaKarta> lista;
    String[] kolone = new String[]{"ID","Ime i prezime","Kategorija","Datum važenja"};
    
    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return kolone.length;
    }

    public List<ClanskaKarta> getLista() {
        return lista;
    }

    public ModelTabeleClanskeKarte(List<ClanskaKarta> lista) {
        this.lista = lista;
    }

    public ModelTabeleClanskeKarte() {
        lista = new ArrayList<>();
    }
    

    public void setLista(List<ClanskaKarta> lista) {
        this.lista = lista;
    }

    
    @Override
    public Object getValueAt(int red, int kol) {
        ClanskaKarta d = (ClanskaKarta) lista.get(red);
        switch(kol){
            case 0: return d.getClanskaKartaID();
            case 1: return d.getImePrezime();
            case 2: return d.getPosebnaKategorija();
            case 3: return d.getDatumVazenja();
            default: return "";
        }
    }

    @Override
    public String getColumnName(int i) {
        return kolone[i];
    }

    public void isprazniListu() {
        lista.clear();
        fireTableDataChanged();
    }

    public ClanskaKarta vratiClanskuKartu(int red) {
        return lista.get(red);
    }

    public void vratiPocetniIzgled() {
        fireTableDataChanged();
    }

   
    
    
    
}
