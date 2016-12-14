package presentacion;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.BorderLayout;

import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.ImageIcon;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SeleccionIdioma {

	JFrame frame;

	public String idiomaElegido;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SeleccionIdioma window = new SeleccionIdioma();
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
	public SeleccionIdioma() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 463, 185);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblSeleccioneElIdioma = new JLabel("Seleccione el idioma deseado:");
		lblSeleccioneElIdioma.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSeleccioneElIdioma.setBounds(10, 46, 203, 14);
		panel.add(lblSeleccioneElIdioma);
		
		final JRadioButton rdbtnEspaol = new JRadioButton("Espa\u00F1ol");
		rdbtnEspaol.setIcon(new ImageIcon(SeleccionIdioma.class.getResource("/presentacion/banderaEsp.gif")));
		rdbtnEspaol.setBounds(219, 44, 109, 23);
		panel.add(rdbtnEspaol);
		
		final JRadioButton rdbtnIngls = new JRadioButton("Ingl\u00E9s");
		rdbtnIngls.setIcon(new ImageIcon(SeleccionIdioma.class.getResource("/presentacion/banderaIng.gif")));
		rdbtnIngls.setBounds(330, 44, 109, 23);
		panel.add(rdbtnIngls);
		
		JButton btnOk = new JButton("Ok");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					
				if(rdbtnIngls.isSelected()){
					
					MessagesLoginInter.setIdioma("inglés");
					MessagesRefugioIPOInter.setIdioma("inglés");
				}
				if(rdbtnEspaol.isSelected()){
					MessagesLoginInter.setIdioma("español");
					MessagesRefugioIPOInter.setIdioma("español");
				}
				
				Login ventana = new Login();
				ventana.frame.setVisible(true);
				
				frame.dispose();
			}
		});
		btnOk.setBounds(330, 95, 67, 23);
		panel.add(btnOk);
	}
}
