package gui;



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class UserLogin extends JFrame implements ActionListener{//1. 继承JFrame
	
	//4. 创捷界面元素
	private JLabel labelAccout = new  JLabel("账号");
	private JLabel labelPassword = new  JLabel("密码");
	private JTextField jtfAccount = new JTextField();
	private JPasswordField jpfPassword = new JPasswordField();
	private JButton btnLogin = new JButton("登录");
	
	//2. 书写构造方法
	public UserLogin(){
		this.setTitle("用户登录");
		this.setSize(300, 400);
		this.setLocation(400, 400);
		this.setResizable(false);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(null);
		labelAccout.setBounds(50, 100, 100, 30);
		jtfAccount.setBounds(150, 100, 100, 30);
		labelPassword.setBounds(50, 150, 100, 30);
		jpfPassword.setBounds(150, 150, 100, 30);
		btnLogin.setBounds(90, 220, 100, 30);
		this.getContentPane().add(labelAccout);
		this.getContentPane().add(jtfAccount);
		this.getContentPane().add(labelPassword);
		this.getContentPane().add(jpfPassword);
		this.getContentPane().add(btnLogin);
		btnLogin.addActionListener(this);
		this.setVisible(true);
	}

	
	//3. 在main方法里面创捷该类的一个对象
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserLogin login = new UserLogin();
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==btnLogin){
			String account = jtfAccount.getText();
			String password = new String(jpfPassword.getPassword());
			if("zhangsan".equals(account) && "123456".equals(password)){
				new TicketBooker();
				this.dispose();
			}else{
				JOptionPane.showMessageDialog(this, "账号或密码错误！");
			}
		}
	}




}
