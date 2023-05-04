package Ejercicio;
import javax.swing.*;
import javax.swing.plaf.ComboBoxUI;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class panelagregar extends JPanel {

    private DefaultListModel<Peliculas> listModel;
    private JComboBox<Genero> comboBoxGeneros;
    private JTextField txtnombre;
	private JLabel lblId;
	private JLabel lblIdValue;
	
    public panelagregar(DefaultListModel<Peliculas> listModel, Genero[] listaGeneros) {

        this.listModel = listModel;

        setLayout(null);
        
        

        lblId = new JLabel("ID: " );
		lblId.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblId.setBounds(70, 37, 121, 14);
		add(lblId);
		
		lblIdValue = new JLabel();
        lblIdValue.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblIdValue.setBounds(182, 37, 154, 20);
        lblIdValue.setText(Integer.toString(Peliculas.getContador()));
        add(lblIdValue);

		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNombre.setBounds(70, 75, 98, 20);
		add(lblNombre);
		
		JLabel lblgenero = new JLabel("Genero");
		lblgenero.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblgenero.setBounds(70, 131, 98, 14);
		add(lblgenero);
		
		txtnombre = new JTextField();
		txtnombre.setBounds(182, 72, 154, 29);
		add(txtnombre);
		txtnombre.setColumns(10);

        comboBoxGeneros = new JComboBox<>(listaGeneros);
        comboBoxGeneros.setBounds(180, 125, 154, 29);
        add(comboBoxGeneros);

        JLabel labelEspacio = new JLabel("");
        add(labelEspacio);

        JButton botonAgregar = new JButton("Agregar");
        

        botonAgregar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	
                // Obtener los valores ingresados por el usuario
                String nombre = txtnombre.getText();
                Genero genero = (Genero) comboBoxGeneros.getSelectedItem();
                if(!nombre.isEmpty() && comboBoxGeneros.getSelectedIndex()!=0) {
                // Crear una nueva película y agregarla al listModel
                Peliculas nuevaPelicula = new Peliculas(nombre, genero);
                listModel.addElement(nuevaPelicula);
                }else {
                	JOptionPane.showMessageDialog(null, "Los datos ingresados no son validos, asegurese de seleccionar un genero y poner el nombre de la pelicula");
                }
                
                // Limpiar los campos de texto
                txtnombre.setText("");
                comboBoxGeneros.setSelectedIndex(0);
                lblIdValue.setText(Integer.toString(Peliculas.getContador()));
                
            }
        });
        botonAgregar.setBounds(60, 173, 137, 37);
        add(botonAgregar);
    }

	public DefaultListModel<Peliculas> getListModel() {
		return listModel;
	}

	public void setListModel(DefaultListModel<Peliculas> listModel) {
		this.listModel = listModel;
	}
    
    
    
}