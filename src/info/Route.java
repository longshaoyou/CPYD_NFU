package info;

public class Route {
	
	private long id = -1;
	public String starting = new String();//Æðµã
	public String ending = new String();//ÖÕµã
	
	
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
