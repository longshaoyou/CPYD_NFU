package info;

public class User {
	
	private long id = -1;
	private String name = new String();
	private String password = new String();
	private String stuNum = new String();
	
	
	public User(){
		
	}
	
	public long getId(){
		return this.id;
	}
	
	public void setId(long id){
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getStuNum() {
		return stuNum;
	}

	public void setStuNum(String stuNum) {
		this.stuNum = stuNum;
	}

	public void show(){
		System.out.println("�û���Ϣ���£�");
		System.out.println("�û�����"  + this.name);
		System.out.println("ѧ�ţ�" + this.stuNum);
	}
}
