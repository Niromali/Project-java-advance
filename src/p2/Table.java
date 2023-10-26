package p2;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Table extends JTable{
	private static final long serialVersionUID = 1L;

	public Table(String ...cols) {
		// TODO Auto-generated constructor stub
		super(new DefaultTableModel(cols,0));
		
	}

	public void add(Object[] row) {
		// TODO Auto-generated method stub
		add(row);
		
	}
}
