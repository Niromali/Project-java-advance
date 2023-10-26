package p2;

import java.util.List;

import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JViewport;
import javax.swing.text.Position;

public class LabelList extends LabelComponents {
	public LabelList(String label ,int visibleRowCount,String ...data) {
		super(label);
		JList<String> l=new JList<String>(data);
		l.setVisibleRowCount(visibleRowCount);
		add(new JScrollPane(l));
	}

	public void setSelectedItem(String value) {
		// TODO Auto-generated method stub
		JScrollPane scrollPane = (JScrollPane)getComponent(1);
		JViewport viewport = scrollPane.getViewport(); 
		JList list = (JList)viewport.getView();
		
		list.setSelectedValue(value,true);
	}
	public void setSelectedItems(String ...values) {
		 JScrollPane scrollPane = (JScrollPane) getComponent(1);
		    JViewport viewport = scrollPane.getViewport();
		    JList<String> list = (JList<String>) viewport.getView();
		    list.clearSelection(); 
		    for (String value : values) {
		    	//System.out.println(Position.Bias.Forward);
		        int index = list.getNextMatch(value, 0, Position.Bias.Forward); 
		        if (index != -1) {
		            list.addSelectionInterval(index, index);
		        }
		    }
		
	}
	
	public List<String> getSelectedItems() {
		JScrollPane scrollPane = (JScrollPane)getComponent(1);
		JViewport viewport = scrollPane.getViewport(); 
		JList list = (JList)viewport.getView();

		return list.getSelectedValuesList();
	}
	
}
