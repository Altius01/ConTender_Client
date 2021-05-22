package contender.contenderClient.views.models;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Product {
	private IntegerProperty pid;
	private StringProperty name;
	private DoubleProperty price;
	private IntegerProperty count;
	
	public Product() {
		pid = new SimpleIntegerProperty();
		name = new SimpleStringProperty();
		price = new SimpleDoubleProperty();
		count = new SimpleIntegerProperty();
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

	public String getName() {
		return name.get();
	}

	public void setName(String name) {
		this.name.set(name);
	}
	
	public StringProperty nameProperty() {
		return name;
	}

	public Double getPrice() {
		return price.get();
	}

	public void setPrice(Double price) {
		this.price.set(price);
	}
	
	public DoubleProperty priceProperty() {
		return price;
	}

	public Integer getCount() {
		return count.get();
	}

	public void setCount(Integer count) {
		this.count.set(count);
	}
	
	public IntegerProperty сountProperty() {
		return count;
	}
}
