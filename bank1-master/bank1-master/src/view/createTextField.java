package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class createTextField {
	JTextField idText;
	JPanel idPan;

	public void create() {
	idText = new JTextField();
	idPan= new JPanel();
	idPan.add(idText);
		
	
	}
}
