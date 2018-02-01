package metier;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="cityBean")
@SessionScoped
public class City {
	
	private String name;
	private int zipCode;
	
	public City() {
		setName("Saint-Nazaire");
		setZipCode(44600);
	}
	
	public String validate() {
		if(getZipCode() == 44000) {
			setName("Nantes");
		}
		else if(getZipCode() == 44600) {
			setName("Saint-Nazaire");
		} else {
			setName("Unknow Zip Code");
		}
		return name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getZipCode() {
		return zipCode;
	}
	
	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}

}
