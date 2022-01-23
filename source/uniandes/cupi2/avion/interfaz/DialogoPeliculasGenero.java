package uniandes.cupi2.avion.interfaz;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

import uniandes.cupi2.avion.mundo.Pelicula;

/**
 * Dialogo para seleccionar un g�nero de pel�cula para la bpusqueda.
 */
public class DialogoPeliculasGenero extends JDialog implements ActionListener {
    // -----------------------------------------------
    // Atributos
    // -----------------------------------------------

    /**
     * Comando aceptar
     */
    private final static String ACEPTAR = "ACEPTAR";

    /**
     * Ventana principal de la aplicaci�n
     */
    private InterfazAvion principal;

    /**
     * Etiqueta c�dula pasajero.
     */
    private JLabel labelCedulaPasajero;

    /**
     * Etiqueta g�nero pelicula.
     */
    private JLabel labelGenero;

    /**
     * Texto c�dula pasajero.
     */
    private JTextField textoCedulaPasajero;

    /**
     * Combo g�nero.
     */
    private JComboBox comboGenero;

    /**
     * Bot�n aceptar.
     */
    private JButton botonAceptar;

    // -----------------------------------------------
    // M�todos
    // -----------------------------------------------

    /**
     * Constructor del dialogo.
     * 
     * @param ventana Ventana principal de la aplicaci�n.
     */
    public DialogoPeliculasGenero(InterfazAvion ventana) {

        super(ventana, true);

        principal = ventana;

        setLayout(new BorderLayout(10, 10));
        setSize(300, 170);

        JPanel panelCentral = new JPanel();
        JPanel panelSur = new JPanel();

        panelCentral.setBorder(new TitledBorder("Información película"));

        panelCentral.setLayout(new GridLayout(2, 2, 5, 5));

        labelCedulaPasajero = new JLabel("Cédula pasajero:");
        panelCentral.add(labelCedulaPasajero);

        textoCedulaPasajero = new JTextField();
        panelCentral.add(textoCedulaPasajero);

        labelGenero = new JLabel("Género:");
        panelCentral.add(labelGenero);

        comboGenero = new JComboBox();
        comboGenero.addItem(Pelicula.ACCION);
        comboGenero.addItem(Pelicula.COMEDIA);
        comboGenero.addItem(Pelicula.DRAMA);
        comboGenero.addItem(Pelicula.INFANTIL);
        comboGenero.addItem(Pelicula.ROMANCE);
        panelCentral.add(comboGenero);

        add(panelCentral, BorderLayout.CENTER);

        botonAceptar = new JButton("Aceptar");
        botonAceptar.setActionCommand(ACEPTAR);
        botonAceptar.addActionListener(this);

        panelSur.add(botonAceptar);

        add(panelSur, BorderLayout.SOUTH);

        setLocationRelativeTo(principal);

    }

    /**
     * M�todo para manejar acciones
     * 
     * @param e Acci�n generada
     */
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals(ACEPTAR)) {

            try {
                int cedula = Integer.parseInt(textoCedulaPasajero.getText());
                String genero = (String) comboGenero.getSelectedItem();
                principal.peliculasGenero(cedula, genero);

            } catch (Exception e2) {
                JOptionPane.showMessageDialog(this, "Error en el formato de la duración y/o cédula.");
            }
            dispose();

        }

    }
}
