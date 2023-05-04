package Ejercicio;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JPanel;

import javax.swing.border.EmptyBorder;

import java.util.ArrayList;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Principal extends JFrame{
 
	private JPanel contentPane;
	private static DefaultListModel<Peliculas> listModel;
	private ArrayList<Genero> listaGeneros;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
					//INSTANCIO EL LISTMODEL
					listModel = new DefaultListModel<Peliculas>();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

public Principal() {

	setTitle("Programa");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setBounds(100, 100, 650, 500);
	
	JMenuBar menuBar = new JMenuBar();
	setJMenuBar(menuBar);
	
	JMenu menu = new JMenu("Peliculas");
	menu.setFont(new Font("Segoe UI", Font.PLAIN, 18));
	menuBar.add(menu);
	 
	JMenuItem menuItemAgregar = new JMenuItem("Agregar");
	menuItemAgregar.setFont(new Font("Segoe UI", Font.PLAIN, 18));
	
	
	listaGeneros = new ArrayList<Genero>();
	listaGeneros.add(new Genero());
	listaGeneros.add(new Genero("Acción"));
	listaGeneros.add(new Genero("Romantica"));
	listaGeneros.add(new Genero("Suspenso"));
	listaGeneros.add(new Genero("Terror"));
	
	Genero[] arrayGeneros = listaGeneros.toArray(new Genero[listaGeneros.size()]);
	
	menuItemAgregar.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			
			contentPane.removeAll();
			panelagregar x = new panelagregar(listModel, arrayGeneros);
			contentPane.add(x);
			contentPane.repaint();
			contentPane.revalidate();
			
		}
	});
	menu.add(menuItemAgregar);
	
	JMenuItem menuItemListado = new JMenuItem("Listar");
	menuItemListado.setFont(new Font("Segoe UI", Font.PLAIN, 18));
	
	menuItemListado.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		
			
			contentPane.removeAll();
			panellistar x = new panellistar(listModel);
	
			contentPane.add(x);
			contentPane.repaint();
			contentPane.revalidate();
			
		}
	});
	menu.add(menuItemListado);
	
	
	contentPane = new JPanel();
	contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	contentPane.setLayout(new BorderLayout(0, 0));
	setContentPane(contentPane);
}

}



