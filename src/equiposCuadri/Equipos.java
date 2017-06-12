package equiposCuadri;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JSeparator;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JTextArea;
import javax.swing.JButton;

public class Equipos extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField portero1t;
	private JTextField portero2t;
	private JTextField jugador1t;
	private JTextField jugador2t;
	private JTextField jugador3t;
	private JTextField jugador4t;
	private JTextField jugador5t;
	private JTextField jugador6t;
	private JTextField jugador7t;
	private JTextField jugador8t;
	JTextArea equipo1box;
	JTextArea equipo2box;
	JButton btncrear = new JButton();
	private JButton Crear;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Equipos frame = new Equipos();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Equipos() {
		setTitle("Equipo patxanga");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Asier\\Desktop\\pp.jfif"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 491, 498);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblPortero = new JLabel("Portero 1:");
		lblPortero.setBounds(6, 20, 61, 16);
		contentPane.add(lblPortero);

		portero1t = new JTextField();
		portero1t.setBounds(76, 15, 130, 26);
		contentPane.add(portero1t);
		portero1t.setColumns(10);

		JLabel lblPortero_1 = new JLabel("Portero 2");
		lblPortero_1.setBounds(238, 20, 61, 16);
		contentPane.add(lblPortero_1);

		portero2t = new JTextField();
		portero2t.setBounds(314, 15, 130, 26);
		contentPane.add(portero2t);
		portero2t.setColumns(10);

		JLabel lblJugador = new JLabel("Jugador 1:");
		lblJugador.setBounds(6, 62, 71, 16);
		contentPane.add(lblJugador);

		JLabel lblJugador_1 = new JLabel("Jugador 2:");
		lblJugador_1.setBounds(6, 105, 71, 16);
		contentPane.add(lblJugador_1);

		JLabel lblJugador_2 = new JLabel("Jugador 3:");
		lblJugador_2.setBounds(6, 150, 71, 16);
		contentPane.add(lblJugador_2);

		JLabel lblJugador_3 = new JLabel("Jugador 4:");
		lblJugador_3.setBounds(6, 197, 71, 16);
		contentPane.add(lblJugador_3);

		jugador1t = new JTextField();
		jugador1t.setColumns(10);
		jugador1t.setBounds(76, 57, 130, 26);
		contentPane.add(jugador1t);

		jugador2t = new JTextField();
		jugador2t.setColumns(10);
		jugador2t.setBounds(76, 100, 130, 26);
		contentPane.add(jugador2t);

		jugador3t = new JTextField();
		jugador3t.setColumns(10);
		jugador3t.setBounds(76, 145, 130, 26);
		contentPane.add(jugador3t);

		jugador4t = new JTextField();
		jugador4t.setColumns(10);
		jugador4t.setBounds(76, 192, 130, 26);
		contentPane.add(jugador4t);

		JLabel lblJugador_4 = new JLabel("Jugador 5:");
		lblJugador_4.setBounds(228, 62, 71, 16);
		contentPane.add(lblJugador_4);

		JLabel lblJugador_5 = new JLabel("Jugador 6:");
		lblJugador_5.setBounds(228, 105, 71, 16);
		contentPane.add(lblJugador_5);

		JLabel lblJugador_6 = new JLabel("Jugador 7:");
		lblJugador_6.setBounds(228, 150, 71, 16);
		contentPane.add(lblJugador_6);

		JLabel lblJugador_7 = new JLabel("Jugador 8:");
		lblJugador_7.setBounds(228, 197, 71, 16);
		contentPane.add(lblJugador_7);

		jugador5t = new JTextField();
		jugador5t.setColumns(10);
		jugador5t.setBounds(314, 53, 130, 26);
		contentPane.add(jugador5t);

		jugador6t = new JTextField();
		jugador6t.setColumns(10);
		jugador6t.setBounds(314, 100, 130, 26);
		contentPane.add(jugador6t);

		jugador7t = new JTextField();
		jugador7t.setColumns(10);
		jugador7t.setBounds(314, 145, 130, 26);
		contentPane.add(jugador7t);

		jugador8t = new JTextField();
		jugador8t.setColumns(10);
		jugador8t.setBounds(314, 192, 130, 26);
		contentPane.add(jugador8t);

		JLabel lblEquipoFinal = new JLabel("EQUIPO FINAL");
		lblEquipoFinal.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		lblEquipoFinal.setBounds(175, 252, 138, 16);
		contentPane.add(lblEquipoFinal);

		JSeparator separator = new JSeparator();
		separator.setBounds(20, 228, 424, 6);
		contentPane.add(separator);

		equipo1box = new JTextArea();
		equipo1box.setBounds(10, 298, 130, 161);
		contentPane.add(equipo1box);
		btncrear.addActionListener(this);

		JLabel lblEquipo = new JLabel("Equipo 1");
		lblEquipo.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEquipo.setBounds(43, 281, 61, 16);
		contentPane.add(lblEquipo);

		equipo2box = new JTextArea();
		equipo2box.setBounds(314, 298, 130, 161);
		contentPane.add(equipo2box);
		btncrear.addActionListener(this);

		JLabel lblEquipo_1 = new JLabel("Equipo 2");
		lblEquipo_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEquipo_1.setBounds(345, 281, 61, 16);
		contentPane.add(lblEquipo_1);

		Crear = new JButton("\u00A1Crear!");
		Crear.setFont(new Font("Tahoma", Font.BOLD, 11));
		Crear.setBounds(188, 279, 89, 23);
		contentPane.add(Crear);
		
		JLabel lblByAsierpark = new JLabel("By: AsierPark");
		lblByAsierpark.setBounds(188, 445, 109, 14);
		contentPane.add(lblByAsierpark);
		Crear.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(Crear)) {
			String jugador1, jugador2, jugador3, jugador4, jugador5, jugador6, jugador7, jugador8;
			String portero1, portero2;
			String[] equipo1 = new String[5];
			String[] equipo2 = new String[5];
			short i, cont1 = 0, cont2 = 0;
			Random aleat = new Random();
			int n = 0 + aleat.nextInt(2);
			jugador1 = jugador1t.getText();
			n = 0 + aleat.nextInt(2);
			if (n == 0) {
				if (cont1 < 4) {
					equipo1[cont1] = jugador1;
					cont1++;
				} else {
					equipo2[cont2] = jugador1;
					cont2++;
				}
			} else {
				if (cont2 < 4) {
					equipo2[cont2] = jugador1;
					cont2++;
				} else {
					equipo1[cont1] = jugador1;
					cont1++;
				}
			}

			jugador2 = jugador2t.getText();
			n = 0 + aleat.nextInt(2);
			if (n == 0) {
				if (cont1 < 4) {
					equipo1[cont1] = jugador2;
					cont1++;
				} else {
					equipo2[cont2] = jugador2;
					cont2++;
				}
			} else {
				if (cont2 < 4) {
					equipo2[cont2] = jugador2;
					cont2++;
				} else {
					equipo1[cont1] = jugador2;
					cont1++;
				}
			}
			jugador3 = jugador3t.getText();
			n = 0 + aleat.nextInt(2);
			if (n == 0) {
				if (cont1 < 4) {
					equipo1[cont1] = jugador3;
					cont1++;
				} else {
					equipo2[cont2] = jugador3;
					cont2++;
				}
			} else {
				if (cont2 < 4) {
					equipo2[cont2] = jugador3;
					cont2++;
				} else {
					equipo1[cont1] = jugador3;
					cont1++;
				}
			}
			jugador4 = jugador4t.getText();
			n = 0 + aleat.nextInt(2);
			if (n == 0) {
				if (cont1 < 4) {
					equipo1[cont1] = jugador4;
					cont1++;
				} else {
					equipo2[cont2] = jugador4;
					cont2++;
				}
			} else {
				if (cont2 < 4) {
					equipo2[cont2] = jugador4;
					cont2++;
				} else {
					equipo1[cont1] = jugador4;
					cont1++;
				}
			}
			jugador5 = jugador5t.getText();
			n = 0 + aleat.nextInt(2);
			if (n == 0) {
				if (cont1 < 4) {
					equipo1[cont1] = jugador5;
					cont1++;
				} else {
					equipo2[cont2] = jugador5;
					cont2++;
				}
			} else {
				if (cont2 < 4) {
					equipo2[cont2] = jugador5;
					cont2++;
				} else {
					equipo1[cont1] = jugador5;
					cont1++;
				}
			}
			jugador6 = jugador6t.getText();
			n = 0 + aleat.nextInt(2);
			if (n == 0) {
				if (cont1 < 4) {
					equipo1[cont1] = jugador6;
					cont1++;
				} else {
					equipo2[cont2] = jugador6;
					cont2++;
				}
			} else {
				if (cont2 < 4) {
					equipo2[cont2] = jugador6;
					cont2++;
				} else {
					equipo1[cont1] = jugador6;
					cont1++;
				}
			}
			jugador7 = jugador7t.getText();
			n = 0 + aleat.nextInt(2);
			if (n == 0) {
				if (cont1 < 4) {
					equipo1[cont1] = jugador7;
					cont1++;
				} else {
					equipo2[cont2] = jugador7;
					cont2++;
				}
			} else {
				if (cont2 < 4) {
					equipo2[cont2] = jugador7;
					cont2++;
				} else {
					equipo1[cont1] = jugador7;
					cont1++;
				}
			}
			jugador8 = jugador8t.getText();
			n = 0 + aleat.nextInt(2);
			if (n == 0) {
				if (cont1 < 4) {
					equipo1[cont1] = jugador8;
					cont1++;
				} else {
					equipo2[cont2] = jugador8;
					cont2++;
				}
			} else {
				if (cont2 < 4) {
					equipo2[cont2] = jugador8;
					cont2++;
				} else {
					equipo1[cont1] = jugador8;
					cont1++;
				}
			}
			portero1 = portero1t.getText();
			equipo1box.append(portero1 + "\n");
			portero2 = portero2t.getText();
			equipo2box.append(portero2 + "\n");
			for (i = 0; i < 4; i++) {
				equipo1box.append(equipo1[i].toString() + "\n");
			}
			for (i = 0; i < 4; i++) {
				equipo2box.append(equipo2[i].toString() + "\n");
			}
			for (i = 0; i < 4; i++) {
				equipo2[i].toString();
			}
			for (i = 0; i < 4; i++) {
				equipo1[i].toString();
			}
		}
	}
}
