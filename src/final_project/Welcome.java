package final_project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import javax.swing.JRadioButton;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JSeparator;

public class Welcome {

	private JFrame frame;
	private ImageIcon icon;
	

	/**
	 * Create the application.
	 */
	public Welcome() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 204, 51));
		frame.setBounds(100, 100, 979, 595);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		frame.setLocationRelativeTo(null);
		
		icon = new ImageIcon(getClass().getResource("mabrur.jpg"));
		frame.setIconImage(icon.getImage());
		
		JButton btnNewButton = new JButton("Go to System");
		btnNewButton.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				
				Hostel_MS hostel = new Hostel_MS();
				hostel.show();
				
				dispose();
			}

			private void dispose() {
				// TODO Auto-generated method stub
				
			}
		});
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setForeground(new Color(237, 125, 43));
		btnNewButton.setFont(new Font("Century Gothic", Font.BOLD, 20));
		btnNewButton.setBounds(36, 458, 168, 55);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Hostel Management");
		lblNewLabel.setFont(new Font("Century Gothic", Font.BOLD | Font.ITALIC, 42));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(36, 101, 445, 55);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setIcon(new ImageIcon(Welcome.class.getResource("/final_project/hostel1.png")));
		lblNewLabel_1.setBounds(347, 0, 662, 564);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblSystem = new JLabel("System");
		lblSystem.setForeground(new Color(94, 191, 237));
		lblSystem.setFont(new Font("Century Gothic", Font.BOLD | Font.ITALIC, 42));
		lblSystem.setBounds(36, 167, 247, 46);
		frame.getContentPane().add(lblSystem);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.WHITE);
		separator.setBounds(36, 234, 301, 12);
		frame.getContentPane().add(separator);
	}
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Welcome window = new Welcome();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
