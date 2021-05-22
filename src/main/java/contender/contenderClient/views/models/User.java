package contender.contenderClient.views.models;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.ObservableIntegerArray;

public class User {
	private IntegerProperty pid;

	private StringProperty name;

	private StringProperty mail;
	
	private StringProperty passwd;
    
	transient ObservableIntegerArray tenders;
	
	transient ObservableIntegerArray suppliers;

	public User(){
		pid = new SimpleIntegerProperty();
		name = new SimpleStringProperty();
		mail = new SimpleStringProperty();
		passwd = new SimpleStringProperty();
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

	public String getMail() {
		return mail.get();
	}

	public void setMail(String mail) {
		this.mail.set(mail);
	}
	
	public StringProperty mailProperty() {
		return mail;
	}
	
	public String getPassw() {
		return passwd.get();
	}

	public void setPasswd(String mail) {
		this.passwd.set(mail);
	}
	
	public StringProperty passwdProperty() {
		return passwd;
	}

	public ObservableIntegerArray getTenders() {
		return tenders;
	}

	public void setTenders(ObservableIntegerArray tenders) {
		this.tenders = tenders;
	}

	public ObservableIntegerArray getSuppliers() {
		return suppliers;
	}

	public void setSuppliers(ObservableIntegerArray suppliers) {
		this.suppliers = suppliers;
	}
}
