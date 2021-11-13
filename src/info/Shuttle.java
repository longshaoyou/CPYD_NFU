package info;

import java.util.Date;

public class Shuttle {

	private long id = -1;
	private Route route = new Route();//路线
	private Date date = new Date();//日期时间
	private int seatingCapacity = 50;//座位总数
	private int seating = 50;//余票
	private int fee = 20;
	
	public Shuttle() {
		super();
	}

	public Shuttle(int seatingCapacity, int seating) {
		super();
		this.seatingCapacity = seatingCapacity;
		this.seating = seating;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Route getRoute() {
		return route;
	}

	public void setRoute(Route route) {
		this.route = route;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getSeatingCapacity() {
		return seatingCapacity;
	}

	public void setSeatingCapacity(int seatingCapacity) {
		this.seatingCapacity = seatingCapacity;
	}

	public int getSeating() {
		return seating;
	}

	public void setSeating(int seating) {
		this.seating = seating;
	}

	public int getFee() {
		return fee;
	}

	public void setFee(int fee) {
		this.fee = fee;
	}
	
	public void show(){
		System.out.println("车次信息如下：");
		System.out.println("起点：" + this.route.starting  + ",终点：" + this.route.ending);
		System.out.println("日期时间：" + this.date.toString());
		System.out.println("总座位：" + this.seatingCapacity);
		System.out.println("余票：" + this.seating);
		System.out.println("票价："  + this.fee);
	}
	
}
