package contender.contenderClient.entites;

public class Supplier {
	private Integer pid;
    
    private User user;

    private Product product;
	
	public Supplier(){}
	
	public void setUser(User user) {
		this.user = user; 
	}
	
	public User getUser() {
		return this.user;
	}

    public void setProduct(Product product) {
		this.product = product; 
	}
	
	public Product getProduct() {
		return this.product;
	}    
    
	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}
}
