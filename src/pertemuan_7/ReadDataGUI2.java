package pertemuan_7;

import javax.swing.JOptionPane;

public class ReadDataGUI2 {
	public static void main(String[] args) {
		String temp;
		int radius;
		double luas;
		temp = JOptionPane.showInputDialog(null, "Radius: ");
		radius = Integer.parseInt(temp);
		luas = Math.PI * Math.pow(radius, 2);
		JOptionPane.showMessageDialog(null, "Luas: "+luas);
	}
}
