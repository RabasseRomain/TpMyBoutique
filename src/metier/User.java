package metier;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.component.html.HtmlOutputLabel;

@ManagedBean(name="userBean")
@SessionScoped
public class User {
	
	// ----- Parameters -----
	
	private HtmlOutputLabel message;
	private String firstName;
	private String lastName;
	private String username;
	private String password;
	private String gender;
	private int age;
	
	// ----- Methods -----
	
	public User() {
		age = 0;
		gender = "unknown";
	}

	public String login() {
		if(username.equals("log1") && password.equals("pwd1")) { 
			System.out.println("Success");
			message.setValue("Authentification reussie");
			message.setStyle("color:GREEN");
		} else {
			System.out.println("Failure");
			message.setValue("Echec d'authentification");
			message.setStyle("color:RED");
		}
		return null;
	}

	public String signin() {
		System.out.println(toString());
		return "Login";
	}
	
	public String cancel() {
		System.out.println("Cancel");
		return "Signin";
	}
	
	// ----- Getters, Setters, toString -----
	
	@Override
	public String toString() {
		return "User [firstName=" + firstName + ", lastName=" + lastName + ", username=" + username + ", password=" + password + ", gender=" + gender + ", age=" + age + "]";
	}

	public HtmlOutputLabel getMessage() {
		return message;
	}

	public void setMessage(HtmlOutputLabel message) {
		this.message = message;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
