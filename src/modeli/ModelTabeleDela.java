/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeli;

import domen.Delo;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author hasan
 */
public class ModelTabeleDela extends AbstractTableModel{

    List<Delo> lista;
    String[] kolone = new String[]{"ID","Naziv","Autor","Tip"};

    public ModelTabeleDela() {
    }

    public ModelTabeleDela(List<Delo> lista) {
        this.lista = lista;
    }

    public List<Delo> getLista() {
        return lista;
    }

    public void setLista(List<Delo> lista) {
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
        Delo d = (Delo) lista.get(red);
        switch(kol){
            case 0: return d.getDeloID();
            case 1: return d.getNaziv();
            case 2: return d.getAutor();
            case 3: return d.getTip();
            default: return "";
        }
    }

    @Override
    public String getColumnName(int i) {
        return kolone[i];
    }

    public void izbaciDelo(int red) {
        lista.remove(red);
        fireTableDataChanged();
    }
    
    
}
