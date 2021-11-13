package info;

import java.util.Date;

public class Shuttle {

	private long id = -1;
	private Route route = new Route();//·��
	private Date date = new Date();//����ʱ��
	private int seatingCapacity = 50;//��λ����
	private int seating = 50;//��Ʊ
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
		System.out.println("������Ϣ���£�");
		System.out.println("��㣺" + this.route.starting  + ",�յ㣺" + this.route.ending);
		System.out.println("����ʱ�䣺" + this.date.toString());
		System.out.println("����λ��" + this.seatingCapacity);
		System.out.println("��Ʊ��" + this.seating);
		System.out.println("Ʊ�ۣ�"  + this.fee);
	}
	
}
