package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

import dao.ActorDAOImplementacion;
import modelo.Actor;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JTextArea;
import java.awt.Color;

public class GUIProyecto {

	private JFrame frame;
	private JTextField txtId;
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtFecha;
	String idIntroducido;
	String nombre;
	String apellido;
	String fecha;
	ActorDAOImplementacion actorDAO = new ActorDAOImplementacion();
	Actor actor1;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUIProyecto window = new GUIProyecto();
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
	public GUIProyecto() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(Color.PINK);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.getContentPane().setLayout(null);
		txtId = new JTextField();
		txtId.setBounds(77, 11, 124, 20);
		frame.getContentPane().add(txtId);
		txtId.setColumns(10);

		txtNombre = new JTextField();
		txtNombre.setBounds(77, 37, 124, 20);
		frame.getContentPane().add(txtNombre);
		txtNombre.setColumns(10);

		txtApellido = new JTextField();
		txtApellido.setBounds(77, 68, 124, 20);
		frame.getContentPane().add(txtApellido);
		txtApellido.setColumns(10);
		
		txtFecha = new JTextField();
		txtFecha.setBounds(77, 94, 124, 20);
		frame.getContentPane().add(txtFecha);
		txtFecha.setColumns(10);

		JButton btnNewButton = new JButton("Insert");
		btnNewButton.setBounds(278, 5, 89, 21);
		frame.getContentPane().add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				idIntroducido = txtId.getText();
				nombre = txtNombre.getText();
				apellido = txtApellido.getText();
				fecha = txtFecha.getText();
				try {
					actorDAO.saveActor(new Actor(Integer.parseInt(idIntroducido), nombre, apellido, fecha));
				} catch (SQLException e1) {
					e1.printStackTrace();
				}

			}
		});

		JButton btnNewButton_1 = new JButton("Update");
		btnNewButton_1.setBounds(278, 36, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				idIntroducido = txtId.getText();
				try {
					

				} catch (SQLException e1) {
					e1.printStackTrace();
				}

			}
		});
		
		JButton btnNewButton_2 = new JButton("Delete");
		btnNewButton_2.setBounds(278, 67, 89, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		JTextArea textArea = new JTextArea();
		textArea.setForeground(Color.PINK);
		textArea.setBounds(77, 141, 237, 34);
		frame.getContentPane().add(textArea);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				idIntroducido = txtId.getText();
				try {
					
					
					
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
				
			}
		});
		
		
	}
}
