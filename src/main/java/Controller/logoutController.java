package Controller;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class logoutController extends ActionSupport {

	@Override
	public String execute() throws Exception{
		Map session=ActionContext.getContext().getSession();
		if(session!=null)
		    session.remove("cu");
		    
		return "login";
	}
}
