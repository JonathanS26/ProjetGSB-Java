/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Entity.Medicament;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.table.AbstractTableModel;



/**
*
* @author fello
*/
public class ModelMedicament extends AbstractTableModel



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


@Override
public String getColumnName(int column) {
return nomsColonnes[column];
}

public void loadDatas8Colonnes(ArrayList<Medicament> lesMedicaments)
{
 rows = new Vector<>();
 nomsColonnes = new String[]{ "Dépôt Légal","Nom" ,"Famille","Composition","Effets","Contre-indications","Prix"};
 for (Medicament m : lesMedicaments)
 {
 rows.add(new String[]{String.valueOf(m.getDepotLegal()),String.valueOf(m.getNomCommercial()),String.valueOf(m.getCode()),m.getComposition(),m.getEffets(),m.getContreIndication(),String.valueOf(m.getPrixEchantillion())});
 }
fireTableChanged(null);
}

public void loadDatas2Colonnes(ArrayList<Medicament> lesMedicaments)
{
rows = new Vector<>();
nomsColonnes = new String[]{"Dépôt légal", "Nom"};
for (Medicament m : lesMedicaments)
{
rows.add(new String[]{String.valueOf(m.getDepotLegal()),m.getNomCommercial()});
}
fireTableChanged(null);
}

}
