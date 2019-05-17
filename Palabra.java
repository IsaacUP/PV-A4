import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JList;

public class Palabra extends JFrame implements ActionListener {

	private JLabel mensaje;
	private JLabel mensajePal;
	private JLabel mensajeLong;
	private JLabel mensajeInv;
	private JLabel mensajeRep;
	private JButton boton;
	private JTextField caja1;
//		private JTextField caja2;
//		private JList<Integer> lista;
//		private DefaultListModel<Integer> model = new DefaultListModel();
	private String selectIva;
	
	public Palabra() {
		super();
		configurarVentana();
		crearComponentes();
	}

	private void configurarVentana(){
		this.setTitle("Palabra");
		this.setSize(300, 200);
		this.setLocationRelativeTo(null);
		this.setLayout(null);
		this.setResizable(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	private void crearComponentes() {
		mensaje = new JLabel();
		mensaje.setText("Palabra");
		mensaje.setBounds(50, 8, 100, 30);
		this.add(mensaje);
		
		caja1 = new JTextField();
		caja1.setBounds(96, 8, 100, 30);
		this.add(caja1);
		
		boton = new JButton();
		boton.setText("Verificar");
		boton.setBounds(96, 38, 100, 30);
		boton.addActionListener(this);
		this.add(boton);
		
		mensaje = new JLabel();
		mensaje.setText("Palindromo: ");
		mensaje.setBounds(50, 70, 100, 30);
		this.add(mensaje);
		
		mensaje = new JLabel();
		mensaje.setText("Longitud: ");
		mensaje.setBounds(50, 90, 100, 30);
		this.add(mensaje);
		
		mensaje = new JLabel();
		mensaje.setText("Inversa: ");
		mensaje.setBounds(50, 110, 100, 30);
		this.add(mensaje);
		
		mensaje = new JLabel();
		mensaje.setText("Repetidas: ");
		mensaje.setBounds(50, 130, 100, 30);
		this.add(mensaje);
		
		mensajePal = new JLabel();
		mensajePal.setText(" ");
		mensajePal.setBounds(150, 70, 100, 30);
		this.add(mensajePal);
		
		mensajeLong = new JLabel(" ");
		mensajeLong.setText(" ");
		mensajeLong.setBounds(150, 90, 100, 30);
		this.add(mensajeLong);
		
		mensajeInv = new JLabel();
		mensajeInv.setText(" ");
		mensajeInv.setBounds(150, 110, 100, 30);
		this.add(mensajeInv);
		
		mensajeRep = new JLabel();
		mensajeRep.setText(" ");
		mensajeRep.setBounds(150, 130, 100, 30);
		this.add(mensajeRep);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String str1 = caja1.getText().replace(" ", "");

	
		
			
		int longitud= str1.length();
		
		String inversa = "";
		for (int i = longitud - 1; i >= 0; i--) {
			inversa += str1.charAt(i);
		}
		
		String palindromo = "No";
		int cont = 0;
		for (int i = 0; i < longitud; i++) {
			if (str1.charAt(i) == inversa.charAt(cont)) {
				cont++;
			}
		}
		if (cont == longitud) {
			palindromo = "Si";
		}
		
		String repetida = " ";
		int max = 0;
		for (int i = 0; i < longitud; i++) {
			char letra = str1.charAt(i);
			cont = 0;
			for (int j = 0; j < longitud; j++) {
				if (letra == str1.charAt(j)) {
					cont++;
				}
			}
			if (cont > max) {
				max = cont;
				repetida = str1.charAt(i) + " ";
			}
		}
		
		mensajeLong.setText(Integer.toString(longitud));
		mensajeInv.setText(str1);
		mensajeRep.setText(repetida);
		mensajePal.setText(palindromo);
	}
	
	public static void main(String[] args) {
		Palabra ventana = new Palabra();
		ventana.setVisible(true);
	}
}
