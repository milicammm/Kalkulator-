package kalkulator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Kalkulator {

	private JFrame frmKalkulator;
	private JTextField textField;
	private JButton btnNewButton_4;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JButton btnNewButton_5;
	private JButton btnNewButton_6;
	private JButton btnNewButton_7;
	private JButton btnNewButton_8;
	private JButton btnNewButton_Plus;
	private JButton btnNewButton_Minus;
	private JButton btnNewButton_Puta;
	private JButton btnNewButton_C;
	private JButton btnNewButton_0;
	private JButton btnNewButton_14;
	private JButton btnNewButton_Deljenje;
	String prviBroj;
	String drugiBroj;
	String operacija;
	int rezultat;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Kalkulator window = new Kalkulator();
					window.frmKalkulator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Kalkulator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmKalkulator = new JFrame();
		frmKalkulator.getContentPane().setBackground(new Color(218, 215, 251));
		frmKalkulator.setTitle("Kalkulator");
		frmKalkulator.setBounds(100, 100, 299, 315);
		frmKalkulator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmKalkulator.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(10, 35, 263, 41);
		frmKalkulator.getContentPane().add(textField);
		textField.setColumns(10);
	
		
		JButton btnNewButton1 = new JButton("1");
		btnNewButton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("1");		}
		});
		btnNewButton1.setBounds(20, 87, 55, 34);
		frmKalkulator.getContentPane().add(btnNewButton1);
		
		btnNewButton_4 = new JButton("4");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("4");	
			}
		});
		btnNewButton_4.setBounds(20, 127, 55, 34);
		frmKalkulator.getContentPane().add(btnNewButton_4);
		
		btnNewButton_1 = new JButton("2");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("2");	
			}
		});
		btnNewButton_1.setBounds(85, 87, 55, 34);
		frmKalkulator.getContentPane().add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("5");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("5");	
			}
		});
		btnNewButton_2.setBounds(85, 127, 55, 34);
		frmKalkulator.getContentPane().add(btnNewButton_2);
		
		btnNewButton_3 = new JButton("7");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("7");	
			}
		});
		btnNewButton_3.setBounds(20, 172, 55, 34);
		frmKalkulator.getContentPane().add(btnNewButton_3);
		
		btnNewButton_5 = new JButton("8");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("8");	
			}
		});
		btnNewButton_5.setBounds(85, 172, 55, 34);
		frmKalkulator.getContentPane().add(btnNewButton_5);
		
		btnNewButton_6 = new JButton("3");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("3");	
			}
		});
		btnNewButton_6.setBounds(150, 87, 55, 34);
		frmKalkulator.getContentPane().add(btnNewButton_6);
		
		btnNewButton_7 = new JButton("6");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("6");	
			}
		});
		btnNewButton_7.setBounds(150, 127, 55, 34);
		frmKalkulator.getContentPane().add(btnNewButton_7);
		
		btnNewButton_8 = new JButton("9");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("9");	
			}
		});
		btnNewButton_8.setBounds(150, 172, 55, 34);
		frmKalkulator.getContentPane().add(btnNewButton_8);
		
		btnNewButton_Plus = new JButton("+");
		btnNewButton_Plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 prviBroj = new String(textField.getText());
				 operacija="+";
				 textField.setText(null);
			}
		});
		btnNewButton_Plus.setBounds(215, 87, 55, 34);
		frmKalkulator.getContentPane().add(btnNewButton_Plus);
		
		btnNewButton_Minus = new JButton("-");
		btnNewButton_Minus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					
			}
		});
		btnNewButton_Minus.setBounds(215, 127, 55, 34);
		frmKalkulator.getContentPane().add(btnNewButton_Minus);
		
		btnNewButton_Puta = new JButton("*");
		btnNewButton_Puta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			}
		});
		btnNewButton_Puta.setBounds(215, 172, 55, 34);
		frmKalkulator.getContentPane().add(btnNewButton_Puta);
		
		btnNewButton_C = new JButton("C");
		btnNewButton_C.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton_C.setBounds(20, 217, 55, 34);
		frmKalkulator.getContentPane().add(btnNewButton_C);
		
		btnNewButton_0 = new JButton("0");
		btnNewButton_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("0");	
			}
		});
		btnNewButton_0.setBounds(85, 217, 55, 34);
		frmKalkulator.getContentPane().add(btnNewButton_0);
		
		btnNewButton_14 = new JButton("=");
		btnNewButton_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				drugiBroj = new String(textField.getText());
				if(operacija=="+") {
					rezultat = Integer.parseInt(prviBroj)+ Integer.parseInt(drugiBroj);
				}
			  else if(operacija=="-")
			  {
				  rezultat = Integer.parseInt(prviBroj)-Integer.parseInt(drugiBroj);
			  }
			  else if(operacija=="*")
			  {
				  rezultat = Integer.parseInt(prviBroj)*Integer.parseInt(drugiBroj);
			  }
			  else if(operacija =="/")
			  {
				  rezultat = Integer.parseInt(prviBroj)/Integer.parseInt(drugiBroj);
			  }
			}
		});
		btnNewButton_14.setBounds(150, 217, 55, 34);
		frmKalkulator.getContentPane().add(btnNewButton_14);
		
		btnNewButton_Deljenje = new JButton("/");
		btnNewButton_Deljenje.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_Deljenje.setBounds(215, 217, 55, 34);
		frmKalkulator.getContentPane().add(btnNewButton_Deljenje);
	}
}
