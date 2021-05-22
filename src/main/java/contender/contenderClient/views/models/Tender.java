package contender.contenderClient.views.models;

import javafx.beans.property.FloatProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleFloatProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.collections.ObservableIntegerArray;

public class Tender {
	private IntegerProperty pid;

	private FloatProperty volume;

	private IntegerProperty user;
    
	private IntegerProperty product;
    
	transient ObservableIntegerArray suppliers;
	
	public Tender() {
		pid = new SimpleIntegerProperty();
		volume = new SimpleFloatProperty();
		user = new SimpleIntegerProperty();
		product = new SimpleIntegerProperty();
	}

	public Integer getPid() {
		return pid.get();
	}

	public void setPid(Integer pid) {
		this.pid.setValue(pid);
	}
	
	public IntegerProperty pidProperty() {
		return pid;
	}

	public Float getVolume() {
		return volume.get();
	}

	public void setVolume(Float volume) {
		this.volume.setValue(volume);
	}
	
	public FloatProperty volumeProperty() {
		return volume;
	}

	public Integer getUser() {
		return user.get();
	}

	public void setUser(Integer user) {
		this.user.setValue(user);
	}
	
	public IntegerProperty userProperty() {
		return user;
	}

	public Integer getProduct() {
		return product.get();
	}

	public void setProduct(Integer product) {
		this.product.setValue(product);
	}
	
	public IntegerProperty productProperty() {
		return product;
	}
	
	public ObservableIntegerArray suppliersProperty() {
		return suppliers;
	}
}
