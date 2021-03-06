package Model;

import java.util.ArrayList;

public class CustomerManager {
	private ArrayList<Customer> customerList = new ArrayList<Customer>();

	public ArrayList<Customer> getCustomerList() {
		return customerList;
	}

	public void setCustomerList(ArrayList<Customer> customerList) {
		this.customerList = customerList;
	}

	public void addCustomerToCusList(Customer c) {
		getCustomerList().add(c);
	}

	public void deleteCustomerInCusList(Customer c) {
		getCustomerList().remove(c);
	}
}
