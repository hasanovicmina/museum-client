/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeli;

import domen.Vodic;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author hasan
 */
public class ModelTabeleVodici extends AbstractTableModel{

    List<Vodic> lista;
    String[] kolone = new String[]{"VodicID","Ime i prezime","Datum vođenja"};
    public ModelTabeleVodici() {
        lista = new ArrayList<>();
    }

    public ModelTabeleVodici(List<Vodic> lista) {
        this.lista = lista;
    }

    public List<Vodic> getLista() {
        return lista;
    }

    public void setLista(List<Vodic> lista) {
        this.lista = lista;
    }
    
    
    
    
    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return kolone.length;
    }

    @Override
    public Object getValueAt(int red, int kol) {
        Vodic v = lista.get(red);
        switch(kol){
            case 0: return v.getVodicID();
            case 1: return v.getImePrezime();
            case 2: return v.getDatumVodjenja();
            default:return "";
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
    
}
