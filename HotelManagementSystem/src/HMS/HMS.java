/*
 * HOTEL MANAGEMENT SYSTEM
 * AUTHOR: S.AJJUTHAN
 * CREATED 10/02/19- Personal Project
 */

package HMS;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import java.awt.Color;

import javax.swing.border.MatteBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.ComponentOrientation;

import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.SwingConstants;
import javax.swing.JCheckBox;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Component;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.swing.border.CompoundBorder;

import java.awt.SystemColor;

public class HMS {

	private JFrame frame;
	private JTextField txtDisplay;
	private JTextField txtPizzaMrg;
	private JTextField txtPizzaPep;
	private JTextField txtShepPie;
	private JTextField txtChooseDrink;
	private JTextField txtEnterCurrency;


	/**
	 * Launch the application.
	 */
	double firstnum;
	double secondnum;
	double result;
	String operations;
	String answer;
	
	double USD = 1.29333;
	double EU = 1.14152;
	double CHF = 1.29332;
	double IND = 92.1165;
	double CNY = 8.72393;
	
	private JTextArea ReceiptArea;
	private JTextField jlbClock2;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HMS window = new HMS();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public void datetime() {
		Thread datetime = new Thread() {
		public void run() {
		try
		{
		for(;;)
		{
		Calendar cal = new GregorianCalendar(); int day = cal.get(Calendar.DAY_OF_MONTH); int month = cal.get(Calendar.MONTH);
		int year = cal.get(Calendar.YEAR);int second = cal.get(Calendar.SECOND); int minute = cal.get(Calendar.MINUTE); int hour = cal.get(Calendar.HOUR);
		jlbClock2.setText("Time: " + hour + ":" + minute + ":" + second + "  " + year + "/" + month + "/" + day);
				sleep(1000); }
				}
				catch(Exception e) {
				} }
				}; datetime.start();
				}

	/**
	 * Create the application.
	 */
	public HMS() {
		initialize();
		datetime();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	@SuppressWarnings("unchecked")
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(Color.LIGHT_GRAY);
		frame.setBounds(0, 0, 1500, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(211, 211, 211), new Color(248, 248, 255)));
		panel.setBounds(31, 152, 435, 569);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBorder(new LineBorder(new Color(176, 196, 222), 2));
		tabbedPane.setBounds(6, 6, 423, 560);
		panel.add(tabbedPane);
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("Calculator", null, panel_3, null);
		panel_3.setLayout(null);
		
		txtDisplay = new JTextField();
		txtDisplay.setColumns(10);
		txtDisplay.setBounds(30, 24, 355, 92);
		panel_3.add(txtDisplay);
		
		JButton btnClear = new JButton("C");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtDisplay.setText(null);
			}
		});
		btnClear.setForeground(new Color(255, 140, 0));
		btnClear.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		btnClear.setBounds(38, 128, 75, 44);
		panel_3.add(btnClear);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterValue= txtDisplay.getText() + btn7.getText();
				txtDisplay.setText(EnterValue);
			}
		});
		btn7.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		btn7.setBounds(38, 184, 75, 44);
		panel_3.add(btn7);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterValue= txtDisplay.getText() + btn4.getText();
				txtDisplay.setText(EnterValue);
			}
		});
		btn4.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		btn4.setBounds(38, 246, 75, 44);
		panel_3.add(btn4);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterValue= txtDisplay.getText() + btn1.getText();
				txtDisplay.setText(EnterValue);
			}
		});
		btn1.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		btn1.setBounds(38, 302, 75, 44);
		panel_3.add(btn1);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterValue= txtDisplay.getText() + btn0.getText();
				txtDisplay.setText(EnterValue); 
			}
		});
		btn0.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		btn0.setBounds(38, 358, 75, 44);
		panel_3.add(btn0);
		
		JButton btnDot = new JButton(".");
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterValue= txtDisplay.getText() + btnDot.getText();
				txtDisplay.setText(EnterValue);
			}
		});
		btnDot.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		btnDot.setBounds(125, 358, 75, 44);
		panel_3.add(btnDot);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterValue= txtDisplay.getText() + btn2.getText();
				txtDisplay.setText(EnterValue);
			}
		});
		btn2.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		btn2.setBounds(125, 302, 75, 44);
		panel_3.add(btn2);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterValue= txtDisplay.getText() + btn5.getText();
				txtDisplay.setText(EnterValue);
			}
		});
		btn5.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		btn5.setBounds(125, 246, 75, 44);
		panel_3.add(btn5);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterValue= txtDisplay.getText() + btn8.getText();
				txtDisplay.setText(EnterValue);
			}
		});
		btn8.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		btn8.setBounds(125, 184, 75, 44);
		panel_3.add(btn8);
		
		JButton btnbackspace = new JButton("");
		btnbackspace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtDisplay.getText().length()>0)
				{
					String backspace =null;
					StringBuilder strB = new StringBuilder(txtDisplay.getText());
					strB.deleteCharAt(txtDisplay.getText().length()-1);
					backspace =strB.toString();
					txtDisplay.setText(backspace);
				}
			}
		});
		btnbackspace.setFont(new Font("Wingdings", Font.PLAIN, 20));
		btnbackspace.setBounds(125, 128, 75, 44);
		panel_3.add(btnbackspace);
		
		JButton btnModulus = new JButton("%");
		btnModulus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "%";
			}
		});
		btnModulus.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		btnModulus.setBounds(212, 128, 75, 44);
		panel_3.add(btnModulus);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterValue= txtDisplay.getText() + btn9.getText();
				txtDisplay.setText(EnterValue);
			}
		});
		btn9.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		btn9.setBounds(212, 184, 75, 44);
		panel_3.add(btn9);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterValue= txtDisplay.getText() + btn6.getText();
				txtDisplay.setText(EnterValue);
			}
		});
		btn6.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		btn6.setBounds(212, 246, 75, 44);
		panel_3.add(btn6);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterValue= txtDisplay.getText() + btn3.getText();
				txtDisplay.setText(EnterValue);
			}
		});
		btn3.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		btn3.setBounds(212, 302, 75, 44);
		panel_3.add(btn3);
		
		JButton btnPM = new JButton("±");
		btnPM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	
				double plusminus =Double.parseDouble(String.valueOf(txtDisplay.getText()));
				plusminus = plusminus *(-1);
				txtDisplay.setText(String.valueOf(plusminus));
			}
		});
		btnPM.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		btnPM.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		btnPM.setBounds(212, 358, 75, 44);
		panel_3.add(btnPM);
		
		JButton btnEqual = new JButton("=");
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String answer;
				secondnum = Double.parseDouble(txtDisplay.getText());
				if(operations =="+" )
				{
					result =  firstnum + secondnum;
					answer = String.format("%.2f", result);
					txtDisplay.setText(answer);
					}
				else if(operations =="-")
				{
					result = firstnum - secondnum;
					answer = String.format("%.2f", result);
					txtDisplay.setText(answer);
				}
				else if (operations == "X")
				{
					result = firstnum * secondnum;
					answer =String.format("%.2f",result);
					txtDisplay.setText(answer);
			
				}
				else if (operations == "/")
				{
					result = firstnum / secondnum;
					answer = String.format("%.2f",result);
					txtDisplay.setText(answer);
				}
				else if (operations == "%")
				{
					result = firstnum % secondnum;
					answer = String.format("%.2f",result);					
					txtDisplay.setText(answer);
						
				}	
			
			}
		});
		btnEqual.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		btnEqual.setBounds(299, 358, 75, 44);
		panel_3.add(btnEqual);
		
		JButton btnDivide = new JButton("/");
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(txtDisplay.getText()); txtDisplay.setText("");
				operations = "/";
			}
		});
		btnDivide.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		btnDivide.setBounds(299, 302, 75, 44);
		panel_3.add(btnDivide);
		
		JButton multi = new JButton("X");
		multi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "X";
			}
		});
		multi.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		multi.setBounds(299, 246, 75, 44);
		panel_3.add(multi);
		
		JButton btnMinus = new JButton("-");
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "-";
			}
		});
		btnMinus.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		btnMinus.setBounds(299, 184, 75, 44);
		panel_3.add(btnMinus);
		
		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "+";
			}
		});
		btnPlus.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		btnPlus.setBounds(299, 128, 75, 44);
		panel_3.add(btnPlus);
		
		JPanel panel_4 = new JPanel();
		tabbedPane.addTab("Receipt", null, panel_4, null);
		panel_4.setLayout(null);
		
		ReceiptArea = new JTextArea();
		ReceiptArea.setBounds(4, 4, 392, 502);
		panel_4.add(ReceiptArea);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(211, 211, 211)));
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(488, 152, 766, 370);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblMenu = new JLabel("Menu");
		lblMenu.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblMenu.setBounds(29, 8, 61, 16);
		panel_1.add(lblMenu);
		
		JLabel lblQuantity = new JLabel("Quantity");
		lblQuantity.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblQuantity.setBounds(232, 2, 89, 29);
		panel_1.add(lblQuantity);
		
		JLabel lblPrice = new JLabel("Price £");
		lblPrice.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblPrice.setBounds(426, 11, 79, 16);
		panel_1.add(lblPrice);
		
		JLabel lblPizzaMrg = new JLabel("Pizza Margerita");
		lblPizzaMrg.setBounds(29, 49, 118, 29);
		panel_1.add(lblPizzaMrg);
		
		JLabel lblPizzaPep = new JLabel("Pizza Pepperoni");
		lblPizzaPep.setBounds(29, 99, 118, 29);
		panel_1.add(lblPizzaPep);
		
		JLabel lblShepPie = new JLabel("Shepards Pie");
		lblShepPie.setBounds(29, 140, 118, 29);
		panel_1.add(lblShepPie);
		
		txtPizzaMrg = new JTextField();
		txtPizzaMrg.setFont(new Font("Lucida Grande", Font.PLAIN, 19));
		txtPizzaMrg.setBounds(242, 47, 73, 32);
		panel_1.add(txtPizzaMrg);
		txtPizzaMrg.setColumns(10);
		
		txtPizzaPep = new JTextField();
		txtPizzaPep.setFont(new Font("Lucida Grande", Font.PLAIN, 19));
		txtPizzaPep.setColumns(10);
		txtPizzaPep.setBounds(242, 96, 73, 32);
		panel_1.add(txtPizzaPep);
		
		txtShepPie = new JTextField();
		txtShepPie.setFont(new Font("Lucida Grande", Font.PLAIN, 19));
		txtShepPie.setColumns(10);
		txtShepPie.setBounds(242, 138, 73, 32);
		panel_1.add(txtShepPie);
		
		JLabel label = new JLabel("7.56£");
		label.setBounds(435, 49, 61, 29);
		panel_1.add(label);
		
		JLabel label_1 = new JLabel("9.59£");
		label_1.setBounds(435, 99, 73, 29);
		panel_1.add(label_1);
		
		JLabel label_2 = new JLabel("8.79£");
		label_2.setBounds(435, 140, 73, 29);
		panel_1.add(label_2);
		
		JComboBox btnChooseDrink = new JComboBox();
		btnChooseDrink.setModel(new DefaultComboBoxModel(new String[] {"Choose a drink", "Pepsi", "Sprite", "Heinenken"}));
		btnChooseDrink.setBounds(19, 181, 128, 27);
		panel_1.add(btnChooseDrink);
		
		txtChooseDrink = new JTextField();
		txtChooseDrink.setFont(new Font("Lucida Grande", Font.PLAIN, 19));
		txtChooseDrink.setColumns(10);
		txtChooseDrink.setBounds(242, 177, 73, 32);
		panel_1.add(txtChooseDrink);
		
		JLabel label_3 = new JLabel("-");
		label_3.setBounds(444, 179, 73, 29);
		panel_1.add(label_3);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setOrientation(SwingConstants.VERTICAL);
		separator_2.setBounds(495, 4, 12, 364);
		panel_1.add(separator_2);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(6, 210, 494, 13);
		panel_1.add(separator_3);
		
		JComboBox btnChooseRoom = new JComboBox();
		btnChooseRoom.setModel(new DefaultComboBoxModel(new String[] {"Choose a room", "101", "129", "214", "VIP"}));
		btnChooseRoom.setBounds(19, 235, 128, 27);
		panel_1.add(btnChooseRoom);
		
		JCheckBox btnDelivery = new JCheckBox("Delivery");
		btnDelivery.setBounds(19, 274, 128, 23);
		panel_1.add(btnDelivery);
		
		JCheckBox btnTax = new JCheckBox("Tax");
		btnTax.setBounds(19, 309, 128, 23);
		panel_1.add(btnTax);
		
		JLabel lblCurrencyConvert = new JLabel("CURRENCY CONVERTER");
		lblCurrencyConvert.setForeground(new Color(0, 0, 139));
		lblCurrencyConvert.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblCurrencyConvert.setBounds(525, -1, 231, 40);
		panel_1.add(lblCurrencyConvert);
		
		JComboBox btnSelectCountry = new JComboBox();
		btnSelectCountry.setModel(new DefaultComboBoxModel(new String[] {"Country", "Switerland", "Germany", "Indian", "China", "US"}));
		btnSelectCountry.setBounds(546, 51, 179, 27);
		panel_1.add(btnSelectCountry);
		
		txtEnterCurrency = new JTextField();
		txtEnterCurrency.setFont(new Font("Lucida Grande", Font.PLAIN, 19));
		txtEnterCurrency.setColumns(10);
		txtEnterCurrency.setBounds(540, 97, 186, 27);
		panel_1.add(txtEnterCurrency);
		
		JLabel txtCurrencyOutput = new JLabel("");
		txtCurrencyOutput.setForeground(new Color(0, 0, 0));
		txtCurrencyOutput.setBorder(new LineBorder(new Color(192, 192, 192)));
		txtCurrencyOutput.setBounds(542, 140, 183, 29);
		panel_1.add(txtCurrencyOutput);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtCurrencyOutput.setText(null); 
				txtEnterCurrency.setText(null); 
				btnSelectCountry.setSelectedItem("Country");
	
			}
		});
		btnReset.setForeground(new Color(105, 105, 105));
		btnReset.setFont(new Font("Lucida Grande", Font.PLAIN, 22));
		btnReset.setBounds(646, 274, 110, 34);
		panel_1.add(btnReset);
		
		JButton btnConvert = new JButton("Submit");
		btnConvert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double UK_Pounds = Double.parseDouble(txtEnterCurrency.getText());
				
				if (btnSelectCountry.getSelectedItem().equals("Switerland")) {
					String Fr = String.format("Fr %.2f", UK_Pounds*CHF);
					txtCurrencyOutput.setText(Fr); }
					if (btnSelectCountry.getSelectedItem().equals("Germany")) {
					String Euro = String.format("Euro %.2f", UK_Pounds*EU);
					txtCurrencyOutput.setText(Euro); }
					if (btnSelectCountry.getSelectedItem().equals("Indian")) {
					String INDR = String.format("INDR %.2f", UK_Pounds*IND);
					txtCurrencyOutput.setText(INDR); }
					if (btnSelectCountry.getSelectedItem().equals("China")) {
					String Cny = String.format("CNY %.2f", UK_Pounds*CNY);
					txtCurrencyOutput.setText(Cny); }
					if (btnSelectCountry.getSelectedItem().equals("US")) {
						String Dollar = String.format("INR %.2f", UK_Pounds*USD);
						txtCurrencyOutput.setText(Dollar); }
					

				
			}
		});
		btnConvert.setForeground(new Color(255, 165, 0));
		btnConvert.setFont(new Font("Lucida Grande", Font.PLAIN, 22));
		btnConvert.setBounds(525, 275, 123, 34);
		panel_1.add(btnConvert);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(211, 211, 211), new Color(255, 250, 250)));
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(487, 522, 766, 192);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel btnTotalCostOfMeal = new JLabel("Total Cost Of Meal");
		btnTotalCostOfMeal.setBounds(25, 18, 118, 29);
		panel_2.add(btnTotalCostOfMeal);
		
		JLabel btnTotalCostOfDrink = new JLabel("Total Cost Of Drink");
		btnTotalCostOfDrink.setBounds(25, 66, 133, 29);
		panel_2.add(btnTotalCostOfDrink);
		
		JLabel btnTotalCostOfDelivery = new JLabel("Total Cost Of Delivery");
		btnTotalCostOfDelivery.setBounds(25, 107, 139, 29);
		panel_2.add(btnTotalCostOfDelivery);
		
		JLabel txtTotalCostOfMeal = new JLabel("");
		txtTotalCostOfMeal.setForeground(Color.BLACK);
		txtTotalCostOfMeal.setBorder(new LineBorder(new Color(192, 192, 192)));
		txtTotalCostOfMeal.setBounds(237, 19, 144, 29);
		panel_2.add(txtTotalCostOfMeal);
		
		JLabel txtTotalCostOfDrink = new JLabel("");
		txtTotalCostOfDrink.setForeground(Color.BLACK);
		txtTotalCostOfDrink.setBorder(new LineBorder(new Color(192, 192, 192)));
		txtTotalCostOfDrink.setBounds(238, 62, 144, 29);
		panel_2.add(txtTotalCostOfDrink);
		
		JLabel txtTotalCostOfDelivery = new JLabel("");
		txtTotalCostOfDelivery.setForeground(Color.BLACK);
		txtTotalCostOfDelivery.setBorder(new LineBorder(new Color(192, 192, 192)));
		txtTotalCostOfDelivery.setBounds(239, 100, 144, 29);
		panel_2.add(txtTotalCostOfDelivery);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setOrientation(SwingConstants.VERTICAL);
		separator_4.setBounds(496, 1, 15, 191);
		panel_2.add(separator_4);
		
		JLabel btnTax1 = new JLabel("Tax");
		btnTax1.setBounds(522, 11, 37, 29);
		panel_2.add(btnTax1);
		
		JLabel btnSubtotal = new JLabel("SubTotal");
		btnSubtotal.setBounds(522, 71, 60, 29);
		panel_2.add(btnSubtotal);
		
		JLabel btnTotal = new JLabel("Total");
		btnTotal.setForeground(new Color(255, 140, 0));
		btnTotal.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		btnTotal.setBounds(522, 130, 60, 29);
		panel_2.add(btnTotal);
		
		JLabel txtTax1 = new JLabel("");
		txtTax1.setForeground(Color.BLACK);
		txtTax1.setBorder(new LineBorder(new Color(192, 192, 192)));
		txtTax1.setBounds(600, 16, 143, 23);
		panel_2.add(txtTax1);
		
		JLabel txtSubTotal = new JLabel("");
		txtSubTotal.setForeground(Color.BLACK);
		txtSubTotal.setBorder(new LineBorder(new Color(192, 192, 192)));
		txtSubTotal.setBounds(599, 72, 143, 23);
		panel_2.add(txtSubTotal);
		
		JLabel txtTotal = new JLabel("");
		txtTotal.setForeground(Color.BLACK);
		txtTotal.setBorder(new LineBorder(new Color(192, 192, 192)));
		txtTotal.setBounds(598, 129, 143, 23);
		panel_2.add(txtTotal);
		
		JLabel LbHMS = new JLabel("Hotel Management System");
		LbHMS.setForeground(new Color(244, 164, 96));
		LbHMS.setFont(new Font("Marion", Font.PLAIN, 74));
		LbHMS.setBounds(228, 70, 937, 95);
		frame.getContentPane().add(LbHMS);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//========Drinks===========
				
				double Drinks = Double.parseDouble(txtChooseDrink.getText());
				double Pepsi = 2.957* Drinks;
				double Sprite = 2.957* Drinks; 
				double Heinenken = 3.432* Drinks;
				
				if(btnChooseDrink.getSelectedItem().equals("Pepsi"))
				{
					String pPepsi = String.format("%.3f", Pepsi);
					txtTotalCostOfDrink.setText(pPepsi);
				}
				

				if(btnChooseDrink.getSelectedItem().equals("Sprite"))
				{
					String pSprite = String.format("%.3f", Sprite);
					txtTotalCostOfDrink.setText(pSprite);
				}
				
				if(btnChooseDrink.getSelectedItem().equals("Heinenken"))
				{
					String pHeinenken = String.format("%.3f", Heinenken);
					txtTotalCostOfDrink.setText(pHeinenken);
				}
				
				if(btnChooseDrink.getSelectedItem().equals("Choose a drink"))
				{
					txtTotalCostOfDrink.setText("0.000");
				}
		
		
				//==========MEAL===============================
				
				double PizzaM = Double.parseDouble(txtPizzaMrg.getText());
				double pPizzaM = 7.56;
				double getPizzaM;
				getPizzaM = (PizzaM * pPizzaM);
				String TotalPizzaM =String.format("%.3f", getPizzaM);
				txtTotalCostOfMeal.setText(TotalPizzaM);
				
				double PizzaPep = Double.parseDouble(txtPizzaPep.getText());
				double pPizzaPep = 9.59;
				double getPizzaPep;
				getPizzaPep = (PizzaPep* pPizzaPep);
				String TotalPizzaPep =String.format("%.3f", getPizzaPep + getPizzaM);
				txtTotalCostOfMeal.setText(TotalPizzaPep);
				  
				double ShepPi = Double.parseDouble(txtShepPie.getText());
				double pShepPi = 8.79;
				double getShepPi;
				getShepPi = (ShepPi* pShepPi);
				String TotalShepPi =String.format("%.3f", getShepPi +  getPizzaPep + getPizzaM);
				txtTotalCostOfMeal.setText(TotalShepPi);
				
				//===========Delivery=====================
				double cDelivery = 2.549;
				if(btnDelivery.isSelected())
				{
					String pDelivery = String.format("%.3f",cDelivery);
					txtTotalCostOfDelivery.setText(pDelivery);
					
				}
				else 
				{
					txtTotalCostOfDelivery.setText("0.000");
					
				}
				//================TAX=========
				
				double pTotal1 = Double.parseDouble(txtTotalCostOfMeal.getText());
				double pTotal2 = Double.parseDouble(txtTotalCostOfDrink.getText());
				double pTotal3 = Double.parseDouble(txtTotalCostOfDelivery.getText());
				double cTotal =	(pTotal1 + pTotal2 + pTotal3)/100;
				if(btnTax.isSelected())
				{
					String xTotal = String.format("%.3f", cTotal);
					txtTax1.setText(xTotal);
				}
				
				//========Total========================
				
				double pTotal4 = Double.parseDouble(txtTax1.getText());
				
				String zTaxTotal = String.format("$%.3f", pTotal4);
				txtTax1.setText(zTaxTotal);
				
				double SubTotal = (pTotal1 + pTotal2 + pTotal3);
				String pSubTotal = String.format("$%.3f", SubTotal);
				txtSubTotal.setText(pSubTotal);
				
				double xTotal = (pTotal1 + pTotal2 + pTotal3 + pTotal4);
				String yTotal = String.format("$%.3f",xTotal);
				txtTotal.setText(yTotal);
				
					
			}
		});
		btnSubmit.setFont(new Font("Lucida Grande", Font.PLAIN, 22));
		btnSubmit.setForeground(new Color(255, 165, 0));
		btnSubmit.setBounds(243, 275, 123, 34);
		panel_1.add(btnSubmit);
		
		JButton btnReset1 = new JButton("Reset");
		btnReset1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				 txtPizzaMrg.setText(null);
				 txtPizzaPep.setText(null);
				 txtShepPie.setText(null);
			     txtChooseDrink.setText(null);
				 txtEnterCurrency.setText(null);
				 txtChooseDrink.setText(null); 
				 txtTotalCostOfMeal.setText(null); 
				 txtTotalCostOfDrink.setText(null); 
				 txtTotalCostOfDelivery.setText(null); 
				 txtTax1.setText(null);
				 txtSubTotal.setText(null); 
				 txtTotal.setText(null); 
				 txtEnterCurrency.setText(null);
				 txtCurrencyOutput.setText(null); 
				 txtDisplay.setText(null); 
				 btnChooseDrink.setSelectedItem("Choose a drink"); 
				 btnChooseRoom.setSelectedItem("Choose a room"); 
				 btnSelectCountry.setSelectedItem("Country"); 
				 ReceiptArea.setText(null);
				
			}
		});
		btnReset1.setForeground(new Color(105, 105, 105));
		btnReset1.setFont(new Font("Lucida Grande", Font.PLAIN, 22));
		btnReset1.setBounds(369, 275, 110, 34);
		panel_1.add(btnReset1);
		
		
		JMenuItem mntmReset = new JMenuItem("Receipt");
		mntmReset.setForeground(new Color(0, 0, 0));
		mntmReset.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		mntmReset.setAlignmentX(Component.LEFT_ALIGNMENT);
		mntmReset.setBackground(new Color(245, 245, 245));
		mntmReset.setBounds(1, 1, 93, 30);
		frame.getContentPane().add(mntmReset);
		
		JMenuItem mntmExit = new JMenuItem("Exit");
		mntmExit.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		mntmExit.setBackground(new Color(245, 245, 245));
		mntmExit.setBounds(95, 1, 93, 30);
		frame.getContentPane().add(mntmExit);
		mntmExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) { 
				
				System.exit(0);
			
				}
			});
		
		mntmExit.setForeground(new Color(255, 0, 0));
		mntmExit.setFont(new Font("Lucida Grande", Font.BOLD, 14));
		
		jlbClock2 = new JTextField();
		jlbClock2.setForeground(new Color(0, 0, 205));
		jlbClock2.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		jlbClock2.setBackground(SystemColor.window);
		jlbClock2.setBounds(974, 1, 303, 28);
		frame.getContentPane().add(jlbClock2);
		jlbClock2.setText("clock");
		jlbClock2.setColumns(10);
		mntmReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Double Invoice1 = Double.parseDouble(txtPizzaMrg.getText());
				Double Invoice2 = Double.parseDouble(txtPizzaPep.getText());
				Double Invoice3 = Double.parseDouble(txtShepPie.getText());
				Double Invoice4 = Double.parseDouble(txtChooseDrink.getText());
				
				ReceiptArea.append("\t\n Hotel Management System:\n"
									+"\n"+jlbClock2.getText()
									+"\n" + btnChooseRoom.getSelectedItem()
									+"\nPizza Margerita :\t" + Invoice1
									+"\nPizza Pepperoni :\t" + Invoice2
									+"\nShepard's Pie :\t\t" + Invoice3
									+"\n" + btnChooseDrink.getSelectedItem() + " :\t\t" + Invoice4
									+"\nRoom Delivery :\t" + txtTotalCostOfDelivery.getText()
									+"\nVAT:\t\t" + txtTax1.getText() 
									+ "\nTotal :\t\t"	+ txtTotal.getText()
									+"\n\nWelcome and Thank you for your Purchase"
						
						
						);
				
			}
		});
		
	}
}
