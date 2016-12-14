package presentacion;


import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.filechooser.FileNameExtensionFilter;

import java.awt.Font;
import java.io.File;



public class Login {

	JFrame frame;
	
	private JPanel panel;
	private JLabel lblUsuario;
	private JLabel lblPassword;
	private JButton btnEntrar;
	private JTextField tfUsuario;
	private JPasswordField pwdfPassword;
	private final String password = "1234";
	private final String usuario= "protectora";
	private JLabel lblImagen;
	private static String direccion;

	public static String getDireccion() {
		return direccion;
	}

	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
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
	public Login() {
		initialize();
		
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	
	private void initialize() {
		frame = new JFrame();
		frame.setBackground(Color.WHITE);
		frame.setResizable(false);
		frame.setBounds(100, 100, 511, 287);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		{
			panel = new JPanel();
			panel.setBackground(Color.WHITE);
			panel.setBounds(0, 0, 505, 261);
			frame.getContentPane().add(panel);
			panel.setLayout(null);
			{
				lblUsuario = new JLabel(MessagesLoginInter.getString("Login.lblUsuario.text")); //$NON-NLS-1$
				lblUsuario.setFont(new Font("Tahoma", Font.PLAIN, 12));
				lblUsuario.setBounds(209, 65, 72, 17);
				panel.add(lblUsuario);
			}
			{
				lblPassword = new JLabel(MessagesLoginInter.getString("Login.lblPassword.text")); //$NON-NLS-1$
				lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 12));
				lblPassword.setBounds(209, 125, 79, 14);
				panel.add(lblPassword);
			}
			{
				btnEntrar = new JButton(MessagesLoginInter.getString("Login.btnEntrar.text")); //$NON-NLS-1$
				btnEntrar.setEnabled(false);
				btnEntrar.addActionListener(new BtnEntrarActionListener());
				btnEntrar.setBounds(362, 194, 92, 33);
				panel.add(btnEntrar);
			}
			{
				tfUsuario = new JTextField();
				tfUsuario.setEnabled(false);
				
				tfUsuario.setBounds(306, 64, 148, 20);
				panel.add(tfUsuario);
				tfUsuario.setColumns(10);
			}
			{
				pwdfPassword = new JPasswordField();
				pwdfPassword.setEnabled(false);
				
				pwdfPassword.setBounds(306, 123, 148, 20);
				panel.add(pwdfPassword);
			}
			{
				lblImagen = new JLabel("");
				lblImagen.setBounds(21, 39, 140, 140);
				lblImagen.setIcon(new ImageIcon(Login.class.getResource("/presentacion/logo.jpg")));
				panel.add(lblImagen);
			}
			
			final JButton btnIdioma = new JButton(MessagesLoginInter.getString("Login.btnIdioma.text"));
			btnIdioma.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					
					SeleccionIdioma idioma= new SeleccionIdioma();
					idioma.frame.setVisible(true);
					
					frame.dispose();
					
				}
			});
			btnIdioma.setBounds(218, 194, 111, 33);
			panel.add(btnIdioma);
			
			final JButton btnConectarBd = new JButton(MessagesLoginInter.getString("Login.btnConectarBd.text")); //$NON-NLS-1$
			btnConectarBd.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					
					JFileChooser fcAbrir = new JFileChooser();
					FileNameExtensionFilter filtro = new FileNameExtensionFilter("*.accdb", "accdb");

					fcAbrir.setFileFilter(filtro);
					int valorDevuelto = fcAbrir.showOpenDialog(frame);
					//Recoger el nombre del fichero seleccionado por el usuario
					if (valorDevuelto == JFileChooser.APPROVE_OPTION) {
						File file = fcAbrir.getSelectedFile();
						//En este punto la aplicación se debería encargar de realizar la operación sobre el fichero
						
						direccion= file.getAbsolutePath();
						
						btnEntrar.setEnabled(true);
						
						tfUsuario.setEnabled(true);
						pwdfPassword.setEnabled(true);
						btnConectarBd.setEnabled(false);
					}
					
				}
			});
			btnConectarBd.setBounds(31, 194, 119, 33);
			panel.add(btnConectarBd);
		}
	}
	
	
	private class BtnEntrarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			if
			(String.valueOf(pwdfPassword.getPassword()).toString().equals(password) && tfUsuario.getText().toString().equals(usuario)){
				Menu menu1= new Menu();
				menu1.frame.setVisible(true);
			}
			
			else{
				JOptionPane.showMessageDialog(frame, "Usuario o Contraseña incorrectos", "ERROR", JOptionPane.PLAIN_MESSAGE); 
				tfUsuario.setText("");
				pwdfPassword.setText("");
			}
		}
	}
}