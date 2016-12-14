package presentacion;

import presentacion.OpcionLista;
import dominio.Casa;
import dominio.GestorCasa;
import dominio.GestorPerro;
import dominio.GestorSocio;
import dominio.GestorVoluntario;
import dominio.Perro;
import dominio.Socio;
import dominio.Voluntario;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLayeredPane;

import java.awt.BorderLayout;

import javax.swing.JPanel;
import javax.swing.JTabbedPane;

import java.awt.Component;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Point;

import javax.swing.JButton;

import java.awt.GridBagConstraints;
import java.awt.Insets;

import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JFormattedTextField;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.border.TitledBorder;
import javax.swing.text.MaskFormatter;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.Icon;

import java.awt.SystemColor;
import java.awt.Color;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.text.ParseException;
import java.util.Calendar;

import javax.swing.JCheckBox;
import javax.swing.AbstractListModel;

import java.awt.event.KeyAdapter;

import javax.swing.ButtonGroup;

import dominio.Donacion;

import javax.swing.BoxLayout;
import javax.swing.JToolBar;
import javax.swing.JEditorPane;
import javax.swing.JSplitPane;
import javax.swing.JTextPane;
import javax.swing.JMenuBar;
import javax.swing.JMenu;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JMenuItem;

public class Menu {

	JFrame frame;
	private JTabbedPane tabbedPane;
	private JPanel pnlInicio;
	private JPanel pnlPerros;
	private JPanel pnlVoluntarios;
	private JPanel pnlSocios;
	private JPanel pnlDonativos;
	private JPanel pnlAcogida;
	private JPanel pnlBusqueda;
	private JPanel pnlProtectora;
	private JButton btnListarPerros;
	private JLabel lblNombre;
	private JLabel lblSexo;
	private JLabel lblRaza;
	private JLabel lblEdad;
	private JTextField textField_nombre;
	private JTextField textField_raza;
	private JTextField textField_edad;
	private JLabel lblVacunado;
	private JLabel lblChip;
	private JLabel lblEnfermedades;
	private JLabel lblNChip;
	private JLabel lblTipo;
	private JTextField textField_chip;
	private JTextField textField_Enfermedad;
	private JLabel lblSociable;
	private JButton btnFoto;
	private JLabel lblEstado;
	private JComboBox comboBox_estado;
	private JButton btnEliminar;
	private JButton btnModificar;
	private JButton btnBorrarDatos;
	private JButton btnAadir;
	private JButton btnListarVoluntarios;
	
	private JLabel lblNombre_1;
	private JLabel lblApellidos;
	private JLabel lblDni;
	private JLabel lblFechaVoluntario;
	private JLabel lblTelfonoVoluntario;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JLabel lblDireccin;
	private JLabel lblCiudad;
	private JLabel lblProvincia;
	private JLabel lblCorreoVoluntario;
	private JLabel lblDatosPersonales;
	private JTextField textField_5;
	private JTextField txtCiudadVoluntario;
	private JTextField txtProvinciaVoluntario;
	private JTextField txtCorreoVoluntario;
	private JButton btnCambiarFoto;
	private JButton btnEliminarVoluntario;
	private JButton btnModificarVoluntario;
	private JButton btnBorrarDatosVoluntario;
	private JButton btnAñadirVoluntario;
	
	private JLabel lblNewLabel;
	private JComboBox comboBox_donativos;
	private JTextField txtCantidad;
	private JTextField txtNombreVoluntario;
	private JLabel lblOtraCantidad;
	private JLabel lblNumeroDeCuenta;
	private JFormattedTextField formattedTextField;
	private JLabel lblNewLabel_1;
	private JLabel lblNombre2;
	private JLabel lblApellidosDonante;
	private JLabel lblApellidosVoluntario;
	private JLabel lblDireccionDonante;
	private JLabel lblDireccionVoluntario;
	private JLabel lblCiudadDonante;
	private JLabel lblCiudadVoluntario;
	private JLabel lblProvinciaDonante;
	private JLabel lblProvinciaVoluntario;
	private JLabel lblTelefono;
	private JTextField txtNombreDonante;
	private JTextField txtApellidosVoluntario;
	private JTextField txtApellidosDonante;
	private JTextField txtDireccionDonante;
	private JTextField txtCiudadDonante;
	private JTextField txtProvinciaDonante;
	private JTextField textdireccionVoluntario;
	private JFormattedTextField formattedTextField_1;
	private JButton btnAceptar;
	private JButton btnListarSocios;
	private JList list;
	private JButton btnEliminarSocio;
	private JButton btnModificarSocio;
	private JButton btnBorrarDatos_2;
	private JButton btnAadirSocio;
	private JLabel lblNombre_2;
	private JLabel lblApellidos_1;
	private JLabel lblDni_1;
	private JLabel lblFechaNacimiento_1;
	private JLabel lblTelfono_1;
	private JTextField txtNombreSocio;
	private JTextField txtApellidosSocio;
	private JLabel lblDireccin_1;
	private JLabel lblCiudad_1;
	private JLabel lblProvincia_1;
	private JLabel lblCorreoElectrnico_1;
	private JTextField textdireccionSocio;
	private JTextField txtCiudadSocio;
	private JTextField txtProvinciaSocio;
	private JTextField txtCorreoSocio;
	private JLabel lblDatosPersonales_1;
	private JButton btnCambiarFoot;
	private JLabel lblDatosBancarios;
	private JLabel lblNmCuenta;
	private JLabel lblAportacinMensual;
	private JComboBox comboBox_aportacionSocio;
	
	private JScrollPane scrollPane;
	private JLabel lblNewLabel_77;
	private JLabel lblApellidosDueño;
	private JLabel lblDniDueño;
	private JLabel lblDniVoluntario;
	private JLabel lblFechaDeNacimiento;
	private JLabel lblDireccionDueño;
	private JLabel lblCiudadDueño;
	private JLabel lblProvinciaDueño;
	private JLabel lblTelefonoDueño;
	private JLabel lblTelefonoDonante;
	private JLabel lblEmail;
	private JLabel lblNewLabel_11;
	private JTextField textNombreAcogida;
	private JTextField txtApellidoAcogida;
	private JFormattedTextField formattedTextFieldDNI;
	private JFormattedTextField formattedTextField_cuentaDonante;
	private JFormattedTextField formattedTextField_FechaAcogida;
	private JFormattedTextField formattedTextField_telefDonante;
	private JTextField textField_direccion;
	private JTextField textField_ciudad;
	private JTextField textField_provincia;
	private JFormattedTextField formattedTextField_TelefAcogida;
	private JFormattedTextField formattedTextField_email;
	private JTextField textField_profesion;
	private JLabel lblCuestionesGenerales;
	private JLabel lblNewLabel_2;
	private JLabel lblTipoDeVivienda;
	private JLabel lblDondeDormirEl;
	private JButton btnModificarDueño;
	private JButton btnModificarDueño_1;
	private JButton btnEliminarDueño;
	private JButton btnEliminarDueño_1;
	private JLabel lblDatosPersonales_2;
	private JButton btnBorrarDatos_3;
	private JButton btnAadir_2;
	private JComboBox comboBox_animales;
	private JComboBox comboBox_tipoVivienda;
	private JComboBox comboBox_dormir;
	private JLabel lblMascotaAAcoger;
	private JTextField textField_mascota;
	private JCheckBox checkBox_enfermedad;
	private JCheckBox checkBox_chip;
	private JCheckBox checkBox_vacunado;
	
	
	private JFormattedTextField formattedTextField_DniSocio;
	private JFormattedTextField formattedTextField_TelefSocio;
	private JFormattedTextField formattedTextField_FechaSocio;
	private JLabel lblDni_2;
	private JFormattedTextField formattedTextField_DniDonante;
	private JFormattedTextField formattedTextField_DniVoluntario;
	private JFormattedTextField formattedTextField_fechaVoluntario;
	private JFormattedTextField formattedTextField_TelefVoluntario;
	private JCheckBox chckbxConPerros;
	private JCheckBox chckbxConGatos;
	private JCheckBox chckbxConNios;
	private JFormattedTextField formattedTextField_cuenta;
	private JLabel label;
	private JLabel label_1;
	private JToolBar toolBar1;
	private JScrollPane scrollPane_1;
	
	static DefaultListModel modeloLista2=new DefaultListModel();
	
	static DefaultListModel modeloLista3=new DefaultListModel();
	static DefaultListModel modeloLista4=new DefaultListModel();
	static DefaultListModel modeloLista5=new DefaultListModel();
	
	private JToolBar toolBar;
	
	private JButton btnBusqueda;
	private JButton btnVistoPerro;
	private JButton btnVererinaria;
	private JButton btnPolicia;
	private JButton btnCargarMapa;

	//Area de dibujo personalizada (creada extendiendo de JLabel)
	private MiAreaDibujo MiAreaDibujo;
	
	//Imagen en la que se cargará el fichero seleccionado por elusuario
	private ImageIcon imagen;
	
	//Variable que almacena el modo dedibujado seleccionado por elusuario
	int modo = -1;
	
	private final int BUSQUEDA = 1;
	private final int PERRO = 2;
	private final int VETERINARIA = 3;
	private final int POLICIA = 4;
	private final int AREA = 5;
	private final int TEXTO = 6;
	
	private JButton btnArea;
	private JButton btnComentario;
	
	//Cursores e imagenes
	private Toolkit toolkit;
	
	private Image imagPerro;
	private Image imagVeterinaria;
	private Image imagPolicia;
	private Image imagTexto;
	private Image imagArea;
	private Image imagBusqueda;
	
	private Cursor cursorBusqueda;
	private Cursor cursorPerro;
	private Cursor cursorVeterinaria;
	private Cursor cursorPolicia;
	private Cursor cursorArea;
	private Cursor cursorTexto;
	
	private int x, y;
	private JTextField txtTexto = new JTextField();
	private JButton btnListarAcogedores;
	//private JLabel MiAreaDibujo;

	private DefaultListModel modeloLista = new DefaultListModel<>();
	private JButton button;
	private JLabel label_4;
	private JLabel label_5;
	private JLabel label_6;
	private JLabel label_7;
	private JLabel label_8;
	private JLabel label_9;
	private JLabel label_10;
	private JTextField txtCheniles;
	private JTextField txtComederos_1;
	private JTextField txtComederos;
	private JTextField txtPatioInterior;
	private JTextField txtRecibidor;
	private JTextField txtEnfermera;
	private JTextField txtLavabos;
	private JButton btnModificarDatos;
	private JButton btnGuardarDatos;
	private JLabel lblNewLabel_3;
	private JScrollPane scrollPane_2;
	private JLabel lblFotoPerro;
	private JScrollPane scrollPane_3;
	private JLabel lblFotoVoluntario;
	private JScrollPane scrollPane_4;
	private JLabel lblFotoSocio;
	private JLabel label_11;
	private JLabel label_12;
	private JLabel label_13;
	private JScrollPane scrollPane_5;
	static JList list_1;
	private JScrollPane scrollPane_6;
	private JList list_2;
	private JScrollPane scrollPane_7;
	private JList list_4;
	private JScrollPane scrollPane_8;
	private JList list_3;
	private JLabel lblLosCamposCon;
	private JLabel lblNewLabel_4;
	private JLabel label_15;
	private JLabel label_16;
	private JLabel label_17;
	private JLabel label_18;
	private JLabel lblCamposObligatorios;
	private JLabel label_19;
	private JLabel label_20;
	private JLabel label_21;
	private JLabel label_22;
	private JLabel label_23;
	private JComboBox comboBoxSexo;

	private String id="";
	private String dni="";
	private JLabel label_14;
	private JLabel label_24;
	private JLabel label_25;
	private JLabel label_26;
	private JList list_5;
	private JButton btnListarPerrosDisponibles;
	private JMenuItem mntmAcercaDe;
	private JLabel lblProtectora_1;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu window = new Menu();
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
	public Menu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent arg0) {
				JOptionPane.showMessageDialog(frame, "Gracias por utilizar nuestra aplicación", "Cerrar la aplicación", JOptionPane.PLAIN_MESSAGE); 
				System.exit( 0 );
				
			}
		});
		frame.setResizable(false);
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(Menu.class.getResource("/presentacion/logo.jpg")));
		frame.setBounds(100, 100, 1347, 596);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		{
			tabbedPane = new JTabbedPane(JTabbedPane.LEFT);
			frame.getContentPane().add(tabbedPane, BorderLayout.CENTER);
			{
				{
					
					
				}
			}
			{
				{

					MaskFormatter formatoDNI;
					try {
						formatoDNI = new MaskFormatter("########'-U");
						formatoDNI.setPlaceholderCharacter('X');
					} catch (ParseException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				{
					
					
					MaskFormatter formatoFecha;
					try {
						formatoFecha = new MaskFormatter(" ##'/ ##'/ ##");
						formatoFecha.setPlaceholderCharacter('X');
					} catch (ParseException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				{
					
					MaskFormatter formatoTlfno;
					try {
						formatoTlfno = new MaskFormatter(" ###' ###' ###");
						formatoTlfno.setPlaceholderCharacter('*');
					} catch (ParseException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
			pnlInicio = new JPanel();
			tabbedPane.addTab("Inicio", new ImageIcon(Menu.class.getResource("/presentacion/inicio.png")), pnlInicio, null);
			
			
			tabbedPane.setDisabledIconAt(0, null);
			tabbedPane.setBackgroundAt(0, SystemColor.menu);
			pnlInicio.setLayout(null);
			
			JEditorPane dtrpnNuestraAsociacinDesempea = new JEditorPane();
			dtrpnNuestraAsociacinDesempea.setFont(new Font("Tahoma", Font.PLAIN, 13));
			dtrpnNuestraAsociacinDesempea.setText(MessagesRefugioIPOInter.getString("Menu.dtrpnNuestraAsociacinDesempea.text")); //$NON-NLS-1$
			dtrpnNuestraAsociacinDesempea.setBounds(111, 132, 469, 359);
			pnlInicio.add(dtrpnNuestraAsociacinDesempea);
			
			JLabel lblProtectora = new JLabel(MessagesRefugioIPOInter.getString("Menu.lblProtectora.text")); //$NON-NLS-1$
			lblProtectora.setFont(new Font("Tahoma", Font.PLAIN, 30));
			lblProtectora.setBounds(111, 50, 429, 46);
			pnlInicio.add(lblProtectora);
			
			JLabel label_2_1 = new JLabel("");
			label_2_1.setIcon(new ImageIcon(Menu.class.getResource("/presentacion/perros.jpg")));
			label_2_1.setBounds(613, 132, 421, 175);
			pnlInicio.add(label_2_1);
			
			JLabel label_3 = new JLabel("");
			label_3.setIcon(new ImageIcon(Menu.class.getResource("/presentacion/perros2.jpg")));
			label_3.setBounds(613, 318, 421, 173);
			pnlInicio.add(label_3);
			
			JLabel lblUsuario = new JLabel(MessagesRefugioIPOInter.getString("Menu.lblUsuario.text")); //$NON-NLS-1$
			lblUsuario.setBounds(778, 31, 64, 14);
			pnlInicio.add(lblUsuario);
			
			JLabel lblFecha = new JLabel(MessagesRefugioIPOInter.getString("Menu.lblFecha.text")); //$NON-NLS-1$
			lblFecha.setBounds(778, 56, 46, 14);
			pnlInicio.add(lblFecha);
			
			JLabel lblHora = new JLabel(MessagesRefugioIPOInter.getString("Menu.lblHora.text")); //$NON-NLS-1$
			lblHora.setBounds(778, 82, 46, 14);
			pnlInicio.add(lblHora);
			
			JLabel label_27 = new JLabel("00/00/00");
			label_27.setBounds(857, 56, 110, 14);
			pnlInicio.add(label_27);
			
			JLabel label_28 = new JLabel("00:00:00");
			label_28.setBounds(857, 82, 86, 14);
			pnlInicio.add(label_28);
			
			Calendar cal=Calendar.getInstance(); 
		     int fecha1=cal.get(cal.DATE); 
		     int fecha2=cal.get(cal.MONTH)+1;
		     int fecha3=cal.get(cal.YEAR);
		     int hora=cal.get(cal.HOUR_OF_DAY);
		     int mint=cal.get(cal.MINUTE);
		       label_27.setText(fecha1+"/"+fecha2+"/"+fecha3); 
		       label_28.setText(hora+":"+mint);
		       {
		       	lblProtectora_1 = new JLabel(MessagesRefugioIPOInter.getString("Menu.lblProtectora_1.text")); //$NON-NLS-1$
		       	lblProtectora_1.setBounds(857, 31, 74, 14);
		       	pnlInicio.add(lblProtectora_1);
		       }

			
			
			{
				pnlPerros = new JPanel();
				pnlPerros.setFont(new Font("Traditional Arabic", Font.PLAIN, 16));
				tabbedPane.addTab("Perros", new ImageIcon(Menu.class.getResource("/presentacion/perrooo.png")), pnlPerros, null);
				GridBagLayout gbl_pnlPerros = new GridBagLayout();
				gbl_pnlPerros.columnWidths = new int[]{59, 0, 0, 40, 0, 120, 40, 0, 0, 50, 70, 50, 50, 51, 48, 0};
				gbl_pnlPerros.rowHeights = new int[]{30, 40, 30, 50, 50, 50, 0, 0, 50, 52, 27, 25, 0};
				gbl_pnlPerros.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
				gbl_pnlPerros.rowWeights = new double[]{0.0, 0.0, 1.0, 1.0, 1.0, 1.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
				pnlPerros.setLayout(gbl_pnlPerros);
				{
					
					
					
					btnListarPerros = new JButton(MessagesRefugioIPOInter.getString("Menu.btnListarPerros.text")); //$NON-NLS-1$
					btnListarPerros.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
					btnListarPerros.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							modeloLista2.clear();
							list_1.setModel(modeloLista2);
							OpcionLista op= new OpcionLista();
							op.frame.setVisible(true);
							
							
						}
					});
					GridBagConstraints gbc_btnListarPerros = new GridBagConstraints();
					gbc_btnListarPerros.fill = GridBagConstraints.HORIZONTAL;
					gbc_btnListarPerros.insets = new Insets(0, 0, 5, 5);
					gbc_btnListarPerros.gridx = 1;
					gbc_btnListarPerros.gridy = 1;
					pnlPerros.add(btnListarPerros, gbc_btnListarPerros);
				}
				{
					lblNewLabel_4 = new JLabel(MessagesRefugioIPOInter.getString("Menu.lblNewLabel_4.text")); //$NON-NLS-1$
					lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
					GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
					gbc_lblNewLabel_4.anchor = GridBagConstraints.WEST;
					gbc_lblNewLabel_4.gridwidth = 3;
					gbc_lblNewLabel_4.insets = new Insets(0, 0, 5, 5);
					gbc_lblNewLabel_4.gridx = 5;
					gbc_lblNewLabel_4.gridy = 1;
					pnlPerros.add(lblNewLabel_4, gbc_lblNewLabel_4);
				}
				{
					scrollPane_2 = new JScrollPane();
					GridBagConstraints gbc_scrollPane_2 = new GridBagConstraints();
					gbc_scrollPane_2.gridwidth = 2;
					gbc_scrollPane_2.gridheight = 2;
					gbc_scrollPane_2.insets = new Insets(0, 0, 5, 5);
					gbc_scrollPane_2.fill = GridBagConstraints.BOTH;
					gbc_scrollPane_2.gridx = 12;
					gbc_scrollPane_2.gridy = 1;
					pnlPerros.add(scrollPane_2, gbc_scrollPane_2);
					{
						lblFotoPerro = new JLabel(MessagesRefugioIPOInter.getString("Menu.lblFotoPerro.text")); //$NON-NLS-1$
						lblFotoPerro.setIcon(new ImageIcon(Menu.class.getResource("/presentacion/usuarioPerro.jpg")));
						scrollPane_2.setViewportView(lblFotoPerro);
					}
				}
				{
					scrollPane_5 = new JScrollPane();
					scrollPane_5.setBorder(new TitledBorder(null, MessagesRefugioIPOInter.getString("Menu.scrollPane_5.borderTitle"), TitledBorder.LEADING, TitledBorder.TOP, null, null)); //$NON-NLS-1$
					scrollPane_5.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
					GridBagConstraints gbc_scrollPane_5 = new GridBagConstraints();
					gbc_scrollPane_5.gridheight = 6;
					gbc_scrollPane_5.gridwidth = 2;
					gbc_scrollPane_5.insets = new Insets(0, 0, 5, 5);
					gbc_scrollPane_5.fill = GridBagConstraints.BOTH;
					gbc_scrollPane_5.gridx = 1;
					gbc_scrollPane_5.gridy = 2;
					pnlPerros.add(scrollPane_5, gbc_scrollPane_5);
					{
						list_1 = new JList();
						list_1.addMouseListener(new MouseAdapter() {
							@Override
							public void mouseClicked(MouseEvent arg0) {
								String perro= list_1.getSelectedValue().toString();
								
								id="";
								for(int i=0; i< perro.length(); i++){
									if(isNumeric(perro.charAt(i))){
										id=id+perro.charAt(i);
									}
										
								}
								btnEliminarDueño.setEnabled(true);
								btnModificarDueño.setEnabled(true);
								
								GestorPerro g= new GestorPerro();
								try {
									Perro p1=g.readOne(id);
									textField_nombre.setText(p1.getNombre());
									comboBoxSexo.setSelectedItem(p1.getSexo());
									textField_raza.setText(p1.getRaza());
									textField_edad.setText(p1.getEdad());
									textField_chip.setText(p1.getNumeroChip());
									textField_chip.setEnabled(false);
									textField_Enfermedad.setText(p1.getTipoEnfermedad());
									textField_Enfermedad.setEnabled(false);
									lblFotoPerro.setIcon(new ImageIcon(p1.getFoto()));
									checkBox_chip.setSelected(p1.isChip());
									checkBox_vacunado.setSelected(p1.isVacunado());
									checkBox_enfermedad.setSelected(p1.isEnfermedad());
									chckbxConPerros.setSelected(p1.isSociablePerros());
									chckbxConGatos.setSelected(p1.isSociableGatos());
									chckbxConNios.setSelected(p1.isSociableNiños());
									comboBox_estado.setSelectedItem(p1.getEstado());
									
								} catch (Exception e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
								
								//System.out.println("aa "+id);
							}
						});
						scrollPane_5.setViewportView(list_1);
						
						
						
					}
				}
				{
					lblNombre2 = new JLabel(MessagesRefugioIPOInter.getString("Menu.lblNombre2.text")); //$NON-NLS-1$
					lblNombre2.setHorizontalAlignment(SwingConstants.RIGHT);
					GridBagConstraints gbc_lblNombre = new GridBagConstraints();
					gbc_lblNombre.anchor = GridBagConstraints.WEST;
					gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
					gbc_lblNombre.gridx = 4;
					gbc_lblNombre.gridy = 2;
					pnlPerros.add(lblNombre2, gbc_lblNombre);
				}
				{
					textField_nombre = new JTextField();
					textField_nombre.addKeyListener(new KeyAdapter() {
						@Override
						public void keyTyped(KeyEvent arg0) {
							 char c=arg0.getKeyChar(); 
					            
					          if(Character.isDigit(c)) { 
					               
					              arg0.consume(); 
					              JOptionPane.showMessageDialog(null, "Se admiten sólo letras");  
					          } 
							
						}
					});
					GridBagConstraints gbc_textField_nombre = new GridBagConstraints();
					gbc_textField_nombre.fill = GridBagConstraints.HORIZONTAL;
					gbc_textField_nombre.insets = new Insets(0, 0, 5, 5);
					gbc_textField_nombre.gridx = 5;
					gbc_textField_nombre.gridy = 2;
					pnlPerros.add(textField_nombre, gbc_textField_nombre);
					textField_nombre.setColumns(10);
				}
				{
					label_11 = new JLabel("*");
					GridBagConstraints gbc_label_11 = new GridBagConstraints();
					gbc_label_11.anchor = GridBagConstraints.WEST;
					gbc_label_11.insets = new Insets(0, 0, 5, 5);
					gbc_label_11.gridx = 6;
					gbc_label_11.gridy = 2;
					pnlPerros.add(label_11, gbc_label_11);
				}
				{
					lblVacunado = new JLabel(MessagesRefugioIPOInter.getString("Menu.lblVacunado.text")); //$NON-NLS-1$
					GridBagConstraints gbc_lblVacunado = new GridBagConstraints();
					gbc_lblVacunado.anchor = GridBagConstraints.WEST;
					gbc_lblVacunado.insets = new Insets(0, 0, 5, 5);
					gbc_lblVacunado.gridx = 7;
					gbc_lblVacunado.gridy = 2;
					pnlPerros.add(lblVacunado, gbc_lblVacunado);
				}
				{
					checkBox_vacunado = new JCheckBox("");
					GridBagConstraints gbc_checkBox_vacunado = new GridBagConstraints();
					gbc_checkBox_vacunado.anchor = GridBagConstraints.WEST;
					gbc_checkBox_vacunado.insets = new Insets(0, 0, 5, 5);
					gbc_checkBox_vacunado.gridx = 8;
					gbc_checkBox_vacunado.gridy = 2;
					pnlPerros.add(checkBox_vacunado, gbc_checkBox_vacunado);
				}
				{
					textField_raza = new JTextField();
					textField_raza.addKeyListener(new KeyAdapter() {
						@Override
						public void keyTyped(KeyEvent arg0) {
							 char c=arg0.getKeyChar(); 
					            
					          if(Character.isDigit(c)) { 
					               
					              arg0.consume(); 
					              JOptionPane.showMessageDialog(null, "Se admiten sólo letras");  
					          } 
						}
					});
					{
						lblRaza = new JLabel(MessagesRefugioIPOInter.getString("Menu.lblRaza.text")); //$NON-NLS-1$
						GridBagConstraints gbc_lblRaza = new GridBagConstraints();
						gbc_lblRaza.anchor = GridBagConstraints.WEST;
						gbc_lblRaza.insets = new Insets(0, 0, 5, 5);
						gbc_lblRaza.gridx = 4;
						gbc_lblRaza.gridy = 3;
						pnlPerros.add(lblRaza, gbc_lblRaza);
					}
					GridBagConstraints gbc_textField_raza = new GridBagConstraints();
					gbc_textField_raza.insets = new Insets(0, 0, 5, 5);
					gbc_textField_raza.fill = GridBagConstraints.HORIZONTAL;
					gbc_textField_raza.gridx = 5;
					gbc_textField_raza.gridy = 3;
					pnlPerros.add(textField_raza, gbc_textField_raza);
					textField_raza.setColumns(10);
				}
				{
					label_12 = new JLabel("*");
					GridBagConstraints gbc_label_12 = new GridBagConstraints();
					gbc_label_12.anchor = GridBagConstraints.WEST;
					gbc_label_12.insets = new Insets(0, 0, 5, 5);
					gbc_label_12.gridx = 6;
					gbc_label_12.gridy = 3;
					pnlPerros.add(label_12, gbc_label_12);
				}
				{
					
					lblChip = new JLabel(MessagesRefugioIPOInter.getString("Menu.lblChip.text")); //$NON-NLS-1$
					GridBagConstraints gbc_lblChip = new GridBagConstraints();
					gbc_lblChip.anchor = GridBagConstraints.WEST;
					gbc_lblChip.insets = new Insets(0, 0, 5, 5);
					gbc_lblChip.gridx = 7;
					gbc_lblChip.gridy = 3;
					pnlPerros.add(lblChip, gbc_lblChip);
				}
				{
					checkBox_chip = new JCheckBox(MessagesRefugioIPOInter.getString("Menu.checkBox_chip.text")); //$NON-NLS-1$
					checkBox_chip.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							if(checkBox_chip.isSelected()){
								textField_chip.setEnabled(true);
							}
							else{
								textField_chip.setText("");
								textField_chip.setEnabled(false);
							}
							
							
						}
					});
					GridBagConstraints gbc_checkBox_chip = new GridBagConstraints();
					gbc_checkBox_chip.anchor = GridBagConstraints.WEST;
					gbc_checkBox_chip.insets = new Insets(0, 0, 5, 5);
					gbc_checkBox_chip.gridx = 8;
					gbc_checkBox_chip.gridy = 3;
					pnlPerros.add(checkBox_chip, gbc_checkBox_chip);
				}
				{
					lblNChip = new JLabel(MessagesRefugioIPOInter.getString("Menu.lblNChip.text")); //$NON-NLS-1$
					GridBagConstraints gbc_lblNChip = new GridBagConstraints();
					gbc_lblNChip.anchor = GridBagConstraints.WEST;
					gbc_lblNChip.insets = new Insets(0, 0, 5, 5);
					gbc_lblNChip.gridx = 9;
					gbc_lblNChip.gridy = 3;
					pnlPerros.add(lblNChip, gbc_lblNChip);
				}
				{
					textField_chip = new JTextField();
					textField_chip.setEnabled(false);
					textField_chip.addKeyListener(new KeyAdapter() {
						@Override
						public void keyTyped(KeyEvent arg0) {
							 char c=arg0.getKeyChar(); 
					            
					          if(Character.isLetter(c)) { 
					               
					              arg0.consume(); 
					              JOptionPane.showMessageDialog(null, "Se admiten sólo números");  
					          } 
						}
					});
					GridBagConstraints gbc_textField_chip = new GridBagConstraints();
					gbc_textField_chip.insets = new Insets(0, 0, 5, 5);
					gbc_textField_chip.fill = GridBagConstraints.HORIZONTAL;
					gbc_textField_chip.gridx = 10;
					gbc_textField_chip.gridy = 3;
					pnlPerros.add(textField_chip, gbc_textField_chip);
					textField_chip.setColumns(10);
				}
				{
					btnFoto = new JButton(MessagesRefugioIPOInter.getString("Menu.btnFoto.text")); //$NON-NLS-1$
					btnFoto.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
					btnFoto.setIcon(new ImageIcon(Menu.class.getResource("/presentacion/cargarFoto.png")));
					btnFoto.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {
							JFileChooser fcAbrir = new JFileChooser();
							fcAbrir.setFileFilter(new ImageFilter());
							int valorDevuelto = fcAbrir.showOpenDialog(frame);
							//Recoger el nombre del fichero seleccionado por el usuario
							if (valorDevuelto == JFileChooser.APPROVE_OPTION) {
								File file = fcAbrir.getSelectedFile();
								//En este punto la aplicación se debería encargar de realizar la operación sobre el fichero
								
								lblFotoPerro.setIcon(new ImageIcon(file.getAbsolutePath()));
							}
						}
					});
					GridBagConstraints gbc_btnFoto = new GridBagConstraints();
					gbc_btnFoto.fill = GridBagConstraints.HORIZONTAL;
					gbc_btnFoto.gridwidth = 2;
					gbc_btnFoto.insets = new Insets(0, 0, 5, 5);
					gbc_btnFoto.gridx = 12;
					gbc_btnFoto.gridy = 3;
					pnlPerros.add(btnFoto, gbc_btnFoto);
				}
				{
					textField_edad = new JTextField();
					textField_edad.setToolTipText(MessagesRefugioIPOInter.getString("Menu.textField_edad.toolTipText")); //$NON-NLS-1$
					textField_edad.addKeyListener(new KeyAdapter() {
						@Override
						public void keyTyped(KeyEvent arg0) {
							 char c=arg0.getKeyChar(); 
					            
					          if(Character.isLetter(c)) { 
					               
					              arg0.consume(); 
					              JOptionPane.showMessageDialog(null, "Se admiten sólo números");  
					          } 
						}
					});
					{
						lblEdad = new JLabel(MessagesRefugioIPOInter.getString("Menu.lblEdad.text")); //$NON-NLS-1$
						GridBagConstraints gbc_lblEdad = new GridBagConstraints();
						gbc_lblEdad.anchor = GridBagConstraints.WEST;
						gbc_lblEdad.insets = new Insets(0, 0, 5, 5);
						gbc_lblEdad.gridx = 4;
						gbc_lblEdad.gridy = 4;
						pnlPerros.add(lblEdad, gbc_lblEdad);
					}
					GridBagConstraints gbc_textField_edad = new GridBagConstraints();
					gbc_textField_edad.insets = new Insets(0, 0, 5, 5);
					gbc_textField_edad.fill = GridBagConstraints.HORIZONTAL;
					gbc_textField_edad.gridx = 5;
					gbc_textField_edad.gridy = 4;
					pnlPerros.add(textField_edad, gbc_textField_edad);
					textField_edad.setColumns(10);
				}
				{
					label_13 = new JLabel("*");
					GridBagConstraints gbc_label_13 = new GridBagConstraints();
					gbc_label_13.anchor = GridBagConstraints.WEST;
					gbc_label_13.insets = new Insets(0, 0, 5, 5);
					gbc_label_13.gridx = 6;
					gbc_label_13.gridy = 4;
					pnlPerros.add(label_13, gbc_label_13);
				}
				{
					lblEnfermedades = new JLabel(MessagesRefugioIPOInter.getString("Menu.lblEnfermedades.text")); //$NON-NLS-1$
					GridBagConstraints gbc_lblEnfermedades = new GridBagConstraints();
					gbc_lblEnfermedades.anchor = GridBagConstraints.WEST;
					gbc_lblEnfermedades.insets = new Insets(0, 0, 5, 5);
					gbc_lblEnfermedades.gridx = 7;
					gbc_lblEnfermedades.gridy = 4;
					pnlPerros.add(lblEnfermedades, gbc_lblEnfermedades);
				}
				{
					checkBox_enfermedad = new JCheckBox(MessagesRefugioIPOInter.getString("Menu.checkBox_enfermedad.text")); //$NON-NLS-1$
					checkBox_enfermedad.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
							if(checkBox_enfermedad.isSelected()){
								textField_Enfermedad.setEnabled(true);
							}else{
								textField_Enfermedad.setText("");
								textField_Enfermedad.setEnabled(false);
							}
						}
					});
					GridBagConstraints gbc_checkBox_enfermedad = new GridBagConstraints();
					gbc_checkBox_enfermedad.anchor = GridBagConstraints.WEST;
					gbc_checkBox_enfermedad.insets = new Insets(0, 0, 5, 5);
					gbc_checkBox_enfermedad.gridx = 8;
					gbc_checkBox_enfermedad.gridy = 4;
					pnlPerros.add(checkBox_enfermedad, gbc_checkBox_enfermedad);
				}
				{
					lblTipo = new JLabel(MessagesRefugioIPOInter.getString("Menu.lblTipo.text")); //$NON-NLS-1$
					GridBagConstraints gbc_lblTipo = new GridBagConstraints();
					gbc_lblTipo.anchor = GridBagConstraints.WEST;
					gbc_lblTipo.insets = new Insets(0, 0, 5, 5);
					gbc_lblTipo.gridx = 9;
					gbc_lblTipo.gridy = 4;
					pnlPerros.add(lblTipo, gbc_lblTipo);
				}
				{
					textField_Enfermedad = new JTextField();
					textField_Enfermedad.setEnabled(false);
					textField_Enfermedad.addKeyListener(new KeyAdapter() {
						@Override
						public void keyTyped(KeyEvent arg0) {
							 char c=arg0.getKeyChar(); 
					            
					          if(Character.isDigit(c)) { 
					               
					              arg0.consume(); 
					              JOptionPane.showMessageDialog(null, "Se admiten sólo letras");  
					          } 
						}
					});
					GridBagConstraints gbc_textField_Enfermedad = new GridBagConstraints();
					gbc_textField_Enfermedad.insets = new Insets(0, 0, 5, 5);
					gbc_textField_Enfermedad.fill = GridBagConstraints.HORIZONTAL;
					gbc_textField_Enfermedad.gridx = 10;
					gbc_textField_Enfermedad.gridy = 4;
					pnlPerros.add(textField_Enfermedad, gbc_textField_Enfermedad);
					textField_Enfermedad.setColumns(10);
				}
				{
					lblEstado = new JLabel(MessagesRefugioIPOInter.getString("Menu.lblEstado.text")); //$NON-NLS-1$
					GridBagConstraints gbc_lblEstado = new GridBagConstraints();
					gbc_lblEstado.anchor = GridBagConstraints.SOUTHWEST;
					gbc_lblEstado.insets = new Insets(0, 0, 5, 5);
					gbc_lblEstado.gridx = 12;
					gbc_lblEstado.gridy = 4;
					pnlPerros.add(lblEstado, gbc_lblEstado);
				}
				{
					lblSexo = new JLabel(MessagesRefugioIPOInter.getString("Menu.lblSexo.text")); //$NON-NLS-1$
					lblSexo.setHorizontalAlignment(SwingConstants.RIGHT);
					GridBagConstraints gbc_lblSexo = new GridBagConstraints();
					gbc_lblSexo.anchor = GridBagConstraints.WEST;
					gbc_lblSexo.insets = new Insets(0, 0, 5, 5);
					gbc_lblSexo.gridx = 4;
					gbc_lblSexo.gridy = 5;
					pnlPerros.add(lblSexo, gbc_lblSexo);
				}
				{
					comboBoxSexo = new JComboBox();
					comboBoxSexo.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
					comboBoxSexo.setModel(new DefaultComboBoxModel(new String[] {"hembra", "macho"}));
					GridBagConstraints gbc_comboBoxSexo = new GridBagConstraints();
					gbc_comboBoxSexo.insets = new Insets(0, 0, 5, 5);
					gbc_comboBoxSexo.fill = GridBagConstraints.HORIZONTAL;
					gbc_comboBoxSexo.gridx = 5;
					gbc_comboBoxSexo.gridy = 5;
					pnlPerros.add(comboBoxSexo, gbc_comboBoxSexo);
				}
				{
					lblSociable = new JLabel(MessagesRefugioIPOInter.getString("Menu.lblSociable.text")); //$NON-NLS-1$
					GridBagConstraints gbc_lblSociable = new GridBagConstraints();
					gbc_lblSociable.anchor = GridBagConstraints.WEST;
					gbc_lblSociable.insets = new Insets(0, 0, 5, 5);
					gbc_lblSociable.gridx = 7;
					gbc_lblSociable.gridy = 5;
					pnlPerros.add(lblSociable, gbc_lblSociable);
				}
				{
					chckbxConPerros = new JCheckBox(MessagesRefugioIPOInter.getString("Menu.chckbxConPerros.text")); //$NON-NLS-1$
					GridBagConstraints gbc_chckbxConPerros = new GridBagConstraints();
					gbc_chckbxConPerros.anchor = GridBagConstraints.WEST;
					gbc_chckbxConPerros.insets = new Insets(0, 0, 5, 5);
					gbc_chckbxConPerros.gridx = 8;
					gbc_chckbxConPerros.gridy = 5;
					pnlPerros.add(chckbxConPerros, gbc_chckbxConPerros);
				}
				{
					comboBox_estado = new JComboBox();
					comboBox_estado.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
					comboBox_estado.setModel(new DefaultComboBoxModel(new String[] {"Disponible", "Adoptado", "Reservado", "Cuarentena ", "Fallecido"}));
					GridBagConstraints gbc_comboBox_estado = new GridBagConstraints();
					gbc_comboBox_estado.insets = new Insets(0, 0, 5, 5);
					gbc_comboBox_estado.fill = GridBagConstraints.HORIZONTAL;
					gbc_comboBox_estado.gridx = 12;
					gbc_comboBox_estado.gridy = 5;
					pnlPerros.add(comboBox_estado, gbc_comboBox_estado);
				}
				{
					chckbxConGatos = new JCheckBox(MessagesRefugioIPOInter.getString("Menu.chckbxConGatos.text")); //$NON-NLS-1$
					GridBagConstraints gbc_chckbxConGatos = new GridBagConstraints();
					gbc_chckbxConGatos.anchor = GridBagConstraints.WEST;
					gbc_chckbxConGatos.insets = new Insets(0, 0, 5, 5);
					gbc_chckbxConGatos.gridx = 8;
					gbc_chckbxConGatos.gridy = 6;
					pnlPerros.add(chckbxConGatos, gbc_chckbxConGatos);
				}
				{
					chckbxConNios = new JCheckBox(MessagesRefugioIPOInter.getString("Menu.chckbxConNios.text")); //$NON-NLS-1$
					GridBagConstraints gbc_chckbxConNios = new GridBagConstraints();
					gbc_chckbxConNios.anchor = GridBagConstraints.WEST;
					gbc_chckbxConNios.insets = new Insets(0, 0, 5, 5);
					gbc_chckbxConNios.gridx = 8;
					gbc_chckbxConNios.gridy = 7;
					pnlPerros.add(chckbxConNios, gbc_chckbxConNios);
				}
				{
					btnEliminarDueño = new JButton(MessagesRefugioIPOInter.getString("Menu.btnEliminarDue\u00F1o.text")); //$NON-NLS-1$
					btnEliminarDueño.setEnabled(false);
					btnEliminarDueño.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
					btnEliminarDueño.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
							GestorPerro g2=new GestorPerro();
							try {
								g2.delete(id);
								
								textField_nombre.setText("");
								comboBoxSexo.setSelectedItem("hembra");
								textField_raza.setText("");
								textField_edad.setText("");
								textField_chip.setText("");
								textField_chip.setEnabled(false);
								textField_Enfermedad.setText("");
								textField_Enfermedad.setEnabled(false);
								lblFotoPerro.setIcon(new ImageIcon(Menu.class.getResource("/presentacion/usuarioPerro.jpg")));
								checkBox_chip.setSelected(false);
								checkBox_vacunado.setSelected(false);
								checkBox_enfermedad.setSelected(false);
								chckbxConPerros.setSelected(false);
								chckbxConGatos.setSelected(false);
								chckbxConNios.setSelected(false);
								comboBox_estado.setSelectedItem("Disponible");

								int index = list_1.getSelectedIndex(); 
								modeloLista2.remove(index); 
								JOptionPane.showMessageDialog(frame, "Perro eliminado");
							} catch (Exception e1) {
								// TODO Auto-generated catch block
								JOptionPane.showMessageDialog(frame, "Error al eliminar");
								e1.printStackTrace();
							}
							
						}
					});
					btnEliminarDueño.setIcon(new ImageIcon(Menu.class.getResource("/presentacion/cruz.png")));
					GridBagConstraints gbc_btnEliminar = new GridBagConstraints();
					gbc_btnEliminar.fill = GridBagConstraints.HORIZONTAL;
					gbc_btnEliminar.insets = new Insets(0, 0, 5, 5);
					gbc_btnEliminar.gridx = 1;
					gbc_btnEliminar.gridy = 9;
					pnlPerros.add(btnEliminarDueño, gbc_btnEliminar);
				}
				{
					btnBorrarDatos = new JButton(MessagesRefugioIPOInter.getString("Menu.btnBorrarDatos.text")); //$NON-NLS-1$
					btnBorrarDatos.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
					btnBorrarDatos.setIcon(new ImageIcon(Menu.class.getResource("/presentacion/borrar.png")));
					btnBorrarDatos.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
							textField_nombre.setText("");
							comboBoxSexo.setSelectedItem("hembra");
							textField_raza.setText("");
							textField_edad.setText("");
							textField_chip.setText("");
							textField_chip.setEnabled(false);
							textField_Enfermedad.setText("");
							textField_Enfermedad.setEnabled(false);
							lblFotoPerro.setIcon(new ImageIcon(Menu.class.getResource("/presentacion/usuarioPerro.jpg")));
							checkBox_chip.setSelected(false);
							checkBox_vacunado.setSelected(false);
							checkBox_enfermedad.setSelected(false);
							chckbxConPerros.setSelected(false);
							chckbxConGatos.setSelected(false);
							chckbxConNios.setSelected(false);
							comboBox_estado.setSelectedItem("Disponible");
							
							
						}
					});
					GridBagConstraints gbc_btnBorrarDatos = new GridBagConstraints();
					gbc_btnBorrarDatos.insets = new Insets(0, 0, 5, 5);
					gbc_btnBorrarDatos.gridx = 2;
					gbc_btnBorrarDatos.gridy = 9;
					pnlPerros.add(btnBorrarDatos, gbc_btnBorrarDatos);
				}
				{
					lblLosCamposCon = new JLabel(MessagesRefugioIPOInter.getString("Menu.lblLosCamposCon.text")); //$NON-NLS-1$
					GridBagConstraints gbc_lblLosCamposCon = new GridBagConstraints();
					gbc_lblLosCamposCon.anchor = GridBagConstraints.WEST;
					gbc_lblLosCamposCon.gridwidth = 4;
					gbc_lblLosCamposCon.insets = new Insets(0, 0, 5, 5);
					gbc_lblLosCamposCon.gridx = 4;
					gbc_lblLosCamposCon.gridy = 9;
					pnlPerros.add(lblLosCamposCon, gbc_lblLosCamposCon);
				}
				{
					btnModificarDueño = new JButton(MessagesRefugioIPOInter.getString("Menu.btnModificarDue\u00F1o.text")); //$NON-NLS-1$
					btnModificarDueño.setEnabled(false);
					btnModificarDueño.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
					btnModificarDueño.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							if(textField_nombre.getText().trim().length()!=0 && textField_raza.getText().trim().length()!=0 && textField_edad.getText().trim().length()!=0){
								boolean vacunado=false;
								boolean chip=false;
								boolean enfermedad=false;
								boolean socPerros=false;
								boolean socGatos=false;
								boolean socNiños=false;
								if(checkBox_vacunado.isSelected()){
									vacunado=true;
								}
								if(checkBox_chip.isSelected()){
									chip=true;
									
								}
								if(checkBox_enfermedad.isSelected()){
									enfermedad=true;
								}
								if(chckbxConPerros.isSelected()){
									socPerros=true;
								}
								
								if(chckbxConGatos.isSelected()){
									socGatos=true;
									
								}
								if(chckbxConNios.isSelected()){
									socNiños=true;
								}
								
								Perro p= new Perro(textField_nombre.getText(), (String)comboBoxSexo.getSelectedItem(), textField_raza.getText(), textField_edad.getText(), vacunado, chip,
												
										enfermedad,  
										socPerros,
										socGatos,
										socNiños,
										textField_chip.getText(), 
										textField_Enfermedad.getText(),
										(String)comboBox_estado.getSelectedItem(),
										lblFotoPerro.getIcon().toString());
								
								
								//añadir a la bbdd
								try{
									p.modificarPerro(id, p);
									
									JOptionPane.showMessageDialog(frame, "Perro modificado correctamente");
									textField_nombre.setText("");
									comboBoxSexo.setSelectedItem("hembra");
									textField_raza.setText("");
									textField_edad.setText("");
									textField_chip.setText("");
									textField_Enfermedad.setText("");
									lblFotoPerro.setIcon(new ImageIcon(Menu.class.getResource("/presentacion/usuarioPerro.jpg")));
									checkBox_chip.setSelected(false);
									checkBox_vacunado.setSelected(false);
									checkBox_enfermedad.setSelected(false);
									chckbxConPerros.setSelected(false);
									chckbxConGatos.setSelected(false);
									chckbxConNios.setSelected(false);
									comboBox_estado.setSelectedItem("Disponible");
									
								}catch(Exception ex){
									ex.printStackTrace();
									JOptionPane.showMessageDialog(frame, "Error al modificar");
								}
								
								
								
							}else{
								 JOptionPane.showMessageDialog(frame, "Debe rellenar todos los campos obligatorios");
							}
							
							
						}
					});
					btnModificarDueño.setIcon(new ImageIcon(Menu.class.getResource("/presentacion/modificar.png")));
					GridBagConstraints gbc_btnModificar = new GridBagConstraints();
					gbc_btnModificar.fill = GridBagConstraints.HORIZONTAL;
					gbc_btnModificar.insets = new Insets(0, 0, 5, 5);
					gbc_btnModificar.gridx = 1;
					gbc_btnModificar.gridy = 10;
					pnlPerros.add(btnModificarDueño, gbc_btnModificar);
				}
				{
					btnAadir = new JButton(MessagesRefugioIPOInter.getString("Menu.btnAadir.text")); //$NON-NLS-1$
					btnAadir.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
					btnAadir.setIcon(new ImageIcon(Menu.class.getResource("/presentacion/guardar.png")));
					btnAadir.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							if(textField_nombre.getText().trim().length()!=0 && textField_raza.getText().trim().length()!=0 && textField_edad.getText().trim().length()!=0){
								boolean vacunado=false;
								boolean chip=false;
								boolean enfermedad=false;
								boolean socPerros=false;
								boolean socGatos=false;
								boolean socNiños=false;
								if(checkBox_vacunado.isSelected()){
									vacunado=true;
								}
								if(checkBox_chip.isSelected()){
									chip=true;
									
								}
								if(checkBox_enfermedad.isSelected()){
									enfermedad=true;
								}
								if(chckbxConPerros.isSelected()){
									socPerros=true;
								}
								
								if(chckbxConGatos.isSelected()){
									socGatos=true;
									
								}
								if(chckbxConNios.isSelected()){
									socNiños=true;
								}
								
								Perro p= new Perro(textField_nombre.getText(), (String)comboBoxSexo.getSelectedItem(), textField_raza.getText(), textField_edad.getText(), vacunado, chip,
												
										enfermedad,  
										socPerros,
										socGatos,
										socNiños,
										textField_chip.getText(), 
										textField_Enfermedad.getText(),
										(String)comboBox_estado.getSelectedItem(),
										lblFotoPerro.getIcon().toString());
								
								textField_nombre.setText("");
								comboBoxSexo.setSelectedItem("hembra");
								textField_raza.setText("");
								textField_edad.setText("");
								textField_chip.setText("");
								textField_Enfermedad.setText("");
								lblFotoPerro.setIcon(new ImageIcon(Menu.class.getResource("/presentacion/usuarioPerro.jpg")));
								checkBox_chip.setSelected(false);
								checkBox_vacunado.setSelected(false);
								checkBox_enfermedad.setSelected(false);
								chckbxConPerros.setSelected(false);
								chckbxConGatos.setSelected(false);
								chckbxConNios.setSelected(false);
								comboBox_estado.setSelectedItem("Disponible");
								
								//añadir a la bbdd
								try{
									p.insertarPerro(p);
									JOptionPane.showMessageDialog(frame, "Perro guardado correctamente");
								}catch(Exception ex){
									ex.printStackTrace();
									JOptionPane.showMessageDialog(frame, "Error al añadir el perro");
								}
								
								
								
							}else{
								 JOptionPane.showMessageDialog(frame, "Debe rellenar todos los campos obligatorios");
							}
							
						}
					});
					GridBagConstraints gbc_btnAadir = new GridBagConstraints();
					gbc_btnAadir.fill = GridBagConstraints.HORIZONTAL;
					gbc_btnAadir.insets = new Insets(0, 0, 5, 5);
					gbc_btnAadir.gridx = 2;
					gbc_btnAadir.gridy = 10;
					pnlPerros.add(btnAadir, gbc_btnAadir);
				}
			}
			pnlVoluntarios = new JPanel();
			tabbedPane.addTab("Voluntarios", new ImageIcon(Menu.class.getResource("/presentacion/voluntario.png")), pnlVoluntarios, null);
			GridBagLayout gbl_pnlVoluntarios = new GridBagLayout();
			gbl_pnlVoluntarios.columnWidths = new int[]{40, 149, 0, 13, 0, 150, 25, 95, 200, 15, 67, 20, 40, 0};
			gbl_pnlVoluntarios.rowHeights = new int[]{31, 35, 0, 64, 0, 0, 0, 30, 30, 30, 30, 0};
			gbl_pnlVoluntarios.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
			gbl_pnlVoluntarios.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 1.0, 1.0, 1.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
			pnlVoluntarios.setLayout(gbl_pnlVoluntarios);
			{
				btnListarVoluntarios = new JButton(MessagesRefugioIPOInter.getString("Menu.btnListarVoluntarios.text")); //$NON-NLS-1$
				btnListarVoluntarios.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				btnListarVoluntarios.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						try{
							modeloLista3.clear();
							GestorVoluntario g1=new GestorVoluntario();
							String[] datosLista= g1.read();
							if(datosLista.length!=0){
								for(int i=0; i<datosLista.length; i++){
									 modeloLista3.addElement(datosLista[i]);//nombre es el campo de la base de datos
								}
							           
							    list_2.setModel(modeloLista3);
							}
							else{
								JOptionPane.showMessageDialog(frame, "No hay ningún voluntario en la BBDD");
							}
							
						}catch(Exception ex1){
							ex1.printStackTrace();
						}
						
					}
				});
				GridBagConstraints gbc_btnListarVoluntarios = new GridBagConstraints();
				gbc_btnListarVoluntarios.fill = GridBagConstraints.BOTH;
				gbc_btnListarVoluntarios.insets = new Insets(0, 0, 5, 5);
				gbc_btnListarVoluntarios.gridx = 1;
				gbc_btnListarVoluntarios.gridy = 1;
				pnlVoluntarios.add(btnListarVoluntarios, gbc_btnListarVoluntarios);
			}
			{
				lblDatosPersonales = new JLabel(MessagesRefugioIPOInter.getString("Menu.lblDatosPersonales.text")); //$NON-NLS-1$
				lblDatosPersonales.setFont(new Font("Tahoma", Font.PLAIN, 16));
				GridBagConstraints gbc_lblDatosPersonales = new GridBagConstraints();
				gbc_lblDatosPersonales.anchor = GridBagConstraints.NORTH;
				gbc_lblDatosPersonales.gridwidth = 4;
				gbc_lblDatosPersonales.insets = new Insets(0, 0, 5, 5);
				gbc_lblDatosPersonales.gridx = 4;
				gbc_lblDatosPersonales.gridy = 1;
				pnlVoluntarios.add(lblDatosPersonales, gbc_lblDatosPersonales);
			}
			{
				scrollPane_6 = new JScrollPane();
				scrollPane_6.setBorder(new TitledBorder(null, MessagesRefugioIPOInter.getString("Menu.scrollPane_6.borderTitle"), TitledBorder.LEADING, TitledBorder.TOP, null, null)); //$NON-NLS-1$
				scrollPane_6.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
				GridBagConstraints gbc_scrollPane_6 = new GridBagConstraints();
				gbc_scrollPane_6.gridheight = 5;
				gbc_scrollPane_6.gridwidth = 2;
				gbc_scrollPane_6.insets = new Insets(0, 0, 5, 5);
				gbc_scrollPane_6.fill = GridBagConstraints.BOTH;
				gbc_scrollPane_6.gridx = 1;
				gbc_scrollPane_6.gridy = 2;
				pnlVoluntarios.add(scrollPane_6, gbc_scrollPane_6);
				{
					list_2 = new JList();
					list_2.addMouseListener(new MouseAdapter() {
						@Override
						public void mouseClicked(MouseEvent arg0) {
							
							String voluntario= list_2.getSelectedValue().toString();
							
							dni="";
							
							dni=voluntario.substring(1,11);
							
							btnEliminarVoluntario.setEnabled(true);
							btnModificarVoluntario.setEnabled(true);
							
							GestorVoluntario g= new GestorVoluntario();
							try {
								Voluntario v=g.readOne(dni);
								
								txtNombreVoluntario.setText(v.getNombre());
								txtApellidosVoluntario.setText(v.getApellidos());
								formattedTextField_DniVoluntario.setText(v.getDni());
								lblFotoVoluntario.setIcon(new ImageIcon(v.getFoto()));
								txtCiudadVoluntario.setText(v.getCiudad());
								textdireccionVoluntario.setText(v.getDireccion());
								txtProvinciaVoluntario.setText(v.getProvincia());
								formattedTextField_TelefVoluntario.setText(v.getTelefono());
								txtCorreoVoluntario.setText(v.getCorreo());
								formattedTextField_fechaVoluntario.setText(v.getNacimiento());
								
							} catch (Exception e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							
						}
					});
					scrollPane_6.setViewportView(list_2);
				}
			}
			{
				lblNombre_1 = new JLabel(MessagesRefugioIPOInter.getString("Menu.lblNombre_1.text")); //$NON-NLS-1$
				GridBagConstraints gbc_lblNombre_1 = new GridBagConstraints();
				gbc_lblNombre_1.fill = GridBagConstraints.VERTICAL;
				gbc_lblNombre_1.anchor = GridBagConstraints.WEST;
				gbc_lblNombre_1.insets = new Insets(0, 0, 5, 5);
				gbc_lblNombre_1.gridx = 4;
				gbc_lblNombre_1.gridy = 2;
				pnlVoluntarios.add(lblNombre_1, gbc_lblNombre_1);
			}
			{
				txtNombreVoluntario = new JTextField();
				txtNombreVoluntario.addKeyListener(new KeyAdapter() {
					@Override
					public void keyTyped(KeyEvent arg0) {
						
						   char c=arg0.getKeyChar(); 
				            
					          if(Character.isDigit(c)) { 
					               
					              arg0.consume(); 
					              JOptionPane.showMessageDialog(null, "Se admiten sólo letras");  
					          } 
						
					}
				});
				
				GridBagConstraints gbc_txtNombreVoluntario = new GridBagConstraints();
				gbc_txtNombreVoluntario.insets = new Insets(0, 0, 5, 5);
				gbc_txtNombreVoluntario.fill = GridBagConstraints.HORIZONTAL;
				gbc_txtNombreVoluntario.gridx = 5;
				gbc_txtNombreVoluntario.gridy = 2;
				pnlVoluntarios.add(txtNombreVoluntario, gbc_txtNombreVoluntario);
				txtNombreVoluntario.setColumns(10);
			}
			{
				label_15 = new JLabel("*");
				GridBagConstraints gbc_label_15 = new GridBagConstraints();
				gbc_label_15.fill = GridBagConstraints.VERTICAL;
				gbc_label_15.anchor = GridBagConstraints.WEST;
				gbc_label_15.insets = new Insets(0, 0, 5, 5);
				gbc_label_15.gridx = 6;
				gbc_label_15.gridy = 2;
				pnlVoluntarios.add(label_15, gbc_label_15);
			}
			{
				lblDireccionVoluntario = new JLabel(MessagesRefugioIPOInter.getString("Menu.lblDireccionVoluntario.text")); //$NON-NLS-1$
				GridBagConstraints gbc_lblDireccionVoluntario = new GridBagConstraints();
				gbc_lblDireccionVoluntario.fill = GridBagConstraints.BOTH;
				gbc_lblDireccionVoluntario.insets = new Insets(0, 0, 5, 5);
				gbc_lblDireccionVoluntario.gridx = 7;
				gbc_lblDireccionVoluntario.gridy = 2;
				pnlVoluntarios.add(lblDireccionVoluntario, gbc_lblDireccionVoluntario);
			}
			{
				textdireccionVoluntario = new JTextField();
				GridBagConstraints gbc_textdireccionVoluntario = new GridBagConstraints();
				gbc_textdireccionVoluntario.insets = new Insets(0, 0, 5, 5);
				gbc_textdireccionVoluntario.fill = GridBagConstraints.HORIZONTAL;
				gbc_textdireccionVoluntario.gridx = 8;
				gbc_textdireccionVoluntario.gridy = 2;
				pnlVoluntarios.add(textdireccionVoluntario, gbc_textdireccionVoluntario);
				textdireccionVoluntario.setColumns(10);
			}
			{
				scrollPane_3 = new JScrollPane();
				GridBagConstraints gbc_scrollPane_3 = new GridBagConstraints();
				gbc_scrollPane_3.gridheight = 2;
				gbc_scrollPane_3.gridwidth = 2;
				gbc_scrollPane_3.insets = new Insets(0, 0, 5, 5);
				gbc_scrollPane_3.fill = GridBagConstraints.BOTH;
				gbc_scrollPane_3.gridx = 10;
				gbc_scrollPane_3.gridy = 1;
				pnlVoluntarios.add(scrollPane_3, gbc_scrollPane_3);
				{
					lblFotoVoluntario = new JLabel(MessagesRefugioIPOInter.getString("Menu.lblFotoVoluntario.text")); //$NON-NLS-1$
					lblFotoVoluntario.setIcon(new ImageIcon(Menu.class.getResource("/presentacion/Usuario1.png")));
					scrollPane_3.setViewportView(lblFotoVoluntario);
				}
			}
			{
				lblApellidosVoluntario = new JLabel(MessagesRefugioIPOInter.getString("Menu.lblApellidosVoluntario.text")); //$NON-NLS-1$
				GridBagConstraints gbc_lblApellidosVoluntario = new GridBagConstraints();
				gbc_lblApellidosVoluntario.anchor = GridBagConstraints.WEST;
				gbc_lblApellidosVoluntario.insets = new Insets(0, 0, 5, 5);
				gbc_lblApellidosVoluntario.gridx = 4;
				gbc_lblApellidosVoluntario.gridy = 3;
				pnlVoluntarios.add(lblApellidosVoluntario, gbc_lblApellidosVoluntario);
			}
			{
				txtApellidosVoluntario = new JTextField();
				txtApellidosVoluntario.addKeyListener(new KeyAdapter() {
					@Override
					public void keyTyped(KeyEvent arg0) {
						char c=arg0.getKeyChar(); 
			            
				          if(Character.isDigit(c)) { 
				               
				              arg0.consume(); 
				              JOptionPane.showMessageDialog(null, "Se admiten sólo letras");  
				          } 
					}
				});
				GridBagConstraints gbc_txtApellidosVoluntario = new GridBagConstraints();
				gbc_txtApellidosVoluntario.insets = new Insets(0, 0, 5, 5);
				gbc_txtApellidosVoluntario.fill = GridBagConstraints.HORIZONTAL;
				gbc_txtApellidosVoluntario.gridx = 5;
				gbc_txtApellidosVoluntario.gridy = 3;
				pnlVoluntarios.add(txtApellidosVoluntario, gbc_txtApellidosVoluntario);
				txtApellidosVoluntario.setColumns(10);
			}
			{
				label_16 = new JLabel("*");
				GridBagConstraints gbc_label_16 = new GridBagConstraints();
				gbc_label_16.anchor = GridBagConstraints.WEST;
				gbc_label_16.insets = new Insets(0, 0, 5, 5);
				gbc_label_16.gridx = 6;
				gbc_label_16.gridy = 3;
				pnlVoluntarios.add(label_16, gbc_label_16);
			}
			{
				lblCiudadVoluntario = new JLabel(MessagesRefugioIPOInter.getString("Menu.lblCiudadVoluntario.text")); //$NON-NLS-1$
				GridBagConstraints gbc_lblCiudadVoluntario = new GridBagConstraints();
				gbc_lblCiudadVoluntario.fill = GridBagConstraints.HORIZONTAL;
				gbc_lblCiudadVoluntario.insets = new Insets(0, 0, 5, 5);
				gbc_lblCiudadVoluntario.gridx = 7;
				gbc_lblCiudadVoluntario.gridy = 3;
				pnlVoluntarios.add(lblCiudadVoluntario, gbc_lblCiudadVoluntario);
			}
			{
				txtCiudadVoluntario = new JTextField();
				txtCiudadVoluntario.addKeyListener(new KeyAdapter() {
					@Override
					public void keyTyped(KeyEvent arg0) {
						char c=arg0.getKeyChar(); 
			            
				          if(Character.isDigit(c)) { 
				               
				              arg0.consume(); 
				              JOptionPane.showMessageDialog(null, "Se admiten sólo letras");  
				          } 
					}
				});
				GridBagConstraints gbc_txtCiudadVoluntario = new GridBagConstraints();
				gbc_txtCiudadVoluntario.insets = new Insets(0, 0, 5, 5);
				gbc_txtCiudadVoluntario.fill = GridBagConstraints.HORIZONTAL;
				gbc_txtCiudadVoluntario.gridx = 8;
				gbc_txtCiudadVoluntario.gridy = 3;
				pnlVoluntarios.add(txtCiudadVoluntario, gbc_txtCiudadVoluntario);
				txtCiudadVoluntario.setColumns(10);
			}
			{
				btnCambiarFoto = new JButton(MessagesRefugioIPOInter.getString("Menu.btnCambiarFoto.text")); //$NON-NLS-1$
				btnCambiarFoto.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				btnCambiarFoto.setIcon(new ImageIcon(Menu.class.getResource("/presentacion/cargarFoto.png")));
				btnCambiarFoto.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						JFileChooser fcAbrir = new JFileChooser();
						fcAbrir.setFileFilter(new ImageFilter());
						int valorDevuelto = fcAbrir.showOpenDialog(frame);
						//Recoger el nombre del fichero seleccionado por el usuario
						if (valorDevuelto == JFileChooser.APPROVE_OPTION) {
							File file = fcAbrir.getSelectedFile();
							//En este punto la aplicación se debería encargar de realizar la operación sobre el fichero
							
							lblFotoVoluntario.setIcon(new ImageIcon(file.getAbsolutePath()));
						}
					}
				});
				GridBagConstraints gbc_btnCambiarFoto = new GridBagConstraints();
				gbc_btnCambiarFoto.fill = GridBagConstraints.HORIZONTAL;
				gbc_btnCambiarFoto.gridwidth = 2;
				gbc_btnCambiarFoto.insets = new Insets(0, 0, 5, 5);
				gbc_btnCambiarFoto.gridx = 10;
				gbc_btnCambiarFoto.gridy = 3;
				pnlVoluntarios.add(btnCambiarFoto, gbc_btnCambiarFoto);
			}
			{
				lblDniVoluntario = new JLabel(MessagesRefugioIPOInter.getString("Menu.lblDniVoluntario.text")); //$NON-NLS-1$
				GridBagConstraints gbc_lblDniVoluntario = new GridBagConstraints();
				gbc_lblDniVoluntario.anchor = GridBagConstraints.WEST;
				gbc_lblDniVoluntario.insets = new Insets(0, 0, 5, 5);
				gbc_lblDniVoluntario.gridx = 4;
				gbc_lblDniVoluntario.gridy = 4;
				pnlVoluntarios.add(lblDniVoluntario, gbc_lblDniVoluntario);
			}
			
			
			{
				
				MaskFormatter formatoDNI;
				try {
					formatoDNI = new MaskFormatter("########'-U");
					
					formattedTextField_DniVoluntario = new JFormattedTextField(formatoDNI);
					formattedTextField_DniVoluntario.setToolTipText(MessagesRefugioIPOInter.getString("Menu.formattedTextField_DniVoluntario.toolTipText")); //$NON-NLS-1$
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				formattedTextField_DniVoluntario.addFocusListener(new MiFocusListener());
				
				
				
				GridBagConstraints gbc_formattedTextField_DniVoluntario = new GridBagConstraints();
				gbc_formattedTextField_DniVoluntario.insets = new Insets(0, 0, 5, 5);
				gbc_formattedTextField_DniVoluntario.fill = GridBagConstraints.HORIZONTAL;
				gbc_formattedTextField_DniVoluntario.gridx = 5;
				gbc_formattedTextField_DniVoluntario.gridy = 4;
				pnlVoluntarios.add(formattedTextField_DniVoluntario, gbc_formattedTextField_DniVoluntario);
			}
			{
				label_17 = new JLabel("*");
				GridBagConstraints gbc_label_17 = new GridBagConstraints();
				gbc_label_17.anchor = GridBagConstraints.WEST;
				gbc_label_17.insets = new Insets(0, 0, 5, 5);
				gbc_label_17.gridx = 6;
				gbc_label_17.gridy = 4;
				pnlVoluntarios.add(label_17, gbc_label_17);
			}
			{
				lblProvinciaVoluntario = new JLabel(MessagesRefugioIPOInter.getString("Menu.lblProvinciaVoluntario.text")); //$NON-NLS-1$
				GridBagConstraints gbc_lblProvinciaVoluntario = new GridBagConstraints();
				gbc_lblProvinciaVoluntario.fill = GridBagConstraints.HORIZONTAL;
				gbc_lblProvinciaVoluntario.insets = new Insets(0, 0, 5, 5);
				gbc_lblProvinciaVoluntario.gridx = 7;
				gbc_lblProvinciaVoluntario.gridy = 4;
				pnlVoluntarios.add(lblProvinciaVoluntario, gbc_lblProvinciaVoluntario);
			}
			{
				txtProvinciaVoluntario = new JTextField();
				txtProvinciaVoluntario.addKeyListener(new KeyAdapter() {
					@Override
					public void keyTyped(KeyEvent arg0) {
						char c=arg0.getKeyChar(); 
			            
				          if(Character.isDigit(c)) { 
				               
				              arg0.consume(); 
				              JOptionPane.showMessageDialog(null, "Se admiten sólo letras");  
				          } 
					}
				});
				GridBagConstraints gbc_txtProvinciaVoluntario = new GridBagConstraints();
				gbc_txtProvinciaVoluntario.insets = new Insets(0, 0, 5, 5);
				gbc_txtProvinciaVoluntario.fill = GridBagConstraints.HORIZONTAL;
				gbc_txtProvinciaVoluntario.gridx = 8;
				gbc_txtProvinciaVoluntario.gridy = 4;
				pnlVoluntarios.add(txtProvinciaVoluntario, gbc_txtProvinciaVoluntario);
				txtProvinciaVoluntario.setColumns(10);
			}
			{
				lblFechaVoluntario = new JLabel(MessagesRefugioIPOInter.getString("Menu.lblFechaVoluntario.text")); //$NON-NLS-1$
				GridBagConstraints gbc_lblFechaVoluntario = new GridBagConstraints();
				gbc_lblFechaVoluntario.anchor = GridBagConstraints.WEST;
				gbc_lblFechaVoluntario.insets = new Insets(0, 0, 5, 5);
				gbc_lblFechaVoluntario.gridx = 4;
				gbc_lblFechaVoluntario.gridy = 5;
				pnlVoluntarios.add(lblFechaVoluntario, gbc_lblFechaVoluntario);
			}
			{
				
				MaskFormatter formatoFecha;
				try {
					formatoFecha = new MaskFormatter(" ##'/ ##'/ ##");
					
					formattedTextField_fechaVoluntario = new JFormattedTextField(formatoFecha);
					formattedTextField_fechaVoluntario.setToolTipText("ej: 08/07/95");
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				formattedTextField_fechaVoluntario.addFocusListener(new MiFocusListener());
				
				
				GridBagConstraints gbc_formattedTextField_fechaVoluntario = new GridBagConstraints();
				gbc_formattedTextField_fechaVoluntario.insets = new Insets(0, 0, 5, 5);
				gbc_formattedTextField_fechaVoluntario.fill = GridBagConstraints.HORIZONTAL;
				gbc_formattedTextField_fechaVoluntario.gridx = 5;
				gbc_formattedTextField_fechaVoluntario.gridy = 5;
				pnlVoluntarios.add(formattedTextField_fechaVoluntario, gbc_formattedTextField_fechaVoluntario);
			}
			
			
			
			{
				lblCorreoVoluntario = new JLabel(MessagesRefugioIPOInter.getString("Menu.lblCorreoVoluntario.text")); //$NON-NLS-1$
				GridBagConstraints gbc_lblCorreoVoluntario = new GridBagConstraints();
				gbc_lblCorreoVoluntario.fill = GridBagConstraints.HORIZONTAL;
				gbc_lblCorreoVoluntario.insets = new Insets(0, 0, 5, 5);
				gbc_lblCorreoVoluntario.gridx = 7;
				gbc_lblCorreoVoluntario.gridy = 5;
				pnlVoluntarios.add(lblCorreoVoluntario, gbc_lblCorreoVoluntario);
			}
			{
				txtCorreoVoluntario = new JTextField();
				txtCorreoVoluntario.setToolTipText("ej: ...........@hotmail.com");
				GridBagConstraints gbc_txtCorreoVoluntario = new GridBagConstraints();
				gbc_txtCorreoVoluntario.insets = new Insets(0, 0, 5, 5);
				gbc_txtCorreoVoluntario.fill = GridBagConstraints.HORIZONTAL;
				gbc_txtCorreoVoluntario.gridx = 8;
				gbc_txtCorreoVoluntario.gridy = 5;
				pnlVoluntarios.add(txtCorreoVoluntario, gbc_txtCorreoVoluntario);
				txtCorreoVoluntario.setColumns(10);
			}
			{
				lblTelfonoVoluntario = new JLabel(MessagesRefugioIPOInter.getString("Menu.lblTelfonoVoluntario.text")); //$NON-NLS-1$
				GridBagConstraints gbc_lblTelfonoVoluntario = new GridBagConstraints();
				gbc_lblTelfonoVoluntario.anchor = GridBagConstraints.WEST;
				gbc_lblTelfonoVoluntario.insets = new Insets(0, 0, 5, 5);
				gbc_lblTelfonoVoluntario.gridx = 4;
				gbc_lblTelfonoVoluntario.gridy = 6;
				pnlVoluntarios.add(lblTelfonoVoluntario, gbc_lblTelfonoVoluntario);
			}
			{
				
				MaskFormatter formatoTlfno;
				try {
					formatoTlfno = new MaskFormatter(" ###' ###' ###");
					
					formattedTextField_TelefVoluntario = new JFormattedTextField(formatoTlfno);
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				formattedTextField_TelefVoluntario.addFocusListener(new MiFocusListener());
				
				
				GridBagConstraints gbc_formattedTextField_TelefVoluntario = new GridBagConstraints();
				gbc_formattedTextField_TelefVoluntario.insets = new Insets(0, 0, 5, 5);
				gbc_formattedTextField_TelefVoluntario.fill = GridBagConstraints.HORIZONTAL;
				gbc_formattedTextField_TelefVoluntario.gridx = 5;
				gbc_formattedTextField_TelefVoluntario.gridy = 6;
				pnlVoluntarios.add(formattedTextField_TelefVoluntario, gbc_formattedTextField_TelefVoluntario);
			}
			{
				label_18 = new JLabel("*");
				GridBagConstraints gbc_label_18 = new GridBagConstraints();
				gbc_label_18.anchor = GridBagConstraints.WEST;
				gbc_label_18.insets = new Insets(0, 0, 5, 5);
				gbc_label_18.gridx = 6;
				gbc_label_18.gridy = 6;
				pnlVoluntarios.add(label_18, gbc_label_18);
			}
			
			
			
			{
				btnEliminarVoluntario = new JButton(MessagesRefugioIPOInter.getString("Menu.btnEliminarVoluntario.text")); //$NON-NLS-1$
				btnEliminarVoluntario.setEnabled(false);
				btnEliminarVoluntario.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				btnEliminarVoluntario.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						GestorVoluntario g2=new GestorVoluntario();
						try {
							g2.delete(dni);
							
							txtNombreVoluntario.setText("");
							txtApellidosVoluntario.setText("");
							formattedTextField_DniVoluntario.setText("");
							lblFotoVoluntario.setIcon(new ImageIcon(Menu.class.getResource("/presentacion/Usuario1.png")));
							txtCiudadVoluntario.setText("");
							textdireccionVoluntario.setText("");
							txtProvinciaVoluntario.setText("");
							formattedTextField_TelefVoluntario.setText("");
							txtCorreoVoluntario.setText("");
							formattedTextField_fechaVoluntario.setText("");

							int index = list_2.getSelectedIndex(); 
							modeloLista3.remove(index); 
							JOptionPane.showMessageDialog(frame, "Voluntario eliminado");
						} catch (Exception e1) {
							// TODO Auto-generated catch block
							JOptionPane.showMessageDialog(frame, "Error al eliminar");
							e1.printStackTrace();
						}
						
					}
				});
				btnEliminarVoluntario.setIcon(new ImageIcon(Menu.class.getResource("/presentacion/cruz.png")));
				GridBagConstraints gbc_btnEliminarVoluntario = new GridBagConstraints();
				gbc_btnEliminarVoluntario.fill = GridBagConstraints.HORIZONTAL;
				gbc_btnEliminarVoluntario.insets = new Insets(0, 0, 5, 5);
				gbc_btnEliminarVoluntario.gridx = 1;
				gbc_btnEliminarVoluntario.gridy = 8;
				pnlVoluntarios.add(btnEliminarVoluntario, gbc_btnEliminarVoluntario);
			}
			{
				btnBorrarDatosVoluntario = new JButton(MessagesRefugioIPOInter.getString("Menu.btnBorrarDatosVoluntario.text")); //$NON-NLS-1$
				btnBorrarDatosVoluntario.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				btnBorrarDatosVoluntario.setIcon(new ImageIcon(Menu.class.getResource("/presentacion/borrar.png")));
				btnBorrarDatosVoluntario.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						txtNombreVoluntario.setText("");
						txtApellidosVoluntario.setText("");
						formattedTextField_DniVoluntario.setText("");
						lblFotoVoluntario.setIcon(new ImageIcon(Menu.class.getResource("/presentacion/Usuario1.png")));
						txtCiudadVoluntario.setText("");
						textdireccionVoluntario.setText("");
						txtProvinciaVoluntario.setText("");
						formattedTextField_TelefVoluntario.setText("");
						txtCorreoVoluntario.setText("");
						formattedTextField_fechaVoluntario.setText("");
						
					}
				});
				GridBagConstraints gbc_btnBorrarDatosVoluntario = new GridBagConstraints();
				gbc_btnBorrarDatosVoluntario.fill = GridBagConstraints.HORIZONTAL;
				gbc_btnBorrarDatosVoluntario.insets = new Insets(0, 0, 5, 5);
				gbc_btnBorrarDatosVoluntario.gridx = 2;
				gbc_btnBorrarDatosVoluntario.gridy = 8;
				pnlVoluntarios.add(btnBorrarDatosVoluntario, gbc_btnBorrarDatosVoluntario);
			}
			{
				lblCamposObligatorios = new JLabel(" * campos obligatorios de rellenar");
				GridBagConstraints gbc_lblCamposObligatorios = new GridBagConstraints();
				gbc_lblCamposObligatorios.anchor = GridBagConstraints.WEST;
				gbc_lblCamposObligatorios.gridwidth = 2;
				gbc_lblCamposObligatorios.insets = new Insets(0, 0, 5, 5);
				gbc_lblCamposObligatorios.gridx = 4;
				gbc_lblCamposObligatorios.gridy = 8;
				pnlVoluntarios.add(lblCamposObligatorios, gbc_lblCamposObligatorios);
			}
			{
				btnModificarVoluntario = new JButton(MessagesRefugioIPOInter.getString("Menu.btnModificarVoluntario.text")); //$NON-NLS-1$
				btnModificarVoluntario.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						
						if(txtNombreVoluntario.getText().trim().length()!=0 && txtApellidosVoluntario.getText().trim().length()!=0 && formattedTextField_DniVoluntario.getText().trim().length()!=0 && formattedTextField_TelefVoluntario.getText().trim().length()!=0){
							
							
							
							Voluntario v= new Voluntario(formattedTextField_DniVoluntario.getText().toString(), txtNombreVoluntario.getText(), txtApellidosVoluntario.getText(), 
									formattedTextField_fechaVoluntario.getText().toString(), formattedTextField_TelefVoluntario.getText().toString(), 
									textdireccionVoluntario.getText().toString(), txtCiudadVoluntario.getText(), txtProvinciaVoluntario.getText(), 
									txtCorreoVoluntario.getText(), lblFotoVoluntario.getIcon().toString());
							
							txtNombreVoluntario.setText("");
							txtApellidosVoluntario.setText("");
							formattedTextField_DniVoluntario.setText("");
							lblFotoVoluntario.setIcon(new ImageIcon(Menu.class.getResource("/presentacion/Usuario1.png")));
							txtCiudadVoluntario.setText("");
							textdireccionVoluntario.setText("");
							txtProvinciaVoluntario.setText("");
							formattedTextField_TelefVoluntario.setText("");
							txtCorreoVoluntario.setText("");
							formattedTextField_fechaVoluntario.setText("");
							
							
							
							try{
								v.modificarVoluntario(dni, v);
								JOptionPane.showMessageDialog(frame, "Voluntario modificado correctamente");
							}catch(Exception ex){
								ex.printStackTrace();
								JOptionPane.showMessageDialog(frame, "Error al modificar");
							}
							
							
							
						}else{
							 JOptionPane.showMessageDialog(frame, "Debe rellenar todos los campos obligatorios");
						}
						
						
					}
				});
				btnModificarVoluntario.setEnabled(false);
				btnModificarVoluntario.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				btnModificarVoluntario.setIcon(new ImageIcon(Menu.class.getResource("/presentacion/modificar.png")));
				GridBagConstraints gbc_btnModificarVoluntario = new GridBagConstraints();
				gbc_btnModificarVoluntario.fill = GridBagConstraints.HORIZONTAL;
				gbc_btnModificarVoluntario.insets = new Insets(0, 0, 5, 5);
				gbc_btnModificarVoluntario.gridx = 1;
				gbc_btnModificarVoluntario.gridy = 9;
				pnlVoluntarios.add(btnModificarVoluntario, gbc_btnModificarVoluntario);
			}
			{
				btnAñadirVoluntario = new JButton(MessagesRefugioIPOInter.getString("Menu.btnA\u00F1adirVoluntario.text")); //$NON-NLS-1$
				btnAñadirVoluntario.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				btnAñadirVoluntario.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						
						
						if(txtNombreVoluntario.getText().trim().length()!=0 && txtApellidosVoluntario.getText().trim().length()!=0 && formattedTextField_DniVoluntario.getText().trim().length()!=0 && formattedTextField_TelefVoluntario.getText().trim().length()!=0){
							
							
							
							Voluntario v= new Voluntario(formattedTextField_DniVoluntario.getText().toString(), txtNombreVoluntario.getText(), txtApellidosVoluntario.getText(), 
									formattedTextField_fechaVoluntario.getText().toString(), formattedTextField_TelefVoluntario.getText().toString(), 
									textdireccionVoluntario.getText().toString(), txtCiudadVoluntario.getText(), txtProvinciaVoluntario.getText(), 
									txtCorreoVoluntario.getText(), lblFotoVoluntario.getIcon().toString());
							txtNombreVoluntario.setText("");
							txtApellidosVoluntario.setText("");
							formattedTextField_DniVoluntario.setText("");
							lblFotoVoluntario.setIcon(new ImageIcon(Menu.class.getResource("/presentacion/Usuario1.png")));
							txtCiudadVoluntario.setText("");
							textdireccionVoluntario.setText("");
							txtProvinciaVoluntario.setText("");
							formattedTextField_TelefVoluntario.setText("");
							txtCorreoVoluntario.setText("");
							formattedTextField_fechaVoluntario.setText("");
							
							
							
							try{
								v.insertarVoluntario(v);
								JOptionPane.showMessageDialog(frame, "Voluntario guardado correctamente");
							}catch(Exception ex){
								ex.printStackTrace();
								JOptionPane.showMessageDialog(frame, "Error al añadir Voluntario");
							}
							
							
							
						}else{
							 JOptionPane.showMessageDialog(frame, "Debe rellenar todos los campos obligatorios");
						}
						
					}
				});
				btnAñadirVoluntario.setIcon(new ImageIcon(Menu.class.getResource("/presentacion/guardar.png")));
				GridBagConstraints gbc_btnAñadirVoluntario = new GridBagConstraints();
				gbc_btnAñadirVoluntario.fill = GridBagConstraints.HORIZONTAL;
				gbc_btnAñadirVoluntario.insets = new Insets(0, 0, 5, 5);
				gbc_btnAñadirVoluntario.gridx = 2;
				gbc_btnAñadirVoluntario.gridy = 9;
				pnlVoluntarios.add(btnAñadirVoluntario, gbc_btnAñadirVoluntario);
			}
			{
			pnlSocios = new JPanel();
			tabbedPane.addTab("Socios", new ImageIcon(Menu.class.getResource("/presentacion/socios.png")), pnlSocios, null);
			GridBagLayout gbl_pnlSocios = new GridBagLayout();
			gbl_pnlSocios.columnWidths = new int[]{80, 0, 0, 30, 0, 175, 30, 30, 175, 30, 54, 75, 80, 0};
			gbl_pnlSocios.rowHeights = new int[]{30, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
			gbl_pnlSocios.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
			gbl_pnlSocios.rowWeights = new double[]{0.0, 0.0, 1.0, 1.0, 1.0, 1.0, 1.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
			pnlSocios.setLayout(gbl_pnlSocios);
			{
				btnListarSocios = new JButton(MessagesRefugioIPOInter.getString("Menu.btnListarSocios.text")); //$NON-NLS-1$
				btnListarSocios.addActionListener(new BtnListarSociosActionListener());
				btnListarSocios.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				GridBagConstraints gbc_btnListarSocios = new GridBagConstraints();
				gbc_btnListarSocios.fill = GridBagConstraints.HORIZONTAL;
				gbc_btnListarSocios.insets = new Insets(0, 0, 5, 5);
				gbc_btnListarSocios.gridx = 1;
				gbc_btnListarSocios.gridy = 1;
				pnlSocios.add(btnListarSocios, gbc_btnListarSocios);
			}
			{
				lblDatosPersonales_1 = new JLabel(MessagesRefugioIPOInter.getString("Menu.lblDatosPersonales_1.text")); //$NON-NLS-1$
				lblDatosPersonales_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
				GridBagConstraints gbc_lblDatosPersonales_1 = new GridBagConstraints();
				gbc_lblDatosPersonales_1.anchor = GridBagConstraints.SOUTHWEST;
				gbc_lblDatosPersonales_1.insets = new Insets(0, 0, 5, 5);
				gbc_lblDatosPersonales_1.gridx = 5;
				gbc_lblDatosPersonales_1.gridy = 1;
				pnlSocios.add(lblDatosPersonales_1, gbc_lblDatosPersonales_1);
			}
			{
				scrollPane_4 = new JScrollPane();
				GridBagConstraints gbc_scrollPane_4 = new GridBagConstraints();
				gbc_scrollPane_4.gridheight = 2;
				gbc_scrollPane_4.gridwidth = 2;
				gbc_scrollPane_4.insets = new Insets(0, 0, 5, 5);
				gbc_scrollPane_4.fill = GridBagConstraints.BOTH;
				gbc_scrollPane_4.gridx = 10;
				gbc_scrollPane_4.gridy = 1;
				pnlSocios.add(scrollPane_4, gbc_scrollPane_4);
				{
					lblFotoSocio = new JLabel("");
					scrollPane_4.setViewportView(lblFotoSocio);
					lblFotoSocio.setIcon(new ImageIcon(Menu.class.getResource("/presentacion/Usuario1.png")));
				}
			}
			{
				scrollPane_7 = new JScrollPane();
				scrollPane_7.setBorder(new TitledBorder(null, MessagesRefugioIPOInter.getString("Menu.scrollPane_7.borderTitle"), TitledBorder.LEADING, TitledBorder.TOP, null, null)); //$NON-NLS-1$
				scrollPane_7.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
				GridBagConstraints gbc_scrollPane_7 = new GridBagConstraints();
				gbc_scrollPane_7.gridheight = 5;
				gbc_scrollPane_7.gridwidth = 2;
				gbc_scrollPane_7.insets = new Insets(0, 0, 5, 5);
				gbc_scrollPane_7.fill = GridBagConstraints.BOTH;
				gbc_scrollPane_7.gridx = 1;
				gbc_scrollPane_7.gridy = 2;
				pnlSocios.add(scrollPane_7, gbc_scrollPane_7);
				{
					list_4 = new JList();
					list_4.addMouseListener(new MouseAdapter() {
						@Override
						public void mouseClicked(MouseEvent arg0) {
							String socio= list_4.getSelectedValue().toString();
							
							dni="";
							
							dni=socio.substring(1,11);
							
							btnEliminarSocio.setEnabled(true);
							btnModificarSocio.setEnabled(true);
							
							GestorSocio g= new GestorSocio();
							try {
								Socio s=g.readOne(dni);
								
								txtNombreSocio.setText(s.getNombre());
								txtApellidosSocio.setText(s.getApellidos());
								formattedTextField_DniSocio.setText(s.getDni());
								lblFotoSocio.setIcon(new ImageIcon(s.getFoto()));
								txtCiudadSocio.setText(s.getCiudad());
								textdireccionSocio.setText(s.getDireccion());
								txtProvinciaSocio.setText(s.getProvincia());
								formattedTextField_TelefSocio.setText(s.getTelefono());
								txtCorreoSocio.setText(s.getCorreo());
								formattedTextField_FechaSocio.setText(s.getNacimiento());
								formattedTextField_cuenta.setText(s.getCuenta());
								comboBox_aportacionSocio.setSelectedItem(s.getCantidad());
								
							} catch (Exception e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							
							
							
							
						}
					});
					scrollPane_7.setViewportView(list_4);
				}
			}
			{
				lblNombre_2 = new JLabel(MessagesRefugioIPOInter.getString("Menu.lblNombre_2.text")); //$NON-NLS-1$
				GridBagConstraints gbc_lblNombre_2 = new GridBagConstraints();
				gbc_lblNombre_2.anchor = GridBagConstraints.WEST;
				gbc_lblNombre_2.insets = new Insets(0, 0, 5, 5);
				gbc_lblNombre_2.gridx = 4;
				gbc_lblNombre_2.gridy = 2;
				pnlSocios.add(lblNombre_2, gbc_lblNombre_2);
			}
			{
				txtNombreSocio = new JTextField();
				txtNombreSocio.setToolTipText(MessagesRefugioIPOInter.getString("Menu.txtNombreSocio.toolTipText")); //$NON-NLS-1$
				txtNombreSocio.addKeyListener(new KeyAdapter() {
					@Override
					public void keyTyped(KeyEvent arg0) {
						char c=arg0.getKeyChar(); 
			            
				          if(Character.isDigit(c)) { 
				               
				              arg0.consume(); 
				              JOptionPane.showMessageDialog(null, "Se admiten sólo letras");  
				          } 
					}
				});
				GridBagConstraints gbc_txtNombreSocio = new GridBagConstraints();
				gbc_txtNombreSocio.insets = new Insets(0, 0, 5, 5);
				gbc_txtNombreSocio.fill = GridBagConstraints.HORIZONTAL;
				gbc_txtNombreSocio.gridx = 5;
				gbc_txtNombreSocio.gridy = 2;
				pnlSocios.add(txtNombreSocio, gbc_txtNombreSocio);
				txtNombreSocio.setColumns(10);
			}
			{
				label_19 = new JLabel("*");
				GridBagConstraints gbc_label_19 = new GridBagConstraints();
				gbc_label_19.anchor = GridBagConstraints.WEST;
				gbc_label_19.insets = new Insets(0, 0, 5, 5);
				gbc_label_19.gridx = 6;
				gbc_label_19.gridy = 2;
				pnlSocios.add(label_19, gbc_label_19);
			}
			{
				lblDireccin_1 = new JLabel(MessagesRefugioIPOInter.getString("Menu.lblDireccin_1.text")); //$NON-NLS-1$
				GridBagConstraints gbc_lblDireccin_1 = new GridBagConstraints();
				gbc_lblDireccin_1.anchor = GridBagConstraints.WEST;
				gbc_lblDireccin_1.insets = new Insets(0, 0, 5, 5);
				gbc_lblDireccin_1.gridx = 7;
				gbc_lblDireccin_1.gridy = 2;
				pnlSocios.add(lblDireccin_1, gbc_lblDireccin_1);
			}
			{
				textdireccionSocio = new JTextField();
				GridBagConstraints gbc_textdireccionSocio = new GridBagConstraints();
				gbc_textdireccionSocio.insets = new Insets(0, 0, 5, 5);
				gbc_textdireccionSocio.fill = GridBagConstraints.HORIZONTAL;
				gbc_textdireccionSocio.gridx = 8;
				gbc_textdireccionSocio.gridy = 2;
				pnlSocios.add(textdireccionSocio, gbc_textdireccionSocio);
				textdireccionSocio.setColumns(10);
			}
			{
				lblApellidos_1 = new JLabel(MessagesRefugioIPOInter.getString("Menu.lblApellidos_1.text")); //$NON-NLS-1$
				GridBagConstraints gbc_lblApellidos_1 = new GridBagConstraints();
				gbc_lblApellidos_1.anchor = GridBagConstraints.WEST;
				gbc_lblApellidos_1.insets = new Insets(0, 0, 5, 5);
				gbc_lblApellidos_1.gridx = 4;
				gbc_lblApellidos_1.gridy = 3;
				pnlSocios.add(lblApellidos_1, gbc_lblApellidos_1);
			}
			{
				txtApellidosSocio = new JTextField();
				txtApellidosSocio.addKeyListener(new KeyAdapter() {
					@Override
					public void keyTyped(KeyEvent arg0) {
						char c=arg0.getKeyChar(); 
			            
				          if(Character.isDigit(c)) { 
				               
				              arg0.consume(); 
				              JOptionPane.showMessageDialog(null, "Se admiten sólo letras");  
				          } 
					}
				});
				GridBagConstraints gbc_txtApellidosSocio = new GridBagConstraints();
				gbc_txtApellidosSocio.insets = new Insets(0, 0, 5, 5);
				gbc_txtApellidosSocio.fill = GridBagConstraints.HORIZONTAL;
				gbc_txtApellidosSocio.gridx = 5;
				gbc_txtApellidosSocio.gridy = 3;
				pnlSocios.add(txtApellidosSocio, gbc_txtApellidosSocio);
				txtApellidosSocio.setColumns(10);
			}
			{
				label_20 = new JLabel("*");
				GridBagConstraints gbc_label_20 = new GridBagConstraints();
				gbc_label_20.anchor = GridBagConstraints.WEST;
				gbc_label_20.insets = new Insets(0, 0, 5, 5);
				gbc_label_20.gridx = 6;
				gbc_label_20.gridy = 3;
				pnlSocios.add(label_20, gbc_label_20);
			}
			{
				lblCiudad_1 = new JLabel(MessagesRefugioIPOInter.getString("Menu.lblCiudad_1.text")); //$NON-NLS-1$
				GridBagConstraints gbc_lblCiudad_1 = new GridBagConstraints();
				gbc_lblCiudad_1.anchor = GridBagConstraints.WEST;
				gbc_lblCiudad_1.insets = new Insets(0, 0, 5, 5);
				gbc_lblCiudad_1.gridx = 7;
				gbc_lblCiudad_1.gridy = 3;
				pnlSocios.add(lblCiudad_1, gbc_lblCiudad_1);
			}
			{
				txtCiudadSocio = new JTextField();
				txtCiudadSocio.addKeyListener(new KeyAdapter() {
					@Override
					public void keyTyped(KeyEvent arg0) {
						char c=arg0.getKeyChar(); 
			            
				          if(Character.isDigit(c)) { 
				               
				              arg0.consume(); 
				              JOptionPane.showMessageDialog(null, "Se admiten sólo letras");  
				          } 
					}
				});
				GridBagConstraints gbc_txtCiudadSocio = new GridBagConstraints();
				gbc_txtCiudadSocio.insets = new Insets(0, 0, 5, 5);
				gbc_txtCiudadSocio.fill = GridBagConstraints.HORIZONTAL;
				gbc_txtCiudadSocio.gridx = 8;
				gbc_txtCiudadSocio.gridy = 3;
				pnlSocios.add(txtCiudadSocio, gbc_txtCiudadSocio);
				txtCiudadSocio.setColumns(10);
			}
			{
				btnCambiarFoot = new JButton(MessagesRefugioIPOInter.getString("Menu.btnCambiarFoot.text")); //$NON-NLS-1$
				btnCambiarFoot.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				btnCambiarFoot.setIcon(new ImageIcon(Menu.class.getResource("/presentacion/cargarFoto.png")));
				btnCambiarFoot.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						JFileChooser fcAbrir = new JFileChooser();
						fcAbrir.setFileFilter(new ImageFilter());
						int valorDevuelto = fcAbrir.showOpenDialog(frame);
						//Recoger el nombre del fichero seleccionado por el usuario
						if (valorDevuelto == JFileChooser.APPROVE_OPTION) {
							File file = fcAbrir.getSelectedFile();
							//En este punto la aplicación se debería encargar de realizar la operación sobre el fichero
							
							lblFotoSocio.setIcon(new ImageIcon(file.getAbsolutePath()));
						}
					}
				});
				GridBagConstraints gbc_btnCambiarFoot = new GridBagConstraints();
				gbc_btnCambiarFoot.fill = GridBagConstraints.HORIZONTAL;
				gbc_btnCambiarFoot.gridwidth = 2;
				gbc_btnCambiarFoot.insets = new Insets(0, 0, 5, 5);
				gbc_btnCambiarFoot.gridx = 10;
				gbc_btnCambiarFoot.gridy = 3;
				pnlSocios.add(btnCambiarFoot, gbc_btnCambiarFoot);
			}
			{
				lblDni_1 = new JLabel(MessagesRefugioIPOInter.getString("Menu.lblDni_1.text")); //$NON-NLS-1$
				GridBagConstraints gbc_lblDni_1 = new GridBagConstraints();
				gbc_lblDni_1.anchor = GridBagConstraints.WEST;
				gbc_lblDni_1.insets = new Insets(0, 0, 5, 5);
				gbc_lblDni_1.gridx = 4;
				gbc_lblDni_1.gridy = 4;
				pnlSocios.add(lblDni_1, gbc_lblDni_1);
			}
			{
				
				
				MaskFormatter formatoDNI;
				try {
					formatoDNI = new MaskFormatter("########'-U");
					
					formattedTextField_DniSocio = new JFormattedTextField(formatoDNI);
					formattedTextField_DniSocio.setToolTipText(MessagesRefugioIPOInter.getString("Menu.formattedTextField_DniSocio.toolTipText")); //$NON-NLS-1$
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				formattedTextField_DniSocio.addFocusListener(new MiFocusListener());
				
		
				GridBagConstraints gbc_formattedTextField_DniSocio = new GridBagConstraints();
				gbc_formattedTextField_DniSocio.insets = new Insets(0, 0, 5, 5);
				gbc_formattedTextField_DniSocio.fill = GridBagConstraints.HORIZONTAL;
				gbc_formattedTextField_DniSocio.gridx = 5;
				gbc_formattedTextField_DniSocio.gridy = 4;
				pnlSocios.add(formattedTextField_DniSocio, gbc_formattedTextField_DniSocio);
			}
			{
				label_21 = new JLabel("*");
				GridBagConstraints gbc_label_21 = new GridBagConstraints();
				gbc_label_21.anchor = GridBagConstraints.WEST;
				gbc_label_21.insets = new Insets(0, 0, 5, 5);
				gbc_label_21.gridx = 6;
				gbc_label_21.gridy = 4;
				pnlSocios.add(label_21, gbc_label_21);
			}
			{
				lblProvincia_1 = new JLabel(MessagesRefugioIPOInter.getString("Menu.lblProvincia_1.text")); //$NON-NLS-1$
				GridBagConstraints gbc_lblProvincia_1 = new GridBagConstraints();
				gbc_lblProvincia_1.anchor = GridBagConstraints.WEST;
				gbc_lblProvincia_1.insets = new Insets(0, 0, 5, 5);
				gbc_lblProvincia_1.gridx = 7;
				gbc_lblProvincia_1.gridy = 4;
				pnlSocios.add(lblProvincia_1, gbc_lblProvincia_1);
			}
			{
				txtProvinciaSocio = new JTextField();
				txtProvinciaSocio.addKeyListener(new KeyAdapter() {
					@Override
					public void keyTyped(KeyEvent arg0) {
						char c=arg0.getKeyChar(); 
			            
				          if(Character.isDigit(c)) { 
				               
				              arg0.consume(); 
				              JOptionPane.showMessageDialog(null, "Se admiten sólo letras");  
				          } 
					}
				});
				GridBagConstraints gbc_txtProvinciaSocio = new GridBagConstraints();
				gbc_txtProvinciaSocio.insets = new Insets(0, 0, 5, 5);
				gbc_txtProvinciaSocio.fill = GridBagConstraints.HORIZONTAL;
				gbc_txtProvinciaSocio.gridx = 8;
				gbc_txtProvinciaSocio.gridy = 4;
				pnlSocios.add(txtProvinciaSocio, gbc_txtProvinciaSocio);
				txtProvinciaSocio.setColumns(10);
			}
			{
				lblFechaNacimiento_1 = new JLabel(MessagesRefugioIPOInter.getString("Menu.lblFechaNacimiento_1.text")); //$NON-NLS-1$
				GridBagConstraints gbc_lblFechaNacimiento_1 = new GridBagConstraints();
				gbc_lblFechaNacimiento_1.anchor = GridBagConstraints.WEST;
				gbc_lblFechaNacimiento_1.insets = new Insets(0, 0, 5, 5);
				gbc_lblFechaNacimiento_1.gridx = 4;
				gbc_lblFechaNacimiento_1.gridy = 5;
				pnlSocios.add(lblFechaNacimiento_1, gbc_lblFechaNacimiento_1);
			}
			{
				
				MaskFormatter formatoFecha;
				try {
					formatoFecha = new MaskFormatter(" ##'/ ##'/ ##");
					
					formattedTextField_FechaSocio = new JFormattedTextField(formatoFecha);
					formattedTextField_FechaSocio.setToolTipText("ej: 09/12/89");
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				formattedTextField_FechaSocio.addFocusListener(new MiFocusListener());
				
				
				GridBagConstraints gbc_formattedTextField_FechaSocio = new GridBagConstraints();
				gbc_formattedTextField_FechaSocio.insets = new Insets(0, 0, 5, 5);
				gbc_formattedTextField_FechaSocio.fill = GridBagConstraints.HORIZONTAL;
				gbc_formattedTextField_FechaSocio.gridx = 5;
				gbc_formattedTextField_FechaSocio.gridy = 5;
				pnlSocios.add(formattedTextField_FechaSocio, gbc_formattedTextField_FechaSocio);
			}
			{
				lblCorreoElectrnico_1 = new JLabel(MessagesRefugioIPOInter.getString("Menu.lblCorreoElectrnico_1.text")); //$NON-NLS-1$
				GridBagConstraints gbc_lblCorreoElectrnico_1 = new GridBagConstraints();
				gbc_lblCorreoElectrnico_1.anchor = GridBagConstraints.WEST;
				gbc_lblCorreoElectrnico_1.insets = new Insets(0, 0, 5, 5);
				gbc_lblCorreoElectrnico_1.gridx = 7;
				gbc_lblCorreoElectrnico_1.gridy = 5;
				pnlSocios.add(lblCorreoElectrnico_1, gbc_lblCorreoElectrnico_1);
			}
			{
				txtCorreoSocio = new JTextField();
				txtCorreoSocio.setToolTipText("ej:...................@gmail.es");
				GridBagConstraints gbc_txtCorreoSocio = new GridBagConstraints();
				gbc_txtCorreoSocio.insets = new Insets(0, 0, 5, 5);
				gbc_txtCorreoSocio.fill = GridBagConstraints.HORIZONTAL;
				gbc_txtCorreoSocio.gridx = 8;
				gbc_txtCorreoSocio.gridy = 5;
				pnlSocios.add(txtCorreoSocio, gbc_txtCorreoSocio);
				txtCorreoSocio.setColumns(10);
			}
			{
				lblTelfono_1 = new JLabel(MessagesRefugioIPOInter.getString("Menu.lblTelfono_1.text")); //$NON-NLS-1$
				GridBagConstraints gbc_lblTelfono_1 = new GridBagConstraints();
				gbc_lblTelfono_1.anchor = GridBagConstraints.WEST;
				gbc_lblTelfono_1.insets = new Insets(0, 0, 5, 5);
				gbc_lblTelfono_1.gridx = 4;
				gbc_lblTelfono_1.gridy = 6;
				pnlSocios.add(lblTelfono_1, gbc_lblTelfono_1);
			}
			{
				
				MaskFormatter formatoTlfno;
				try {
					formatoTlfno = new MaskFormatter(" ###' ###' ###");
					
					formattedTextField_TelefSocio = new JFormattedTextField(formatoTlfno);
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				formattedTextField_TelefSocio.addFocusListener(new MiFocusListener());
				
				
				GridBagConstraints gbc_formattedTextField_TelefSocio = new GridBagConstraints();
				gbc_formattedTextField_TelefSocio.insets = new Insets(0, 0, 5, 5);
				gbc_formattedTextField_TelefSocio.fill = GridBagConstraints.HORIZONTAL;
				gbc_formattedTextField_TelefSocio.gridx = 5;
				gbc_formattedTextField_TelefSocio.gridy = 6;
				pnlSocios.add(formattedTextField_TelefSocio, gbc_formattedTextField_TelefSocio);
			}
			{
				label_22 = new JLabel("*");
				GridBagConstraints gbc_label_22 = new GridBagConstraints();
				gbc_label_22.anchor = GridBagConstraints.WEST;
				gbc_label_22.insets = new Insets(0, 0, 5, 5);
				gbc_label_22.gridx = 6;
				gbc_label_22.gridy = 6;
				pnlSocios.add(label_22, gbc_label_22);
			}
			{
				lblDatosBancarios = new JLabel(MessagesRefugioIPOInter.getString("Menu.lblDatosBancarios.text")); //$NON-NLS-1$
				lblDatosBancarios.setFont(new Font("Tahoma", Font.PLAIN, 16));
				GridBagConstraints gbc_lblDatosBancarios = new GridBagConstraints();
				gbc_lblDatosBancarios.anchor = GridBagConstraints.SOUTHWEST;
				gbc_lblDatosBancarios.insets = new Insets(0, 0, 5, 5);
				gbc_lblDatosBancarios.gridx = 5;
				gbc_lblDatosBancarios.gridy = 8;
				pnlSocios.add(lblDatosBancarios, gbc_lblDatosBancarios);
			}
			{
				btnEliminarSocio = new JButton(MessagesRefugioIPOInter.getString("Menu.btnEliminarSocio.text")); //$NON-NLS-1$
				btnEliminarSocio.setEnabled(false);
				btnEliminarSocio.addActionListener(new BtnEliminarSocioActionListener());
				btnEliminarSocio.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				btnEliminarSocio.setIcon(new ImageIcon(Menu.class.getResource("/presentacion/cruz.png")));
				GridBagConstraints gbc_btnEliminarSocio = new GridBagConstraints();
				gbc_btnEliminarSocio.fill = GridBagConstraints.HORIZONTAL;
				gbc_btnEliminarSocio.insets = new Insets(0, 0, 5, 5);
				gbc_btnEliminarSocio.gridx = 1;
				gbc_btnEliminarSocio.gridy = 9;
				pnlSocios.add(btnEliminarSocio, gbc_btnEliminarSocio);
			}
			{
				btnBorrarDatos_2 = new JButton(MessagesRefugioIPOInter.getString("Menu.btnBorrarDatos_2.text")); //$NON-NLS-1$
				btnBorrarDatos_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				btnBorrarDatos_2.setIcon(new ImageIcon(Menu.class.getResource("/presentacion/borrar.png")));
				btnBorrarDatos_2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						txtNombreSocio.setText("");
						txtApellidosSocio.setText("");
						formattedTextField_DniSocio.setText("");
						lblFotoSocio.setIcon(new ImageIcon(Menu.class.getResource("/presentacion/Usuario1.png")));
						txtCiudadSocio.setText("");
						textdireccionSocio.setText("");
						txtProvinciaSocio.setText("");
						formattedTextField_TelefSocio.setText("");
						txtCorreoSocio.setText("");
						formattedTextField_FechaSocio.setText("");
						formattedTextField_cuenta.setText("");
						comboBox_aportacionSocio.setSelectedItem("5");
						
					}
				});
				GridBagConstraints gbc_btnBorrarDatos_2 = new GridBagConstraints();
				gbc_btnBorrarDatos_2.fill = GridBagConstraints.HORIZONTAL;
				gbc_btnBorrarDatos_2.insets = new Insets(0, 0, 5, 5);
				gbc_btnBorrarDatos_2.gridx = 2;
				gbc_btnBorrarDatos_2.gridy = 9;
				pnlSocios.add(btnBorrarDatos_2, gbc_btnBorrarDatos_2);
			}
			{
				lblNmCuenta = new JLabel(MessagesRefugioIPOInter.getString("Menu.lblNmCuenta.text")); //$NON-NLS-1$
				GridBagConstraints gbc_lblNmCuenta = new GridBagConstraints();
				gbc_lblNmCuenta.anchor = GridBagConstraints.WEST;
				gbc_lblNmCuenta.insets = new Insets(0, 0, 5, 5);
				gbc_lblNmCuenta.gridx = 4;
				gbc_lblNmCuenta.gridy = 9;
				pnlSocios.add(lblNmCuenta, gbc_lblNmCuenta);
			}
			{
				 
				
				MaskFormatter formatoCuenta;
				try {
					formatoCuenta = new MaskFormatter("UU' ##' - ####' - ####' - ##' - ##########");
					
					formattedTextField_cuenta = new JFormattedTextField(formatoCuenta);
					formattedTextField_cuenta.setToolTipText("ej: ES 00 0000 0000 00 0000000000");
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				formattedTextField_cuenta.addFocusListener(new MiFocusListener());
				
				
				GridBagConstraints gbc_formattedTextField_cuenta = new GridBagConstraints();
				gbc_formattedTextField_cuenta.insets = new Insets(0, 0, 5, 5);
				gbc_formattedTextField_cuenta.fill = GridBagConstraints.HORIZONTAL;
				gbc_formattedTextField_cuenta.gridx = 5;
				gbc_formattedTextField_cuenta.gridy = 9;
				pnlSocios.add(formattedTextField_cuenta, gbc_formattedTextField_cuenta);
			}
			{
				label_23 = new JLabel("*");
				GridBagConstraints gbc_label_23 = new GridBagConstraints();
				gbc_label_23.anchor = GridBagConstraints.WEST;
				gbc_label_23.insets = new Insets(0, 0, 5, 5);
				gbc_label_23.gridx = 6;
				gbc_label_23.gridy = 9;
				pnlSocios.add(label_23, gbc_label_23);
			}
			{
				btnModificarSocio = new JButton(MessagesRefugioIPOInter.getString("Menu.btnModificarSocio.text")); //$NON-NLS-1$
				btnModificarSocio.setEnabled(false);
				btnModificarSocio.addActionListener(new BtnModificarSocioActionListener());
				btnModificarSocio.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				btnModificarSocio.setIcon(new ImageIcon(Menu.class.getResource("/presentacion/modificar.png")));
				GridBagConstraints gbc_btnModificarSocio = new GridBagConstraints();
				gbc_btnModificarSocio.fill = GridBagConstraints.HORIZONTAL;
				gbc_btnModificarSocio.insets = new Insets(0, 0, 5, 5);
				gbc_btnModificarSocio.gridx = 1;
				gbc_btnModificarSocio.gridy = 10;
				pnlSocios.add(btnModificarSocio, gbc_btnModificarSocio);
			}
			{
				btnAadirSocio = new JButton(MessagesRefugioIPOInter.getString("Menu.btnAadirSocio.text")); //$NON-NLS-1$
				btnAadirSocio.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				btnAadirSocio.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						
						
						
						if(txtNombreSocio.getText().trim().length()!=0 && txtApellidosSocio.getText().trim().length()!=0 && formattedTextField_DniSocio.getText().trim().length()!=0 && formattedTextField_TelefSocio.getText().trim().length()!=0 && formattedTextField_cuenta.getText().trim().length()!=0){
							
							Socio s= new Socio(formattedTextField_DniSocio.getText().toString(), txtNombreSocio.getText(), txtApellidosSocio.getText(), 
									formattedTextField_FechaSocio.getText().toString(), formattedTextField_TelefSocio.getText().toString(), 
									textdireccionSocio.getText().toString(), txtCiudadSocio.getText(), txtProvinciaSocio.getText(), 
									txtCorreoSocio.getText(), lblFotoSocio.getIcon().toString(), formattedTextField_cuenta.getText().toString(), (String)comboBox_aportacionSocio.getSelectedItem());
							
							txtNombreSocio.setText("");
							txtApellidosSocio.setText("");
							formattedTextField_DniSocio.setText("");
							lblFotoSocio.setIcon(new ImageIcon(Menu.class.getResource("/presentacion/Usuario1.png")));
							txtCiudadSocio.setText("");
							textdireccionSocio.setText("");
							txtProvinciaSocio.setText("");
							formattedTextField_TelefSocio.setText("");
							txtCorreoSocio.setText("");
							formattedTextField_FechaSocio.setText("");
							formattedTextField_cuenta.setText("");
							comboBox_aportacionSocio.setSelectedItem("5");
							
							try{
								s.insertarSocio(s);
								JOptionPane.showMessageDialog(frame, "Socio guardado correctamente");
							}catch(Exception ex){
								ex.printStackTrace();
								JOptionPane.showMessageDialog(frame, "Error al añadir socio");
							}
						}else{
							 JOptionPane.showMessageDialog(frame, "Debe rellenar todos los campos obligatorios");
						}
						
						
					}
				});
				btnAadirSocio.setIcon(new ImageIcon(Menu.class.getResource("/presentacion/guardar.png")));
				GridBagConstraints gbc_btnAadirSocio = new GridBagConstraints();
				gbc_btnAadirSocio.fill = GridBagConstraints.HORIZONTAL;
				gbc_btnAadirSocio.insets = new Insets(0, 0, 5, 5);
				gbc_btnAadirSocio.gridx = 2;
				gbc_btnAadirSocio.gridy = 10;
				pnlSocios.add(btnAadirSocio, gbc_btnAadirSocio);
			}
			{
				lblAportacinMensual = new JLabel(MessagesRefugioIPOInter.getString("Menu.lblAportacinMensual.text")); //$NON-NLS-1$
				GridBagConstraints gbc_lblAportacinMensual = new GridBagConstraints();
				gbc_lblAportacinMensual.anchor = GridBagConstraints.WEST;
				gbc_lblAportacinMensual.insets = new Insets(0, 0, 5, 5);
				gbc_lblAportacinMensual.gridx = 4;
				gbc_lblAportacinMensual.gridy = 10;
				pnlSocios.add(lblAportacinMensual, gbc_lblAportacinMensual);
			}
			{
				comboBox_aportacionSocio = new JComboBox();
				comboBox_aportacionSocio.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				comboBox_aportacionSocio.setModel(new DefaultComboBoxModel(new String[] {"5", "10", "15", "20", "50", "100"}));
				GridBagConstraints gbc_comboBox_aportacionSocio = new GridBagConstraints();
				gbc_comboBox_aportacionSocio.fill = GridBagConstraints.HORIZONTAL;
				gbc_comboBox_aportacionSocio.insets = new Insets(0, 0, 5, 5);
				gbc_comboBox_aportacionSocio.gridx = 5;
				gbc_comboBox_aportacionSocio.gridy = 10;
				pnlSocios.add(comboBox_aportacionSocio, gbc_comboBox_aportacionSocio);
			}
			{
				{
					
					MaskFormatter formatoDNI;
					try {
						formatoDNI = new MaskFormatter("########'-U");
						formatoDNI.setPlaceholderCharacter('X');
					} catch (ParseException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				{
					
					
					MaskFormatter formatoCuenta;
					try {
						formatoCuenta = new MaskFormatter("UU' ##' - ####' - ####' - ##' - ##########");
						formatoCuenta.setPlaceholderCharacter('X');
					} catch (ParseException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				{
				
					
					MaskFormatter formatoTlfno;
					try {
						formatoTlfno = new MaskFormatter(" ###' ###' ###");
						formatoTlfno.setPlaceholderCharacter('*');
					} catch (ParseException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
			pnlDonativos = new JPanel();
			pnlDonativos.setForeground(new Color(153, 180, 209));
			tabbedPane.addTab("Donativos", new ImageIcon(Menu.class.getResource("/presentacion/donativo.png")), pnlDonativos, null);
			GridBagLayout gridBagLayout = new GridBagLayout();
			gridBagLayout.columnWidths = new int[]{39, 300, 50, 0, 100, 0, 436, 70, 0};
			gridBagLayout.rowHeights = new int[]{50, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
			gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
			gridBagLayout.rowWeights = new double[]{0.0, 0.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 0.0, 1.0, Double.MIN_VALUE};
			pnlDonativos.setLayout(gridBagLayout);
			{
				lblNewLabel_77 = new JLabel(MessagesRefugioIPOInter.getString("Menu.lblNewLabel_77.text")); //$NON-NLS-1$
				lblNewLabel_77.setFont(new Font("Tahoma", Font.PLAIN, 14));
				GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
				gbc_lblNewLabel.anchor = GridBagConstraints.WEST;
				gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
				gbc_lblNewLabel.gridx = 1;
				gbc_lblNewLabel.gridy = 1;
				pnlDonativos.add(lblNewLabel_77, gbc_lblNewLabel);
			}
			{
				lblOtraCantidad = new JLabel(MessagesRefugioIPOInter.getString("Menu.lblOtraCantidad.text")); //$NON-NLS-1$
				GridBagConstraints gbc_lblOtraCantidad = new GridBagConstraints();
				gbc_lblOtraCantidad.anchor = GridBagConstraints.WEST;
				gbc_lblOtraCantidad.insets = new Insets(0, 0, 5, 5);
				gbc_lblOtraCantidad.gridx = 3;
				gbc_lblOtraCantidad.gridy = 1;
				pnlDonativos.add(lblOtraCantidad, gbc_lblOtraCantidad);
			}
			{
				lblNewLabel_11 = new JLabel(MessagesRefugioIPOInter.getString("Menu.lblNewLabel_11.text")); //$NON-NLS-1$
				lblNewLabel_11.setFont(new Font("Tahoma", Font.PLAIN, 16));
				GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
				gbc_lblNewLabel_1.gridwidth = 2;
				gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
				gbc_lblNewLabel_1.gridx = 5;
				gbc_lblNewLabel_1.gridy = 1;
				pnlDonativos.add(lblNewLabel_11, gbc_lblNewLabel_1);
			}
			{
				comboBox_donativos = new JComboBox();
				comboBox_donativos.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				comboBox_donativos.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if(comboBox_donativos.getSelectedItem().equals("Otra cantidad")){
							txtCantidad.setEnabled(true);
						}else{
							txtCantidad.setText("");
							txtCantidad.setEnabled(false);
						}
						
					}
				});
				comboBox_donativos.setModel(new DefaultComboBoxModel(new String[] {"5", "10", "20", "30", "40", "Otra cantidad"}));
				GridBagConstraints gbc_comboBox_donativos = new GridBagConstraints();
				gbc_comboBox_donativos.insets = new Insets(0, 0, 5, 5);
				gbc_comboBox_donativos.fill = GridBagConstraints.HORIZONTAL;
				gbc_comboBox_donativos.gridx = 1;
				gbc_comboBox_donativos.gridy = 2;
				pnlDonativos.add(comboBox_donativos, gbc_comboBox_donativos);
			}
			{
				txtCantidad = new JTextField();
				txtCantidad.addKeyListener(new KeyAdapter() {
					@Override
					public void keyTyped(KeyEvent arg0) {
						char c=arg0.getKeyChar(); 
			            
				          if(Character.isLetter(c)) { 
				               
				              arg0.consume(); 
				              JOptionPane.showMessageDialog(null, "Se admiten sólo números");  
				          } 
					}
				});
				{
					label_1 = new JLabel("\u20AC");
					GridBagConstraints gbc_label_1 = new GridBagConstraints();
					gbc_label_1.insets = new Insets(0, 0, 5, 5);
					gbc_label_1.anchor = GridBagConstraints.WEST;
					gbc_label_1.gridx = 2;
					gbc_label_1.gridy = 2;
					pnlDonativos.add(label_1, gbc_label_1);
				}
				txtCantidad.setEnabled(false);
				GridBagConstraints gbc_txtCantidad = new GridBagConstraints();
				gbc_txtCantidad.insets = new Insets(0, 0, 5, 5);
				gbc_txtCantidad.fill = GridBagConstraints.HORIZONTAL;
				gbc_txtCantidad.gridx = 3;
				gbc_txtCantidad.gridy = 2;
				pnlDonativos.add(txtCantidad, gbc_txtCantidad);
				txtCantidad.setColumns(10);
			}
			{
				label = new JLabel("\u20AC");
				GridBagConstraints gbc_label = new GridBagConstraints();
				gbc_label.anchor = GridBagConstraints.WEST;
				gbc_label.insets = new Insets(0, 0, 5, 5);
				gbc_label.gridx = 4;
				gbc_label.gridy = 2;
				pnlDonativos.add(label, gbc_label);
			}
			{
				lblNombre2 = new JLabel(MessagesRefugioIPOInter.getString("Menu.lblNombre2.text_1")); //$NON-NLS-1$
				GridBagConstraints gbc_lblNombre = new GridBagConstraints();
				gbc_lblNombre.anchor = GridBagConstraints.WEST;
				gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
				gbc_lblNombre.gridx = 5;
				gbc_lblNombre.gridy = 2;
				pnlDonativos.add(lblNombre2, gbc_lblNombre);
			}
			{
				txtNombreDonante = new JTextField();
				txtNombreDonante.addKeyListener(new KeyAdapter() {
					@Override
					public void keyTyped(KeyEvent arg0) {
						char c=arg0.getKeyChar(); 
			            
				          if(Character.isDigit(c)) { 
				               
				              arg0.consume(); 
				              JOptionPane.showMessageDialog(null, "Se admiten sólo letras");  
				          } 
					}
				});
				GridBagConstraints gbc_txtNombreDonante = new GridBagConstraints();
				gbc_txtNombreDonante.insets = new Insets(0, 0, 5, 5);
				gbc_txtNombreDonante.fill = GridBagConstraints.HORIZONTAL;
				gbc_txtNombreDonante.gridx = 6;
				gbc_txtNombreDonante.gridy = 2;
				pnlDonativos.add(txtNombreDonante, gbc_txtNombreDonante);
				txtNombreDonante.setColumns(10);
			}
			{
				lblApellidosDonante = new JLabel(MessagesRefugioIPOInter.getString("Menu.lblApellidosDonante.text")); //$NON-NLS-1$
				GridBagConstraints gbc_lblApellidos = new GridBagConstraints();
				gbc_lblApellidos.anchor = GridBagConstraints.WEST;
				gbc_lblApellidos.insets = new Insets(0, 0, 5, 5);
				gbc_lblApellidos.gridx = 5;
				gbc_lblApellidos.gridy = 3;
				pnlDonativos.add(lblApellidosDonante, gbc_lblApellidos);
			}
			{
				txtApellidosDonante = new JTextField();
				txtApellidosDonante.addKeyListener(new KeyAdapter() {
					@Override
					public void keyTyped(KeyEvent arg0) {
						char c=arg0.getKeyChar(); 
			            
				          if(Character.isDigit(c)) { 
				               
				              arg0.consume(); 
				              JOptionPane.showMessageDialog(null, "Se admiten sólo letras");  
				          } 
					}
				});
				GridBagConstraints gbc_txtApellidosDonante = new GridBagConstraints();
				gbc_txtApellidosDonante.insets = new Insets(0, 0, 5, 5);
				gbc_txtApellidosDonante.fill = GridBagConstraints.HORIZONTAL;
				gbc_txtApellidosDonante.gridx = 6;
				gbc_txtApellidosDonante.gridy = 3;
				pnlDonativos.add(txtApellidosDonante, gbc_txtApellidosDonante);
				txtApellidosDonante.setColumns(10);
			}
			{
				lblNumeroDeCuenta = new JLabel(MessagesRefugioIPOInter.getString("Menu.lblNumeroDeCuenta.text")); //$NON-NLS-1$
				lblNumeroDeCuenta.setFont(new Font("Tahoma", Font.PLAIN, 14));
				GridBagConstraints gbc_lblNumeroDeCuenta = new GridBagConstraints();
				gbc_lblNumeroDeCuenta.anchor = GridBagConstraints.WEST;
				gbc_lblNumeroDeCuenta.insets = new Insets(0, 0, 5, 5);
				gbc_lblNumeroDeCuenta.gridx = 1;
				gbc_lblNumeroDeCuenta.gridy = 4;
				pnlDonativos.add(lblNumeroDeCuenta, gbc_lblNumeroDeCuenta);
			}
			{
				lblDni_2 = new JLabel(MessagesRefugioIPOInter.getString("Menu.lblDni_2.text")); //$NON-NLS-1$
				GridBagConstraints gbc_lblDni_2 = new GridBagConstraints();
				gbc_lblDni_2.anchor = GridBagConstraints.WEST;
				gbc_lblDni_2.insets = new Insets(0, 0, 5, 5);
				gbc_lblDni_2.gridx = 5;
				gbc_lblDni_2.gridy = 4;
				pnlDonativos.add(lblDni_2, gbc_lblDni_2);
			}
			 
			MaskFormatter formatoDNI;
			try {
				formatoDNI = new MaskFormatter("########'-U");
				
				formattedTextField_DniDonante = new JFormattedTextField(formatoDNI);
				formattedTextField_DniDonante.setToolTipText(MessagesRefugioIPOInter.getString("Menu.formattedTextField_DniDonante.toolTipText")); //$NON-NLS-1$
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
			formattedTextField_DniDonante.addFocusListener(new MiFocusListener());
			
			
			GridBagConstraints gbc_formattedTextField_DniDonante = new GridBagConstraints();
			gbc_formattedTextField_DniDonante.insets = new Insets(0, 0, 5, 5);
			gbc_formattedTextField_DniDonante.fill = GridBagConstraints.HORIZONTAL;
			gbc_formattedTextField_DniDonante.gridx = 6;
			gbc_formattedTextField_DniDonante.gridy = 4;
			pnlDonativos.add(formattedTextField_DniDonante, gbc_formattedTextField_DniDonante);
		
			
			MaskFormatter formatoCuenta;
			try {
				formatoCuenta = new MaskFormatter("UU' ##' - ####' - ####' - ##' - ##########");
				
				formattedTextField_cuentaDonante = new JFormattedTextField(formatoCuenta);
				formattedTextField_cuentaDonante.setToolTipText("ej: ES 00 0000 0000 00 0000000000");
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			formattedTextField_cuentaDonante .addFocusListener(new MiFocusListener());
			
			GridBagConstraints gbc_formattedTextField_cuentaDonante = new GridBagConstraints();
			gbc_formattedTextField_cuentaDonante.insets = new Insets(0, 0, 5, 5);
			gbc_formattedTextField_cuentaDonante.fill = GridBagConstraints.HORIZONTAL;
			gbc_formattedTextField_cuentaDonante.gridx = 1;
			gbc_formattedTextField_cuentaDonante.gridy = 5;
			pnlDonativos.add(formattedTextField_cuentaDonante, gbc_formattedTextField_cuentaDonante);
			{
				lblDireccionDonante = new JLabel(MessagesRefugioIPOInter.getString("Menu.lblDireccionDonante.text")); //$NON-NLS-1$
				GridBagConstraints gbc_lblDireccin = new GridBagConstraints();
				gbc_lblDireccin.anchor = GridBagConstraints.WEST;
				gbc_lblDireccin.insets = new Insets(0, 0, 5, 5);
				gbc_lblDireccin.gridx = 5;
				gbc_lblDireccin.gridy = 5;
				pnlDonativos.add(lblDireccionDonante, gbc_lblDireccin);
			}
			{
				txtDireccionDonante = new JTextField();
				GridBagConstraints gbc_txtDireccionDonante = new GridBagConstraints();
				gbc_txtDireccionDonante.insets = new Insets(0, 0, 5, 5);
				gbc_txtDireccionDonante.fill = GridBagConstraints.HORIZONTAL;
				gbc_txtDireccionDonante.gridx = 6;
				gbc_txtDireccionDonante.gridy = 5;
				pnlDonativos.add(txtDireccionDonante, gbc_txtDireccionDonante);
				txtDireccionDonante.setColumns(10);
			}
			{
				lblCiudadDonante = new JLabel(MessagesRefugioIPOInter.getString("Menu.lblCiudadDonante.text")); //$NON-NLS-1$
				GridBagConstraints gbc_lblCiudad = new GridBagConstraints();
				gbc_lblCiudad.anchor = GridBagConstraints.WEST;
				gbc_lblCiudad.insets = new Insets(0, 0, 5, 5);
				gbc_lblCiudad.gridx = 5;
				gbc_lblCiudad.gridy = 6;
				pnlDonativos.add(lblCiudadDonante, gbc_lblCiudad);
			}
			{
				txtCiudadDonante = new JTextField();
				txtCiudadDonante.addKeyListener(new KeyAdapter() {
					@Override
					public void keyTyped(KeyEvent arg0) {
						char c=arg0.getKeyChar(); 
			            
				          if(Character.isDigit(c)) { 
				               
				              arg0.consume(); 
				              JOptionPane.showMessageDialog(null, "Se admiten sólo letras");  
				          } 
					}
				});
				GridBagConstraints gbc_txtCiudadDonante = new GridBagConstraints();
				gbc_txtCiudadDonante.insets = new Insets(0, 0, 5, 5);
				gbc_txtCiudadDonante.fill = GridBagConstraints.HORIZONTAL;
				gbc_txtCiudadDonante.gridx = 6;
				gbc_txtCiudadDonante.gridy = 6;
				pnlDonativos.add(txtCiudadDonante, gbc_txtCiudadDonante);
				txtCiudadDonante.setColumns(10);
			}
			{
				lblProvinciaDonante = new JLabel(MessagesRefugioIPOInter.getString("Menu.lblProvinciaDonante.text")); //$NON-NLS-1$
				GridBagConstraints gbc_lblProvincia = new GridBagConstraints();
				gbc_lblProvincia.anchor = GridBagConstraints.WEST;
				gbc_lblProvincia.insets = new Insets(0, 0, 5, 5);
				gbc_lblProvincia.gridx = 5;
				gbc_lblProvincia.gridy = 7;
				pnlDonativos.add(lblProvinciaDonante, gbc_lblProvincia);
			}
			{
				txtProvinciaDonante = new JTextField();
				txtProvinciaDonante.addKeyListener(new KeyAdapter() {
					@Override
					public void keyTyped(KeyEvent arg0) {
						char c=arg0.getKeyChar(); 
			            
				          if(Character.isDigit(c)) { 
				               
				              arg0.consume(); 
				              JOptionPane.showMessageDialog(null, "Se admiten sólo letras");  
				          } 
					}
				});
				GridBagConstraints gbc_txtProvinciaDonante = new GridBagConstraints();
				gbc_txtProvinciaDonante.insets = new Insets(0, 0, 5, 5);
				gbc_txtProvinciaDonante.fill = GridBagConstraints.HORIZONTAL;
				gbc_txtProvinciaDonante.gridx = 6;
				gbc_txtProvinciaDonante.gridy = 7;
				pnlDonativos.add(txtProvinciaDonante, gbc_txtProvinciaDonante);
				txtProvinciaDonante.setColumns(10);
			}
			{
				lblTelefonoDonante = new JLabel(MessagesRefugioIPOInter.getString("Menu.lblTelefonoDonante.text")); //$NON-NLS-1$
				GridBagConstraints gbc_lblTelefonoDonante = new GridBagConstraints();
				gbc_lblTelefonoDonante.anchor = GridBagConstraints.WEST;
				gbc_lblTelefonoDonante.insets = new Insets(0, 0, 5, 5);
				gbc_lblTelefonoDonante.gridx = 5;
				gbc_lblTelefonoDonante.gridy = 8;
				pnlDonativos.add(lblTelefonoDonante, gbc_lblTelefonoDonante);
			}
			
			MaskFormatter formatoTlfno;
			try {
				formatoTlfno = new MaskFormatter("###' ###' ###");
				
				formattedTextField_telefDonante = new JFormattedTextField(formatoTlfno);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			formattedTextField_telefDonante.addFocusListener(new MiFocusListener());
			
			formattedTextField_telefDonante.addFocusListener(new MiFocusListener());
			
			GridBagConstraints gbc_formattedTextField_telefDonante = new GridBagConstraints();
			gbc_formattedTextField_telefDonante.insets = new Insets(0, 0, 5, 5);
			gbc_formattedTextField_telefDonante.fill = GridBagConstraints.HORIZONTAL;
			gbc_formattedTextField_telefDonante.gridx = 6;
			gbc_formattedTextField_telefDonante.gridy = 8;
			pnlDonativos.add(formattedTextField_telefDonante, gbc_formattedTextField_telefDonante);
			{
				btnAceptar = new JButton(MessagesRefugioIPOInter.getString("Menu.btnAceptar.text")); //$NON-NLS-1$
				btnAceptar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				btnAceptar.setIcon(new ImageIcon(Menu.class.getResource("/presentacion/guardar.png")));
				btnAceptar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						if(txtCantidad.isEnabled()){
							Donacion d = new Donacion (txtNombreDonante.getText(),txtApellidosDonante.getText(), formattedTextField_DniDonante.getText(), txtCantidad.getText());
							Dialogo segundaVentana = new Dialogo(d);
							segundaVentana.setVisible(true);
						}else{
							Donacion d = new Donacion (txtNombreDonante.getText(),txtApellidosDonante.getText(), formattedTextField_DniDonante.getText(), comboBox_donativos.getSelectedItem().toString());
							Dialogo segundaVentana = new Dialogo(d);
							segundaVentana.setVisible(true);
						}
						
						
						
						txtNombreDonante.setText("");
						txtApellidosDonante.setText("");
						comboBox_donativos.setSelectedItem("5€");
						txtCantidad.setText("");
						txtCiudadDonante.setText("");
						txtProvinciaDonante.setText("");
						txtDireccionDonante.setText("");
						formattedTextField_DniDonante.setText("");
						formattedTextField_telefDonante.setText("");
						formattedTextField_cuentaDonante.setText("");
						
					}
				});
				GridBagConstraints gbc_btnAceptar = new GridBagConstraints();
				gbc_btnAceptar.fill = GridBagConstraints.VERTICAL;
				gbc_btnAceptar.anchor = GridBagConstraints.EAST;
				gbc_btnAceptar.insets = new Insets(0, 0, 5, 5);
				gbc_btnAceptar.gridx = 6;
				gbc_btnAceptar.gridy = 9;
				pnlDonativos.add(btnAceptar, gbc_btnAceptar);
			}
			{
				{
					
					MaskFormatter formatoDNIAc;
					try {
						formatoDNIAc = new MaskFormatter("########'-U");
						formatoDNIAc.setPlaceholderCharacter('X');
					} catch (ParseException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
			}
			 
			
			
			MaskFormatter formatoDNIAc;
			try {
				formatoDNIAc = new MaskFormatter("########'-U");
				formatoDNIAc.setPlaceholderCharacter('X');
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			{
				
				
				MaskFormatter formatoFechaAc;
				try {
					formatoFechaAc = new MaskFormatter("##' / ##' / ##");
					formatoFechaAc.setPlaceholderCharacter('*');
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			{
				
				MaskFormatter formatoTlfnoAc;
				try {
					formatoTlfnoAc = new MaskFormatter("'(###')' ###' ###' ###");
					formatoTlfnoAc.setPlaceholderCharacter('*');
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			
			MaskFormatter formatoDNIAcog;
			try {
				formatoDNIAcog = new MaskFormatter("########'-U");
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			MaskFormatter formatoFecha;
			try {
				formatoFecha = new MaskFormatter(" ##'/ ##'/ ##");
				formatoFecha.setPlaceholderCharacter('X');
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			MaskFormatter formatoTlfnoAcog;
			try {
				formatoTlfnoAcog = new MaskFormatter(" ###' ###' ###");
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			{
			}
			pnlAcogida = new JPanel();
			tabbedPane.addTab("Casas de acogida", new ImageIcon(Menu.class.getResource("/presentacion/casas.png")), pnlAcogida, null);
			GridBagLayout gbl_pnlAcogida = new GridBagLayout();
			gbl_pnlAcogida.columnWidths = new int[]{58, 125, 106, 40, 190, 40, 0, 300, 150, 0};
			gbl_pnlAcogida.rowHeights = new int[]{35, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 37, 0, 0, 0, 0, 0};
			gbl_pnlAcogida.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
			gbl_pnlAcogida.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
			pnlAcogida.setLayout(gbl_pnlAcogida);
			{
				btnListarAcogedores = new JButton(MessagesRefugioIPOInter.getString("Menu.btnListarAcogedores.text")); //$NON-NLS-1$
				btnListarAcogedores.addActionListener(new BtnListarAcogedoresActionListener());
				btnListarAcogedores.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				GridBagConstraints gbc_btnListarAcogedores = new GridBagConstraints();
				gbc_btnListarAcogedores.anchor = GridBagConstraints.WEST;
				gbc_btnListarAcogedores.insets = new Insets(0, 0, 5, 5);
				gbc_btnListarAcogedores.gridx = 1;
				gbc_btnListarAcogedores.gridy = 2;
				pnlAcogida.add(btnListarAcogedores, gbc_btnListarAcogedores);
			}
			{
				lblMascotaAAcoger = new JLabel(MessagesRefugioIPOInter.getString("Menu.lblMascotaAAcoger.text")); //$NON-NLS-1$
				lblMascotaAAcoger.setFont(new Font("Tahoma", Font.PLAIN, 16));
				GridBagConstraints gbc_lblMascotaAAcoger = new GridBagConstraints();
				gbc_lblMascotaAAcoger.anchor = GridBagConstraints.WEST;
				gbc_lblMascotaAAcoger.insets = new Insets(0, 0, 5, 5);
				gbc_lblMascotaAAcoger.gridx = 4;
				gbc_lblMascotaAAcoger.gridy = 2;
				pnlAcogida.add(lblMascotaAAcoger, gbc_lblMascotaAAcoger);
			}
			{
				lblDatosPersonales_2 = new JLabel(MessagesRefugioIPOInter.getString("Menu.lblDatosPersonales_2.text")); //$NON-NLS-1$
				lblDatosPersonales_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
				GridBagConstraints gbc_lblDatosPersonales_2 = new GridBagConstraints();
				gbc_lblDatosPersonales_2.anchor = GridBagConstraints.NORTHWEST;
				gbc_lblDatosPersonales_2.insets = new Insets(0, 0, 5, 5);
				gbc_lblDatosPersonales_2.gridx = 7;
				gbc_lblDatosPersonales_2.gridy = 2;
				pnlAcogida.add(lblDatosPersonales_2, gbc_lblDatosPersonales_2);
			}
			{
				scrollPane_8 = new JScrollPane();
				scrollPane_8.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
				scrollPane_8.setBorder(new TitledBorder(null, MessagesRefugioIPOInter.getString("Menu.scrollPane_8.borderTitle"), TitledBorder.LEADING, TitledBorder.TOP, null, null)); //$NON-NLS-1$
				GridBagConstraints gbc_scrollPane_8 = new GridBagConstraints();
				gbc_scrollPane_8.gridheight = 10;
				gbc_scrollPane_8.gridwidth = 2;
				gbc_scrollPane_8.insets = new Insets(0, 0, 5, 5);
				gbc_scrollPane_8.fill = GridBagConstraints.BOTH;
				gbc_scrollPane_8.gridx = 1;
				gbc_scrollPane_8.gridy = 3;
				pnlAcogida.add(scrollPane_8, gbc_scrollPane_8);
				{
					list_3 = new JList();
					list_3.addMouseListener(new MouseAdapter() {
						@Override
						public void mouseClicked(MouseEvent arg0) {
							String acogedor= list_3.getSelectedValue().toString();
							
							dni="";
							
							dni=acogedor.substring(1,11);
							
							btnEliminarDueño_1.setEnabled(true);
							
							btnModificarDueño_1.setEnabled(true);
							
							GestorCasa g= new GestorCasa();
							try {
								
								Casa a=g.readOne(dni);
								
								textNombreAcogida.setText(a.getNombre());
								txtApellidoAcogida.setText(a.getApellidos());
								formattedTextFieldDNI.setText(a.getDni());
								textField_ciudad.setText(a.getCiudad());
								textField_direccion.setText(a.getDireccion());
								textField_provincia.setText(a.getProvincia());
								formattedTextField_TelefAcogida.setText(a.getTelefono());
								formattedTextField_email.setText(a.getCorreo());
								formattedTextField_FechaAcogida.setText(a.getNacimiento());
								textField_profesion.setText(a.getProfesion());
								comboBox_animales.setSelectedItem(a.getOtrosAnimales());
								comboBox_tipoVivienda.setSelectedItem(a.getTipoVivienda());
								comboBox_dormir.setSelectedItem(a.getLugarDormir());
								textField_mascota.setText(a.getMascota());
								
								
								
								
							} catch (Exception e2) {
								// TODO Auto-generated catch block
								e2.printStackTrace();
							}
							
							
						}
					});
					scrollPane_8.setViewportView(list_3);
				}
			}
			{
				textField_mascota = new JTextField();
				textField_mascota.setEnabled(false);
				GridBagConstraints gbc_textField_mascota = new GridBagConstraints();
				gbc_textField_mascota.insets = new Insets(0, 0, 5, 5);
				gbc_textField_mascota.fill = GridBagConstraints.HORIZONTAL;
				gbc_textField_mascota.gridx = 4;
				gbc_textField_mascota.gridy = 3;
				pnlAcogida.add(textField_mascota, gbc_textField_mascota);
				textField_mascota.setColumns(10);
			}
			{
				lblNewLabel_77 = new JLabel(MessagesRefugioIPOInter.getString("Menu.lblNewLabel_77.text_1")); //$NON-NLS-1$
				GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
				gbc_lblNewLabel.anchor = GridBagConstraints.WEST;
				gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
				gbc_lblNewLabel.gridx = 6;
				gbc_lblNewLabel.gridy = 3;
				pnlAcogida.add(lblNewLabel_77, gbc_lblNewLabel);
			}
			{
				textNombreAcogida = new JTextField();
				textNombreAcogida.addKeyListener(new KeyAdapter() {
					@Override
					public void keyTyped(KeyEvent arg0) {
						char c=arg0.getKeyChar(); 
			            
				          if(Character.isDigit(c)) { 
				               
				              arg0.consume(); 
				              JOptionPane.showMessageDialog(null, "Se admiten sólo letras");  
				          } 
					}
				});
				GridBagConstraints gbc_textNombreAcogida = new GridBagConstraints();
				gbc_textNombreAcogida.insets = new Insets(0, 0, 5, 5);
				gbc_textNombreAcogida.fill = GridBagConstraints.HORIZONTAL;
				gbc_textNombreAcogida.gridx = 7;
				gbc_textNombreAcogida.gridy = 3;
				pnlAcogida.add(textNombreAcogida, gbc_textNombreAcogida);
				textNombreAcogida.setColumns(10);
			}
			{
				label_14 = new JLabel(MessagesRefugioIPOInter.getString("Menu.label_14.text")); //$NON-NLS-1$
				GridBagConstraints gbc_label_14 = new GridBagConstraints();
				gbc_label_14.anchor = GridBagConstraints.WEST;
				gbc_label_14.insets = new Insets(0, 0, 5, 0);
				gbc_label_14.gridx = 8;
				gbc_label_14.gridy = 3;
				pnlAcogida.add(label_14, gbc_label_14);
			}
			{
				lblApellidosDueño = new JLabel(MessagesRefugioIPOInter.getString("Menu.lblApellidosDue\u00F1o.text")); //$NON-NLS-1$
				GridBagConstraints gbc_lblApellidos = new GridBagConstraints();
				gbc_lblApellidos.anchor = GridBagConstraints.WEST;
				gbc_lblApellidos.insets = new Insets(0, 0, 5, 5);
				gbc_lblApellidos.gridx = 6;
				gbc_lblApellidos.gridy = 4;
				pnlAcogida.add(lblApellidosDueño, gbc_lblApellidos);
			}
			{
				txtApellidoAcogida = new JTextField();
				txtApellidoAcogida.addKeyListener(new KeyAdapter() {
					@Override
					public void keyTyped(KeyEvent arg0) {
						char c=arg0.getKeyChar(); 
			            
				          if(Character.isDigit(c)) { 
				               
				              arg0.consume(); 
				              JOptionPane.showMessageDialog(null, "Se admiten sólo letras");  
				          } 
					}
				});
				GridBagConstraints gbc_txtApellidoAcogida = new GridBagConstraints();
				gbc_txtApellidoAcogida.insets = new Insets(0, 0, 5, 5);
				gbc_txtApellidoAcogida.fill = GridBagConstraints.HORIZONTAL;
				gbc_txtApellidoAcogida.gridx = 7;
				gbc_txtApellidoAcogida.gridy = 4;
				pnlAcogida.add(txtApellidoAcogida, gbc_txtApellidoAcogida);
				txtApellidoAcogida.setColumns(10);
			}
			{
				label_24 = new JLabel("*");
				GridBagConstraints gbc_label_24 = new GridBagConstraints();
				gbc_label_24.anchor = GridBagConstraints.WEST;
				gbc_label_24.insets = new Insets(0, 0, 5, 0);
				gbc_label_24.gridx = 8;
				gbc_label_24.gridy = 4;
				pnlAcogida.add(label_24, gbc_label_24);
			}
			{
				btnListarPerrosDisponibles = new JButton(MessagesRefugioIPOInter.getString("Menu.btnListarPerrosDisponibles.text")); //$NON-NLS-1$
				btnListarPerrosDisponibles.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						
						try{
							modeloLista2.clear();
							GestorPerro g1=new GestorPerro();
							String[] datosLista= g1.readDisponible("Disponible");
							if(datosLista.length!=0){
								for(int i=0; i<datosLista.length; i++){
									 modeloLista2.addElement(datosLista[i]);//nombre es el campo de la base de datos
								}
							           
							    list_5.setModel(Menu.modeloLista2);
							}else{
								JOptionPane.showMessageDialog(frame, "No hay ningún perro disponible");
							}
							
							
						}catch(Exception ex1){
							ex1.printStackTrace();
						}
						
					}
				});
				GridBagConstraints gbc_btnListarPerrosDisponibles = new GridBagConstraints();
				gbc_btnListarPerrosDisponibles.anchor = GridBagConstraints.WEST;
				gbc_btnListarPerrosDisponibles.insets = new Insets(0, 0, 5, 5);
				gbc_btnListarPerrosDisponibles.gridx = 4;
				gbc_btnListarPerrosDisponibles.gridy = 5;
				pnlAcogida.add(btnListarPerrosDisponibles, gbc_btnListarPerrosDisponibles);
			}
			{
				lblDniDueño = new JLabel(MessagesRefugioIPOInter.getString("Menu.lblDniDue\u00F1o.text")); //$NON-NLS-1$
				GridBagConstraints gbc_lblDni = new GridBagConstraints();
				gbc_lblDni.anchor = GridBagConstraints.WEST;
				gbc_lblDni.insets = new Insets(0, 0, 5, 5);
				gbc_lblDni.gridx = 6;
				gbc_lblDni.gridy = 5;
				pnlAcogida.add(lblDniDueño, gbc_lblDni);
			}
			
			
			
			MaskFormatter formatoDNIAcogedor;
			try {
				formatoDNIAcogedor = new MaskFormatter("########'-U");
				
				formattedTextFieldDNI = new JFormattedTextField(formatoDNIAcogedor);
				formattedTextFieldDNI.setToolTipText(MessagesRefugioIPOInter.getString("Menu.formattedTextFieldDNI.toolTipText")); //$NON-NLS-1$
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			formattedTextFieldDNI.addFocusListener(new MiFocusListener());
			
			
			
			
			formattedTextFieldDNI.addFocusListener(new MiFocusListener());
			
			
			GridBagConstraints gbc_formattedTextFieldDNI = new GridBagConstraints();
			gbc_formattedTextFieldDNI.insets = new Insets(0, 0, 5, 5);
			gbc_formattedTextFieldDNI.fill = GridBagConstraints.HORIZONTAL;
			gbc_formattedTextFieldDNI.gridx = 7;
			gbc_formattedTextFieldDNI.gridy = 5;
			pnlAcogida.add(formattedTextFieldDNI, gbc_formattedTextFieldDNI);
			{
				label_25 = new JLabel("*");
				GridBagConstraints gbc_label_25 = new GridBagConstraints();
				gbc_label_25.anchor = GridBagConstraints.WEST;
				gbc_label_25.insets = new Insets(0, 0, 5, 0);
				gbc_label_25.gridx = 8;
				gbc_label_25.gridy = 5;
				pnlAcogida.add(label_25, gbc_label_25);
			}
			
			{
				scrollPane = new JScrollPane();
				scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
				scrollPane.setBorder(new TitledBorder(null, MessagesRefugioIPOInter.getString("Menu.scrollPane.borderTitle"), TitledBorder.LEADING, TitledBorder.TOP, null, null)); //$NON-NLS-1$
				GridBagConstraints gbc_scrollPane = new GridBagConstraints();
				gbc_scrollPane.gridheight = 7;
				gbc_scrollPane.insets = new Insets(0, 0, 5, 5);
				gbc_scrollPane.fill = GridBagConstraints.BOTH;
				gbc_scrollPane.gridx = 4;
				gbc_scrollPane.gridy = 6;
				pnlAcogida.add(scrollPane, gbc_scrollPane);
				{
					list_5 = new JList();
					list_5.addMouseListener(new MouseAdapter() {
						@Override
						public void mouseClicked(MouseEvent e) {
							String perro= list_5.getSelectedValue().toString();
							String nombre=perro.substring(1,perro.length()-1);
							GestorPerro g= new GestorPerro();
							try {
								
								textField_mascota.setText(nombre);
								
								
								
								
							} catch (Exception e2) {
								// TODO Auto-generated catch block
								e2.printStackTrace();
							}
							
							
							
						}
					});
					scrollPane.setViewportView(list_5);
				}
			}
			{
				lblFechaDeNacimiento = new JLabel(MessagesRefugioIPOInter.getString("Menu.lblFechaDeNacimiento.text")); //$NON-NLS-1$
				GridBagConstraints gbc_lblFechaDeNacimiento = new GridBagConstraints();
				gbc_lblFechaDeNacimiento.anchor = GridBagConstraints.WEST;
				gbc_lblFechaDeNacimiento.insets = new Insets(0, 0, 5, 5);
				gbc_lblFechaDeNacimiento.gridx = 6;
				gbc_lblFechaDeNacimiento.gridy = 6;
				pnlAcogida.add(lblFechaDeNacimiento, gbc_lblFechaDeNacimiento);
			}
			
			
			MaskFormatter formatoFechaAc;
			try {
				formatoFechaAc = new MaskFormatter(" ##'/ ##'/ ##");
			

				formattedTextField_FechaAcogida = new JFormattedTextField(formatoFechaAc);

				formattedTextField_FechaAcogida.setToolTipText("ej: 09/12/89");
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			

			formattedTextField_FechaAcogida.addFocusListener(new MiFocusListener());
			


			
			GridBagConstraints gbc_formattedTextField_FechaAcogida = new GridBagConstraints();
			gbc_formattedTextField_FechaAcogida.insets = new Insets(0, 0, 5, 5);
			gbc_formattedTextField_FechaAcogida.fill = GridBagConstraints.HORIZONTAL;
			gbc_formattedTextField_FechaAcogida.gridx = 7;
			gbc_formattedTextField_FechaAcogida.gridy = 6;
			pnlAcogida.add(formattedTextField_FechaAcogida, gbc_formattedTextField_FechaAcogida);
			{
				lblDireccin = new JLabel(MessagesRefugioIPOInter.getString("Menu.lblDireccin.text")); //$NON-NLS-1$
				GridBagConstraints gbc_lblDireccin = new GridBagConstraints();
				gbc_lblDireccin.anchor = GridBagConstraints.WEST;
				gbc_lblDireccin.insets = new Insets(0, 0, 5, 5);
				gbc_lblDireccin.gridx = 6;
				gbc_lblDireccin.gridy = 7;
				pnlAcogida.add(lblDireccin, gbc_lblDireccin);
			}
			{
				textField_direccion = new JTextField();
				GridBagConstraints gbc_textField_direccion = new GridBagConstraints();
				gbc_textField_direccion.insets = new Insets(0, 0, 5, 5);
				gbc_textField_direccion.fill = GridBagConstraints.HORIZONTAL;
				gbc_textField_direccion.gridx = 7;
				gbc_textField_direccion.gridy = 7;
				pnlAcogida.add(textField_direccion, gbc_textField_direccion);
				textField_direccion.setColumns(10);
			}
			{
				lblCiudad = new JLabel(MessagesRefugioIPOInter.getString("Menu.lblCiudad.text")); //$NON-NLS-1$
				GridBagConstraints gbc_lblCiudad = new GridBagConstraints();
				gbc_lblCiudad.anchor = GridBagConstraints.WEST;
				gbc_lblCiudad.insets = new Insets(0, 0, 5, 5);
				gbc_lblCiudad.gridx = 6;
				gbc_lblCiudad.gridy = 8;
				pnlAcogida.add(lblCiudad, gbc_lblCiudad);
			}
			{
				textField_ciudad = new JTextField();
				textField_ciudad.addKeyListener(new KeyAdapter() {
					@Override
					public void keyTyped(KeyEvent arg0) {
						char c=arg0.getKeyChar(); 
			            
				          if(Character.isDigit(c)) { 
				               
				              arg0.consume(); 
				              JOptionPane.showMessageDialog(null, "Se admiten sólo letras");  
				          } 
					}
				});
				GridBagConstraints gbc_textField_ciudad = new GridBagConstraints();
				gbc_textField_ciudad.insets = new Insets(0, 0, 5, 5);
				gbc_textField_ciudad.fill = GridBagConstraints.HORIZONTAL;
				gbc_textField_ciudad.gridx = 7;
				gbc_textField_ciudad.gridy = 8;
				pnlAcogida.add(textField_ciudad, gbc_textField_ciudad);
				textField_ciudad.setColumns(10);
			}
			{
				lblProvinciaDueño = new JLabel(MessagesRefugioIPOInter.getString("Menu.lblProvinciaDue\u00F1o.text")); //$NON-NLS-1$
				GridBagConstraints gbc_lblProvincia = new GridBagConstraints();
				gbc_lblProvincia.anchor = GridBagConstraints.WEST;
				gbc_lblProvincia.insets = new Insets(0, 0, 5, 5);
				gbc_lblProvincia.gridx = 6;
				gbc_lblProvincia.gridy = 9;
				pnlAcogida.add(lblProvinciaDueño, gbc_lblProvincia);
			}
			{
				textField_provincia = new JTextField();
				textField_provincia.addKeyListener(new KeyAdapter() {
					@Override
					public void keyTyped(KeyEvent arg0) {
						char c=arg0.getKeyChar(); 
			            
				          if(Character.isDigit(c)) { 
				               
				              arg0.consume(); 
				              JOptionPane.showMessageDialog(null, "Se admiten sólo letras");  
				          } 
					}
				});
				GridBagConstraints gbc_textField_provincia = new GridBagConstraints();
				gbc_textField_provincia.insets = new Insets(0, 0, 5, 5);
				gbc_textField_provincia.fill = GridBagConstraints.HORIZONTAL;
				gbc_textField_provincia.gridx = 7;
				gbc_textField_provincia.gridy = 9;
				pnlAcogida.add(textField_provincia, gbc_textField_provincia);
				textField_provincia.setColumns(10);
			}
			{
				lblTelefonoDueño = new JLabel(MessagesRefugioIPOInter.getString("Menu.lblTelefonoDue\u00F1o.text")); //$NON-NLS-1$
				GridBagConstraints gbc_lblTelefono = new GridBagConstraints();
				gbc_lblTelefono.anchor = GridBagConstraints.WEST;
				gbc_lblTelefono.insets = new Insets(0, 0, 5, 5);
				gbc_lblTelefono.gridx = 6;
				gbc_lblTelefono.gridy = 10;
				pnlAcogida.add(lblTelefonoDueño, gbc_lblTelefono);
			}
			
			
			MaskFormatter formatoTlfnoAc;
			try {
				formatoTlfnoAc = new MaskFormatter(" ###' ###' ###");
				
				formattedTextField_TelefAcogida = new JFormattedTextField(formatoTlfnoAc);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			formattedTextField_TelefAcogida.addFocusListener(new MiFocusListener());
			
			
			
			
			
			GridBagConstraints gbc_formattedTextField_TelefAcogida = new GridBagConstraints();
			gbc_formattedTextField_TelefAcogida.insets = new Insets(0, 0, 5, 5);
			gbc_formattedTextField_TelefAcogida.fill = GridBagConstraints.HORIZONTAL;
			gbc_formattedTextField_TelefAcogida.gridx = 7;
			gbc_formattedTextField_TelefAcogida.gridy = 10;
			pnlAcogida.add(formattedTextField_TelefAcogida, gbc_formattedTextField_TelefAcogida);
			{
				label_26 = new JLabel("*");
				GridBagConstraints gbc_label_26 = new GridBagConstraints();
				gbc_label_26.anchor = GridBagConstraints.WEST;
				gbc_label_26.insets = new Insets(0, 0, 5, 0);
				gbc_label_26.gridx = 8;
				gbc_label_26.gridy = 10;
				pnlAcogida.add(label_26, gbc_label_26);
			}
			{
				lblEmail = new JLabel("e-mail:");
				GridBagConstraints gbc_lblEmail = new GridBagConstraints();
				gbc_lblEmail.anchor = GridBagConstraints.WEST;
				gbc_lblEmail.insets = new Insets(0, 0, 5, 5);
				gbc_lblEmail.gridx = 6;
				gbc_lblEmail.gridy = 11;
				pnlAcogida.add(lblEmail, gbc_lblEmail);
			}
			{
				formattedTextField_email = new JFormattedTextField();
				formattedTextField_email.setToolTipText("ej: ..................@hotmail.com");
				GridBagConstraints gbc_formattedTextField_email = new GridBagConstraints();
				gbc_formattedTextField_email.insets = new Insets(0, 0, 5, 5);
				gbc_formattedTextField_email.fill = GridBagConstraints.HORIZONTAL;
				gbc_formattedTextField_email.gridx = 7;
				gbc_formattedTextField_email.gridy = 11;
				pnlAcogida.add(formattedTextField_email, gbc_formattedTextField_email);
			}
			{
				lblNewLabel_11 = new JLabel(MessagesRefugioIPOInter.getString("Menu.lblNewLabel_11.text_1")); //$NON-NLS-1$
				GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
				gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
				gbc_lblNewLabel_1.anchor = GridBagConstraints.WEST;
				gbc_lblNewLabel_1.gridx = 6;
				gbc_lblNewLabel_1.gridy = 12;
				pnlAcogida.add(lblNewLabel_11, gbc_lblNewLabel_1);
			}
			{
				textField_profesion = new JTextField();
				textField_profesion.addKeyListener(new KeyAdapter() {
					@Override
					public void keyTyped(KeyEvent arg0) {
						char c=arg0.getKeyChar(); 
			            
				          if(Character.isDigit(c)) { 
				               
				              arg0.consume(); 
				              JOptionPane.showMessageDialog(null, "Se admiten sólo letras");  
				          } 
					}
				});
				GridBagConstraints gbc_textField_profesion = new GridBagConstraints();
				gbc_textField_profesion.insets = new Insets(0, 0, 5, 5);
				gbc_textField_profesion.fill = GridBagConstraints.HORIZONTAL;
				gbc_textField_profesion.gridx = 7;
				gbc_textField_profesion.gridy = 12;
				pnlAcogida.add(textField_profesion, gbc_textField_profesion);
				textField_profesion.setColumns(10);
			}
			{
				lblCuestionesGenerales = new JLabel(MessagesRefugioIPOInter.getString("Menu.lblCuestionesGenerales.text")); //$NON-NLS-1$
				lblCuestionesGenerales.setFont(new Font("Tahoma", Font.PLAIN, 16));
				GridBagConstraints gbc_lblCuestionesGenerales = new GridBagConstraints();
				gbc_lblCuestionesGenerales.anchor = GridBagConstraints.NORTHWEST;
				gbc_lblCuestionesGenerales.insets = new Insets(0, 0, 5, 5);
				gbc_lblCuestionesGenerales.gridx = 7;
				gbc_lblCuestionesGenerales.gridy = 14;
				pnlAcogida.add(lblCuestionesGenerales, gbc_lblCuestionesGenerales);
			}
			btnEliminarDueño_1 = new JButton(MessagesRefugioIPOInter.getString("Menu.btnEliminarDue\u00F1o_1.text")); //$NON-NLS-1$
			btnEliminarDueño_1.setEnabled(false);
			btnEliminarDueño_1.addActionListener(new BtnEliminarDueño_1ActionListener());
			btnEliminarDueño_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			btnEliminarDueño_1.setIcon(new ImageIcon(Menu.class.getResource("/presentacion/cruz.png")));
			GridBagConstraints gbc_btnEliminar = new GridBagConstraints();
			gbc_btnEliminar.fill = GridBagConstraints.HORIZONTAL;
			gbc_btnEliminar.insets = new Insets(0, 0, 5, 5);
			gbc_btnEliminar.gridx = 1;
			gbc_btnEliminar.gridy = 15;
			pnlAcogida.add(btnEliminarDueño_1, gbc_btnEliminar);
			{
				btnBorrarDatos_3 = new JButton(MessagesRefugioIPOInter.getString("Menu.btnBorrarDatos_3.text")); //$NON-NLS-1$
				btnBorrarDatos_3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				btnBorrarDatos_3.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						
						textNombreAcogida.setText("");
						txtApellidoAcogida.setText("");
						formattedTextFieldDNI.setText("");
						textField_ciudad.setText("");
						textField_direccion.setText("");
						textField_provincia.setText("");
						formattedTextField_TelefAcogida.setText("");
						formattedTextField_email.setText("");
						formattedTextField_FechaAcogida.setText("");
						textField_profesion.setText("");
						comboBox_animales.setSelectedItem("Si");
						comboBox_tipoVivienda.setSelectedItem("Piso");
						comboBox_dormir.setSelectedItem("Caseta exterior");
						textField_mascota.setText("");
						
						
						
					}
				});
				btnBorrarDatos_3.setIcon(new ImageIcon(Menu.class.getResource("/presentacion/borrar.png")));
				GridBagConstraints gbc_btnBorrarDatos_3 = new GridBagConstraints();
				gbc_btnBorrarDatos_3.fill = GridBagConstraints.HORIZONTAL;
				gbc_btnBorrarDatos_3.insets = new Insets(0, 0, 5, 5);
				gbc_btnBorrarDatos_3.gridx = 2;
				gbc_btnBorrarDatos_3.gridy = 15;
				pnlAcogida.add(btnBorrarDatos_3, gbc_btnBorrarDatos_3);
			}
			
			{
				lblNewLabel_2 = new JLabel(MessagesRefugioIPOInter.getString("Menu.lblNewLabel_2.text")); //$NON-NLS-1$
				GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
				gbc_lblNewLabel_2.anchor = GridBagConstraints.WEST;
				gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
				gbc_lblNewLabel_2.gridx = 6;
				gbc_lblNewLabel_2.gridy = 15;
				pnlAcogida.add(lblNewLabel_2, gbc_lblNewLabel_2);
			}
			{
				comboBox_animales = new JComboBox();
				comboBox_animales.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				comboBox_animales.setModel(new DefaultComboBoxModel(new String[] {"Si", "No"}));
				GridBagConstraints gbc_comboBox_animales = new GridBagConstraints();
				gbc_comboBox_animales.insets = new Insets(0, 0, 5, 5);
				gbc_comboBox_animales.fill = GridBagConstraints.HORIZONTAL;
				gbc_comboBox_animales.gridx = 7;
				gbc_comboBox_animales.gridy = 15;
				pnlAcogida.add(comboBox_animales, gbc_comboBox_animales);
			}
			{
				btnModificarDueño_1 = new JButton(MessagesRefugioIPOInter.getString("Menu.btnModificarDue\u00F1o_1.text")); //$NON-NLS-1$
				btnModificarDueño_1.setEnabled(false);
				btnModificarDueño_1.addActionListener(new BtnModificarDueño_1ActionListener());
				btnModificarDueño_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				btnModificarDueño_1.setIcon(new ImageIcon(Menu.class.getResource("/presentacion/modificar.png")));
				GridBagConstraints gbc_btnModificar = new GridBagConstraints();
				gbc_btnModificar.fill = GridBagConstraints.HORIZONTAL;
				gbc_btnModificar.insets = new Insets(0, 0, 5, 5);
				gbc_btnModificar.gridx = 1;
				gbc_btnModificar.gridy = 16;
				pnlAcogida.add(btnModificarDueño_1, gbc_btnModificar);
			}
			{
				btnAadir_2 = new JButton(MessagesRefugioIPOInter.getString("Menu.btnAadir_2.text")); //$NON-NLS-1$
				btnAadir_2.addActionListener(new BtnAadir_2ActionListener());
				btnAadir_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				btnAadir_2.setIcon(new ImageIcon(Menu.class.getResource("/presentacion/guardar.png")));
				GridBagConstraints gbc_btnAadir_2 = new GridBagConstraints();
				gbc_btnAadir_2.fill = GridBagConstraints.HORIZONTAL;
				gbc_btnAadir_2.insets = new Insets(0, 0, 5, 5);
				gbc_btnAadir_2.gridx = 2;
				gbc_btnAadir_2.gridy = 16;
				pnlAcogida.add(btnAadir_2, gbc_btnAadir_2);
			}
			{
				lblTipoDeVivienda = new JLabel(MessagesRefugioIPOInter.getString("Menu.lblTipoDeVivienda.text")); //$NON-NLS-1$
				GridBagConstraints gbc_lblTipoDeVivienda = new GridBagConstraints();
				gbc_lblTipoDeVivienda.anchor = GridBagConstraints.WEST;
				gbc_lblTipoDeVivienda.insets = new Insets(0, 0, 5, 5);
				gbc_lblTipoDeVivienda.gridx = 6;
				gbc_lblTipoDeVivienda.gridy = 16;
				pnlAcogida.add(lblTipoDeVivienda, gbc_lblTipoDeVivienda);
			}
			{
				comboBox_tipoVivienda = new JComboBox();
				comboBox_tipoVivienda.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				comboBox_tipoVivienda.setModel(new DefaultComboBoxModel(new String[] {"Piso", "Casa", "Apartamento"}));
				GridBagConstraints gbc_comboBox_tipoVivienda = new GridBagConstraints();
				gbc_comboBox_tipoVivienda.insets = new Insets(0, 0, 5, 5);
				gbc_comboBox_tipoVivienda.fill = GridBagConstraints.HORIZONTAL;
				gbc_comboBox_tipoVivienda.gridx = 7;
				gbc_comboBox_tipoVivienda.gridy = 16;
				pnlAcogida.add(comboBox_tipoVivienda, gbc_comboBox_tipoVivienda);
			}
			{
				lblDondeDormirEl = new JLabel(MessagesRefugioIPOInter.getString("Menu.lblDondeDormirEl.text")); //$NON-NLS-1$
				GridBagConstraints gbc_lblDondeDormirEl = new GridBagConstraints();
				gbc_lblDondeDormirEl.anchor = GridBagConstraints.WEST;
				gbc_lblDondeDormirEl.insets = new Insets(0, 0, 0, 5);
				gbc_lblDondeDormirEl.gridx = 6;
				gbc_lblDondeDormirEl.gridy = 17;
				pnlAcogida.add(lblDondeDormirEl, gbc_lblDondeDormirEl);
			}
			{
				comboBox_dormir = new JComboBox();
				comboBox_dormir.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				comboBox_dormir.setModel(new DefaultComboBoxModel(new String[] {"Caseta exterior", "Caseta interior"}));
				GridBagConstraints gbc_comboBox_dormir = new GridBagConstraints();
				gbc_comboBox_dormir.insets = new Insets(0, 0, 0, 5);
				gbc_comboBox_dormir.fill = GridBagConstraints.HORIZONTAL;
				gbc_comboBox_dormir.gridx = 7;
				gbc_comboBox_dormir.gridy = 17;
				pnlAcogida.add(comboBox_dormir, gbc_comboBox_dormir);
			}
			{
				pnlBusqueda = new JPanel();
				tabbedPane.addTab("B\u00FAsqueda Perros Perdidos", new ImageIcon(Menu.class.getResource("/presentacion/busqueda.png")), pnlBusqueda, null);
				pnlBusqueda.setLayout(null);
				{
					toolBar1 = new JToolBar();
					toolBar1.setBounds(0, 0, 1162, 57);
					pnlBusqueda.add(toolBar1);
					
					{
						btnCargarMapa = new JButton(MessagesRefugioIPOInter.getString("Menu.btnCargarMapa.text")); //$NON-NLS-1$
						btnCargarMapa.addActionListener(new BtnCargarMapaActionListener());
						btnCargarMapa.setIcon(new ImageIcon(Menu.class.getResource("/presentacion/Mapa.png")));
						toolBar1.add(btnCargarMapa);
					}
					
					{
						btnBusqueda = new JButton(MessagesRefugioIPOInter.getString("Menu.btnBusqueda.text")); //$NON-NLS-1$
						btnBusqueda.addActionListener(new BtnBusquedaActionListener());
						btnBusqueda.setIcon(new ImageIcon(Menu.class.getResource("/presentacion/flecha.png")));
						toolBar1.add(btnBusqueda);
					}
					{
						btnVistoPerro = new JButton(MessagesRefugioIPOInter.getString("Menu.btnVistoPerro.text")); //$NON-NLS-1$
						btnVistoPerro.addActionListener(new BtnVistoPerroActionListener());
						btnVistoPerro.setIcon(new ImageIcon(Menu.class.getResource("/presentacion/perro.png")));
						toolBar1.add(btnVistoPerro);
					}
					{
						btnVererinaria = new JButton(MessagesRefugioIPOInter.getString("Menu.btnVererinaria.text")); //$NON-NLS-1$
						btnVererinaria.addActionListener(new BtnVererinariaActionListener());
						btnVererinaria.setIcon(new ImageIcon(Menu.class.getResource("/presentacion/Veteriaria.png")));
						toolBar1.add(btnVererinaria);
					}
					{
						btnPolicia = new JButton(MessagesRefugioIPOInter.getString("Menu.btnPolicia.text")); //$NON-NLS-1$
						btnPolicia.addActionListener(new BtnPoliciaActionListener());
						btnPolicia.setIcon(new ImageIcon(Menu.class.getResource("/presentacion/policia.png")));
						toolBar1.add(btnPolicia);
					}
					{
						btnArea = new JButton(MessagesRefugioIPOInter.getString("Menu.btnArea.text")); //$NON-NLS-1$
						btnArea.addActionListener(new BtnAreaActionListener());
						btnArea.setIcon(new ImageIcon(Menu.class.getResource("/presentacion/rectangulo.png")));
						toolBar1.add(btnArea);
					}
					{
						btnComentario = new JButton(MessagesRefugioIPOInter.getString("Menu.btnComentario.text")); //$NON-NLS-1$
						btnComentario.addActionListener(new BtnComentarioActionListener());
						btnComentario.setIcon(new ImageIcon(Menu.class.getResource("/presentacion/comentario (2).png")));
						toolBar1.add(btnComentario);
					}
					{
						button = new JButton(MessagesRefugioIPOInter.getString("Menu.button.text")); //$NON-NLS-1$
						button.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								
								for (int i = 0; i < modeloLista.size(); i++) {
									
									MiAreaDibujo.removeUltimoObjetoGrafico();
									
									
								}
								modeloLista.removeAllElements();
								MiAreaDibujo.repaint();
								frame.setCursor(Cursor.getDefaultCursor());
							}
						});
						button.setIcon(new ImageIcon(Menu.class.getResource("/presentacion/borrarMapa.png")));
						toolBar1.add(button);
					}
					
				}
				{
					{
						scrollPane_1 = new JScrollPane();
						scrollPane_1.setBounds(0, 57, 795, 506);
						pnlBusqueda.add(scrollPane_1);
						//MiAreaDibujo = new JLabel("");
						//scrollPane_1.setViewportView(MiAreaDibujo);
						
						//Creación del área de dibujo personalizada
						MiAreaDibujo = new MiAreaDibujo();
						MiAreaDibujo.addMouseMotionListener(new MiAreaDibujoMouseMotionListener());
						MiAreaDibujo.addMouseListener(new MiAreaDibujoMouseListener());
						MiAreaDibujo.setIcon(null);
						scrollPane_1.setRowHeaderView(MiAreaDibujo);
						
						JLabel label_2 = new JLabel(MessagesRefugioIPOInter.getString("Menu.label_2.text")); //$NON-NLS-1$
						label_2.setForeground(Color.WHITE);
						label_2.setIcon(new ImageIcon(Menu.class.getResource("/presentacion/datosMapa.PNG")));
						label_2.setBounds(805, 57, 357, 506);
						pnlBusqueda.add(label_2);
						
						
						//Creación de imágenes y cursores
						toolkit = Toolkit.getDefaultToolkit();
						imagBusqueda = toolkit.getImage(getClass().getClassLoader().getResource("presentacion/flecha.png"));
						imagPerro = toolkit.getImage(getClass().getClassLoader().getResource("presentacion/perro.png"));
						imagVeterinaria = toolkit.getImage(getClass().getClassLoader().getResource("presentacion/Veteriaria.png"));
						imagPolicia = toolkit.getImage(getClass().getClassLoader().getResource("presentacion/policia.png"));
						imagTexto = toolkit.getImage(getClass().getClassLoader().getResource("presentacion/comentario (1).png"));
						imagArea = toolkit.getImage(getClass().getClassLoader().getResource("presentacion/rectangulo.png"));
						
						
						//Creación de los cursores
						cursorBusqueda = toolkit.createCustomCursor(imagBusqueda,new Point(0,0),"CURSOR_BUSQUEDA");
						cursorPerro = toolkit.createCustomCursor(imagPerro,new Point(0,0),"CURSOR_PERRO");
						cursorTexto= toolkit.createCustomCursor(imagTexto,new Point(0,0),"CURSOR_TEXT");
						cursorVeterinaria = toolkit.createCustomCursor(imagVeterinaria,new Point(0,0),"CURSOR_VETERINARIA");
						cursorPolicia = toolkit.createCustomCursor(imagPolicia,new Point(0,0),"CURSOR_POLICIA");
						cursorArea = toolkit.createCustomCursor(imagArea,new Point(0,0),"CURSOR_AREA");
						
					}
					
					
					
				}
				{
					
					
					
					
				}
				
				
				
				
				
				
			}
			{
				pnlProtectora = new JPanel();
				pnlProtectora.setFont(new Font("Trebuchet MS", Font.PLAIN, 11));
				tabbedPane.addTab("Espacio de la protectora", new ImageIcon(Menu.class.getResource("/presentacion/espacios.png")), pnlProtectora, null);
				GridBagLayout gbl_pnlProtectora = new GridBagLayout();
				gbl_pnlProtectora.columnWidths = new int[]{80, 268, 44, 800, 0};
				gbl_pnlProtectora.rowHeights = new int[]{0, 40, 35, 39, 37, 39, 37, 38, 53, 50, 47, 0, 0, 0, 0, 0};
				gbl_pnlProtectora.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
				gbl_pnlProtectora.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
				pnlProtectora.setLayout(gbl_pnlProtectora);
				{
					lblNewLabel_3 = new JLabel(MessagesRefugioIPOInter.getString("Menu.lblNewLabel_3.text")); //$NON-NLS-1$
					lblNewLabel_3.setIcon(new ImageIcon(Menu.class.getResource("/presentacion/plano.png")));
					GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
					gbc_lblNewLabel_3.gridheight = 15;
					gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 0);
					gbc_lblNewLabel_3.gridx = 3;
					gbc_lblNewLabel_3.gridy = 0;
					pnlProtectora.add(lblNewLabel_3, gbc_lblNewLabel_3);
				}
				{
					label_4 = new JLabel(MessagesRefugioIPOInter.getString("Menu.label_4.text")); //$NON-NLS-1$
					label_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
					GridBagConstraints gbc_label_4 = new GridBagConstraints();
					gbc_label_4.anchor = GridBagConstraints.EAST;
					gbc_label_4.insets = new Insets(0, 0, 5, 5);
					gbc_label_4.gridx = 0;
					gbc_label_4.gridy = 1;
					pnlProtectora.add(label_4, gbc_label_4);
				}
				{
					txtCheniles = new JTextField();
					txtCheniles.setEnabled(false);
					txtCheniles.setText(MessagesRefugioIPOInter.getString("Menu.txtCheniles.text")); //$NON-NLS-1$
					GridBagConstraints gbc_txtCheniles = new GridBagConstraints();
					gbc_txtCheniles.insets = new Insets(0, 0, 5, 5);
					gbc_txtCheniles.fill = GridBagConstraints.HORIZONTAL;
					gbc_txtCheniles.gridx = 1;
					gbc_txtCheniles.gridy = 1;
					pnlProtectora.add(txtCheniles, gbc_txtCheniles);
					txtCheniles.setColumns(10);
				}
				{
					label_5 = new JLabel(MessagesRefugioIPOInter.getString("Menu.label_5.text")); //$NON-NLS-1$
					label_5.setFont(new Font("Tahoma", Font.PLAIN, 16));
					GridBagConstraints gbc_label_5 = new GridBagConstraints();
					gbc_label_5.anchor = GridBagConstraints.EAST;
					gbc_label_5.insets = new Insets(0, 0, 5, 5);
					gbc_label_5.gridx = 0;
					gbc_label_5.gridy = 2;
					pnlProtectora.add(label_5, gbc_label_5);
				}
				{
					txtComederos_1 = new JTextField();
					txtComederos_1.setText(MessagesRefugioIPOInter.getString("Menu.txtComederos_1.text")); //$NON-NLS-1$
					txtComederos_1.setEnabled(false);
					GridBagConstraints gbc_txtComederos_1 = new GridBagConstraints();
					gbc_txtComederos_1.insets = new Insets(0, 0, 5, 5);
					gbc_txtComederos_1.fill = GridBagConstraints.HORIZONTAL;
					gbc_txtComederos_1.gridx = 1;
					gbc_txtComederos_1.gridy = 2;
					pnlProtectora.add(txtComederos_1, gbc_txtComederos_1);
					txtComederos_1.setColumns(10);
				}
				{
					label_6 = new JLabel(MessagesRefugioIPOInter.getString("Menu.label_6.text")); //$NON-NLS-1$
					label_6.setFont(new Font("Tahoma", Font.PLAIN, 16));
					GridBagConstraints gbc_label_6 = new GridBagConstraints();
					gbc_label_6.anchor = GridBagConstraints.EAST;
					gbc_label_6.insets = new Insets(0, 0, 5, 5);
					gbc_label_6.gridx = 0;
					gbc_label_6.gridy = 3;
					pnlProtectora.add(label_6, gbc_label_6);
				}
				{
					txtComederos = new JTextField();
					txtComederos.setEnabled(false);
					txtComederos.setText(MessagesRefugioIPOInter.getString("Menu.txtComederos.text")); //$NON-NLS-1$
					GridBagConstraints gbc_txtComederos = new GridBagConstraints();
					gbc_txtComederos.insets = new Insets(0, 0, 5, 5);
					gbc_txtComederos.fill = GridBagConstraints.HORIZONTAL;
					gbc_txtComederos.gridx = 1;
					gbc_txtComederos.gridy = 3;
					pnlProtectora.add(txtComederos, gbc_txtComederos);
					txtComederos.setColumns(10);
				}
				{
					label_7 = new JLabel(MessagesRefugioIPOInter.getString("Menu.label_7.text")); //$NON-NLS-1$
					label_7.setFont(new Font("Tahoma", Font.PLAIN, 16));
					GridBagConstraints gbc_label_7 = new GridBagConstraints();
					gbc_label_7.anchor = GridBagConstraints.EAST;
					gbc_label_7.insets = new Insets(0, 0, 5, 5);
					gbc_label_7.gridx = 0;
					gbc_label_7.gridy = 4;
					pnlProtectora.add(label_7, gbc_label_7);
				}
				{
					txtPatioInterior = new JTextField();
					txtPatioInterior.setEnabled(false);
					txtPatioInterior.setText(MessagesRefugioIPOInter.getString("Menu.txtPatioInterior.text")); //$NON-NLS-1$
					GridBagConstraints gbc_txtPatioInterior = new GridBagConstraints();
					gbc_txtPatioInterior.insets = new Insets(0, 0, 5, 5);
					gbc_txtPatioInterior.fill = GridBagConstraints.HORIZONTAL;
					gbc_txtPatioInterior.gridx = 1;
					gbc_txtPatioInterior.gridy = 4;
					pnlProtectora.add(txtPatioInterior, gbc_txtPatioInterior);
					txtPatioInterior.setColumns(10);
				}
				{
					label_8 = new JLabel(MessagesRefugioIPOInter.getString("Menu.label_8.text")); //$NON-NLS-1$
					label_8.setFont(new Font("Tahoma", Font.PLAIN, 16));
					GridBagConstraints gbc_label_8 = new GridBagConstraints();
					gbc_label_8.anchor = GridBagConstraints.EAST;
					gbc_label_8.insets = new Insets(0, 0, 5, 5);
					gbc_label_8.gridx = 0;
					gbc_label_8.gridy = 5;
					pnlProtectora.add(label_8, gbc_label_8);
				}
				{
					txtRecibidor = new JTextField();
					txtRecibidor.setEnabled(false);
					txtRecibidor.setText(MessagesRefugioIPOInter.getString("Menu.txtRecibidor.text")); //$NON-NLS-1$
					GridBagConstraints gbc_txtRecibidor = new GridBagConstraints();
					gbc_txtRecibidor.insets = new Insets(0, 0, 5, 5);
					gbc_txtRecibidor.fill = GridBagConstraints.HORIZONTAL;
					gbc_txtRecibidor.gridx = 1;
					gbc_txtRecibidor.gridy = 5;
					pnlProtectora.add(txtRecibidor, gbc_txtRecibidor);
					txtRecibidor.setColumns(10);
				}
				{
					label_9 = new JLabel(MessagesRefugioIPOInter.getString("Menu.label_9.text")); //$NON-NLS-1$
					label_9.setFont(new Font("Tahoma", Font.PLAIN, 16));
					GridBagConstraints gbc_label_9 = new GridBagConstraints();
					gbc_label_9.anchor = GridBagConstraints.EAST;
					gbc_label_9.insets = new Insets(0, 0, 5, 5);
					gbc_label_9.gridx = 0;
					gbc_label_9.gridy = 6;
					pnlProtectora.add(label_9, gbc_label_9);
				}
				{
					txtEnfermera = new JTextField();
					txtEnfermera.setEnabled(false);
					txtEnfermera.setText(MessagesRefugioIPOInter.getString("Menu.txtEnfermera.text")); //$NON-NLS-1$
					GridBagConstraints gbc_txtEnfermera = new GridBagConstraints();
					gbc_txtEnfermera.insets = new Insets(0, 0, 5, 5);
					gbc_txtEnfermera.fill = GridBagConstraints.HORIZONTAL;
					gbc_txtEnfermera.gridx = 1;
					gbc_txtEnfermera.gridy = 6;
					pnlProtectora.add(txtEnfermera, gbc_txtEnfermera);
					txtEnfermera.setColumns(10);
				}
				{
					label_10 = new JLabel(MessagesRefugioIPOInter.getString("Menu.label_10.text")); //$NON-NLS-1$
					label_10.setFont(new Font("Tahoma", Font.PLAIN, 16));
					GridBagConstraints gbc_label_10 = new GridBagConstraints();
					gbc_label_10.anchor = GridBagConstraints.EAST;
					gbc_label_10.insets = new Insets(0, 0, 5, 5);
					gbc_label_10.gridx = 0;
					gbc_label_10.gridy = 7;
					pnlProtectora.add(label_10, gbc_label_10);
				}
				{
					txtLavabos = new JTextField();
					txtLavabos.setEnabled(false);
					txtLavabos.setText(MessagesRefugioIPOInter.getString("Menu.txtLavabos.text")); //$NON-NLS-1$
					GridBagConstraints gbc_txtLavabos = new GridBagConstraints();
					gbc_txtLavabos.fill = GridBagConstraints.HORIZONTAL;
					gbc_txtLavabos.insets = new Insets(0, 0, 5, 5);
					gbc_txtLavabos.gridx = 1;
					gbc_txtLavabos.gridy = 7;
					pnlProtectora.add(txtLavabos, gbc_txtLavabos);
					txtLavabos.setColumns(10);
				}
				{
					btnModificarDatos = new JButton(MessagesRefugioIPOInter.getString("Menu.btnModificarDatos.text")); //$NON-NLS-1$
					btnModificarDatos.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
					btnModificarDatos.setIcon(new ImageIcon(Menu.class.getResource("/presentacion/modificar.png")));
					btnModificarDatos.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
							txtCheniles.setEnabled(true);
							txtLavabos.setEnabled(true);
							txtEnfermera.setEnabled(true);
							txtRecibidor.setEnabled(true);
							txtComederos.setEnabled(true);
							txtPatioInterior.setEnabled(true);
							txtComederos_1.setEnabled(true);
							
						}
					});
					GridBagConstraints gbc_btnModificarDatos = new GridBagConstraints();
					gbc_btnModificarDatos.fill = GridBagConstraints.HORIZONTAL;
					gbc_btnModificarDatos.insets = new Insets(0, 0, 5, 5);
					gbc_btnModificarDatos.gridx = 1;
					gbc_btnModificarDatos.gridy = 9;
					pnlProtectora.add(btnModificarDatos, gbc_btnModificarDatos);
				}
				{
					btnGuardarDatos = new JButton(MessagesRefugioIPOInter.getString("Menu.btnGuardarDatos.text")); //$NON-NLS-1$
					btnGuardarDatos.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
					btnGuardarDatos.setIcon(new ImageIcon(Menu.class.getResource("/presentacion/guardar.png")));
					btnGuardarDatos.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {
							
							txtCheniles.setEnabled(false);
							txtLavabos.setEnabled(false);
							txtEnfermera.setEnabled(false);
							txtRecibidor.setEnabled(false);
							txtComederos.setEnabled(false);
							txtPatioInterior.setEnabled(false);
							txtComederos_1.setEnabled(false);
							
							
						}
					});
					GridBagConstraints gbc_btnGuardarDatos = new GridBagConstraints();
					gbc_btnGuardarDatos.fill = GridBagConstraints.HORIZONTAL;
					gbc_btnGuardarDatos.insets = new Insets(0, 0, 5, 5);
					gbc_btnGuardarDatos.gridx = 1;
					gbc_btnGuardarDatos.gridy = 10;
					pnlProtectora.add(btnGuardarDatos, gbc_btnGuardarDatos);
				}
			}
		}
		}
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setAlignmentX(Component.RIGHT_ALIGNMENT);
		frame.setJMenuBar(menuBar);
		
		JMenu mnAyuda = new JMenu(MessagesRefugioIPOInter.getString("Menu.mnAyuda.text")); //$NON-NLS-1$
		mnAyuda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		mnAyuda.setAlignmentX(Component.RIGHT_ALIGNMENT);
		mnAyuda.setHorizontalAlignment(SwingConstants.RIGHT);
		menuBar.add(mnAyuda);
		{
			mntmAcercaDe = new JMenuItem(MessagesRefugioIPOInter.getString("Menu.mntmAcercaDe.text")); //$NON-NLS-1$
			mntmAcercaDe.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					JOptionPane.showMessageDialog(frame, "Autores: \t\n    Antonio García-Peñuela Molina-Prados \t\n    Mª Dolores Sesmero Pozo \nFecha creación: 05/01/2016 \nVersión: 0.1", "Información", JOptionPane.PLAIN_MESSAGE); 
					
				}
			});
			mnAyuda.add(mntmAcercaDe);
		}
	}
	
	private class MiFocusListener extends FocusAdapter {
		@Override
		public void focusGained(FocusEvent e) {
			//e.getComponent().setBackground(new Color(250,250,210));
		}
	}
	
	
	private class BtnCargarMapaActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			JFileChooser fcAbrir = new JFileChooser();
			int valorDevuelto = fcAbrir.showOpenDialog(frame);
			
			if (valorDevuelto == JFileChooser.APPROVE_OPTION) {
				borrar();
				File file = fcAbrir.getSelectedFile();
				imagen = new ImageIcon(file.getAbsolutePath());
				MiAreaDibujo.setIcon(imagen);

			}
			
		}
		
		private void borrar() {
			for (int i = 0; i < modeloLista.size(); i++) {
				
				MiAreaDibujo.removeUltimoObjetoGrafico();
				
				
			}
			modeloLista.removeAllElements();
			
		}
		
	}
	private class BtnBusquedaActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			modo = BUSQUEDA;
			frame.setCursor(cursorBusqueda);
		}
	}
	private class BtnVistoPerroActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			modo = PERRO;
			frame.setCursor(cursorPerro);
		}
	}
	private class BtnVererinariaActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			modo = VETERINARIA;
			frame.setCursor(cursorVeterinaria);
		}
	}
	private class BtnPoliciaActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			modo = POLICIA;
			frame.setCursor(cursorPolicia);
		}
	}
	private class BtnAreaActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			modo = AREA;
			frame.setCursor(cursorArea);
		}
	}
	private class BtnComentarioActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			modo = TEXTO;
			frame.setCursor(cursorTexto);
		}
	}
	private class MiAreaDibujoMouseListener extends MouseAdapter {
		public void mousePressed(MouseEvent e) {
			x = e.getX();
			y = e.getY();
			if (imagen != null){
			switch (modo){
			case BUSQUEDA:
			MiAreaDibujo.addObjetoGrafico(new ImagenGrafico(x,y,imagBusqueda));
			MiAreaDibujo.repaint();
			modeloLista.addElement("Busqueda");
			break;
			
			case PERRO:
			MiAreaDibujo.addObjetoGrafico(new ImagenGrafico(x,y,imagPerro));
			MiAreaDibujo.repaint();
			modeloLista.addElement("Perro");
			break;
			
			case VETERINARIA:
				MiAreaDibujo.addObjetoGrafico(new ImagenGrafico(x,y,imagVeterinaria));
				MiAreaDibujo.repaint();
				modeloLista.addElement("Veterinaria");
				break;
			
			case POLICIA:
				MiAreaDibujo.addObjetoGrafico(new ImagenGrafico(x,y,imagPolicia));
				MiAreaDibujo.repaint();
				modeloLista.addElement("Policia");
				break;
			
			case AREA:
				MiAreaDibujo.addObjetoGrafico(new AreaGrafico(x,y,x,y,Color.RED));
				modeloLista.addElement("Area");
						break;
			case TEXTO:
				txtTexto.setBounds(x, y, 200,30);
				txtTexto.setVisible(true);
				txtTexto.requestFocus();
				txtTexto.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg) {
						if(!txtTexto.getText().equals("")){
							MiAreaDibujo.addObjetoGrafico(new TextoGrafico(x, y+15, txtTexto.getText(), Color.BLUE));
							modeloLista.addElement("Texto");
						}
						txtTexto.setText("");
						txtTexto.setVisible(false);
						MiAreaDibujo.repaint();
					}
				}
				
						);
				MiAreaDibujo.add(txtTexto);
				
				break;
			}
			}
			
		}
	}
	private class MiAreaDibujoMouseMotionListener extends MouseMotionAdapter {
		@Override
		public void mouseDragged(MouseEvent e) {
			if (modo == AREA && imagen!=null) {
				((AreaGrafico)MiAreaDibujo.getUltimoObjetoGrafico()).setX1(e.getX());
				((AreaGrafico)MiAreaDibujo.getUltimoObjetoGrafico()).setY1(e.getY());
				MiAreaDibujo.repaint();
				}
		}
	}
	private class BtnEliminarSocioActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			GestorSocio g3=new GestorSocio();
			try {
				g3.delete(dni);
				
				txtNombreSocio.setText("");
				txtApellidosSocio.setText("");
				formattedTextField_DniSocio.setText("");
				lblFotoSocio.setIcon(new ImageIcon(Menu.class.getResource("/presentacion/Usuario1.png")));
				txtCiudadSocio.setText("");
				textdireccionSocio.setText("");
				txtProvinciaSocio.setText("");
				formattedTextField_TelefSocio.setText("");
				txtCorreoSocio.setText("");
				formattedTextField_FechaSocio.setText("");
				formattedTextField_cuenta.setText("");
				comboBox_aportacionSocio.setSelectedItem("5");

				int index = list_4.getSelectedIndex(); 
				
				modeloLista4.remove(index); 
				JOptionPane.showMessageDialog(frame, "Socio eliminado");
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				JOptionPane.showMessageDialog(frame, "Error al eliminar");
				e1.printStackTrace();
			}
		}
	}
	private class BtnListarSociosActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			try{
				modeloLista4.clear();
				GestorSocio g5=new GestorSocio();
				String[] datosLista= g5.read();
				if(datosLista.length!=0){
					for(int i=0; i<datosLista.length; i++){
						 modeloLista4.addElement(datosLista[i]);//nombre es el campo de la base de datos
					}
				           
				    list_4.setModel(modeloLista4);
				}else{
					JOptionPane.showMessageDialog(frame, "No hay ningún socio en la BBDD");
				}
				
				
			}catch(Exception ex1){
				ex1.printStackTrace();
			}
		}
	}
	private class BtnModificarSocioActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			
			if(txtNombreSocio.getText().trim().length()!=0 && txtApellidosSocio.getText().trim().length()!=0 && formattedTextField_DniSocio.getText().trim().length()!=0 && formattedTextField_TelefSocio.getText().trim().length()!=0){
				
				
				
				Socio s= new Socio(formattedTextField_DniSocio.getText().toString(), txtNombreSocio.getText(), txtApellidosSocio.getText(), 
						formattedTextField_FechaSocio.getText().toString(), formattedTextField_TelefSocio.getText().toString(), 
						textdireccionSocio.getText().toString(), txtCiudadSocio.getText(), txtProvinciaSocio.getText(), 
						txtCorreoSocio.getText(), lblFotoSocio.getIcon().toString(),formattedTextField_cuenta.getText().toString(),comboBox_aportacionSocio.getSelectedItem().toString() );
				
				txtNombreSocio.setText("");
				txtApellidosSocio.setText("");
				formattedTextField_DniSocio.setText("");
				lblFotoSocio.setIcon(new ImageIcon(Menu.class.getResource("/presentacion/Usuario1.png")));
				txtCiudadSocio.setText("");
				textdireccionSocio.setText("");
				txtProvinciaSocio.setText("");
				formattedTextField_TelefSocio.setText("");
				txtCorreoSocio.setText("");
				formattedTextField_FechaSocio.setText("");
				formattedTextField_cuenta.setText("");
				comboBox_aportacionSocio.setSelectedItem("5");
				
				
				try{
					s.modificarSocio(dni, s);
					JOptionPane.showMessageDialog(frame, "Socio modificado correctamente");
				}catch(Exception ex){
					ex.printStackTrace();
					JOptionPane.showMessageDialog(frame, "Error al modificar");
				}
				
				
				
			}else{
				 JOptionPane.showMessageDialog(frame, "Debe rellenar todos los campos obligatorios");
			}
			
			
		}
		
	}
	private class BtnEliminarDueño_1ActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			GestorCasa g6=new GestorCasa();
			try {
				g6.delete(dni);
				
				textNombreAcogida.setText("");
				txtApellidoAcogida.setText("");
				formattedTextFieldDNI.setText("");
				textField_ciudad.setText("");
				textField_direccion.setText("");
				textField_provincia.setText("");
				formattedTextField_TelefAcogida.setText("");
				formattedTextField_email.setText("");
				formattedTextField_FechaAcogida.setText("");
				textField_profesion.setText("");
				comboBox_animales.setSelectedItem("Si");
				comboBox_tipoVivienda.setSelectedItem("Piso");
				comboBox_dormir.setSelectedItem("Caseta exterior");
				textField_mascota.setText("");
				
				int index = list_3.getSelectedIndex(); 
				
				modeloLista5.remove(index); 
				JOptionPane.showMessageDialog(frame, "Casa de acogida eliminada");
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				JOptionPane.showMessageDialog(frame, "Error al eliminar");
				e1.printStackTrace();
			}
			
		}
	}
	private class BtnModificarDueño_1ActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if(textNombreAcogida.getText().trim().length()!=0 && txtApellidoAcogida.getText().trim().length()!=0 && formattedTextFieldDNI.getText().trim().length()!=0 && formattedTextField_TelefAcogida.getText().trim().length()!=0){
				
				
				
				Casa s= new Casa(formattedTextFieldDNI.getText().toString(), textNombreAcogida.getText(), txtApellidoAcogida.getText(),  
						textField_direccion.getText(), textField_ciudad.getText(), 
						textField_provincia.getText(), formattedTextField_FechaAcogida.getText().toString(), formattedTextField_TelefAcogida.getText().toString(), 
						formattedTextField_email.getText().toString(),textField_profesion.getText() ,comboBox_animales.getSelectedItem().toString(),comboBox_tipoVivienda.getSelectedItem().toString(),comboBox_dormir.getSelectedItem().toString(), textField_mascota.getText() );
				
				textNombreAcogida.setText("");
				txtApellidoAcogida.setText("");
				formattedTextFieldDNI.setText("");
				textField_ciudad.setText("");
				textField_direccion.setText("");
				textField_provincia.setText("");
				formattedTextField_TelefAcogida.setText("");
				formattedTextField_email.setText("");
				formattedTextField_FechaAcogida.setText("");
				textField_profesion.setText("");
				comboBox_animales.setSelectedItem("Si");
				comboBox_tipoVivienda.setSelectedItem("Piso");
				comboBox_dormir.setSelectedItem("Caseta exterior");
				textField_mascota.setText("");
				
				
				try{
					s.modificarCasa(dni, s);
					JOptionPane.showMessageDialog(frame, "Casa modificada correctamente");
				}catch(Exception ex){
					ex.printStackTrace();
					JOptionPane.showMessageDialog(frame, "Error al modificar");
				}
				
				
				
			}else{
				 JOptionPane.showMessageDialog(frame, "Debe rellenar todos los campos obligatorios");
			}
		}
	}
	private class BtnAadir_2ActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if(textNombreAcogida.getText().trim().length()!=0 && txtApellidoAcogida.getText().trim().length()!=0 && formattedTextFieldDNI.getText().trim().length()!=0 && formattedTextField_TelefAcogida.getText().trim().length()!=0){
				
				
				
				Casa s= new Casa(formattedTextFieldDNI.getText().toString(), textNombreAcogida.getText(), txtApellidoAcogida.getText(), 
						textField_direccion.getText(), textField_ciudad.getText(), 
						textField_provincia.getText(), formattedTextField_FechaAcogida.getText().toString(), formattedTextField_TelefAcogida.getText().toString(), 
						formattedTextField_email.getText().toString(),textField_profesion.getText() ,comboBox_animales.getSelectedItem().toString(),comboBox_tipoVivienda.getSelectedItem().toString(),comboBox_dormir.getSelectedItem().toString(), textField_mascota.getText() );
				
				textNombreAcogida.setText("");
				txtApellidoAcogida.setText("");
				formattedTextFieldDNI.setText("");
				textField_ciudad.setText("");
				textField_direccion.setText("");
				textField_provincia.setText("");
				formattedTextField_TelefAcogida.setText("");
				formattedTextField_email.setText("");
				formattedTextField_FechaAcogida.setText("");
				textField_profesion.setText("");
				comboBox_animales.setSelectedItem("Si");
				comboBox_tipoVivienda.setSelectedItem("Piso");
				comboBox_dormir.setSelectedItem("Caseta exterior");
				textField_mascota.setText("");
				
				try{
					s.insertarCasa(s);
					JOptionPane.showMessageDialog(frame, "Casa guardada correctamente");
				}catch(Exception ex){
					ex.printStackTrace();
					JOptionPane.showMessageDialog(frame, "Error al guardar");
				}
				
				
				
			}else{
				 JOptionPane.showMessageDialog(frame, "Debe rellenar todos los campos obligatorios");
			}
			
			
		}
	}
	private class BtnListarAcogedoresActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			try{
				modeloLista5.clear();
				GestorCasa g5=new GestorCasa();
				String[] datosLista= g5.read();
				if(datosLista.length!=0){
					for(int i=0; i<datosLista.length; i++){
						 modeloLista5.addElement(datosLista[i]);//nombre es el campo de la base de datos
					}
				           
				    list_3.setModel(modeloLista5);
				}else{
					JOptionPane.showMessageDialog(frame, "No hay ninguna casa en la BBDD");
				}
				
				
			}catch(Exception ex1){
				ex1.printStackTrace();
			}
		}
	}
	public boolean isNumeric(char caracter){
		try {
		Integer.parseInt(String.valueOf(caracter));
		return true;
		} catch (NumberFormatException ex){
			return false;
		}
	}
}
