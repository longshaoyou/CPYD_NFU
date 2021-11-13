package gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.util.Calendar;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class TicketBooker extends JFrame{

	private JLabel label = new JLabel("路线");
	private static final String[] arrayStarting = {"中大","南方学院"};
	private static final String[] arrayEnding = {"中大","南方学院"};
	private static final String[] arrayYear = {"2020","2021"};
	private static final String[] arrayMonth = {"1","2","3","4","5","6","7","8","9","10","11","12"};
	private static final String[] arrayDay = {"1","2","3","4","5","6","7","8","9","10",
			"11","12","13","14","15","16","17","18","19","20",
			"21","22","23","24","25","26","27","28","29","30","31"};
	private JComboBox<String> JCB_Starting = new JComboBox<String>(arrayStarting);
	private JComboBox<String> JCB_Ending = new JComboBox<String>(arrayEnding);
	private JComboBox<String> JCB_Year = new JComboBox<String>(arrayYear);
	private JComboBox<String> JCB_Month = new JComboBox<String>(arrayMonth);
	private JComboBox<String> JCB_Day = new JComboBox<String>(arrayDay);
	private JButton btnSearch = new JButton("查询");
	private JButton btnBook = new JButton("预订");
	private JTable tableResult = null;
	private DefaultTableModel defaultTableModel;
	
	public TicketBooker(){
		this.setTitle("车票预订");
		this.setLocation(400, 400);
		this.setSize(400, 600);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setLayout(null);
		
		//创建上面的面板
		JPanel panelUpper= new JPanel();
		panelUpper.setLocation(0, 0);
		panelUpper.setSize(400, 100);
		panelUpper.setLayout(new FlowLayout());
		panelUpper.add(label);
		panelUpper.add(JCB_Starting);
		JCB_Starting.setToolTipText("起点");
		panelUpper.add(JCB_Ending);
		JCB_Ending.setToolTipText("终点");
		panelUpper.add(JCB_Year);
		panelUpper.add(JCB_Month);
		panelUpper.add(JCB_Day);
		panelUpper.add(btnSearch);
		
		Calendar calendar = Calendar.getInstance();
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH);
		int day = calendar.get(Calendar.DAY_OF_MONTH);
		JCB_Year.setSelectedIndex(year-Integer.parseInt(arrayYear[0]));
		JCB_Month.setSelectedIndex(month);
		JCB_Day.setSelectedIndex(day-1);
		
		this.getContentPane().add(panelUpper);
		
		//创建中间面板
		JPanel panelMiddle = new JPanel();
		panelMiddle.setLocation(0, 100);
		panelMiddle.setSize(400, 400);
		panelMiddle.setLayout(new BorderLayout());
		createTable();
		JScrollPane scrollPane = new JScrollPane(tableResult);
		panelMiddle.add(scrollPane);
		this.getContentPane().add(panelMiddle);
		
		//创建下面的面板
		JPanel panelLower = new JPanel();
		panelLower.setLocation(0, 500);
		panelLower.setSize(400, 50);
		panelLower.setLayout(new BorderLayout());
		panelLower.add(btnBook);
		this.getContentPane().add(panelLower);
		
		this.setVisible(true);
	}
	
	
	private void createTable() {
		// TODO Auto-generated method stub
		String[] columnNames = {"时间","票价","剩余票数"};
		Object[][] data = {};		
		defaultTableModel = new DefaultTableModel(data, columnNames);
		tableResult = new JTable(defaultTableModel);
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TicketBooker();
	}

}
