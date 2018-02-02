package metier;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.component.html.HtmlOutputLabel;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

@ManagedBean(name="loginBean")
@SessionScoped
public class Login {
	
	private HtmlOutputLabel message;
	private String username;
	private String password;
	
	public String login(UserList userList) {
		
		User user = null;
		
		if(userList != null) {
			user = userList.checkLogin(username, password);
		}
		
		if(user != null) { 
			message.setValue("Authentification reussie");
			message.setStyle("color:GREEN");
			
			FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("checkedUser", user);
			
			return "visuBoutique";
		} else {
			message.setValue("Echec d'authentification");
			message.setStyle("color:RED");
		}
		return null;
	}
	
	public String disconnect() {
		HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(true);
		session.invalidate();
		return "Login";
	}

	public String signin() {
		System.out.println(toString());
		return "Login";
	}
	
	public String cancel() {
		System.out.println("Cancel");
		return "Signin";
	}

	public HtmlOutputLabel getMessage() {
		return message;
	}

	public void setMessage(HtmlOutputLabel message) {
		this.message = message;
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
	
}
