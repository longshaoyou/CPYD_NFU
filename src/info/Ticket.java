package info;

public class Ticket {
	
	private long id = -1;
	private User user = null;
	private Shuttle shuttle = null;
	private String status = "未乘坐";
	
	
	public Ticket() {
		super();
	}
	
	public Ticket(User user) {
		super();
		this.user = user;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Shuttle getShuttle() {
		return shuttle;
	}

	public void setShuttle(Shuttle shuttle) {
		this.shuttle = shuttle;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void show(){
		System.out.println("车票信息如下：");
		user.show();
		shuttle.show();
		System.out.println("状态：" + this.status);
	}

}
