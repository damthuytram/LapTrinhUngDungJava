package Baitap.tuan2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import java.awt.Component;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.UIManager;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Dimension;

public class Bai5 extends JFrame {

	private JPanel contentPane;
	private JTextField txtSoa;
	private JTextField txtSob;
	private JTextField txtSoc;
	private JTextField txtKetQua;

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
		setBounds(100, 100, 443, 399);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("Giải Phương Trình Bậc 2");
		lblNewLabel.setBackground(Color.DARK_GRAY);
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setHorizontalTextPosition(SwingConstants.CENTER);
		contentPane.add(lblNewLabel, BorderLayout.NORTH);
		
		JPanel pnNhap = new JPanel();
		pnNhap.setBorder(new TitledBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 0, 0), new Color(0, 255, 0)), "Nhap so a, b, c", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)), "Nhap so a, b, c", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		contentPane.add(pnNhap, BorderLayout.CENTER);
		
		JLabel lblNewLabel_1 = new JLabel("He so a:");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		
		txtSoa = new JTextField();
		txtSoa.setAlignmentX(Component.RIGHT_ALIGNMENT);
		txtSoa.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("He so b:");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		
		txtSob = new JTextField();
		txtSob.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("He so c:");
		lblNewLabel_3.setMaximumSize(new Dimension(40, 14));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		
		txtSoc = new JTextField();
		txtSoc.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Ket qua: ");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		
		txtKetQua = new JTextField();
		txtKetQua.setHorizontalAlignment(SwingConstants.CENTER);
		txtKetQua.setColumns(10);
		GroupLayout gl_pnNhap = new GroupLayout(pnNhap);
		gl_pnNhap.setHorizontalGroup(
			gl_pnNhap.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_pnNhap.createSequentialGroup()
					.addGap(113)
					.addGroup(gl_pnNhap.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblNewLabel_3, GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
						.addComponent(lblNewLabel_2, GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
						.addComponent(lblNewLabel_1, GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE))
					.addGap(21)
					.addGroup(gl_pnNhap.createParallelGroup(Alignment.LEADING)
						.addComponent(txtSoa, GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
						.addComponent(txtSob, GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
						.addComponent(txtSoc, GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE))
					.addGap(87))
				.addGroup(Alignment.LEADING, gl_pnNhap.createSequentialGroup()
					.addGap(127)
					.addComponent(txtKetQua, GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
					.addGap(129))
				.addGroup(Alignment.LEADING, gl_pnNhap.createSequentialGroup()
					.addGap(169)
					.addComponent(lblNewLabel_4, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(175, Short.MAX_VALUE))
		);
		gl_pnNhap.setVerticalGroup(
			gl_pnNhap.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnNhap.createSequentialGroup()
					.addGap(1)
					.addGroup(gl_pnNhap.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_1, GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
						.addComponent(txtSoa, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
					.addGap(15)
					.addGroup(gl_pnNhap.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtSob, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_pnNhap.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtSoc, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addComponent(lblNewLabel_4, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(txtKetQua, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
					.addGap(56))
		);
		pnNhap.setLayout(gl_pnNhap);
		
		JPanel pnChucnang = new JPanel();
		pnChucnang.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 0, 255), new Color(255, 175, 175)), "Chon Thao Tac", TitledBorder.LEFT, TitledBorder.TOP, null, new Color(0, 0, 0)));
		contentPane.add(pnChucnang, BorderLayout.SOUTH);
		
		JButton btnGiai = new JButton("Giai");
		btnGiai.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					double a,b,c;
					a=Double.parseDouble(txtSoa.getText());
					b=Double.parseDouble(txtSob.getText());
					c=Double.parseDouble(txtSoc.getText());
					txtKetQua.setText(giaiPTB2(a,b,c));
				}
				catch (Exception ex){
					JOptionPane.showMessageDialog(null,"Hay dien day du so nha");
					}

				
			}
		});
		pnChucnang.add(btnGiai);
		
		JButton btnXoaTrang = new JButton("Xoa trang");
		btnXoaTrang.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtSoa.setText("");
				txtSob.setText("");
				txtSoc.setText("");
				txtKetQua.setText("");
				
			}
		});
		pnChucnang.add(btnXoaTrang);
		
		JButton btnThoat = new JButton("Thoat");
		btnThoat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
			
		});
		pnChucnang.add(btnThoat);
	}
	public String giaiPTB2(double a, double b, double c) {
        double delta,x,x1,x2,canDelta;
        String kq;
        if(a==0) {
             kq="He so a phai >0.";
            return kq;
        }
        else {
            delta = Math.pow(b,2)-4*a*c;
            if(delta<0) {
               kq="Phuong trinh vo nghiem";
                return kq;
            }
            if(delta==0) {
                x=-b/(2*a);
                kq="Nghiem kep: x ="+ x;
                return kq;
            }
            if(delta>0) {
                canDelta=Math.sqrt(delta);
                x1= (-b+canDelta)/(2*a);
                x2 = (-b-canDelta)/(2*a);
                kq="Phuong trinh co 2 nghiem: x1= "+x1+"; x2= "+x2;
                return kq;
            }
            return "Error";
        }
    }

}
