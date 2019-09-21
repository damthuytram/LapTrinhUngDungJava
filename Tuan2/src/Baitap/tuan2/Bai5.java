package Baitap.tuan2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JList;

public class Bai5 extends JFrame {

	private JPanel contentPane;
	private JTextField txtGiaiPTbac2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bai5 frame = new Bai5();
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
	public Bai5() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		txtGiaiPTbac2 = new JTextField();
		txtGiaiPTbac2.setHorizontalAlignment(SwingConstants.CENTER);
		txtGiaiPTbac2.setForeground(Color.BLACK);
		txtGiaiPTbac2.setFont(new Font("Arial", Font.BOLD, 20));
		txtGiaiPTbac2.setBackground(Color.GRAY);
		txtGiaiPTbac2.setText("Gi\u1EA3i Ph\u01B0\u01A1ng Tr\u00ECnh B\u1EADc 2");
		contentPane.add(txtGiaiPTbac2, BorderLayout.NORTH);
		txtGiaiPTbac2.setColumns(10);
	}

}
