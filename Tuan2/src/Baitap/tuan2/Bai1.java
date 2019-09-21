package Baitap.tuan2;

import javax.swing.JFrame;

public class Bai1 extends JFrame {
	 public Bai1 () {
	        super("Demo Windows");
	        setDefaultCloseOperation(EXIT_ON_CLOSE);
	 }
	 
	 public static void main(String[] args) {
	        Bai1 ui=new Bai1();
	        ui.setSize(400,300);
	        ui.setLocationRelativeTo(null);
	        ui.setVisible(true);
	 }

}
