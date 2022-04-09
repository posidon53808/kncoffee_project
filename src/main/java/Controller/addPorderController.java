package Controller;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import Factory.Company;
import Model.porder;

public class addPorderController extends ActionSupport {
@Override
public String execute() throws Exception{
	
	Map session=ActionContext.getContext().getSession();
	porder p=(porder) session.get("P");
	Company c=Dao.connDatabase.a1.getBean("c",Company.class);
	c.getPorderDao().add(p);
	return "finish";
	}
}
