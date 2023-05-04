package Ejercicio;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.awt.Font;
import java.util.ArrayList;
import java.util.Comparator;

import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils.Collections;

public class panellistar extends JPanel {

	private JList lbPeliculas;
	private JLabel lblPeliculas;
	private DefaultListModel<Peliculas> listModel;
	private DefaultListModel<Peliculas> listModel2;
	//private ArrayList<Peliculas> List;
	
	public panellistar(DefaultListModel<Peliculas> listModel) {
		setLayout(null);
		
		lbPeliculas = new JList();
		lbPeliculas.setBounds(124, 21, 421, 336);
		add(lbPeliculas);
		
		
		Set<Peliculas> setPeliculas = new TreeSet<>();
		for (int i = 0; i < listModel.size(); i++) {
		    setPeliculas.add(listModel.getElementAt(i));
		}
		DefaultListModel<Peliculas> listModel2 = new DefaultListModel<>();
		List<Peliculas> Lpeliculas = new ArrayList<>(setPeliculas);
		
		 
		 for (Peliculas pelicula : Lpeliculas) {
	            listModel2.addElement(pelicula);
	        }
		
		
		
		
		//ese model no vamos a mostrar otro mejor, que lo creamos y le metemos la lista peliculas.
		lbPeliculas.setModel(listModel2);
		
		
		
		lblPeliculas = new JLabel("Peliculas");
		lblPeliculas.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPeliculas.setBounds(56, 162, 65, 28);
		add(lblPeliculas);

	}


	
}
