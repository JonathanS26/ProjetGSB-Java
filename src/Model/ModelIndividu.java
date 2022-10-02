/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Entity.Individus;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author natha
 */
public class ModelIndividu extends AbstractTableModel
{
private String[] nomsColonnes;
private Vector<String[]> rows;





@Override
public int getRowCount() {
return rows.size();
}





@Override
public int getColumnCount() {
return nomsColonnes.length;
}





@Override
public Object getValueAt(int rowIndex, int columnIndex) {
return rows.get(rowIndex)[columnIndex];
}



public void loadDatas(ArrayList<Individus> lesIndividus)
{
rows = new Vector<>();
nomsColonnes = new String[] {"Code", "Libellé"};
for(Individus i : lesIndividus)
{
rows.add(new String[]{String.valueOf(i.getCodeIndividu()),i.getLibelle()});
}
fireTableChanged(null);
}



@Override
public String getColumnName(int column) {
return nomsColonnes[column];
}

public void loadDatas2Colonnes(ArrayList<Individus> lesIndividus)
{
rows = new Vector<>();
nomsColonnes = new String[]{"Depot legal", "Nom"};
for (Individus i : lesIndividus)
{
rows.add(new String[]{String.valueOf(i.getCodeIndividu()),i.getLibelle()});
}
fireTableChanged(null);
}



}