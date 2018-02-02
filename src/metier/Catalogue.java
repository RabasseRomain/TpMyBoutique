package metier;

import java.util.ArrayList;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.model.ListDataModel;

@ManagedBean
@ApplicationScoped
public class Catalogue extends ListDataModel<Item> {
	
	private ArrayList<Item> itemList;
	
	public Catalogue() {
		itemList = new ArrayList<>();
		for(int i = 1; i <= 10; i++) {
			Item item = new Item();
			item.setName("name" + i);
			item.setPrice(i + "9.99");
			item.setDescription("I am Item N°" + i);
			itemList.add(item);
		}
		// Put itemList in the Catalogue (DataModel)
		this.setWrappedData(itemList);
	}
	
	public ArrayList<Item> getItemList() {
		return itemList;
	}
	public void setItemList(ArrayList<Item> itemList) {
		this.itemList = itemList;
	}
	
}
