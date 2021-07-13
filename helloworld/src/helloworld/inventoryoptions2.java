package helloworld;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;

@SuppressWarnings("serial")
public class inventoryoptions2 extends JFrame {
	public static Scanner x;
	private JPanel contentPane;
	static int ii ;
	private JTextField idfield;
	private JTextField productfield;
	private JTextField quantityfield;
	private JTextField marginalfield;
	private JTextField sellingfield;
	private JLabel lblNewLabel1;
	private JLabel lblNewLabel_1;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JButton btnNewButton_4;
	
	private JButton btnNewButton_6;
	private JLabel lblNewLabel_2;
	 static String id = "";
	 static String name = "";
	 static String quantity = "";
	 static String sprice = "";
	 static String mprice = "";
	 static String newid = "";
	 static String newitem = "";
	 static String newmprice = "";
	 static String newsprice = "";
	 static int newq ;
	 static int newm ;
	 static int news ;
	 static int profit ;
	 static String newname = "";
	 String filepath2 = "/Users/gagankv/Desktop/gagan.txt";
	 static String setname = "";
	 static String nul = "";
	 private JTable jTable1;
	 private JScrollPane scroll;
	 private JTextField jtext;
	 private JButton btnNewButton_5;
	 private JButton btnNewButton_7;
	 private JButton btnNewButton_8;
	    

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					inventoryoptions2 frame = new inventoryoptions2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public inventoryoptions2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 856, 823);
		contentPane = new JPanel();
		
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		Image img2 = new ImageIcon(this.getClass().getResource("/black.png")).getImage();
		
		
		
		
		
		btnNewButton_3 = new JButton("Stock Check");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String filepath2 = "/Users/gagankv/Desktop/gagan.txt";
				boolean found = false;
				try{
		            x = new Scanner(new File(filepath2));
		            x.useDelimiter("[,\n]");
		            String search = productfield.getText();
		            while(x.hasNext() && !found) 
		            {
		            	id = x.next();
	                    name = x.next();
	                    quantity = x.next();
	                    mprice = x.next();
	                    sprice = x.next();
		              
	                    if (search.equals(name)) 
		                {
		                	found = true;
		                }
		           }
		            
		                if(found) 
		                {
		                	 JOptionPane.showMessageDialog(null,"Stock is avaliable , no. of Quantities present : "+quantity );
		                } 
		            
		        }catch (Exception E){
		            System.out.println("error");
		        }
				
			}
		});
		btnNewButton_3.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		btnNewButton_3.setForeground(new Color(128, 0, 128));
		btnNewButton_3.setBounds(545, 367, 117, 29);
		contentPane.add(btnNewButton_3);
		
		
		
		btnNewButton_4 = new JButton("Find Profit");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String filepath2 = "/Users/gagankv/Desktop/gagan.txt";
				boolean found = false;
				try{
		            x = new Scanner(new File(filepath2));
		            x.useDelimiter("[,\n]");
		            String search = productfield.getText();
		            while(x.hasNext() && !found) 
		            {
		            	id = x.next();
	                    name = x.next();
	                    quantity = x.next();
	                    mprice = x.next();
	                    sprice = x.next();
		              
		                if (search.equals(name)) 
		                {
		                	newq = Integer.parseInt(quantity);
		                	newm = Integer.parseInt(mprice);
		                	news = Integer.parseInt(sprice);
		                	profit = newq * (news - newm);
		                	found = true;
		                }
		                if(found) 
		                {
		                	 jtext.setText("the Profit of the product "+name+" is : "+profit);
		                } 
		           }
		                
		            
		        }catch (Exception E22){
		            System.out.println("error");
		        }	
			}
		});
		btnNewButton_4.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		btnNewButton_4.setForeground(new Color(128, 0, 128));
		btnNewButton_4.setBounds(542, 408, 120, 29);
		contentPane.add(btnNewButton_4);
		
		
		
		
		JLabel idlabel = new JLabel(" ID                    :");
		idlabel.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		idlabel.setForeground(new Color(148, 0, 211));
		idlabel.setBounds(152, 220, 120, 16);
		contentPane.add(idlabel);
		
		JLabel productlabel = new JLabel("Product Name :");
		productlabel.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		productlabel.setForeground(new Color(148, 0, 211));
		productlabel.setBounds(152, 277, 120, 16);
		contentPane.add(productlabel);
		
		JLabel quantitylabel = new JLabel("Quantity          :");
		quantitylabel.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		quantitylabel.setForeground(new Color(148, 0, 211));
		quantitylabel.setBounds(152, 335, 120, 16);
		contentPane.add(quantitylabel);
		
		JLabel marginallabel = new JLabel("Marginal Price :");
		marginallabel.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		marginallabel.setForeground(new Color(148, 0, 211));
		marginallabel.setBounds(152, 397, 120, 16);
		contentPane.add(marginallabel);
		
		JLabel sellinglabel = new JLabel("Selling Price     :");
		sellinglabel.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		sellinglabel.setForeground(new Color(148, 0, 211));
		sellinglabel.setBounds(152, 458, 120, 16);
		contentPane.add(sellinglabel);
		
		idfield = new JTextField();
		idfield.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		idfield.setFont(new Font("Lucida Grande", Font.BOLD, 14));
		idfield.setBounds(294, 215, 130, 26);
		contentPane.add(idfield);
		idfield.setColumns(10);
		
		productfield = new JTextField();
		productfield.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		productfield.setFont(new Font("Lucida Grande", Font.BOLD, 14));
		productfield.setBounds(294, 272, 130, 26);
		contentPane.add(productfield);
		productfield.setColumns(10);
		
		marginalfield = new JTextField();
		marginalfield.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		marginalfield.setFont(new Font("Lucida Grande", Font.BOLD, 14));
		marginalfield.setBounds(294, 392, 130, 26);
		contentPane.add(marginalfield);
		marginalfield.setColumns(10);
		
		quantityfield = new JTextField();
		quantityfield.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		quantityfield.setFont(new Font("Lucida Grande", Font.BOLD, 14));
		quantityfield.setBounds(294, 330, 130, 26);
		contentPane.add(quantityfield);
		quantityfield.setColumns(10);
		
		sellingfield = new JTextField();
		sellingfield.setBackground(new Color(255, 255, 255));
		sellingfield.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		sellingfield.setFont(new Font("Lucida Grande", Font.BOLD, 14));
		sellingfield.setBounds(294, 453, 130, 26);
		contentPane.add(sellingfield);
		sellingfield.setColumns(10);
		
		
		
		btnNewButton_2 = new JButton("New update");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String filepath2 = "/Users/gagankv/Desktop/gagan.txt";
		        String tempfile = "/Users/gagankv/Desktop/new.txt";
		        File oldfile = new File(filepath2);
		        File newfile = new File(tempfile);
		        String name2 = productfield.getText();
		        String quantity1 = quantityfield.getText();
		        int q2;
		        try {
		            FileWriter fv = new FileWriter(tempfile);
		            BufferedWriter bw = new BufferedWriter(fv);
		            PrintWriter pw = new PrintWriter(bw);
		            x = new Scanner(new File(filepath2));
		            x.useDelimiter("[,\n]");
		            while(x.hasNext()){
		            	id = x.next();
	                    name = x.next();
	                    quantity = x.next();
	                    mprice = x.next();
	                    sprice = x.next();
		                if(name2.equals(name)){
		                    newid = id;
		                    newname = name; 
		                    newq = Integer.parseInt(quantity1);
		                    q2 = Integer.parseInt(quantity);
		                    newmprice = mprice;
		                    newsprice = sprice;
		                    newq = newq + q2;
		                  
		                    pw.println(newid +","+newname+","+newq+","+newmprice+","+newsprice);
		                    JOptionPane.showMessageDialog(null,"Product successfully UPDATED present quantity is :"+newq);
		                }
		                else{
		                    pw.println(id + "," + name + "," + quantity + "," + mprice + "," +sprice);
		                }

		            }
		            
		            pw.flush();
		            pw.close();
		            oldfile.delete();
		            File dump = new File(filepath2);
		            newfile.renameTo(dump);
		            
		            

		        }catch (Exception E){
		            System.out.println("error");
		        }
			}
		});
		btnNewButton_2.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		btnNewButton_2.setForeground(new Color(128, 0, 128));
		btnNewButton_2.setBounds(545, 207, 117, 29);
		contentPane.add(btnNewButton_2);
		
		
		
		
		
		
		btnNewButton = new JButton("INSERT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				id = idfield.getText();
				name = productfield.getText();
				quantity = quantityfield.getText();
				sprice = sellingfield.getText();
				mprice = marginalfield.getText();
				
				try {
					if(id == null && name == null && quantity == null &&sprice == null && mprice == null) 
					{
						JOptionPane.showMessageDialog(null, "please enter all fields !!");
					}
					
					FileWriter fv = new FileWriter(filepath2,true);
		            BufferedWriter fw = new BufferedWriter(fv);
		            PrintWriter pw = new PrintWriter(fw);
		            pw.println(id + "," + name + "," + quantity + "," + mprice + "," +sprice);

		            pw.flush();
		            pw.close();
		            JOptionPane.showMessageDialog(null,"Record updated ;)");
		           
		        } catch (Exception E) {
		            
		            JOptionPane.showMessageDialog(null, "record not saved");
		        }
				
			}
		});
		btnNewButton.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		btnNewButton.setForeground(new Color(128, 0, 128));
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setBounds(545, 330, 117, 29);
		contentPane.add(btnNewButton);
		
		
		
		
		
		
		btnNewButton_6 = new JButton("Display");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			       File file = new File(filepath2);
			       try {
			    	   
			    	   BufferedReader br = new BufferedReader(new FileReader(file));
			    	   String firstline = br.readLine().trim();
			    	   String[] coloumsName = firstline.split(",");
			    	   DefaultTableModel mode1 = (DefaultTableModel)jTable1.getModel();
			    	   mode1.setColumnIdentifiers(coloumsName);
			    	   Object[] tableLines = br.lines().toArray();
			    	 
			    	   	for(int i = 0;i <tableLines.length; i++) {
			    		   String line = tableLines[i].toString().trim();
			    		   String[] dataRow =line.split(",");
			    		   mode1.addRow(dataRow);
			    		   
			    		   
			    	   }
			    			   
			    	  br.close(); 
			    	   
			    	   
			       }catch(Exception e31 ) {
			    	  // Logger.getLogger(TextFileDataToJTable.class.getName().log(Level.SEVERE,null, ex);
			    	   JOptionPane.showMessageDialog(null, "error");
			    	   
			       }

			}
			
		});
		btnNewButton_6.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		btnNewButton_6.setForeground(new Color(128, 0, 128));
		btnNewButton_6.setBounds(542, 453, 117, 29);
		contentPane.add(btnNewButton_6);
		
		
		
		
		
		btnNewButton_5 = new JButton("Search");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{	String filepath2 = "/Users/gagankv/Desktop/gagan.txt";
				boolean found = false;
				try{
		            x = new Scanner(new File(filepath2));
		            x.useDelimiter("[,\n]");
		            String search = productfield.getText();
		            while(x.hasNext() && !found) 
		            {
		            	id = x.next();
	                    name = x.next();
	                    quantity = x.next();
	                    mprice = x.next();
	                    sprice = x.next();
		              
		                if (search.equals(name)) 
		                {
		                	found = true;
		                }
		           }
		                if(found) 
		                {
		                	 JOptionPane.showMessageDialog(null," ID :" + id + "NAME :" + name + "QUANTITY : " + quantity + "MARGINAL PRICE" + mprice + "SELLING PRICE" +sprice);
		                } 
		            
		        }catch (Exception E){
		            System.out.println("error");
		        }
			}
		});
		btnNewButton_5.setFont(new Font("Lucida Grande", Font.BOLD, 14));
		btnNewButton_5.setForeground(new Color(128, 0, 128));
		btnNewButton_5.setBounds(542, 496, 117, 29);
		contentPane.add(btnNewButton_5);
		
		
		
		
		
		
		
		btnNewButton_1 = new JButton("DELETE");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String filepath3 = "/Users/gagankv/Desktop/gagan.txt";
		          
		            String pro = productfield.getText();
		            String tempfile = "/Users/gagankv/Desktop/new.txt";
		            File oldfile = new File(filepath3);
		            File newfile = new File(tempfile);

		            try {
		                FileWriter fv = new FileWriter(tempfile);
		                BufferedWriter bw = new BufferedWriter(fv);
		                PrintWriter pw = new PrintWriter(bw);
		                x = new Scanner(new File(filepath3));
		                x.useDelimiter("[,\n]");
		                
		                while (x.hasNext())
		                {
		                    id = x.next();
		                    name = x.next();
		                    quantity = x.next();
		                    mprice = x.next();
		                    sprice = x.next();
		                    
		                    if (!name.equals(pro)) {
		                        pw.println(id + "," + name + "," + quantity + "," + mprice + "," +sprice);
		                    }
		                }
		                x.close();
		                pw.flush();
		                pw.close();
		                oldfile.delete();
		                File dump = new File(filepath3);
		                newfile.renameTo(dump);
		               JOptionPane.showMessageDialog(null,"Product successfully Delete (:-O)");

		            } catch (Exception e11) {
		                JOptionPane.showMessageDialog(null, "error");
		            }
				
			}
			
		});
		btnNewButton_1.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		btnNewButton_1.setForeground(new Color(128, 0, 128));
		btnNewButton_1.setBounds(545, 289, 117, 29);
		contentPane.add(btnNewButton_1);
		
		
		
		
		
		btnNewButton_7 = new JButton("SOLD Update");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String filepath2 = "/Users/gagankv/Desktop/gagan.txt";
		        String tempfile = "/Users/gagankv/Desktop/new.txt";
		        File oldfile = new File(filepath2);
		        File newfile = new File(tempfile);
		        String name2 = productfield.getText();
		        String quantity1 = quantityfield.getText();
		        int q2;
		        try {
		            FileWriter fv = new FileWriter(tempfile);
		            BufferedWriter bw = new BufferedWriter(fv);
		            PrintWriter pw = new PrintWriter(bw);
		            x = new Scanner(new File(filepath2));
		            x.useDelimiter("[,\n]");
		            while(x.hasNext()){
		            	id = x.next();
	                    name = x.next();
	                    quantity = x.next();
	                    mprice = x.next();
	                    sprice = x.next();
		                if(name2.equals(name)){
		                    newid = id;
		                    newname = name2; 
		                    newq = Integer.parseInt(quantity1);
		                    q2 = Integer.parseInt(quantity);
		                    newmprice = mprice;
		                    newsprice = sprice;
		                    newq = 	q2 - newq;
		                    pw.println(newid +","+name+","+newq+","+mprice+","+sprice);
		                    JOptionPane.showMessageDialog(null,"Product successfully UPDATED present quantity is :"+newq);
		                }
		                else{
		                    pw.println(id+","+name+","+quantity+","+mprice+","+sprice);
		                }


		            }
		            pw.flush();
		            pw.close();
		            oldfile.delete();
		            File dump = new File(filepath2);
		            newfile.renameTo(dump);
		            
		            
		        }catch (Exception E){
		            System.out.println("error");
		        }
			}
		});
		btnNewButton_7.setFont(new Font("Lucida Grande", Font.BOLD, 12));
		btnNewButton_7.setForeground(new Color(128, 0, 128));
		btnNewButton_7.setBounds(545, 248, 117, 29);
		contentPane.add(btnNewButton_7);
		
		
		
		
		
		
		btnNewButton_8 = new JButton("CLEAR ");
		 
		btnNewButton_8.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				idfield.setText(null);
				productfield.setText(null);
				quantityfield.setText(null);
				jtext.setText(null);
				sellingfield.setText(null);
				marginalfield.setText(null);
				//DefaultTableModel mode1 = (DefaultTableModel) jTable1.getModel();
				jTable1.setModel(new DefaultTableModel(null,new String[] {""}));
				
			}
		});
		btnNewButton_8.setForeground(new Color(128, 0, 128));
		btnNewButton_8.setBounds(221, 497, 117, 29);
		contentPane.add(btnNewButton_8);
		
		
		
		
		
		
		scroll = new JScrollPane();
		scroll.setBounds(30, 631, 763, 133);
		contentPane.add(scroll);
		
		
		
		jtext = new JTextField();
		jtext.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		jtext.setBounds(30, 596, 763, 29);
		contentPane.add(jtext);
		jtext.setColumns(10);
		
		
		
			 
		
		jTable1 = new JTable();
		scroll.setViewportView(jTable1);
		jTable1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		jTable1.setFont(new Font("Helvetica Neue", Font.BOLD, 15));
		
		
		lblNewLabel1 = new JLabel("");
		Image img22 = new ImageIcon(this.getClass().getResource("/purple2.jpg")).getImage();
		lblNewLabel1.setIcon(new ImageIcon(img22));
		lblNewLabel1.setBackground(new Color(0, 0, 0));
		lblNewLabel1.setBounds(436, 184, 318, 359);
		contentPane.add(lblNewLabel1);
		
		
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(img2));
		lblNewLabel.setBackground(new Color(0, 0, 0));
		lblNewLabel.setBounds(130, 184, 313, 359);
		contentPane.add(lblNewLabel);
		
		
		lblNewLabel_1 = new JLabel("");
		Image img21 = new ImageIcon(this.getClass().getResource("/page.jpg")).getImage();
		lblNewLabel_1.setIcon(new ImageIcon(img21));
		lblNewLabel_1.setBounds(6, 6, 856, 619);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("");
		Image img20 = new ImageIcon(this.getClass().getResource("/pink.jpg")).getImage();
		lblNewLabel_2.setIcon(new ImageIcon(img20));
		
		lblNewLabel_2.setBounds(6, 578, 848, 216);
		contentPane.add(lblNewLabel_2);
			
	}
}
