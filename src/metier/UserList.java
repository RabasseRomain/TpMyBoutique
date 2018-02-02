package metier;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean
@ApplicationScoped
public class UserList {
	
	private List<User> userList;
	
	public UserList() {
		userList = new ArrayList<User>();
		for(int i=0; i<=9; i++) {
			User user = new User();
			user.setFirstName("firstname" + i);
			user.setLastName("lastname" + i);
			user.setUsername("username" + i);
			user.setPassword("password" + i);
			userList.add(user);
		}
	}
	
	public User checkLogin(String username, String password) {
		for(User user : userList) {
			if(user.getUsername().equals(username) && user.getPassword().equals(password)) {
				return user;
			}
		}
		return null;
	}

	public List<User> getUserList() {
		return userList;
	}

	public void setUserList(List<User> userList) {
		this.userList = userList;
	}
		
}
