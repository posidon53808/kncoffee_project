package Controller;

import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import Dao.connDatabase;
import Factory.Company;
import Model.customer;

public class loginController extends ActionSupport {
private String username;
private String password;
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
@Override
public String execute()throws Exception {
	Company c = Dao.connDatabase.a1.getBean("c",Company.class);
	List<Object> l=c.getCustomerDao().queryUser(getUsername(), getPassword());
	if(l.size()!=0) {
		customer [] cu=l.toArray(new customer[l.size()]);
		Map session=ActionContext.getContext().getSession();
		session.put("cu",cu[0]);
		return "loginSuccess";
	
	}else {
		return "loginError";
	}
	
}
}
