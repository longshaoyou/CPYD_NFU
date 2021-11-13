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

	JButton btnOK = new JButton("确认");
	JButton btnCancel = new JButton("取消");
	
	public TicketBookingGUI(){
		
	}
	
	public TicketBookingGUI(User user, Shuttle shuttle){
		this.setTitle("车票信息");
		this.setSize(320, 160);
		this.setResizable(false);
		this.setLocation(200, 200);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(new GridLayout(4, 1, 0, 0));
		//第一行
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(1, 4, 0, 0));
		panel.add(new JLabel("用户名"));
		panel.add(new JLabel(user.getName()));
		panel.add(new JLabel("学号"));
		panel.add(new JLabel(user.getStuNum()));
		this.getContentPane().add(panel);
		//第二行
		panel = new JPanel();
		panel.setLayout(new GridLayout(1, 4, 0, 0));
		panel.add(new JLabel("起点"));
		panel.add(new JLabel(shuttle.getRoute().starting));
		panel.add(new JLabel("终点"));
		panel.add(new JLabel(shuttle.getRoute().ending));
		this.getContentPane().add(panel);
		//第三行
		panel = new JPanel();
		panel.setLayout(new GridLayout(1, 2));
		panel.add(new JLabel("时间"));
		Date date = shuttle.getDate();
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH);
		int day = calendar.get(Calendar.DAY_OF_MONTH);
		int hour = calendar.get(Calendar.HOUR_OF_DAY);
		int minute = calendar.get(Calendar.MINUTE);
		String time = year + "年" + (month+1) + "月" + day + "日" + hour + "时" + minute + "分";
		panel.add(new JLabel(time));
		this.getContentPane().add(panel);
		//第四行
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
		user.setName("张三");
		user.setStuNum("10001");
		user.setPassword("123456");
		Shuttle shuttle = new Shuttle(50, 50);
		shuttle.setId(1);
		shuttle.setFee(20);
		shuttle.setRoute(new Route("中大","南方学院"));
		shuttle.setDate(new Date());		
				
		new TicketBookingGUI(user,shuttle);
	}

}
