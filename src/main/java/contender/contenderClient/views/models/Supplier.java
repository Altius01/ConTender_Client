package contender.contenderClient.views.models;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.collections.ObservableIntegerArray;

public class Supplier {
	private IntegerProperty pid;
	private IntegerProperty user;

    private IntegerProperty product;

	transient ObservableIntegerArray tenders;

	transient ObservableIntegerArray deals;
	
	public Supplier(){
		pid = new SimpleIntegerProperty();
		user = new SimpleIntegerProperty();
		product = new SimpleIntegerProperty();
	}
    
    public Integer getPid() {
		return pid.get();
	}

	public void setPid(Integer pid) {
		this.pid.set(pid);
	}
	
	public IntegerProperty pidProperty() {
		return pid;
	}
	
	public Integer getUser() {
		return user.get();
	}

	public void setUser(Integer user) {
		this.user.set(user);
	}
	
	public IntegerProperty userProperty() {
		return user;
	}

	public Integer getProduct() {
		return product.get();
	}

	public void setProduct(Integer product) {
		this.product.set(product);
	}
	
	public IntegerProperty productProperty() {
		return product;
	}
	
	public ObservableIntegerArray getTenders() {
		return tenders;
	}

	public void setTenders(ObservableIntegerArray tenders) {
		this.tenders = tenders;
	}

	public ObservableIntegerArray getDeals() {
		return deals;
	}

	public void setDeals(ObservableIntegerArray deals) {
		this.deals = deals;
	}
	
}
