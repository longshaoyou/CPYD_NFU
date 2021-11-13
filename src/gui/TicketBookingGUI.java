package gui;

import java.awt.GridLayout;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import info.Route;
import info.Shuttle;
import info.User;

public class TicketBookingGUI extends JFrame{

	JButton btnOK = new JButton("ȷ��");
	JButton btnCancel = new JButton("ȡ��");
	
	public TicketBookingGUI(){
		
	}
	
	public TicketBookingGUI(User user, Shuttle shuttle){
		this.setTitle("��Ʊ��Ϣ");
		this.setSize(320, 160);
		this.setResizable(false);
		this.setLocation(200, 200);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(new GridLayout(4, 1, 0, 0));
		//��һ��
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(1, 4, 0, 0));
		panel.add(new JLabel("�û���"));
		panel.add(new JLabel(user.getName()));
		panel.add(new JLabel("ѧ��"));
		panel.add(new JLabel(user.getStuNum()));
		this.getContentPane().add(panel);
		//�ڶ���
		panel = new JPanel();
		panel.setLayout(new GridLayout(1, 4, 0, 0));
		panel.add(new JLabel("���"));
		panel.add(new JLabel(shuttle.getRoute().starting));
		panel.add(new JLabel("�յ�"));
		panel.add(new JLabel(shuttle.getRoute().ending));
		this.getContentPane().add(panel);
		//������
		panel = new JPanel();
		panel.setLayout(new GridLayout(1, 2));
		panel.add(new JLabel("ʱ��"));
		Date date = shuttle.getDate();
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH);
		int day = calendar.get(Calendar.DAY_OF_MONTH);
		int hour = calendar.get(Calendar.HOUR_OF_DAY);
		int minute = calendar.get(Calendar.MINUTE);
		String time = year + "��" + (month+1) + "��" + day + "��" + hour + "ʱ" + minute + "��";
		panel.add(new JLabel(time));
		this.getContentPane().add(panel);
		//������
		panel = new JPanel();
		panel.setLayout(new GridLayout(1, 2));
		panel.add(btnOK);
		panel.add(btnCancel);
		this.getContentPane().add(panel);
		
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User user = new User();
		user.setId(1);
		user.setName("����");
		user.setStuNum("10001");
		user.setPassword("123456");
		Shuttle shuttle = new Shuttle(50, 50);
		shuttle.setId(1);
		shuttle.setFee(20);
		shuttle.setRoute(new Route("�д�","�Ϸ�ѧԺ"));
		shuttle.setDate(new Date());		
				
		new TicketBookingGUI(user,shuttle);
	}

}
