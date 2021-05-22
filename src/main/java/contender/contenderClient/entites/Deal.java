package contender.contenderClient.entites;

public class Deal {
	private Integer pid;
	private Integer count;
	private DealState state;
	private Tender tender;
	private Supplier supplier;
	
	public Deal(){}
	
	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public DealState getState() {
		return state;
	}

	public void setState(DealState state) {
		this.state = state;
	}

	public Supplier getSupplier() {
		return supplier;
	}

	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}

	public Tender getTender() {
		return tender;
	}

	public void setTender(Tender tender) {
		this.tender = tender;
	}

}
