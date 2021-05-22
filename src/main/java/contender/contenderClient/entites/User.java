package contender.contenderClient.entites;

import java.util.Objects;

public class User {
	private Integer pid;

	private String name;

	private String mail;
	
	private String passwd;

	public User(){}
	
	public void setName(String name) {
		this.name = Objects.requireNonNull(name, "Name must not be Null!"); 
	}
	
	public String getName() {
		return this.name;
	}

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}
	
	public void setPassword(String passwd) {
		this.passwd = Objects.requireNonNull(passwd, "Name must not be Null!"); 
	}
	
	public String getPassword() {
		return this.passwd;
	}
}
