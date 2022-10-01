package final_project;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Hostel_MS extends JFrame implements ActionListener{
	
	private ImageIcon icon;
	private Container c;
	private JLabel titleLabel, stdNameLabel, deptLabel, emailLabel, stdPhoneLabel, roomLabel, prntNameLabel, prntPhoneLabel;
	private JTextField stdName_Tf, dept_Tf, email_Tf, stdPhone_Tf, room_Tf, prntName_Tf, prntPhone_Tf;
	private JButton addButton, updateButton, deleteButton, clearButton;
	
	// Creating the table
	private JTable table;
	private JScrollPane scroll;
	private DefaultTableModel model;
	
	// Creating the row & column
	private String[] columns = {"Student Name", "Dept", "Email", "Cont Number", "Room Number", "Parent Name", "Cont Number"};
	private String[] rows = new String[7];
	
	
	Hostel_MS(){
		initComponents();
	}
	
	public void initComponents() {
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(1200, 800);
		this.setLocationRelativeTo(null);
		this.setTitle("Final Project ICE107");
		
		icon = new ImageIcon(getClass().getResource("mabrur.jpg"));
		this.setIconImage(icon.getImage());
		
		c = this.getContentPane();
		c.setLayout(null);
		c.setBackground(new Color(152,251,152));
		
		Font font = new Font("Arial", Font.BOLD, 16);
		
		titleLabel = new JLabel("Hostel Management System");
		titleLabel.setFont(new Font("Century Gothic", Font.BOLD, 32));
		titleLabel.setBounds(420, 10, 650, 50);
		c.add(titleLabel);
		
		// Code for student name
		stdNameLabel = new JLabel("Student's Name");
		stdNameLabel.setBounds(10, 100, 140, 30);
		stdNameLabel.setFont(font);
		c.add(stdNameLabel);
		
		stdName_Tf = new JTextField();
		stdName_Tf.setBounds(160, 100, 200, 30);
		stdName_Tf.setFont(font);
		c.add(stdName_Tf);
		
		addButton = new JButton("Add Student");
		addButton.setBounds(400, 100, 180, 30);
		addButton.setFont(font);
		c.add(addButton);
		
		// Code for Student's Department 
		deptLabel = new JLabel("Department");
		deptLabel.setBounds(10, 150, 140, 30);
		deptLabel.setFont(font);
		c.add(deptLabel);
		
		dept_Tf = new JTextField();
		dept_Tf.setBounds(160, 150, 200, 30);
		dept_Tf.setFont(font);
		c.add(dept_Tf);
		
		updateButton = new JButton("Update Info");
		updateButton.setBounds(400, 150, 180, 30);
		updateButton.setFont(font);
		c.add(updateButton);
		
		// Code for Student's Email 
		emailLabel = new JLabel("Email");
		emailLabel.setBounds(10, 200, 140, 30);
		emailLabel.setFont(font);
		c.add(emailLabel);
		
		email_Tf = new JTextField();
		email_Tf.setBounds(160, 200, 200, 30);
		email_Tf.setFont(font);
		c.add(email_Tf);
		
		deleteButton = new JButton("Delete Info");
		deleteButton.setBounds(400, 200, 180, 30);
		deleteButton.setFont(font);
		c.add(deleteButton);
		
		// Code for Student's Phone Number 
		stdPhoneLabel = new JLabel("Contact Number");
		stdPhoneLabel.setBounds(10, 250, 140, 30);
		stdPhoneLabel.setFont(font);
		c.add(stdPhoneLabel);
		
		stdPhone_Tf = new JTextField();
		stdPhone_Tf.setBounds(160, 250, 200, 30);
		stdPhone_Tf.setFont(font);
		c.add(stdPhone_Tf);
		
		clearButton = new JButton("Clear Info");
		clearButton.setBounds(400, 250, 180, 30);
		clearButton.setFont(font);
		c.add(clearButton);
		
		// Code for Student's Room Number 
		roomLabel = new JLabel("Room Number");
		roomLabel.setBounds(10, 300, 140, 30);
		roomLabel.setFont(font);
		c.add(roomLabel);
		
		room_Tf = new JTextField();
		room_Tf.setBounds(160, 300, 200, 30);
		room_Tf.setFont(font);
		c.add(room_Tf);
		
		// Code for Student's Parent's Name 
		prntNameLabel = new JLabel("Parent's Name");
		prntNameLabel.setBounds(10, 350, 140, 30);
		prntNameLabel.setFont(font);
		c.add(prntNameLabel);
		
		prntName_Tf = new JTextField();
		prntName_Tf.setBounds(160, 350, 200, 30);
		prntName_Tf.setFont(font);
		c.add(prntName_Tf);
		
		// Code for Student's Parent's Name 
		prntPhoneLabel = new JLabel("Contact Number");
		prntPhoneLabel.setBounds(10, 400, 140, 30);
		prntPhoneLabel.setFont(font);
		c.add(prntPhoneLabel);
		
		prntPhone_Tf = new JTextField();
		prntPhone_Tf.setBounds(160, 400, 200, 30);
		prntPhone_Tf.setFont(font);
		c.add(prntPhone_Tf);
		
		// Creating the data table
		table = new JTable();
		model = new DefaultTableModel();
		model.setColumnIdentifiers(columns);
		table.setModel(model);
		table.setFont(font);
		table.setSelectionBackground(new Color(255, 158, 0));
		table.setBackground(Color.WHITE);
		table.setRowHeight(40);
		
		// ScrollPane Creating
		scroll = new JScrollPane(table);
		scroll.setBounds(10, 450, 1160, 220);
		c.add(scroll);
		
		// Making buttons functional by adding ActionListener
		addButton.addActionListener(this);
		clearButton.addActionListener(this);
		deleteButton.addActionListener(this);
		updateButton.addActionListener(this);
		
		
		// For showing row data in JTextFields after clicking on any row
		table.addMouseListener(new MouseAdapter() {
			
			public void mouseClicked(MouseEvent me) {
				
				int numberOfRow = table.getSelectedRow(); // It gives us the number of a row we have clicked on
				
				// Values of all columns has taken from the selected row 
				String std_name 	= model.getValueAt(numberOfRow, 0).toString();
				String dept_name 	= model.getValueAt(numberOfRow, 1).toString();
				String std_email 	= model.getValueAt(numberOfRow, 2).toString();
				String std_phn 		= model.getValueAt(numberOfRow, 3).toString();
				String room_number 	= model.getValueAt(numberOfRow, 4).toString();
				String prnt_name 	= model.getValueAt(numberOfRow, 5).toString();
				String prnt_phn 	= model.getValueAt(numberOfRow, 6).toString();
				
				// Taken values will be set to the textField now
				stdName_Tf.setText(std_name);
				dept_Tf.setText(dept_name);
				email_Tf.setText(std_email);
				stdPhone_Tf.setText(std_phn);
				room_Tf.setText(room_number);
				prntName_Tf.setText(prnt_name);
				prntPhone_Tf.setText(prnt_phn);
				
			}
		});
		
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == addButton) { // when clicked on the "Add" button
			rows[0] = stdName_Tf.getText();
			rows[1] = dept_Tf.getText();
			rows[2] = email_Tf.getText();
			rows[3] = stdPhone_Tf.getText();
			rows[4] = room_Tf.getText();
			rows[5] = prntName_Tf.getText();
			rows[6] = prntPhone_Tf.getText();
			model.addRow(rows); // row data will be inserted in model
		}
		else if(e.getSource() == clearButton) { // when clicked on the "Clear" button
			stdName_Tf.setText(null);
			dept_Tf.setText(null);
			email_Tf.setText(null);
			stdPhone_Tf.setText(null);
			room_Tf.setText(null);
			prntName_Tf.setText(null);
			prntPhone_Tf.setText(null);
		}
		else if(e.getSource() == deleteButton) { // when clicked on the "Delete" button
			
			int numberOfRow = table.getSelectedRow();
			if(numberOfRow >= 0) {
				model.removeRow(numberOfRow);
			}
			else {
				JOptionPane.showMessageDialog(null, "No row has been selected or exists!", "Alert",JOptionPane.WARNING_MESSAGE);
			}
		}
		else if(e.getSource() == updateButton) { // when clicked on the "Update" button
			
			int numberOfRow = table.getSelectedRow();
			
			// Updated data has taken after clicking on update button 
			String std_name 	= stdName_Tf.getText();
			String dept_name 	= dept_Tf.getText();
			String std_email 	= email_Tf.getText();
			String std_phn 		= stdPhone_Tf.getText();
			String room_number 	= room_Tf.getText();
			String prnt_name 	= prntName_Tf.getText();
			String prnt_phn 	= prntPhone_Tf.getText();
			
			// Updated data will take place in row and column after clicking on update button
			model.setValueAt(std_name, numberOfRow, 0);
			model.setValueAt(dept_name, numberOfRow, 1);
			model.setValueAt(std_email, numberOfRow, 2);
			model.setValueAt(std_phn, numberOfRow, 3);
			model.setValueAt(room_number, numberOfRow, 4);
			model.setValueAt(prnt_name, numberOfRow, 5);
			model.setValueAt(prnt_phn, numberOfRow, 6);
		}
	}
	
	public static void main(String[] args) {
		Hostel_MS frame = new Hostel_MS();
		frame.setVisible(true);
	}

	
}




