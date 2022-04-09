package Controller;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import Factory.Company;
import Model.customer;

public class registerController extends ActionSupport {

	private String name;
	private String username;
	private String password;
	private String email;
	private String address;
	private String phone;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Override
	public String execute()throws Exception{
		Company c=Dao.connDatabase.a1.getBean("c",Company.class);
		List<Object> l=c.getCustomerDao().queryUsername(getUsername());
		if(l.size()!=0) {
			return "memberError";
		}else {
			customer cu =new customer(getName(),getUsername(),getPassword(),getEmail(),
					getPhone());
				c.getCustomerDao().add(cu);
			return "memberSuccess";
		}
		}
		
	}
	
