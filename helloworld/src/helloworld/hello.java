package helloworld;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder; 

public class hello {
	
	public static Scanner x;
	private JFrame frame;
	private JTextField userentry;
	
	String filepath = "/Users/gagankv/Desktop/strpasswd.txt";
	static String id = "";
	static String name = "";
	static String quantity = "";
	private JTextField passwordField1;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					hello window = new hello();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public hello() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Lucida Grande", Font.BOLD, 23));
		frame.getContentPane().setForeground(new Color(0, 0, 0));
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setBounds(100, 100, 922, 673);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_22 = new JLabel("");
		Image img7 = new ImageIcon(this.getClass().getResource("/hithere.png")).getImage();
		
		
		
		
		JButton btnNewButton = new JButton("SIGN UP");
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setBounds(306, 456, 292, 39);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				 boolean found = false;
				 String username = userentry.getText();
				 String password = passwordField1.getText();
			        String tempusername = "";
			        String temppassword = "";
			        try {
			            x = new Scanner(new File(filepath));
			            x.useDelimiter("[,\n]");
			            while (x.hasNext() && !found) {
			                tempusername = x.next();
			                temppassword = x.next();
			                if (tempusername.trim().equals(username.trim()) && temppassword.trim().equals(password.trim())) {
			                    found = true;
			                }
			            }
			            if (found) {
			            	//System.out.println("password and user name  matched");
			            	 JOptionPane.showMessageDialog(null,"password matched");
			            	 frame.dispose();
			            	 inventoryoptions2 inve = new inventoryoptions2();
			            	 inve.setVisible(true);
			            } else {
			               // System.out.println("password and user name does'nt match");
			               
			                JOptionPane.showMessageDialog(null,"password and user name does'nt match");
			                System.exit(0);
			            }


			        } catch (Exception e12) {
			            System.out.println("not found");
			            JOptionPane.showMessageDialog(null, "password and user name does'nt match");

			        }
			}
		});
		
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 16));
		btnNewButton.setBackground(new Color(255, 255, 255));
		frame.getContentPane().add(btnNewButton);
		
		passwordField1 = new JTextField();
		passwordField1.setFont(new Font("Al Bayan", Font.BOLD, 14));
		passwordField1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		passwordField1.setBounds(364, 356, 205, 39);
		frame.getContentPane().add(passwordField1);
		passwordField1.setColumns(10);
		
		
		
		userentry = new JTextField();
		userentry.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		userentry.setFont(new Font("Al Bayan", Font.BOLD, 14));
		userentry.setBounds(364, 305, 205, 39);
		frame.getContentPane().add(userentry);
		userentry.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("SIGN IN(NEW)");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 String username = userentry.getText();
				 String password = passwordField1.getText();
				 boolean found = false;
			      
			try {
					
					FileWriter fv = new FileWriter(filepath,true);
		            BufferedWriter fw = new BufferedWriter(fv);
		            PrintWriter pw = new PrintWriter(fw);
		            pw.println(username+","+password);

		            pw.flush();
		            pw.close();
		            JOptionPane.showMessageDialog(null,"sucessful username and password is stored ! ;)");
		           found = true;
		      
			 if (found) {
	            	//System.out.println("password and user name  matched");
	            	 //JOptionPane.showMessageDialog(null,"password matched");
	            	 frame.dispose();
	            	 inventoryoptions2 inve = new inventoryoptions2();
	            	 inve.setVisible(true);
	            } else {
	               // System.out.println("password and user name does'nt match");
	               
	                JOptionPane.showMessageDialog(null,"try another user name");
	                System.exit(0);
	            }
			  }catch (Exception E1) {
		            
		            JOptionPane.showMessageDialog(null, "record not saved");
		        }
			}
		});
		btnNewButton_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		btnNewButton_1.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		btnNewButton_1.setBounds(316, 507, 272, 35);
		frame.getContentPane().add(btnNewButton_1);
		lblNewLabel_22.setIcon(new ImageIcon(img7));
		
		
		
		
		
		lblNewLabel_22.setBounds(299, 120, 325, 498);
		frame.getContentPane().add(lblNewLabel_22);
		
		
		
		
		JLabel lblNewLabel3 = new JLabel("");
		lblNewLabel3.setBounds(52, 6, 123, 123);
		Image img2 = new ImageIcon(this.getClass().getResource("/inve.jpeg")).getImage();
		lblNewLabel3.setIcon(new ImageIcon(img2));
		frame.getContentPane().add(lblNewLabel3);
		
		
		
		JLabel lblNewLabel4 = new JLabel("SMART INVENTORY");
		lblNewLabel4.setFont(new Font("Lao MN", Font.BOLD, 50));
		lblNewLabel4.setBounds(247, 19, 511, 70);
		
		frame.getContentPane().add(lblNewLabel4); 
		
		
		
		
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBorder(null);
		Image img6 = new ImageIcon(this.getClass().getResource("/illu1.jpg")).getImage();
		lblNewLabel_1.setIcon(new ImageIcon(img6));
		lblNewLabel_1.setBounds(73, 0, 909, 634);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setBounds(346, 264, 61, 16);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lblNewLabel.setBounds(346, 497, 61, 16);
		frame.getContentPane().add(lblNewLabel);
		
		
		
		
		
		
	}
}



























