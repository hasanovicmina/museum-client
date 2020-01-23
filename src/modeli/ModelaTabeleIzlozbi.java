/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeli;

import domen.Izlozba;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author hasan
 */
public class ModelaTabeleIzlozbi extends AbstractTableModel{

    List<Izlozba> lista;
    String[] kolone = new String[]{"ID","Naziv","Tip","Datum od","Datum do"};

    public ModelaTabeleIzlozbi() {
        lista = new ArrayList<>();
    }

    public ModelaTabeleIzlozbi(List<Izlozba> lista) {
        this.lista = lista;
    }

    public void setLista(List<Izlozba> lista) {
        this.lista = lista;
    }

    public List<Izlozba> getLista() {
        return lista;
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
        Izlozba i = lista.get(red);
        switch(kol){
            case 0: return i.getIzlozbaID();
            case 1: return i.getNaziv();
            case 2: return i.getTip();
            case 3: return i.getDatumOd();
            case 4: return i.getDatumDo();
            default: return "";
        }
    }

    @Override
    public String getColumnName(int i) {
        return kolone[i];
    }

    public void osvezi() {
        fireTableDataChanged();
    }

    public Izlozba vratiIzlozbu(int red) {
        return lista.get(red);
    }
    
}
