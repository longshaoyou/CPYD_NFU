package info;

public class Route {
	
	private long id = -1;
	public String starting = new String();//���
	public String ending = new String();//�յ�
	
	
	public Route() {
		super();
	}


	public Route(String starting, String ending) {
		super();
		this.starting = starting;
		this.ending = ending;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}
	
	

}
