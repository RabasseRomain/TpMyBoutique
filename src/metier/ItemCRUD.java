package metier;

import java.util.ArrayList;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.event.AjaxBehaviorEvent;

@ManagedBean(name="itemCRUDBean")
@RequestScoped
public class ItemCRUD {
	
	private String name, price, description;
	private String nameError, priceError, descriptionError;
	
	
	public ItemCRUD() {
		setNameError("");
		setPriceError("");
		setDescriptionError("");
	}
	
	public void AddItem(ArrayList<Item> itemList) {
		Item item = new Item();
		item.setName(name);
		item.setPrice(price);
		item.setDescription(description);
		itemList.add(item);
	}
	
	public void RemoveItem(ArrayList<Item> itemList) {
		Item item = new Item();
		item.setName(name);
		item.setPrice(price);
		item.setDescription(description);
		itemList.remove(item);
	}
	
	public void CheckName(AjaxBehaviorEvent event) {
		System.out.println("Checking Name");
		if(getName().length() >= 10) {
			System.out.println("Too many characters!");
			setNameError("Too many characters!");
		} else {
			System.out.println("");
			setNameError("");
		}
	}
	
	public void CheckPrice(AjaxBehaviorEvent event) {
		System.out.println("Checking Price");
		try {
			Double newPrice = new Double(getPrice());
			if(newPrice < 5.0) {
				System.out.println("Too cheap!");
				setPriceError("Too cheap!");
			} else if(newPrice > 100.0){
				System.out.println("Too expensive!");
				setPriceError("Too expensive!");
			} else {
				System.out.println("");
				setPriceError("");
			}
		}
		catch(Exception e) {
			System.out.println("NaN!");
			setPriceError("NaN!");
		}
	}
	
	public void CheckDescription(AjaxBehaviorEvent event) {
		System.out.println("Checking Description");
	}
		
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getNameError() {
		return nameError;
	}
	public void setNameError(String nameError) {
		this.nameError = nameError;
	}
	public String getPriceError() {
		return priceError;
	}
	public void setPriceError(String priceError) {
		this.priceError = priceError;
	}
	public String getDescriptionError() {
		return descriptionError;
	}
	public void setDescriptionError(String descriptionError) {
		this.descriptionError = descriptionError;
	}

}
