package presentacion;

import java.awt.EventQueue;
import java.awt.Window;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

import dominio.GestorPerro;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class OpcionLista {

	JFrame frame;
	JTextField textFieldOpRaza;
	JComboBox comboBoxOpSexo = new JComboBox();
	String razaPerro;
	String sexoPerro;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OpcionLista window = new OpcionLista();
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
	public OpcionLista() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 191);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(textFieldOpRaza.getText().trim().length()!=0){
					razaPerro=textFieldOpRaza.getText().toString();
					sexoPerro=(String)comboBoxOpSexo.getSelectedItem();
					
					try{
						GestorPerro g1=new GestorPerro();
						String[] datosLista= g1.read(razaPerro, sexoPerro);
						if(datosLista.length!=0){
							for(int i=0; i<datosLista.length; i++){
								 Menu.modeloLista2.addElement(datosLista[i]);//nombre es el campo de la base de datos
							}
						           
						    Menu.list_1.setModel(Menu.modeloLista2);
						}else{
							JOptionPane.showMessageDialog(frame, "No hay ningún perro en la BBDD");
						}
						
						
					}catch(Exception ex1){
						ex1.printStackTrace();
					}
					
					frame.dispose();
					
					
				}else{
					JOptionPane.showMessageDialog(null, "Introduce la raza de perro que desea listar");
				}
				
				
			}
		});
		btnAceptar.setBounds(335, 119, 89, 23);
		frame.getContentPane().add(btnAceptar);
		
		textFieldOpRaza = new JTextField();
		textFieldOpRaza.setBounds(65, 59, 105, 20);
		frame.getContentPane().add(textFieldOpRaza);
		textFieldOpRaza.setColumns(10);
		
		JLabel lblRaza = new JLabel("Raza:");
		lblRaza.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblRaza.setBounds(65, 34, 46, 14);
		frame.getContentPane().add(lblRaza);
		
		JLabel lblSexo = new JLabel("Sexo:");
		lblSexo.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblSexo.setBounds(229, 34, 46, 14);
		frame.getContentPane().add(lblSexo);
		
		
		comboBoxOpSexo.setModel(new DefaultComboBoxModel(new String[] {"hembra", "macho"}));
		comboBoxOpSexo.setBounds(229, 59, 112, 20);
		frame.getContentPane().add(comboBoxOpSexo);
	}

}
