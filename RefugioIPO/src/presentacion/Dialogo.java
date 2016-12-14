package presentacion;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import dominio.Donacion;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Dialogo extends JFrame {

	private JPanel contentPane;
	private JButton btnAceptar;
	private JScrollPane scrollPane;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public Dialogo(Donacion donacion) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //QUITAMOS ESTO SI QUEREMOS QUE AL CERRAR ESTE VENTANA NO SE CIERRE LA PRINCIPAL
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		{
			btnAceptar = new JButton("Aceptar");
			btnAceptar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dispose();
				}
			});
			contentPane.add(btnAceptar, BorderLayout.SOUTH);
		}
		{
			scrollPane = new JScrollPane();
			contentPane.add(scrollPane, BorderLayout.CENTER);
			{
				textArea = new JTextArea();
				scrollPane.setViewportView(textArea);
			}
		}
		
		
		//Al final del método, después de haber creado los objetos de la GUI
		String contenido = "Nombre: "+ donacion.getNombre()+"\nApellidos: "+ donacion.getApellidos()+"\nDNI: "+donacion.getDni()+"\n"+
		"Cantidad donada: "+ donacion.getCantidadDonar()+" €";
		
		
		
		textArea.setText(contenido);
		
	}

}

