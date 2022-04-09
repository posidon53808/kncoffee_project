package Factory;

import Model.customer;
import Model.porder;
import Dao.customerDao;
import Dao.porderDao;

public class Company {
private customer customer;
private porder porder;
private customerDao customerDao;
private porderDao porderDao;
public Company() {
	super();
	// TODO Auto-generated constructor stub
}
public Company(Model.customer customer, Model.porder porder, Dao.customerDao customerDao, Dao.porderDao porderDao) {
	super();
	this.customer = customer;
	this.porder = porder;
	this.customerDao = customerDao;
	this.porderDao = porderDao;
}
public customer getCustomer() {
	return customer;
}
public void setCustomer(customer customer) {
	this.customer = customer;
}
public porder getPorder() {
	return porder;
}
public void setPorder(porder porder) {
	this.porder = porder;
}
public customerDao getCustomerDao() {
	return customerDao;
}
public void setCustomerDao(customerDao customerDao) {
	this.customerDao = customerDao;
}
public porderDao getPorderDao() {
	return porderDao;
}
public void setPorderDao(porderDao porderDao) {
	this.porderDao = porderDao;
}

}
